import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Gib eine Zahl ein:");
        int numberone = In.readInt();

        Out.println("Gib eine Zahl ein:");
        int numbertwo = In.readInt();

        Out.println("Gib eine Zahl ein:");
        int numberthree = In.readInt();

        if(numberone > numbertwo && numberone > numberthree){
            Out.print("Die Zahl " + numberone + " ist das Maximum");
        } 
        if(numbertwo > numberone && numbertwo > numberthree){
            Out.print("Die Zahl " + numbertwo + " ist das Maximum");
        }
        if(numberthree > numbertwo && numberthree > numberone){
            Out.print("Die Zahl " + numberthree + " ist das Maximum");
        }
    }
}
