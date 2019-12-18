
class TheatherTickets extends TicketsMain {

	int sitzReihe;
	 
	   public TheatherTickets(String ort, String name, int preis, int reihe) {
	      super(ort, name, preis);
	      reihe = sitzReihe;
	   }
	 
	   public int berechneTicketpreis() {
	      ticketPreis = basisPreis * sitzReihe;
	      return ticketPreis;
	   }   
}
