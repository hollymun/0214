
public class BreakAndContinue {

	public static void main(String[] args) {
	/*
		for(int i=0; i<10; i=i+1) {
			//continue; 세 번째 구문으로 넘어가서 반복함 
			System.out.printf("break와 continue 연습\n");
			continue; //없어도 진행됨 
		}
		
		//3의 배수가 되면 멈추기
		for(int i=1; i<=10; i=i+1) {
			if(i%3==0) { 
			break; 
			}
			System.out.printf("i: %d\n", i);
		}
	*/
	
		//반복문 안에 반복문이 있는 중첩 반복문 
		//OUTER라는 레이블을 가진 반복문 
		OUTER:for(int i=0; i<3; i=i+1) {
			System.out.printf("★\n");
			for(int j=0; j<3; j=j+1) {
				System.out.printf("♨♨♨\n");
				//break는 가장 가까운 switch나 반복문에 영향을 줍니다 
				//break나 continue 뒤에 레이블을 붙이면 레이블에 해당하는 제어문에 영향을 줍니다 
				break OUTER;
			}
		}
		

	
	
	
	}
}
