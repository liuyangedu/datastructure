package cn.edu.bupt.sdmda.main;

import cn.edu.bupt.sdmda.ds.linearlist.SeqStack;

public class NumBaseConvertor {
	
	public final static char[] digits=
		{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};;
	
	
	public static int toDec(String number, int base){
		return 0;
	}
	
	public static String Convert(int number, int base){
		if(base>digits.length)
			throw new RuntimeException(String.format(
					"base should not larger than %d, but got %d",
					digits.length, base));
		return "";
	}
	
	
	
	public static String Convert(String number, int srcBase, int desBase) {
		return Convert( toDec(number, srcBase),desBase);
	}
}
