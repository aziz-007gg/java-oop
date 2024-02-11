/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a25_inheriting_private_number;

/**
 *
 * @author MADARA
 */
public class C {
    
    
    public static void main(String[] args) {
        B ob =new B();
        ob.setname("aziz");
        ob.setid(101);
        ob.setage(23);
        
        System.out.println(ob.getname());
        System.out.println(ob.getid());
        System.out.println(ob.getage());
    }
}
