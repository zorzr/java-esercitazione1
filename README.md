# java-esercitazione1
Esercitazione 1 - Classi e Array

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
