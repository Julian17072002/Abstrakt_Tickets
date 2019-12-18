
class KonzertTickets extends TicketsMain {

	int konzertDauer;
	 
	   public KonzertTickets(String ort, String name, int preis, int dauer) {
	      super(ort, name, preis);
	      konzertDauer = dauer;
	   }
	 
	   public int berechneTicketpreis()
	   {
	      ticketPreis = basisPreis;
	 
	      if (konzertDauer > 120)
	      {
	         ticketPreis += 3;
	      }
	      return ticketPreis;
	   }
}


