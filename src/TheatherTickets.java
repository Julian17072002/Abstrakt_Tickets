
class TheatherTickets extends TicketsMain {

	int sitzReihe;
	 
	   public TheatherTickets(String ort, String name, double preis, int reihe) {
	      super(ort, name, preis);
	      reihe = sitzReihe;
	     
	   }
	 
	   public double berechneTicketpreis() {
	      setTicketPreis(basisPreis * sitzReihe);
	      return getTicketPreis();
	   }   
}
