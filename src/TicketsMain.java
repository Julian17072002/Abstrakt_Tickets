
abstract class TicketsMain {

	   static String eventOrt;
	   static String eventName;
	   static int basisPreis = 10;
	   static int ticketPreis;

	   public TicketsMain (String ort, String name, int preis) {
		    eventOrt = ort;
		    eventName = name;
		    basisPreis = preis;
	   }   
	
	   public abstract int berechneTicketpreis();
	   
	   public static void output() {
	      String text;
	      text  = "Eventort: " + eventOrt;
	      text += ", Eventname: " + eventName;
	      text += ", Preis: " + ticketPreis + " Euro";
	      System.out.println(text);
	      System.out.println(" ");
	   }
}
