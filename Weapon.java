/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.model;

/**
 *
 * @author Noelia
 */
public class Weapon {
    
    
    protected String model;
    protected int maxD;
    protected int minD;
    protected int idA;
    
    
    public Weapon (){
       this.model = "";
    }

    public Weapon(String model, int maxD, int minD, int idA) {
        this.model = model;
        this.maxD = maxD;
        this.minD = minD;
        this.idA = idA;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxD() {
        return maxD;
    }

    public void setMaxD(int maxD) {
        this.maxD = maxD;
    }

    public int getMinD() {
        return minD;
    }

    public void setMinD(int minD) {
        this.minD = minD;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

   
    
    
}
