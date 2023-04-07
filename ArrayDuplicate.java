package Pc_1;

	
import java.util.Arrays; 
public class  ArrayDuplicate {
public static void main(String[] args) 
{
  int[] a= {10,12,34,56,12,34,10};
  for (int i = 0; i < a.length-1; i++)
	   {
	      for (int j = i+1; j < a.length; j++)
	         {
	            if ((a[i] == a[j]) && (i != j))
	            {
	             System.out.println("Duplicate Element : "+a[j]);
	              
	              
	             int n1=0; 
	             n1++;
	             System.out.println("It occures : "+n1+" Times");
	              
	             }
	          // System.out.println("It occures : "+n1+" Times");
	          }
	      
	        }
	    }    
	}


