package com.dp.behavioral.stratagy.ex02;

public class MainTest {

	public static void main(String[] args) {
		Context ctx = new Context(new OperationAdd());
		System.out.println(ctx.executeStrategy(123, 20));
		
		ctx = new Context(new OperationMultiply());
		System.out.println(ctx.executeStrategy(3, 20));
	}

}
