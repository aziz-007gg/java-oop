/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a36_polymorphism_run_time;

/**
 *
 * @author MADARA
 */
public class Teacher extends person {
    
    String qualification;
    
    Teacher(String name,int id,String qualification){
        super(name,id);
        this.qualification=qualification;
    }

    @Override
    void display(){
        super.display();
        System.out.println(qualification);
    }
   
}
