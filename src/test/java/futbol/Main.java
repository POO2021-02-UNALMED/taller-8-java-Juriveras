package futbol;

public class Main {

	public static void main(String[] args) {
		Futbolista f2 = new Futbolista();
		Futbolista f1 = new Futbolista();
		Futbolista f3 = f1;
		
		System.out.println(f1.equals(f3));

	}

}
