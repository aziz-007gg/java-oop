/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a6_constructor_overloading_type_2;

/**
 *
 * @author MADARA
 */
public class test {
    
    public static void main(String[] args) {
        Teacher ob1=new Teacher();
    
    Teacher ob2=new Teacher("abdur Rob Aziz",101);
    ob2.display();
    
    Teacher ob3=new Teacher("Abdur Rob Aziz",101,24);
    ob3.display();
    }
    
}
