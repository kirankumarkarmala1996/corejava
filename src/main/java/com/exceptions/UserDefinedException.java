package com.exceptions;

public class UserDefinedException {
	public static void main(String[] args)  {
//		instance veriable
		int a=10;
		int b =20;
		
		try {
			
			int c=a/b;
		
		if(c==0) 
			throw new MyException("0 is not divisible");
			System.out.println(c);
		
		}catch(MyException e){
			System.out.println(e.getMessage());
			
		}
	}

}
