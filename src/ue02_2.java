import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        
     System.out.print("Geben Sie eine Jahreszahl ein: ");
     int jahr = In.readInt();

     
     System.out.print("Geben Sie einen Monats-Wert zwischen 1 und 12 ein: ");
     int monat = In.readInt();

        
        if (monat < 1 || monat > 12) {
            System.out.println("Fehler: Der Monat muss zwischen 1 und 12 liegen.");
            return;
        }

        
        int tageImMonat;
        switch (monat) {
            case 1: // Januar
            case 3: // März
            case 5: // Mai
            case 7: // Juli
            case 8: // August
            case 10: // Oktober
            case 12: // Dezember
                tageImMonat = 31;
                break;
            case 4: // April
            case 6: // Juni
            case 9: // September
            case 11: // November
                tageImMonat = 30;
                break;
            case 2: // Februar
                
                 if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
                    tageImMonat = 29; // Schaltjahr
                } else {
                    tageImMonat = 28; // Kein Schaltjahr
                }
                break;
            default:
                
                tageImMonat = 0;
        }

        
        System.out.println("Der Monat " + monat + " im Jahr " + jahr + " hat " + tageImMonat + " Tage.");
    }
}
