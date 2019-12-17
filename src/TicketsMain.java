
abstract class TicketsMain {

	   static String eventOrt;
	   static String eventName;
	   static int basisPreis;
	   static int ticketPreis;

	public static void Ticket (String ort, String name, int preis) {
	      eventOrt = ort;
	      eventName = name;
	      basisPreis = preis;
	   }   
	
	   public abstract int berechneTicketpreis();
	   
	   public static void printTicketdaten() {
	      String text;
	      text  = "Eventort: " + eventOrt;
	      text += ", Eventname: " + eventName;
	      text += ", Preis: " + ticketPreis + " Euro";
	      System.out.println(text);
	   }
}
