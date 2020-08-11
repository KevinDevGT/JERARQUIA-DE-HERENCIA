
package figurasplanas;

import figurasgeometricastarea.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVINSAMA
 */

public class Triangulo extends Datos implements figurasgeometricastarea.FigurasGeometricas
{ 
     double base;
     double altura;
     double areaTriangulo;

         //Construtor
    public Triangulo(double base, double altura) {
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

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    
    
    /////////////////////////////
    
    
    //////Interface

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
     @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null,"Base: " + base + "\nAltura: " + altura + "\nEl Area del Triangulo: " + areaTriangulo + " Mts.", "\nArea del Triangulo: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}