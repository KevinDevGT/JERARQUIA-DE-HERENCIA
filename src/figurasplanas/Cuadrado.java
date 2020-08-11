
package figurasplanas;

import figurasgeometricastarea.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVINSAMA
 */

public class Cuadrado extends Datos implements figurasgeometricastarea.FigurasGeometricas
{
     double lado;
     double areaCuadrado;
     
    //Construtor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    /////////////////////////////

    public double getLado() {
        return lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
          
  
     //Interface
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }
    
      /////////////////////////////
    @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null,"Lado: " + lado + "\nEl area del Cuadrado es: " + areaCuadrado + " Mts.", "\nArea del Cuadrado: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}