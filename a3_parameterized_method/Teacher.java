/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3_parameterized_method;

/**
 *
 * @author MADARA
 */
public class Teacher {
     
    String name;
    int id;
    
    void setInfo(String name,int id){
        
        this.name=name;
        this.id=id;
        
        
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(id);
    }
}
