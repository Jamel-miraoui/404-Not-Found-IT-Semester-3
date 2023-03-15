package EX3;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine();

        
        mot = mot.toLowerCase();

        int nbA = 0;
        int nbE = 0;
        int nbI = 0;
        int nbO = 0;
        int nbU = 0;
        int nbY = 0;

        
        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            if (c == 'a') {
                nbA++;
            } else if (c == 'e') {
                nbE++;
            } else if (c == 'i') {
                nbI++;
            } else if (c == 'o') {
                nbO++;
            } else if (c == 'u') {
                nbU++;
            } else if (c == 'y') {
                nbY++;
            }
        }

        
        System.out.println(nbA +" fois la lettre a");
        System.out.println(nbE +" fois la lettre e");
        System.out.println(nbI +" fois la lettre i");
        System.out.println(nbO +" fois la lettre o");
        System.out.println(nbU +" fois la lettre u");
        System.out.println(nbY +" fois la lettre y");

	}

}
