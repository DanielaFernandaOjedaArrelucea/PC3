package javaApplication13;

public class JavaApplication13 {
    private String numero_cuenta;
    private String fecha_apuesta;
    private float saldo_actual;
    private int length;

    public JavaApplication13(String numero_cuenta, String fecha_apuesta, float saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.fecha_apuesta = fecha_apuesta;
        this.saldo_actual = saldo_actual;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public String getFecha_apuesta() {
        return fecha_apuesta;
    }

    public float getSaldo_actual() {
        return saldo_actual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numero_cuenta=" + numero_cuenta + '}';
    }
    
}
