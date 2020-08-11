
package figurasplanas;

import figurasgeometricastarea.Datos;
import figurasgeometricastarea.FigurasGeometricas;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVINSAMA
 */

public class Circulo extends Datos implements FigurasGeometricas 
{
 
     private double radio;
     private double areaCirculo;
     private double pi = Math.PI;

         //Construtor
    public Circulo(double radio) {
        this.radio = radio;
    }
        
    /////////////////////////////

    public double getRadio() {
        return radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public double getPi() {
        return pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
     
    
    
     
    
    /////////////////////////////
    //Interface
    @Override
    public void area() 
    {
        areaCirculo = pi * radio * radio;
    }    
    
    
     @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null,"PI: " + pi + "\nRadio: " + radio + "\nEl area del Circulo es: "+ areaCirculo + " Mts.", "\nArea del Circulo: ", JOptionPane.INFORMATION_MESSAGE);
    }
}