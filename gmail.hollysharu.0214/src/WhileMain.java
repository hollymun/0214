
public class WhileMain {

	public static void main(String[] args) {
		int i=0;

		while(i<3) {
			System.out.printf("i: %d\n", i);
			i=i+1;
		}

		System.out.printf("=====================\n");
		
		while(i<3) {
			System.out.printf("i: %d\n", i);
			i=i+1;
		}

		System.out.printf("=====================\n");
		
		do{
			System.out.printf("i: %d\n", i);
			i=i+1;
		}while(i<3);
		
		
	}
}
