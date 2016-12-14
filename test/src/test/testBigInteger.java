package test;

import java.math.BigInteger;

public class testBigInteger {
	
	private BigInteger a;

	public BigInteger getA() {
		return a;
	}

	public void setA(BigInteger a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		 testBigInteger testBigInteger = new testBigInteger();
		 testBigInteger.setA(BigInteger.valueOf(2222));
		 System.out.println(testBigInteger.getA());
	}

}