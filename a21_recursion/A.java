/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a21_recursion;

/**
 *
 * @author MADARA
 */
public class A {
    int fact(int a){
        
        if(a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    
    
    
}
