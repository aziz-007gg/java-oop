/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a26_instance_of_operator;

/**
 *
 * @author MADARA
 */
public class test {
    public static void main(String[] args) {
        species s=new species();
        Animal A=new Animal();
        dog d=new dog();
        System.out.println(s instanceof species );
        System.out.println(A instanceof species);
        System.out.println(d instanceof species);
        System.out.println(A instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof dog);
        
        System.out.println(s instanceof Animal);
        System.out.println(s instanceof dog);
        System.out.println(A instanceof dog);
        
    }
    
}
