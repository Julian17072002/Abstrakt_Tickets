
class SportTickets extends TicketsMain {

	 int finalStufe;
	 
	   public SportTickets(String ort, String name, int preis, int stufe) {
	      super();
	      finalStufe = stufe;
	   }
	 
	   public int berechneTicketpreis() {
	      ticketPreis = basisPreis + (10 * finalStufe);
	       
	      return ticketPreis;
	   }
}
