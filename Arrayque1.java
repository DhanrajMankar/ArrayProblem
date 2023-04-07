package Pc_1;
/*
Write a Java program to get the index of the first number 
and the last number of a subarray where the sum of numbers is zero from a given array of integers. 
Original Array : [1, 2, 3, -6, 5, 4]
Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
*/
public class Arrayque1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,-6,5,4};
		
		int sum=0;
		for(int i=0;i<6;i++)
		{
			
			sum=sum+a[i];
			
			if (sum==0)
			{
				System.out.print("Indext at frist position is 0 = ");
				System.out.println(a[0]);
				System.out.print("Indext at Last position is ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.print(a[i]);
			}
		}

	}

}
