package main;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class LeapYear {
	

	//check y is illegal or not
	public static int isLeapYear(int y) {  
        if(isMul.is100mul(y) == 1)
        	if(isMul.is400mul(y) == 1) {
        		//ArrayUtils.add(count,1);
        		return 1;
        	}
        	else {
        		//ArrayUtils.add(count,0);
        		return 0;
        	}
        else
        	if(isMul.is4mul(y) == 1) {
        		//ArrayUtils.add(count,1);
        		return 1;
        	}
        	else {
        		//ArrayUtils.add(count,0);
        		return 0;
        	}
	}
	
	public static double Count(int[] years) {
		
		double[] count = new double[100];
		
		for (int i=0;i<years.length;i++) {
			count[i]=isLeapYear(years[i]);
		}
		Sum sum = new Sum();
		System.out.println(count.length);
		System.out.println(sum.evaluate(count));
		return sum.evaluate(count);
		
	}

}