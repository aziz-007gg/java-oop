/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a49_equal_method;

/**
 *
 * @author MADARA
 */
public class A {

    public static void main(String[] args) {

        String pass1 = "aziz123";
        String pass2 = "aziz123";

        String pass3 = "aziz123";
        String pass4 = "Aziz123";

        System.out.println(pass1.equals(pass2));
        System.out.println(pass1.equals(pass3));
        System.out.println(pass2.equals(pass4));
        System.out.println(pass2.equalsIgnoreCase(pass4));
    }

}
