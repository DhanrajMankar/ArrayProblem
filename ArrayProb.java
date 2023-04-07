package Pc_1;
import java.util.Scanner;
public class ArrayProb {

	public static void main(String[] args) {
		System.out.println("Enter tne no line you want");
		Scanner s =new Scanner(System.in);
        int a = s.nextInt()	;
       
        System.out.println("Enter tne no line you want for RiightAngleTraingle");
        System.out.println();
        RiightAngleTraingle(a);
        
        System.out.println();
        
        System.out.println("Enter tne no line you want for DownwardTraingle");
        System.out.println();
        DownwardTraingle(a);
	}
	    
	public static void RiightAngleTraingle(int n) {
		
		for (int i=1 ; i<=n ; i++)
		{
		for (int j=1; j<=i; j++)
		{
		System.out.print("*" + " ");
		}
		System.out.println();
		}
		}
	
		public static void DownwardTraingle(int n) {
			
		for (int i= n-1; i>=0 ; i--)
		{
		for (int j=0; j<=i; j++)
		{
		System.out.print("*" + " ");
		}
		System.out.println();
		}
		}
}


