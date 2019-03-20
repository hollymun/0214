import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		//변수의 자료형 앞에 final이 붙으면 데이터를 변경할 수 없는 상수가 됨
		//constant(상수)는 모두 대문자로 사용 
		final int GS=1;
		final int SEVEN=2;
		final int MINISTOP=3;
		final int CU=4;
		
		//데이터를 입력받기 위한 구문 
		Scanner sc=new Scanner(System.in);
		System.out.printf("1-4번 중 선택하세요\n");
		int convenienceStore=sc.nextInt();
		
		//switch에는 정수와 String만 가능 
		switch (convenienceStore) {
		//case에는 constant와 Literal만 가능 - 일반 변수 안 됨 
		case GS:
			//break를 생략하면 다음 break를 만날 때까지 전부 처리
			System.out.printf("GS\n");
			break;
		case SEVEN:
			System.out.printf("SE7EN\n");
			break;
		case MINISTOP:
			System.out.printf("mini stop\n");
			break;
		case CU:
			System.out.printf("CU\n");
			break;
		default:
			System.out.printf("1-4번 중에 선택하세요\n");
			break;
		}
		
	}
}
