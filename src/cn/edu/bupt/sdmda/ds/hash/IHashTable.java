package cn.edu.bupt.sdmda.ds.hash;

public interface IHashTable<K,V> {
	void put(K key, V val);
    V get(K key);
    int getIdx(K key);
}
