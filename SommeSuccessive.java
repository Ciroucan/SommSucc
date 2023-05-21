import java.util.Scanner;

public class SommSucc {

	public static void main(String[] args) {
		//Dichiarazione
		int n1, n2, r;
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire il primo numero");
		n1 = tastiera.nextInt();
		System.out.println("Inserire il secondo numero");
		n2 = tastiera.nextInt();
		r = 0;
		if (n2>0) {
			while (n2>0) {
				r = r + n1;
				System.out.println(r);
				n2 = n2-1;
			}
		}else {
			n2 = n2*(-1);
			while (n2>0) {
				r = r - n1;
				System.out.println(r);
				n2 = n2 - 1;
			}
		}
		System.out.println("Il risultato è " + r);
		tastiera.close();
	}
}
