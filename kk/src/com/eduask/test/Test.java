package com.eduask.test;

import com.eduask.biz.impl.ClassBizImpl;

public class Test {

	public static void main(String[] args) {
		System.out.println(new ClassBizImpl().findAllClass().size());
	}

}
