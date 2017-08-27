
/**
 * Write a description of class Ejecutar here.
 * 
 * @author (Betsy Rico) 
 * @version (a version number or a date)
 */
public class Ejecutar
{
    public static void main(String[] args) {

        CuentaDeAhorros ahorros1 = new CuentaDeAhorros(200000.0, 4.0);
        CuentaDeAhorros ahorros2 = new CuentaDeAhorros(300000.0, 5.0);

        for (int i = 0; i < 12; i++) {
            ahorros1.interesAbonadoMensual();
            ahorros2.interesAbonadoMensual();
            System.out.println("Cuenta Mes " + (i + 1));
            System.out.println("Ahorros 1 : " + ahorros1.getSaldo());
            System.out.println("Ahorros 2 : " + ahorros2.getSaldo());
        }

    }
}
