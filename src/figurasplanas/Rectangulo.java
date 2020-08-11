
package figurasplanas;

import figurasgeometricastarea.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVINSAMA
 */

public class Rectangulo extends Datos implements figurasgeometricastarea.FigurasGeometricas
{
     double base;
     double altura;
     double areaRectangulo;

         //Construtor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
     /////////////////////////////

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

 
     
     /////////////////////////////
    //Interface
    @Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }
    
     @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null,"Base: " + base + "\nAltura: " + altura + "\nEl Area del cuadrado es: " + areaRectangulo + " Mts.", "\nArea del Cuadrado: ", JOptionPane.INFORMATION_MESSAGE);
    }
}