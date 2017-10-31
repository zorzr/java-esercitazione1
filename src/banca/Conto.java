// ESERCITAZIONE 1
package banca;

/**
 * @see Test
 * @see Banca
 * @see Test2
 * @author zorzr
 */

public class Conto {
    private String iban, cf;
    private double saldo;
    
    public Conto(String ib, String codf) {
        this.iban = ib;
        this.cf = codf;
        this.saldo = 0.;
    }
    
    public boolean preleva (double p) {
        if (p > 0. || p < -saldo)  return false;
        
        saldo += p;
        return true;
    }
    
    public boolean deposita (double c) {
        if (c < 0.)  return false;
        
        saldo += c;
        return true;
    }
    
    
    // Aggiunte per fare il punto 3
    public String getIban () {
        return iban;
    }
    public double getSaldo () {
        return saldo;
    }
    public String getCf() {
        return cf;
    }
}