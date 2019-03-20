import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
	/*	
		//1. 연도 입력 받기
		Scanner sc=new Scanner(System.in);
		System.out.printf("연도를 입력하세요\n: ");
		int year=sc.nextInt();
		//입력한 연도 그대로 출력되는지 확인
		//System.out.printf("%d\n", year);  
		
		//2. 윤년 판별
		//(4의 배수이고 100의 배수가 아닌 경우) 또는 400의 배수인 경우
		//조건 ~라면 -> 분기문, 1) 데이터-if  2) 값-switch
		if(year%4==0&&year%100!=0||year%400==0) {
			//출력할 내용 
			System.out.printf("윤년");  
		}else {
			System.out.printf("윤년 아님");
		}
	*/	
		
		
		//1. 숫자 입력 받기 
		//2. 소수 판별하기 
		//소수는 2부터 / 자신의 절반까지 / 
		//절반으로 나누었을 때 / 
		//떨어지면 소수 x / 떨어지지 않으면 소수o    
		Scanner sc=new Scanner(System.in);
		System.out.printf("숫자를 입력하세요\n: ");
		int su=sc.nextInt();
		int i;
	/*	
		for(i=2; i<=su/2; i=i+1) {
			
			if(su%i==0) {
				break;
			}
			
			if(i==su/2+1) {
				System.out.printf("소수o");
			}else {
				System.out.printf("소수x");
			}
		}
	*/
		
		//소수인지 확인 
		boolean flag=false;
		for(i=2; i<=su/2; i=i+1) {
			if(su%i==0) { //나누어 떨어지면 플래그는 true되고 멈춤 
				flag=true; 
				break;
			}
		}
		
		//확인된 결과를 출력
		if(flag==true) {
			System.out.printf("%d: 소수 아님", su);
		}else {
			System.out.printf("%d: 소수", su);
		}
		
		
		
		
		sc.close();
	}
}
