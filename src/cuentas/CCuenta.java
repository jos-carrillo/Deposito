
package cuentas;

/**
 *
 * @author Jose Carrillo González - 1ºDAM
 * @version 1.0
 */
public class CCuenta {

    public String getNombre() {
        return nombre;
    }
/**
 * @param nombre titular de la cuenta
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }
/**
 * @param cuenta número de cuenta del titular
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
/**
 * 
 * @param saldo guarda saldo
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * 
 * @return muestra tipo de interés
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * 
 * 
 * @param tipoInterés aplica el tipo de interés
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * @return Retorna el estado del saldo
 */
    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad valor de importe a retirar
 * @throws Exception Excepciones de cantidad negativa y salgo insuficiente
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    
}
