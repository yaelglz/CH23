package TestExercise;

import java.util.Scanner;

import Exercise.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese Saldo Inicial: ");
        double saldoInicial = sc.nextFloat();
        System.out.print("Ingrese Tasa de Interes: ");
        double tasaAnual = sc.nextFloat();
        Cuenta cuenta = new Cuenta(saldoInicial, tasaAnual);

        System.out.print("Ingrese Cantidad a Consignar: ");
        float cantidadConsignar = sc.nextFloat();
        cuenta.consignar(cantidadConsignar);

        System.out.print("Ingrese Cantidad a Retirar: ");
        float cantidadRetirar = sc.nextFloat();
        cuenta.retirar(cantidadRetirar);

        // Imprimir información de la cuenta
        cuenta.imprimir();
		
	}
}
