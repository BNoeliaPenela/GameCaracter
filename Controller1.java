/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.controller;

import practica1.model.gameCaracter;
import practica1.model.Weapon;
import java.util.Scanner;

public class Controller1 {
    
    protected Weapon[] armas;
    protected gameCaracter personaje;

    public Controller1() {
    }
    
    

    public Controller1(Weapon[] armas, gameCaracter personaje) {
        this.armas = new Weapon[5];
        this.personaje = personaje;
    }

    public Weapon[] getArmas() {
        return armas;
    }

    public void setArmas(Weapon[] armas) {
        this.armas = armas;
    }

    public gameCaracter getPersonaje() {
        return personaje;
    }

    public void setPersonaje(gameCaracter personaje) {
        this.personaje = personaje;
    }
    
    //metodo para leer la eleccion de arma del usuario.
    public void cargarArmas(){
       
        Scanner scanner = new Scanner(System.in);
        
        String modelo;
        int daño;
        int rango;
        int presicion;
        for (int i = 0; i < this.armas.length; i++) {
            //Recibo/pido los datos
            System.out.println("Ingrese el modelo");
            scanner.nextLine();
            System.out.println("Ingrese el daño");
            daño = scanner.nextInt();
            System.out.println("Ingrese el rango");
            rango = scanner.nextInt();
            System.out.println("Ingrese la presicion");
            presicion = scanner.nextInt();
            //Creo la Persona
            Weapon arma = new Weapon();
            
            //La agrego al arreglo
            this.armas[i] = arma;
            
        }
        System.out.println();
      
//        armas[1] = new Weapon("Sword", 40, 1, 90);
//        armas[2] = new Weapon("Axe", 50, 1, 80);
//        armas[3] =  new Weapon("Bow", 30, 3, 70);
//        armas[4] = new Weapon("Staff", 20, 2, 95);
//        armas[5] =  new Weapon("Dagger", 25, 1, 85);
        
    }
    
//    public void leerArma(){
//        
//        mostrarArmas();
//        Scanner scanner = new Scanner(System.in);
//        
//    }
    
    public void mostrarArmas(){
        System.out.println("Armas disponibles: ");
        for(Weapon arma : this.armas){
            System.out.println("Arma: " + arma.getModel());
            System.out.println("Daño: " + arma.getDamage());
            System.out.println("Rango: " + arma.getRange());
            System.out.println("Presicion: " + arma.getAccuracy());
        }
    }

    
    
}
