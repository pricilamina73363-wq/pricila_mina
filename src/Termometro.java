public class Termometro {
    // 1. Atributos de la clase
    private double celsius= 25.0;

    // Metodos
    public void ConvertirFa(double celsius){
        double fahrenheit= (celsius*9/5)+32;
        System.out.println(fahrenheit);
        
    }
    public void MostrarTemperatura(){
        System.out.println("Temperatura actual: "+ this.celsius + "grados Celsius");
    }

}
