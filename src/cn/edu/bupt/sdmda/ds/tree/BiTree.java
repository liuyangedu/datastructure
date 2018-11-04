package cn.edu.bupt.sdmda.ds.tree;

import java.util.LinkedList;

public class BiTree<T> {
	BiTreeNode<T> _root;
  // a queue to store the order of traverse
	LinkedList<BiTreeNode<T>> _queue = new LinkedList<>();

  // Create a tree whose root is root and data is data[loc]
	private void createTree(BiTreeNode<T> root, T[] data, int loc){
    // if the left child of root is valid,
    // create a tree whose root is it

    // if the right child of root is valid,
    // create a tree whose root is it


	}

	public BiTreeNode<T> getRoot(){
		return _root;
	}

	public BiTree(T[] data) {
		// TODO Auto-generated constructor stub
		// note that the loc starts from 1 not 0
		_root = new BiTreeNode<T>(data[1]);
		createTree(_root, data, 1);
	}

	public BiTree(BiTreeNode<T> root) {
		// TODO Auto-generated constructor stub
		_root = root;
	}

	public int getDepth(BiTreeNode<T> node) {
		// if node is null return 0
    // return MAX(depth of left, depth of right)+1
    return 0;
	}

	public void preOrder(BiTreeNode<T> _node){
		// note offer the correct note to _queue
	}

	public void inOrder(BiTreeNode<T> _node){
		// note offer the correct note to _queue
	}

	public void postOrder(BiTreeNode<T> _node){
		// note offer the correct note to _queue
	}

	public void levelOrder() {
		// note offer the correct note to _queue
	}

	public LinkedList<BiTreeNode<T>> getQueue(){
		return _queue;
	}


  // make queue empty
	public void clearQueue(){
	}

  // search item in the tree whose root is _node in preOrder
	public BiTreeNode<T> searchPreOrder(BiTreeNode<T> _node, T item) {
    // if current node is item, return
    // search the next element in the treeld, item);
		return null;
	}

  // search item in the tree whose root is _node in inOrder
	public BiTreeNode<T> searchInOrder(BiTreeNode<T> _node, T item) {
    // if current node is item, return
    // search the next element in the treeld, item);
		return null;
	}

  // search item in the tree whose root is _node in postOrder
	public BiTreeNode<T> searchPostOrder(BiTreeNode<T> _node, T item) {
    // if current node is item, return
    // search the next element in the treeld, item);
		return null;
	}

  // search item in this tree in levelOrder
	public BiTreeNode<T> SearchLevelOrder(T item) {
    // if current node is item, return
    // search the next element in the treeld, item);
		return null;
	}

}
