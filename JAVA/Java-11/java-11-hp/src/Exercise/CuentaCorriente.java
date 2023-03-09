package Exercise;

public class CuentaCorriente extends Cuenta {
    private float cupoSobregiro;
    private boolean activa;

    public CuentaCorriente(float saldoInicial, float tasaAnual, float cupoSobregiro) {
        super(saldoInicial, tasaAnual);
        this.cupoSobregiro = cupoSobregiro;
        if (saldoInicial >= 0) {
            activa = true;
        } else {
            activa = false;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Error: La cuenta corriente esta inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            if (cantidad <= saldo + cupoSobregiro) {
                saldo -= cantidad;
                numRetiros++;
            } else {
                System.out.println("Error: La cantidad a retirar supera el cupo de sobregiro.");
            }
        } else {
            System.out.println("Error: La cuenta corriente esta inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        if (saldo < 0) {
            activa = false;
        } else {
            activa = true;
        }
        super.extractoMensual();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cupo de sobregiro: " + cupoSobregiro);
        System.out.println("Cuenta activa: " + activa);
    }
}
