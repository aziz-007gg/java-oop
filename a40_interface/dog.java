/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a40_interface;

/**
 *
 * @author MADARA
 */
public class dog implements animal {
    
    @Override
    public void math(int a,int b){
        System.out.println(a+b);
    }
    
    @Override
    public void eat(){
        System.out.println("dogs do not love fish");
    }
    
}
