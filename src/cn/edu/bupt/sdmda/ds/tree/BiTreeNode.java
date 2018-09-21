package cn.edu.bupt.sdmda.ds.tree;

public class BiTreeNode<T> {
	T _data;
	BiTreeNode<T> _leftChild, _rightChild;
	
	public BiTreeNode(T data){
		_data = data;
		_leftChild = null;
		_rightChild = null;
	}
	
	public T getData(){
		return _data;
	}
}
