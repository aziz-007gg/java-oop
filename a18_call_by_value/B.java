/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a18_call_by_value;

/**
 *
 * @author MADARA
 */
public class B {
    
    public static void main(String[] args) {
        
        A ob=new A();
        
        int x=50;
        System.out.println(x);
        
        ob.change(x);
        System.out.println(x);
    }
    
}
