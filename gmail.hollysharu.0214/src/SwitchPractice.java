import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		final String GS="딸기 샌드위치";
		final String SEVEN="삼김";
		final String MINISTOP="핫바";
		final String CU="마크정식";
		
		//데이터를 입력받기 위한 구문 
		Scanner sc=new Scanner(System.in);
		System.out.printf("메뉴를 선택하세요\n1. 딸기 샌드위치 2. 삼김 3. 핫바 4. 마크정식\n");
		String convenienceStore=sc.nextLine();
		
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
		
		
		sc.close();
	}

}
