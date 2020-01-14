
public class Tickets {

	  public static void main (String[] args) {
		    SportTickets st1 = new SportTickets("Barcelona", "BAR-RM", 120, 10);
			st1.output();
	
			KonzertTickets ct1 = new KonzertTickets("Innsbruck", "J_S_Bach Goldbergvariation", 100, 200);
			ct1.output();
			
			TheatherTickets tt1 = new TheatherTickets("Wien", "Romeo_und_Julia", 50, 20);
			tt1.output();
	  
		  TicketShop shop = new TicketShop();
		  shop.bestellen(st1);
		  shop.bestellen(ct1);
		  shop.bestellen(tt1);
		  System.out.println("Anzahl der verfügbaren Tickets: "+shop.getAnzahlTickets());
		  System.out.println("Günstigstes verfügbare Ticket: "+shop.getGuenstigstesTicket());
		  System.out.println("Teuerste verfügbare Ticket: "+shop.getTeuerstesTicket());
	  }
}

