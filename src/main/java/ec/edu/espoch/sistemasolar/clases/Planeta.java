/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemasolar.clases;

import ec.edu.espoch.sistemasolar.enumeraciones.PlanetType;

/**
 *
 * @author SO-LAB1-PC20
 */
public class Planeta {
    
    public String name;
    public int amountSatellites;
    public double massKilograms;
    public double volumeKm3;
    public double diameterKm;
    public double distanceMediaSun;
    public PlanetType planetType;
    
    
    public void printValues(){
    
        System.out.println("Nombre"+name);
        System.out.println("Cantidad de satelites"+amountSatellites);
        System.out.println("Cantidad de masa"+massKilograms);
        System.out.println("Cantidad de volumen"+volumeKm3);
        System.out.println("Diametro"+diameterKm);
        System.out.println("Distancia"+distanceMediaSun);
        
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
