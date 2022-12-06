package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {
	
	StringCalc calc;
	
	@BeforeEach
	void setUp() throws Exception{
		calc = new StringCalc();
	}
	

	@org.junit.jupiter.api.Test
	void testAddEmptyString() {
		int res = calc.Add("");
		assertEquals(0, res);
	}

	@org.junit.jupiter.api.Test
	void testAddOneString() {
		int res = calc.Add("1");
		assertEquals(1, res);
	}
	
	@org.junit.jupiter.api.Test
	void testAddTwoString() {
		int res = calc.Add("1,2");
		assertEquals(3, res);
	}
	
	@org.junit.jupiter.api.Test
	void testAddMultiString() {
		int res = calc.Add("1,2,3");
		assertEquals(6, res);
	}

}
