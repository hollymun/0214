import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
	/*	
		//1. ���� �Է� �ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.printf("������ �Է��ϼ���\n: ");
		int year=sc.nextInt();
		//�Է��� ���� �״�� ��µǴ��� Ȯ��
		//System.out.printf("%d\n", year);  
		
		//2. ���� �Ǻ�
		//(4�� ����̰� 100�� ����� �ƴ� ���) �Ǵ� 400�� ����� ���
		//���� ~��� -> �б⹮, 1) ������-if  2) ��-switch
		if(year%4==0&&year%100!=0||year%400==0) {
			//����� ���� 
			System.out.printf("����");  
		}else {
			System.out.printf("���� �ƴ�");
		}
	*/	
		
		
		//1. ���� �Է� �ޱ� 
		//2. �Ҽ� �Ǻ��ϱ� 
		//�Ҽ��� 2���� / �ڽ��� ���ݱ��� / 
		//�������� �������� �� / 
		//�������� �Ҽ� x / �������� ������ �Ҽ�o    
		Scanner sc=new Scanner(System.in);
		System.out.printf("���ڸ� �Է��ϼ���\n: ");
		int su=sc.nextInt();
		int i;
	/*	
		for(i=2; i<=su/2; i=i+1) {
			
			if(su%i==0) {
				break;
			}
			
			if(i==su/2+1) {
				System.out.printf("�Ҽ�o");
			}else {
				System.out.printf("�Ҽ�x");
			}
		}
	*/
		
		//�Ҽ����� Ȯ�� 
		boolean flag=false;
		for(i=2; i<=su/2; i=i+1) {
			if(su%i==0) { //������ �������� �÷��״� true�ǰ� ���� 
				flag=true; 
				break;
			}
		}
		
		//Ȯ�ε� ����� ���
		if(flag==true) {
			System.out.printf("%d: �Ҽ� �ƴ�", su);
		}else {
			System.out.printf("%d: �Ҽ�", su);
		}
		
		
		
		
		sc.close();
	}
}
