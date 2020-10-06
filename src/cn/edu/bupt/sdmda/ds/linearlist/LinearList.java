package cn.edu.bupt.sdmda.ds.linearlist;

public interface LinearList<T> {
	void init(int s, T init);
	boolean isEmpty();
	int getSize();
	void clear();
	void insert(int i, T t);
	void delete(T t);
	T deleteAt(int i);
	T get(int i);
	void set(int i, T t);
	int  find(T t);	
	LinearList<T> sort();
}