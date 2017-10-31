/*                  ESERCITAZIONE 1 (CLASSI E ARRAY)
1. Creare una classe Conto con
        attributi: iban, cf, saldo
        metodi: preleva, deposita (restituiscano un booleano)
        costruttore: solo iban e cf
2. Testare la classe Conto con una classe apposita nel cui main vengano effettuate le seguenti operazioni:
        creare un oggetto Conto
        eseguire movimenti per verificare che i meccanismi di prelievo e deposito siano
        corretti, anche con importi di prelievo che superano il saldo
3. Creare la classe Banca:
        attributi: nome, numero di conti massimo, array di conti, numero di conti attivi, radice Iban
        metodi: aggiungi conto (che restituisca il Conto attivato), totale saldi, operazione (che gestisca 
            prelievo o deposito a seconda che l'importo sia positivo o negativo), getConto (dato il suo iban)
        costruttore: nome e numero conti massimo
4. Testare la classe Banca:
        creare una banca con 10 conti
        aggiungere qualche conto
        fare operazioni sui conti
        stampare saldo totale
        stampare elenco conti
*/
package banca;

/**
 * @see Conto
 * @see Banca
 * @author zorzr
 */

public class Test2 {
    public static void main(String[] args) {
        boolean x;
        Banca ubi = new Banca("UBI BANCA", 10);
        
        Conto conto01, conto02, conto03;
        conto01 = ubi.aggiungi_conto("CF01");
        check(conto01);
        conto02 = ubi.aggiungi_conto("CF02");
        check(conto02);
        conto03 = ubi.aggiungi_conto("CF03");
        check(conto03);
        
        
        x = ubi.operazione(conto01.getIban(), 100.);
        if (x)   System.out.println("01) OK!");
        else    System.out.println("01) Errore: operazione non eseguita");
        x = ubi.operazione(conto02.getIban(), -100.);
        if (x)   System.out.println("02) OK!");
        else    System.out.println("02) Errore: operazione non eseguita");
        x = ubi.operazione(conto01.getIban(), -50.);
        if (x)   System.out.println("03) OK!");
        else    System.out.println("03) Errore: operazione non eseguita");
        x = ubi.operazione(conto03.getIban(), 1000.);
        if (x)   System.out.println("04) OK!");
        else    System.out.println("04) Errore: operazione non eseguita");
        
        
        double tot = ubi.totale();
        System.out.println("\nTotale = " + tot + "\n");
        
        
        ubi.stampa_conti();
        System.exit(0);
    }
    
    private static void check (Conto c) {
        if (c == null) {
            System.out.println("Errore: numero massimo di conti raggiunto.\n");
            System.exit(-1);
        }
    }
}
