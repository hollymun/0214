
public class BreakAndContinue {

	public static void main(String[] args) {
	/*
		for(int i=0; i<10; i=i+1) {
			//continue; �� ��° �������� �Ѿ�� �ݺ��� 
			System.out.printf("break�� continue ����\n");
			continue; //��� ����� 
		}
		
		//3�� ����� �Ǹ� ���߱�
		for(int i=1; i<=10; i=i+1) {
			if(i%3==0) { 
			break; 
			}
			System.out.printf("i: %d\n", i);
		}
	*/
	
		//�ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ��� 
		//OUTER��� ���̺��� ���� �ݺ��� 
		OUTER:for(int i=0; i<3; i=i+1) {
			System.out.printf("��\n");
			for(int j=0; j<3; j=j+1) {
				System.out.printf("�͢͢�\n");
				//break�� ���� ����� switch�� �ݺ����� ������ �ݴϴ� 
				//break�� continue �ڿ� ���̺��� ���̸� ���̺� �ش��ϴ� ����� ������ �ݴϴ� 
				break OUTER;
			}
		}
		

	
	
	
	}
}
