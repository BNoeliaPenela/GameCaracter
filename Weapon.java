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
    protected int damage;
    protected int range;
    protected int accuracy;
    
    public Weapon (){
       
    }

    public Weapon(String model, int damage, int range, int accuracy) {
        this.model = model;
        this.damage = damage;
        this.range = range;
        this.accuracy = accuracy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    
    
}
