/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a19_call_by_reference;

/**
 *
 * @author MADARA
 */
public class B {
    public static void main(String[] args) {
        
        
        A r1=new A();
        r1.name="aziz";
        
        System.out.println(r1.name);
        
        r1.change(r1);
        System.out.println(r1.name);
         
    }
}
