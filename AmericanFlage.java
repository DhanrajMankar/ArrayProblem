package Pc_1;
/**
 * 14. Write a Java program to print an American flag on the screen. 
Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  =======================
 **/
public class AmericanFlage {

	public static void main(String[] args) {
		
		for (int i=0;i<=6;i++)
		{
			if (i== 0 || i==2 || i==4)
			{
				System.out.println("* * * * * * ================================== ");
			
			}
			else if(i==1 ||i==3)
			{
				System.out.println(" * * * * *  ==================================");
			}
			else if(i==5)
			{
				System.out.println(" * * * * *  =======================");
			}
			
		}

	}

}
