package cn.edu.bupt.sdmda.ds.linearlist;

public class SeqList<T> implements LinearList<T>{

	private Object[] _data;
	private int _size;

	public SeqList(int s, T init){
	}

	public SeqList(){
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
		// TODO Auto-generated method stub
		// TODO check i
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public T deleteAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, T t) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
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

	private boolean checkReadableRange(int i){

		return true;

	}

	private boolean checkWritableRange(int i){
		
		return true;

	}
}
