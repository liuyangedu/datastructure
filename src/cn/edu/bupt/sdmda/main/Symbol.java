package cn.edu.bupt.sdmda.main;


public class Symbol implements Comparable<Symbol>{
	// symbol from sender to receiver
	String symbol;
	// its probability
	double prob;

	public Symbol(String s, double p){
		symbol = s;
		prob = p;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getProb() {
		return prob;
	}

	public void setProb(double prob) {
		this.prob = prob;
	}

	// make Symbol comparable
	@Override
	public int compareTo(Symbol o) {
		// TODO Auto-generated method stub
		final int BASE = 100000;
		// from small to big
		return (int)(prob*BASE)-(int)(o.prob*BASE);
	}

	// auto generated code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(prob);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbol other = (Symbol) obj;
		if (Double.doubleToLongBits(prob) != Double.doubleToLongBits(other.prob))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}


}
