package Day23_Arrays;

import java.util.Scanner;

public class WarmUpTask_1 {

    /*
    1. Write a program that can divide two numbers without 
    using division operator
    */
   public static void main(String[] args) {
       int a = 15;
       int b = 6;
       System.out.println( a/b );
       
       /*
        10 - 3 = 7
        7 - 3 = 4
        4 - 3 =1
        */
       
       /*
        15 - 6 = 9
        9 - 6 = 3
        */
       
       int x = 20; 
       int y = 6;
       int count = 0; 
       while(x>=y) {
           x -= y;
           count++;
       }
       
       System.out.println( count );  // result after dividing the two numbers
       System.out.println( 20 /6 );
       System.out.println(  x );   // remainder
       
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter two numbers");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       int result =0;
       
       int A, B;  // A/B
       if(num1 > num2) {
           A =num1;
           B = num2;
       }
       if(num2 > num1) {
           A =num2;
           B =num1;
       }
       
       
       if(num2!=0) {
               //10       3    
           while(num1 >= num2) {
               num1 -= num2;
               result++;
           }
           
       System.out.println("devision is "+result+" with a remainder of "+num1);
           
       }else {
           System.out.println("Invalid Entry");
       }
       
   
       
       
       
       
       

		}
		
		
		
	}
	

