package cn.edu.bupt.sdmda.ds.linearlist;

public interface MyStack<T> 
  extends LinearList<T> {
	T pop();
	void push(T t);
	T getTop();
}
