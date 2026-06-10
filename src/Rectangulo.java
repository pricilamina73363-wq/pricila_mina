public class Rectangulo {
   
 // 1. Atributos de la clase
 public double base= 8.0;
 public double altura= 4.0;

 // 2.Metodos de la clase
 public void CalcularArea(double base, double altura){
    double resultado_area = base* altura;
    System.out.println( "el área del rectangulo es"+ resultado_area);
 }
 public void CalcularAreaSinParams(){
    double resultado_area = this.base*this.altura;
    System.out.println( "el área del rectangulo es"+ resultado_area);
 }
 public void CalularPerimetro(){
    
 }
 }

