public class CuentaBancaria {
    // 1. Atributos de la clase
    public String titular= "Luis";
    public double saldo = 500000.0;

    // 2.Metodos de la clase
    // Imprime: "Deposito realizado: " + monto
    public void Depositar(double monto) {
        if (this.saldo >= monto){
         System.out.println("Deposito Realizado"+ monto);
         //this.saldo= this.saldo-monto;
         this.saldo -= monto;
         System.out.println("Nuevo saldo: $"+ this.saldo); 
        } 
        else {
            System.out.println("Deposito no Realizado, saldo insuficiente");
        }

    }
    public void Monstrarsaldo(){
        System.out.println("Titular;"+ this.titular);
    }





}
