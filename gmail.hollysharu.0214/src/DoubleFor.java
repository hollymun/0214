
public class DoubleFor {

	public static void main(String[] args) {
		int cnt=1;
	/*
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5; j=j+1) {
				System.out.printf("%3d", cnt);
				cnt=cnt+1;
			}
			System.out.printf("\n");
		}
	
		
		for(int i=0; i<25; i=i+1) {
			System.out.printf("%3d", cnt);			
			cnt=cnt+1;

			if(i%5==0) {
				System.out.printf("\n");		
			}
		}
	*/

		for(int i=0; i<=10; i=i+1) {
			if(i<=4) {
				for(int j=0; j<=i; j=j+1) {
					System.out.printf("*");
				}
				System.out.printf("\n"); 
				}else if(i>4){
					for(int j=0; j<=10-i; j=j+1) {
						System.out.printf("*");
					}
				System.out.printf("\n"); 
				}
			} 
		
		
		System.out.printf("================\n");
		
		//피보나치 수열 
		//1, 1, 2, 3, 5, 8, 13, 21, 34
		//

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
