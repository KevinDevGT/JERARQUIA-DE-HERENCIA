
package figurasgeometricastarea;


//importamoos el otro paquete
import figurasplanas.Triangulo;
import figurasplanas.Cuadrado;
import figurasplanas.Circulo;
import figurasplanas.Rectangulo;
import figurastridimencionales.Cubo;
import figurastridimencionales.Esfera;

import javax.swing.JOptionPane;

public class GeometriaTarea {

    public static void main(String[] args) {
  
        double lado;
        double base;
        double altura;
        double radio;
        
       
    
        //cuadrado
        lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el Lado del Cuadrado en Metros: ","DATOS",2));
        Cuadrado cuadrado = new Cuadrado(lado);
        cuadrado.area();
        cuadrado.verDatos();
       
        
        //cirulo
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el Radio del Circulo en Metros: ","DATOS",2));
        Circulo circulo = new Circulo(radio);
        circulo.area();
        circulo.verDatos();
       
        
        
      
        //rectangulo
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la Base del Rectangulo en Metros: ","DATOS",2));
        base = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la Altura del Rectangulo en Metros: ","DATOS",2));
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.area();
        rectangulo.verDatos();
        
        
        
        //triangulo
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la Base del Triangulo en Metros: ","DATOS",2));
        base = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la Altura del Triangulo en Metros: ","DATOS",2));
        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.area();
        triangulo.verDatos();
        
       
        //Cubo
        lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el Lado del Cubo en Metros: ","DATOS",2));
        Cubo cubo = new Cubo(lado);
        cubo.area();
        cubo.verDatos();
        
        
       //Esfera
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el Radio de la Esfera en Metros: ","DATOS",2));
        Esfera esfera = new Esfera(radio);
        esfera.area();
       esfera.verDatos();
    }
    
    
}
