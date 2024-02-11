/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a22_encapsualtion;

/**
 *
 * @author MADARA
 */
public class A {

    private String name;
    private int id;

   public void setInfo(String name,int id) {
      this.name=name;
      this.id=id;
    }

    public void getInfo() {
        System.out.println(name);
        System.out.println(id);
    }
}
