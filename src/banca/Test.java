// ESERCITAZIONE 1
package banca;

/**
 * @see Conto
 * @author zorzr
 */

public class Test {
    public static void main1(String[] args) {
        Conto conto1;
        conto1 = new Conto("IBAN01", "CF01");
        
        boolean x;
        double val = 100.;
        
        System.out.println("\n" + val);
        x = conto1.deposita(val);
        if (!x)   System.out.println("Errore: operazione non eseguita");
        
        val = -50.;
        System.out.println("\n" + val);
        x = conto1.deposita(val);
        if (!x)   System.out.println("Errore: operazione non eseguita");
        
        val = -50.;
        System.out.println("\n" + val);
        x = conto1.preleva(val);
        if (!x)   System.out.println("Errore: operazione non eseguita");
        
        val = -100.;
        System.out.println("\n" + val);
        x = conto1.preleva(val);
        if (!x)   System.out.println("Errore: operazione non eseguita");
    }
    
}
