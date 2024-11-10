import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        
     System.out.print("Geben Sie eine Jahreszahl ein: ");
     int year = In.readInt();

     
     System.out.print("Geben Sie einen Monats-Wert zwischen 1 und 12 ein: ");
     int month = In.readInt();

        
        if (month < 1 || month > 12) {
            System.out.println("Fehler: Der Monat muss zwischen 1 und 12 liegen.");
            return;
        }
        
        int daysmonth;
        switch (month) {
            case 1: 
            case 3:
            case 5: 
            case 7:
            case 8:
            case 10:
            case 12: 
                daysmonth = 31;
                break;
            case 4: 
            case 6:
            case 9: 
            case 11:
                daysmonth = 30;
                break;
            case 2: 
                
                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysmonth = 29;
                } else {
                    daysmonth = 28;
                }
                break;
            default:
                
                daysmonth = 0;
        }

        System.out.println("Der Monat " + month + " im Jahr " + year + " hat " + daysmonth + " Tage.");
    }
}
