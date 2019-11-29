package test;

import static org.junit.Assert.*;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.LeapYear;
import main.isMul;

class LeapYearTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test  
	public void test100(){
		new isMul();
		assertEquals(1,isMul.is100mul(100));
		assertEquals(0,isMul.is100mul(101));
	}
	
	@Test
	public void test400(){
		new isMul();
		assertEquals(1,isMul.is400mul(400));
		assertEquals(0,isMul.is400mul(401));
		assertEquals(1,isMul.is400mul(0));
		assertEquals(0,isMul.is400mul(40));
		assertEquals(1,isMul.is400mul(800));
		assertEquals(0,isMul.is400mul(150));
	}
	
	@Test
	public void test4(){
		new isMul();
		assertEquals(1,isMul.is4mul(8));
		assertEquals(0,isMul.is4mul(9));
	}

	@Test
	public void IsLeapYeartest() {
		new LeapYear();
		//double[] count= {};
		assertEquals(1,LeapYear.isLeapYear(2004));
		assertEquals(0,LeapYear.isLeapYear(2001));
		assertEquals(1,LeapYear.isLeapYear(2000));
		assertEquals(0,LeapYear.isLeapYear(1500));
	}
	
	@Test
	public void testSum(){

		Sum sum = new Sum();
		double[] count = {1,2,3,4,5};
		assertEquals(15,sum.evaluate(count),0.000);

	}
	
	@Test
	public void testCount(){

		new LeapYear();
		int[] years1= {2000,2001,2002,2004,2008};
		assertEquals(0,(int)LeapYear.Count(years1));

	}
}
