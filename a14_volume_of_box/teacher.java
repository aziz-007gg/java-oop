/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a14_volume_of_box;

/**
 *
 * @author MADARA
 */
public class teacher {
    
    double height,width,depth;
    
    teacher(double height,double width,double depth){
        
        this.height=height;
        this.width=width;
        this.depth=depth;
        
    }
    
    void displayVolume(){
        double volume=height*width*depth;
        System.out.println(volume);
    }
    
}
