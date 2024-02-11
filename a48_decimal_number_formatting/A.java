/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a48_decimal_number_formatting;

import java.text.DecimalFormat;

/**
 *
 * @author MADARA
 */
public class A {
    public static void main(String[] args) {
        
        DecimalFormat ob =new DecimalFormat("0.00");
        
        double x=10.76822;
        System.out.println(ob.format(x));
        
        double y=19.19197918813;
        
        System.out.printf("x=%.2f",y);
    }
}
