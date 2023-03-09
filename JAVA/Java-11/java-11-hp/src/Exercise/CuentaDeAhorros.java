package Exercise;

public class CuentaDeAhorros extends Cuenta {
    private boolean activa;

    public CuentaDeAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        if (saldoInicial < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros esta inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros esta inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
        super.extractoMensual();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
    }
}
