package main;

public class isMul {
	
	public static int is400mul(int x) {
		if (x / 400 == 0) 
			return 1;
		else
			return 0;
	}
	
	
	public static int is100mul(int x) {
		if (x % 100 == 0) 
			return 1;
		else
			return 0;
	}
	
	public static int is4mul(int x) {
		if (x % 4 == 0) 
			return 1;
		else
			return 0;
	}

}
