package UF2.Recursivitat;

public class Recursivitat{
	public static void main(String args[]) {
		ParellSenar(33);
	}

	private static void ParellSenar(int x) {
		if (x <= 0) {
			return;
		}
		else if (x % 2 == 0) {
			System.out.println("El nombre " + x + " és parell");
		}
		else {
			System.out.println("El nombre " + x + " és senar");
		}

		ParellSenar(x - 1);
	}
}