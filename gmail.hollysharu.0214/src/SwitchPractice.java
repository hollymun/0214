import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		final String GS="���� ������ġ";
		final String SEVEN="���";
		final String MINISTOP="�ֹ�";
		final String CU="��ũ����";
		
		//�����͸� �Է¹ޱ� ���� ���� 
		Scanner sc=new Scanner(System.in);
		System.out.printf("�޴��� �����ϼ���\n1. ���� ������ġ 2. ��� 3. �ֹ� 4. ��ũ����\n");
		String convenienceStore=sc.nextLine();
		
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
		
		
		sc.close();
	}

}
