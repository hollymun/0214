
public class ForMain {

	public static void main(String[] args) {
		//Hello Java를 3번 출력
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");

		System.out.printf("=====================\n");
		
		//for 구문 외에서도 i를 사용하기 위해 영역 외에서 변수 선언 
		int i;
		//i가 3보다 작지 않을 때까지 1씩 증가하면서 { }의 내용을 수행
		//둘째 표현식 생략가능하지만 계속 반복됨  
		for(i=0; i<3; i=i+1) {	
			System.out.printf("Hello Java\n");
		}

		System.out.printf("=====================\n");
		// 1 2 3
		for(i=0;i<3;i=i+1) {
			System.out.printf("i:%d\n",i+1); //기준점 맞추기
		}

		System.out.printf("=====================\n");
		// 0 2 4
		for(i=0;i<3;i=i+1) { 
			System.out.printf("i:%d\n",i*2); 
		}
		
	}
}
