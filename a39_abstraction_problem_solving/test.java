/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a39_abstraction_problem_solving;

/**
 *
 * @author MADARA
 */
public class test {

    public static void main(String[] args) {
        shape shape;
        shape = new rectangle(10.2, 5.6);
        
        System.out.println(shape.area());;
        
        shape=new circle(5);
        System.out.println(shape.area());;
        
        shape=new triangle(10,20.5);
        System.out.println(shape.area());;
        

    }

}
