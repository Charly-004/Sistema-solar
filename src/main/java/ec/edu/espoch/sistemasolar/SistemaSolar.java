/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.enumeraciones.PlanetType;

/**
 *
 * @author SO-LAB1-PC20
 */
public class SistemaSolar {

    public static void main(String[] args) {
    
        Planeta objPlaneta= new Planeta("Marte",2,3,4,5,7,PlanetType.ENANO);
        
       
        objPlaneta.printValues();
        
       double densidad=objPlaneta.calculateDms();
        System.out.println("La densidad es: "+densidad);
        
        
        
        
        
        
        
        
        
    }
}
