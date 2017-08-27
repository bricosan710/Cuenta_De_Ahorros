
/**
 * Write a description of class CuentaDeAhorros here.
 * 
 * @author (Betsy Rico) 
 * @version (1.0)
 */
public class CuentaDeAhorros
{
     private Double saldo;
    private Double interes;

    public CuentaDeAhorros(Double saldo, Double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double retirar(Double valor) {
        if (this.getSaldo() != 0) {
            this.setSaldo(this.getSaldo() - valor);
            return valor;
        }
        return 0.0;
    }

    public void depositar(Double valor) {
        if (this.getSaldo() != 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void interesAbonadoMensual() {
        Double interesMes = (this.getInteres()) / 100;
        Double valor = (interesMes * this.getSaldo()) + this.getSaldo();
        this.setSaldo(valor);
    }

}
 