
public class LoopPractice {

	public static void main(String[] args) {
	/*		
		int i=0;
		int j=0;
		int k=0;

		while(i<10) {
			System.out.printf("i: %d\n", i*2);
			i=i+1;
		}
	
		System.out.printf("================\n");
		

		while(j<10) {
			System.out.printf("j: %d\n", j*3);
			j=j+1;
		}

		System.out.printf("================\n");


		do {
			System.out.printf("k: %d\n",  k*2);
			k=k+1;
		}while(k<10);
	
		System.out.printf("================\n");

	*/
		int i=1;
		while(i<10) {
			System.out.printf("2 * %d = %d\n", i, i*2);
			i=i+1;
		}
		
		//1부터 10까지 합계 구하기
		i=1;
		//합계를 저장할 변수 생성 
		int sum=0;
		while(i<11) {
			//합계를 구할 때는 합계=합계+합을 구할 내용
			sum=sum+i;
			i=i+1;
		}
		System.out.printf("합계: %d\n", sum);

		//위의 내용을 변경해서 
		//1부터 10까지의 숫자 중에서 짝수의 합 
		i=1;
		int sum2=0;
		sum2=0;
		while(i<6) {
			sum2=sum2+i*2;
			i=i+1;
		}
		System.out.printf("짝수의 합: %d\n", sum2);
		
		//1부터 10까지의 평균을 소수 첫째 자리까지 구해서 출력 
		double avg=(double)sum/10;
		System.out.printf("평균: %f\n", avg);
			
				
	}
}
