/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a17_auomatic_type_conversion;

/**
 *
 * @author MADARA
 */
public class B {
    public static void main(String[] args) {
        A ob=new A();
        ob.add();
        ob.add(3, 4);//int to double
        ob.add("aziz", 101);
        ob.add(3.5f, 4);
        ob.add(3.4, 4.77, 17.1231);
        
        
    }
}
