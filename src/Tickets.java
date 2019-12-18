
public class Tickets {

	  public static void main (String[] args) {
		    SportTickets st1 = new SportTickets("Barcelona", "BAR-RM", 120, 10);
			st1.output();
	
			KonzertTickets ct1 = new KonzertTickets("Innsbruck", "Bach", 100, 200);
			ct1.output();
			
			TheatherTickets tt1 = new TheatherTickets("Wien", "Romeo_und_Julia", 50, 20);
			tt1.output();
	  }
}

