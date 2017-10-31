// ESERCITAZIONE 1
package banca;

/**
 * @see Conto
 * @see Test2
 * @author zorzr
 */

public class Banca {
    private final String nome, rad_iban;
    private int max, attivi;
    private Conto conti[];
    
    public Banca(String nome_banca, int n_conti) {
        this.nome = nome_banca;
        this.rad_iban = "000";
        this.max = n_conti;
        this.attivi = 0;
        this.conti = new Conto[n_conti];
    }
    
    public Conto aggiungi_conto (String codf) {
        if (attivi >= max)  return null;
        
        String iban = "IBAN" + attivi + rad_iban;
        conti[attivi] = new Conto(iban, codf);
        attivi++;
        
        return conti[attivi-1];
    }
    
    public double totale () {
        int i;
        double tot = 0.;
        
        for (i = 0; i < attivi; i++) {
            tot += conti[i].getSaldo();
        }
        
        return tot;
    }
    
    public boolean operazione (String iban, double val) {
        boolean esito;
        int i = getConto(iban);
        if (i < 0)  return false;
        
        if (val >= 0.)  esito = conti[i].deposita(val);
        else    esito = conti[i].preleva(val);
        
        return esito;
    }
    
    public int getConto (String iban) {
        int i;
        
        for (i = 0; i < attivi; i++) {
            if (iban.equals(conti[i].getIban()))    return i;
        }
        
        return -1;
    }
    
    
    // Aggiunta per punto 4
    public void stampa_conti () {
        int i;
        
        for (i = 0; i < attivi; i++) {
            System.out.println(conti[i].getCf() + "  " + conti[i].getIban() + "  " + conti[i].getSaldo());
        }
    }
}
