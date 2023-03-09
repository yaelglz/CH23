package Exercise;

public class Cuenta {
    protected double saldo;
    protected int numConsignaciones;
    protected int numRetiros;
    protected double tasaAnual;
    protected double comisionMensual;

    public Cuenta(double saldoInicial, double tasaAnual2) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual2;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
        numConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numRetiros++;
        } else {
            System.out.println("Error: No se puede retirar más dinero del que hay en la cuenta.");
        }
    }

    public void calcularInteresMensual() {
        double interesMensual = saldo * tasaAnual / 12 / 100;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
        numConsignaciones = 0;
        numRetiros = 0;
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones: " + (numConsignaciones + numRetiros));
    }
}