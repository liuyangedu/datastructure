package cn.edu.bupt.sdmda.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Calculator {

	String exp;
	static ArrayList<Character> ops = new ArrayList<>();

	static HashMap<Character, Integer> prior = new HashMap<>();
	static{
		ops.add('+');
		ops.add('-');
		ops.add('*');
		ops.add('/');
		ops.add('(');
		ops.add(')');

		prior.put('+', 1);
		prior.put('-', 1);
		prior.put('*', 2);
		prior.put('/', 2);
		prior.put('(', 0);
	}

	Stack<Character> opsStack = new Stack<>();
	Stack<Integer> numsStack = new Stack<>();

	StringBuilder numBuilder;

	public Calculator(String str) {
		exp = str;
		numBuilder = new StringBuilder();
	}


	public int calc(){
		return 0;
	}


	// return 0 for number
	// return 1 for operator
	// note the '-' which can be both number or operator
	private int getFlag(int i){
		return 0;
	}


	// pop two numbers from stack, one operator from stack
	// calculate result and push in stack
	private void popAndCalcAndPush(){

	}


	// compare current operator and top operator in stack
	// if prior[cur]>prior[stack[top]], just push cur to stack
	// else popAndCalculate, then push cur to stack
	// note '(' and ')'
	// '(' always be pushed into stack
	// ')' always popAndCalculate until ')'
	private void compareAndCalc(int i){
		
	}
}
