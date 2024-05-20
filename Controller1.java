/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.controller;

import practica1.model.gameCaracter;
import practica1.model.Weapon;
import java.util.Scanner;

public class Controller1 {
    Scanner scanner = new Scanner(System.in);
    protected Weapon[] armas;
    protected gameCaracter personaje;

    
    public Controller1() {
        this.armas = new Weapon[5];
        this.personaje = new gameCaracter();
    }
    
    

//    public Controller1(Weapon[] armas, gameCaracter personaje) {
//        this.armas = new Weapon[5];
//        this.personaje = personaje;
//    }

    public Weapon[] getArmas() {
        return this.armas;
    }

    public void setArmas(Weapon[] armas) {
        this.armas = armas;
    }

    public gameCaracter getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(gameCaracter personaje) {
        this.personaje = personaje;
    }
    
    //metodo para leer la eleccion de arma del usuario.
    public void cargarArmas(){
       
//        Scanner scanner = new Scanner(System.in);
        
        String model;
        int maxD;
        int minD;
        int idA;
        
        for (int i = 0; i < this.armas.length; i++) {
            //Recibo/pido los datos
            System.out.println("Ingrese el modelo");
            model = scanner.next();
            System.out.println("Ingrese el daño");
            maxD = scanner.nextInt();
            System.out.println("Ingrese el rango");
            minD = scanner.nextInt();
            System.out.println("Ingrese el id del arma");
            idA = scanner.nextInt();
            //Creo la Persona
            Weapon arma = new Weapon(model, maxD, minD, idA);
            
            //La agrego al arreglo
            this.armas[i] = arma;
            
        }
        
      
//        armas[1] = new Weapon("Sword", 40, 1, 90);
//        armas[2] = new Weapon("Axe", 50, 1, 80);
//        armas[3] =  new Weapon("Bow", 30, 3, 70);
//        armas[4] = new Weapon("Staff", 20, 2, 95);
//        armas[5] =  new Weapon("Dagger", 25, 1, 85);
        
    }
    
    public void datosPersonaje(){
        System.out.println("Ingrersar el nombre del personaje");
        String name = scanner.next();
        System.out.println("Ingresar la salud maxima");
        int maxHp = scanner.nextInt();
        personaje.setName(name);
        personaje.setMaxHp(maxHp);
    }
    
//    public void leerArma(){
//        
//        mostrarArmas();
//        Scanner scanner = new Scanner(System.in);
//        
//    }
    
    private void mostrarArmas(){
        System.out.println("Armas disponibles: ");
        for(Weapon arma : this.armas){
            System.out.println("ID: " + arma.getIdA());
            System.out.println("Arma: " + arma.getModel());
            System.out.println("Daño maximo: " + arma.getMaxD());
            System.out.println("Daño minimo: " + arma.getMinD());
        }
    }
    
    public void elegirArma(){
        System.out.println("Seleccione un arma para su personaje");
        mostrarArmas();
        System.out.println("Ingrese el ID del arma elegida");
        int idA = scanner.nextInt();
        int f = 0;
        for(Weapon arma : this.armas){
            if (idA == arma.getIdA()){
                System.out.println("Arma elegida: " + arma.getModel());
                String armaE = arma.getModel();
                personaje.setMyWeapon(armaE);
                f = 1;
            }
        }
        if (f == 0){
            System.out.println("El ID es invalido.");
        }
    }
    
    public void mostrarTotal(){
        
        System.out.println("Personaje: ");
        System.out.println("Nombre: " + personaje.getName());
        System.out.println("Salud max: " + personaje.getMaxHp());
        System.out.println("Arma: " + personaje.getMyWeapon());
        
        for(Weapon arma : this.armas){
            if (arma.getModel() == personaje.getMyWeapon()){
                System.out.println("Arma: " + arma.getModel());
                System.out.println("Daño maximo: " + arma.getMaxD());
                System.out.println("Daño minimo: " + arma.getMinD());
            }                      
        }
        
    }

    
    
}
