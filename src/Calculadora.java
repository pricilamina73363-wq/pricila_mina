public class Calculadora {
    // 1. Atributos de la clase
    public double num1 = 10.0;
    public double num2 = 5.0;

    // 2.Metodos de la clase
    /* Metodo para sumar dos numeros que recibe por parametros */

    public void Sumar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("la suma es: " + resultado);
    }

    // Metodo que no recibe parametros, que opera con loc atributos de la clase
    public void SumaSinParams() {
        double resultado = this.num1 + this.num2;
        System.out.println("la suma es: " + resultado);
    }
    public void SumaGlobal (double numero1){
       double resultado = numero1 + this.num2;
        System.out.println("la suma es: " + resultado);
    }
}   
