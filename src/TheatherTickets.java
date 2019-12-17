
class TheatherTickets extends TicketsMain {

	int sitzReihe;
	 
	   public TheatherTickets(String ort, String name, int preis, int reihe) {
	      super();
	      sitzReihe = reihe;
	   }
	 
	   public int berechneTicketpreis() {
	      ticketPreis = basisPreis * sitzReihe;
	       
	      return ticketPreis;
	   }   
}
