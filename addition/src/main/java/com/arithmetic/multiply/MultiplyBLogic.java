package com.arithmetic.multiply;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MultiplyBLogic {
	public int execute(int a, int b) {
		System.out.println(" MultiplyBLogic.execute(" + a + "," + b + ")");
		return a*b;
	}
}
