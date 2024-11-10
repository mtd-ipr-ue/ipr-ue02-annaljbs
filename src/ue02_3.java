import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        
        double radius = 4.0;

        
        System.out.println("Gib den Punkt x einer Koordinate ein: ");
        double x = In.readDouble(); 
        System.out.println("Gib den Punkt y einer Koordinate ein: ");
        double y = In.readDouble(); 

        // Berechnung der Distanz vom Mittelpunkt
        double distanz = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));


        if (distanz <= radius) {
            System.out.println("Der Punkt liegt innerhalb oder auf dem Rand des Kreises.");
        } else {
            System.out.println("Der Punkt liegt außerhalb des Kreises.");
        }
    }
}
