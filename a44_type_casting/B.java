/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a44_type_casting;

/**
 *
 * @author MADARA
 */
public class B extends A {
    public static void main(String[] args) {
     double x=10.5;
    
    int y=(int)x;
        System.out.println(y);
         int a=10;
    
    double b=a;
        System.out.println(b);
        
        A ob;
        ob=new B();
        ob.method();
        
        
        B ob2=(B)new A();
        ob.method();
        
        
        
    }
    
   
    
    
    
    
}
