package cn.edu.bupt.sdmda.ds.linearlist;

public class MyLinkedList<T> implements LinearList<T>{

	class Node{
		public T _ele;
		public Node _next;
		public Node(){
			init(null, null);
		}
		public Node(T e){
			init(e, null);
		}
		public Node(T e, Node n){
			init(e, n);
		}
		private void init(T e, Node n){
			_ele = e;
			_next = n;
		}
	}

	Node _head;
	int _size;

	public MyLinkedList(int s, T init) {
		// TODO Auto-generated constructor stub
	}

	public MyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(int s, T init) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(int i, T t) {
		// i=_size is OK!
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public T deleteAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public int find(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LinearList<T> sort() {
		// TODO Auto-generated method stub
		return null;
	}

	private Node getNodeBefore(int i){
		// assume i is a valid value
		return null;
	}

	private boolean checkReadableRange(int i){

		return true;
	}

	private boolean checkWritableRange(int i){
	
		return true;
	}


}
