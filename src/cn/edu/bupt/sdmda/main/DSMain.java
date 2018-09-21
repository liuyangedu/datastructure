package cn.edu.bupt.sdmda.main;

import cn.edu.bupt.sdmda.ds.linearlist.LinearList;
import cn.edu.bupt.sdmda.ds.linearlist.LinkedStack;
import cn.edu.bupt.sdmda.ds.linearlist.MyLinkedList;
import cn.edu.bupt.sdmda.ds.linearlist.SeqList;
import cn.edu.bupt.sdmda.ds.linearlist.SeqQueue;
import cn.edu.bupt.sdmda.ds.linearlist.SeqStack;
import cn.edu.bupt.sdmda.ds.tree.BiTree;
import cn.edu.bupt.sdmda.ds.tree.BiTreeNode;
import cn.edu.bupt.sdmda.ds.tree.TraverseFuction;

public class DSMain {
	public static void main(String[] args) {
		if(args.length>=2){
			switch(args[0]){
			case "linearlist":
				testLinearListMain(args);
				break;
			case "stack":
				testStackMain(args);
				break;
			case "queue":
				testQueueMain(args);
				break;
			case "calculator":
				calculator(args[1]);
				break;
			case "tree":
				testTreeMain(args);
				break;
			}
		}

	}

	public static void testLinearListMain(String[] args) {

		SeqList<Integer> seql = new SeqList<Integer>(args.length-1, 0);
		for(int i=0; i<args.length-1; ++i){
			seql.set(i, Integer.parseInt(args[i+1]));
		}
		testLinearList(seql);

		System.out.println("=======");

		MyLinkedList<Integer> lnkl = new MyLinkedList<Integer>(args.length, 0);
		for(int i=0; i<args.length-1; ++i){
			lnkl.set(i, Integer.parseInt(args[i+1]));
		}
		testLinearList(lnkl);
	}


	private static void testLinearList(LinearList<Integer> ll){
		Integer ele1 = ll.get(0)+ll.get(1);
		Integer ele2 = ll.get(0)-ll.get(1);
		Integer ele3 = ll.get(0)*ll.get(1);

		// print size and all
		printInfoOfLinearList(ll);

		// insert in head
		// insert in mid
		// insert in tail
		System.out.println("inserting 3 elements");
		ll.insert(0, ele1);
		ll.insert(ll.getSize()/2, ele2);
		ll.insert(ll.getSize(), ele3);

		// print size and all
		printInfoOfLinearList(ll);

		// delete in head
		// delete in mid
		// delete in tail
		System.out.println("deleting 3 elements");

		System.out.print(ll.deleteAt(0)+"\t");
		System.out.print(ll.deleteAt(ll.getSize()/2)+"\t");
		System.out.println(ll.deleteAt(ll.getSize()-1));

		// print size and all
		printInfoOfLinearList(ll);

		// find element like the tail
		// delete element like the tail
		System.out.println("finding last element");
		Integer found = ll.find(ll.get(ll.getSize()-1));
		System.out.println(found);
		ll.delete(ll.get(found));

		// print size and all
		printInfoOfLinearList(ll);

		// clear
		System.out.println("clearing");
		ll.clear();
		// print size and all
		printInfoOfLinearList(ll);
	}



	private static void printInfoOfLinearList(LinearList<Integer> ll){
		System.out.println("List Summay:");
		System.out.println(ll.getSize());
		for(int i=0; i<ll.getSize(); ++i){
			System.out.print(ll.get(i)+"\t");
		}
		System.out.println("");
	}

	public static void testStackMain(String[] args){

		SeqStack<String> s = new SeqStack<String>();
		System.out.println("Push and pop half of input");
		// push
		int i=1;
		for(;i<args.length/2;++i){
			s.push(args[i]);
		}
		// pop
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		System.out.println("===half===");
		for(;i<args.length;++i){
			s.push(args[i]);
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}




		LinkedStack<String> ls = new LinkedStack<>();
		System.out.println("Push and pop half of input");
		// push
		i=1;
		for(;i<args.length/2;++i){
			ls.push(args[i]);
		}
		// pop
		while(!ls.isEmpty()){
			System.out.println(ls.pop());
		}
		System.out.println("===half===");
		for(;i<args.length;++i){
			ls.push(args[i]);
		}
		while(!ls.isEmpty()){
			System.out.println(ls.pop());
		}

	}

	public static void testQueueMain(String[] args){
		SeqQueue<String> q = new SeqQueue<String>();
		System.out.println("Offer and poll half of input");
		// offer
		int i=1;
		for(;i<args.length/2;++i){
			q.offer(args[i]);
		}
		// poll
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
		System.out.println("===half===");
		for(;i<args.length;++i){
			q.offer(args[i]);
		}
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}

	public static void calculator(String exp){
		Calculator c = new Calculator(exp);
		System.out.println(c.calc());
	}

	public static void testTreeMain(String[] args){
		Integer[] data = new Integer[args.length-1];
		for(int i=0;i<data.length;++i){
			data[i] = Integer.parseInt(args[i+1]);
		}
		BiTree<Integer> tree = new BiTree<>(data);
		PrintTraverse<Integer> func = new PrintTraverse<>();
		tree.preOrder(tree.getRoot(), func);
		System.out.println("=====");
		tree.inOrder(tree.getRoot(), func);
		System.out.println("=====");
		tree.postOrder(tree.getRoot(), func);
		System.out.println("=====");
	}


}


class PrintTraverse<T> implements TraverseFuction<T>{

	@Override
	public void tranverse(BiTreeNode<T> node) {
		// TODO Auto-generated method stub
		System.out.println(node.getData());
	}


}
