/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.model;

/**
 *
 * @author Noelia
 */
public class gameCaracter {
    protected String name;
    protected int maxHp;
    protected int curHP;
    protected String myWeapon;

    public gameCaracter() {
        this.name = "";
        this.myWeapon = "";
    }

    public gameCaracter(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurHP() {
        return curHP;
    }

    public void setCurHP(int curHP) {
        this.curHP = curHP;
    }

    public String getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(String myWeapon) {
        this.myWeapon = myWeapon;
    }
    
    
    
}
