/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a30_super_keyword_constructor;

/**
 *
 * @author MADARA
 */
public class B extends A {

    int age;

    B(String name, int id, int age) {

        super(name, id);
        this.age = age;
    }

    void display() {
        super.display();
        System.out.println(age);
    }
}
