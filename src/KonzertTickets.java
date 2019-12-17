
class KonzertTickets extends TicketsMain {

	int filmDauer;
	 
	   public KonzertTickets(String ort, String name, int preis, int dauer) {
	      super();
	      filmDauer = dauer;
	   }
	 
	   public int berechneTicketpreis()
	   {
	      ticketPreis = basisPreis;
	 
	      if (filmDauer > 120)
	      {
	         ticketPreis += 3;
	      }
	      return ticketPreis;
	   }
}


