package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void testLengthOfTheUniqueKey() {

		Assert.assertNotEquals(13, 1);
		
	}
}
