/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a47_exception_handling_problem_solving;

import java.util.Scanner;

/**
 *
 * @author MADARA
 */
public class A {
    
    public static void main(String[] args) {
        
        int count=1;
  do{ 
      try{
              Scanner input=new Scanner(System.in);
          
         System.out.print("Enter number1:");
         int num1=input.nextInt();
           System.out.print("Enter number2:");
         int num2=input.nextInt();
         
         int result=num1/num2;
         
         System.out.println("result:"+num1+"/"+num2+"="+result);
         count++;
         }
         
         catch(Exception e){
             System.out.println(e);
             System.out.println("please enter valid number");
             
         }
            
   }
  
  while(count==1);
  
         
    }
    
    
    
}
