public class Automovil {

    public String marca= "Ford" ;
    public String color ;
    public String modelo;
    public boolean encendido;

     // Metodo CON parametro
public void ImprimirInformacionVehiculo(String marca){
    System.out.println("Marca:"+ marca);
}

 // Metodo SIN parametro (usa this)
public void ImprimirInformacionVehiculoV2(){
    System.out.println("Marca:"+ this.marca);
}
}

