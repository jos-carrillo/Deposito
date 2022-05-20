
package cuentas;

/**
 *
 * @author Jose Carrillo Glez. - 1ºDAM
 * @version 1.0
 *  
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cantidad = 0;
        operativa_cuenta(cantidad);
    }

    /**
     * @since version 1.0
     * @param cantidad no se usa actualmente.
     * 
     */
    
    private static void operativa_cuenta(float cantidad) {
        
          
        CCuenta cuenta1;
        
        double saldoActual;
        
        
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
