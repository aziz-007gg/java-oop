/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a45_anonymous_class;

/**
 *
 * @author MADARA
 */
public class B {
    
    public static void main(String[] args) {
        A ob=new A(){
          @Override
          void method(){
              System.out.println("B class");
          }  
        };
        
        ob.method();
    }
    
  
    
}
