package com.dp.behavioral.stratagy.ex02;

public class OperationAdd implements Strategy{

	public int doOperation(Integer num1, Integer num2) {		
		return (num1 + num2);
	}

}
