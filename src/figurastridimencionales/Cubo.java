
package figurastridimencionales;

import figurasgeometricastarea.FigurasGeometricas;
import figurasgeometricastarea.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVINSAMA
 */
public class Cubo extends Datos implements FigurasGeometricas {
    
     double lado;
     double areaCubo;
     double areaTotalCubo;
     //Construtor

  
     /////

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getAreaCubo() {
        return areaCubo;
    }

    public double getAreaTotalCubo() {
        return areaTotalCubo;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    
     
     //Interface
    @Override
    public void area() 
    {
        areaCubo = lado * lado;
        
        areaTotalCubo = (areaCubo * 6);
    }   
    
    /////////////////////////////
    @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null,"Lado: " + lado + "\nArea del Cubo: " + areaTotalCubo,"\nArea del Cubo", JOptionPane.INFORMATION_MESSAGE);
    }
}
