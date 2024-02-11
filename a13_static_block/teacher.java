/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a13_static_block;

/**
 *
 * @author MADARA
 */
public class teacher {
    static String name;
    static int id;
    
    static{
        name="aziz";
        id=101;
        
    }
    
    static void method(){
        
        System.out.println(name);
        System.out.println(id);
    }
}
