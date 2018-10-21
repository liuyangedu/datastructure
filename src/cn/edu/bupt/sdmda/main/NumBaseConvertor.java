package cn.edu.bupt.sdmda.main;

import java.util.HashMap;
import java.util.Map;

import cn.edu.bupt.sdmda.ds.linearlist.SeqStack;

public class NumBaseConvertor {
	public enum Base {
		BIN, OCT, DEC, HEX
	}
	
	private final static Map<Base, Integer> map;
	static{
		map = new HashMap<Base, Integer>();
		map.put(Base.BIN, 2);
		map.put(Base.OCT, 8);
		map.put(Base.DEC, 10);
		map.put(Base.HEX, 16);
	}
	
	public static String Convert(String src, Base srcBase, Base desBase) {
        // convert src from srcBase to desBase

        // construct a empty stack
        
        // divide and push reminder to stack
        // Note the last reminder
        
        // convert and concatenate the reminder in stack
        
		return "";
	}
	
	// convert any src to dec
	private static int toDec(String src, Base srcBase) {
		return 0;
	}
	
    // convert a char to int from srcBase
	private static int toDec(char src, Base srcBase) {
		return 0;
	}
	
    // convert a small int to char
	private static char decToAny(int src){
        return 'a';
	}
}
