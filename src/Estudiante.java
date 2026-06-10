public class Estudiante {
    // Aributos
    public String nombre = "Maria";
    public double nota = 3.8;

    // Metodo para registrar nota
    public void RegistrarNota(double notaRecibida) {
        double promedio_notas = (this.nota + notaRecibida) / 2;
        System.out.println("El promedio de dnotas es" + promedio_notas);
    }

    public void VerificarEstado() {
        if (promedio_notas >= 3) {
            System.out.println("El estudiante " + this.nombre + "aprobado");
        } else {
            System.out.println("El estudiante " + this.nombre + "Reprobado");
        }
    }

}
