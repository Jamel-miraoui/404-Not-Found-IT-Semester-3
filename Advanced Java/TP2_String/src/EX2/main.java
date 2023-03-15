package EX2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez un nombre entier : ");
        int nombre = scanner.nextInt();

        String nombreStr = Integer.toString(nombre);

        for (int i = 0; i < nombreStr.length(); i++) {
            System.out.println(nombreStr.charAt(i));
        }

	}

}
