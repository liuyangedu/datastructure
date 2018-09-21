package cn.edu.bupt.sdmda.ds.linearlist;

public interface MyQueue<T> extends LinearList<T>{
	void offer(T t);
	T poll();
	T getHead();
}
