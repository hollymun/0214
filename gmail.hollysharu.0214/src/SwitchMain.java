import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		//������ �ڷ��� �տ� final�� ������ �����͸� ������ �� ���� ����� ��
		//constant(���)�� ��� �빮�ڷ� ��� 
		final int GS=1;
		final int SEVEN=2;
		final int MINISTOP=3;
		final int CU=4;
		
		//�����͸� �Է¹ޱ� ���� ���� 
		Scanner sc=new Scanner(System.in);
		System.out.printf("1-4�� �� �����ϼ���\n");
		int convenienceStore=sc.nextInt();
		
		//switch���� ������ String�� ���� 
		switch (convenienceStore) {
		//case���� constant�� Literal�� ���� - �Ϲ� ���� �� �� 
		case GS:
			//break�� �����ϸ� ���� break�� ���� ������ ���� ó��
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
			System.out.printf("1-4�� �߿� �����ϼ���\n");
			break;
		}
		
	}
}
