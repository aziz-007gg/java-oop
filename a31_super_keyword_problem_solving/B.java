/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a31_super_keyword_problem_solving;

/**
 *
 * @author MADARA
 */
public class B extends A {
    int gear;
    
    B(String color,double weight,int gear){
        super(color,weight);
        this.gear=gear;
        
    }
    @Override
    void display(){
        super.display();
        System.out.println(gear);
    }
    
}
