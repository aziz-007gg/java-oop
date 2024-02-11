/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a46_exception_handling;

/**
 *
 * @author MADARA
 */
public class A {
    
    public static void main(String[] args) {
      try{
            
       
          
          int [] a=new int [3];
          a[3]=10;
         
      }
       catch(ArithmeticException e){
          System.out.println(e);
      }
      catch(Exception e1){
          System.out.println(e1);
      }
     
        finally{
        System.out.println("this is the last line");
      } 
    }
    
}
