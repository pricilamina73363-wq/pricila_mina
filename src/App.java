public class App {
    public static void main(String[] args) {
       // 1. Instanciar las Clases
        Automovil miAuto = new Automovil();
        Persona persona= new Persona();
        Calculadora calculadora= new Calculadora();
        Rectangulo rectangulo= new Rectangulo();
        CuentaBancaria cuenta= new CuentaBancaria();
        Estudiante estudiante= new Estudiante();
        Producto producto= new Producto();
        Mascota mascota = new Mascota();


        // 2. llamamos los metodos de la clase Automovil
        miAuto.ImprimirInformacionVehiculo("Mercedes");
        miAuto.ImprimirInformacionVehiculoV2();

        //3. llamamos los metodos de la clase persona
        persona.saludar("yaneth");

        //4. llamamos los metodos de la clase Calculadora
        calculadora.Sumar (50, 40);
        calculadora.SumaSinParams();
        calculadora.SumaGlobal(70);

        //5. llamamos los metodos de la clase Rectangulo
        rectangulo.CalcularArea(10,5);
        rectangulo.CalcularAreaSinParams();

        //6. llamamos metodos cuenta bancaria
        cuenta.Depositar(100000);
        cuenta.Monstrarsaldo();

        //7. metodos de la clase Estudiante
        estudiante.RegistrarNota(4);
        estudiante.VerificarEstado();

        // 8. metodos de la clase Termometro

        // 9. metodos de la clase Producto
          producto.aplicarDescuento(20000, 20);
          producto.mostrarInfo();
          System.out.println();
       // 9. metodos de la clase Mascota
        mascota.emitirSonido("ladrido");
        mascota.describir();
        System.out.println();
    }  
}
