package com.brainbeast.practice;

//finding armstrong numbers between given range
public class ArmstrongRange {

	public static void main(String[] args) {
		
		int num1=50;
		int num2=500;
		
		findArmstring(num1,num2);

	}

	private static void findArmstring(int low, int high) {
		
		 int j=0;
		 
		for(j=low+1; j< high;j++) {
			
			int y=0;
			int n=0;
			
			y=j;
			
			while(y!=0) {
				y =y/10;
				++n;
			}
			
			int sum=0;
			
			y=j;
			
			while(y!=0) {
				int d= y%10;
				sum= (int) (sum+ Math.pow(d, n));
				
				y=y/10;		
			}
			
			if(sum ==j) {
				
				System.out.print(j + "  ");
			}
		}
		
	}

}// 27+125+1
