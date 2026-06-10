public class Persona {
    // 1.tributos de la clase
    public String nombre = "Ana";
    public int edad = 25;
    
    // 2. TODO: Metodo CON parametro - recibe un String llamado nombre
    // Imprime: "Hola, me llamo: " + nombre
    public void saludar(String nombre) {
        System.out.println("Hola, me llamo"+ nombre);
    }

    // TODO: Metodo SIN parametro - usa this.nombre y this.edad
    public void presentarse() {
        System.out.println("Me llamo"+ this.nombre +"y tengo"+ this.edad+ "Años");
    }
}



