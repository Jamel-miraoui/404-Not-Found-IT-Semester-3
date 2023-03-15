package EX4;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de mots ? ");
        int n = scanner.nextInt();

        String[] mots = new String[n];
        System.out.println("Donnez vos mots :");

        for (int i = 0; i < n; i++) {
            mots[i] = scanner.next();
        }

        Arrays.sort(mots);

        System.out.println("Liste par ordre alphabétique :");
        for (String mot : mots) {
            System.out.println(mot);
        }
	}

}
