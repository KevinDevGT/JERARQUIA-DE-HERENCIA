
package figurastridimencionales ;

import figurasgeometricastarea.FigurasGeometricas;
import javax.swing.JOptionPane;
import figurasgeometricastarea.Datos;

/**
 *
 * @author KEVINSAMA
 */
public class Esfera extends Datos implements FigurasGeometricas 
 {
     double radio;
     double areaEsfera;
     double pi = Math.PI;
     
          //Construtor

    public Esfera(double radio) {
        this.radio = radio;
       
    }

    public double getRadio() {
        return radio;
    }

    public double getAreaEsfera() {
        return areaEsfera;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
     
    
    
      @Override
    public void area() 
    {
        areaEsfera = (4 * pi * radio * radio);
    }
    
     @Override
     public void verDatos(){
     
     JOptionPane.showMessageDialog(null,"PI: " + pi + "\nRadio: " + radio + "\nEl area de la Esfera es: "+ areaEsfera, "\nArea de la Esfera: ", JOptionPane.INFORMATION_MESSAGE);
     }
}
