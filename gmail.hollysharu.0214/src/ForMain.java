
public class ForMain {

	public static void main(String[] args) {
		//Hello Java�� 3�� ���
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");

		System.out.printf("=====================\n");
		
		//for ���� �ܿ����� i�� ����ϱ� ���� ���� �ܿ��� ���� ���� 
		int i;
		//i�� 3���� ���� ���� ������ 1�� �����ϸ鼭 { }�� ������ ����
		//��° ǥ���� �������������� ��� �ݺ���  
		for(i=0; i<3; i=i+1) {	
			System.out.printf("Hello Java\n");
		}

		System.out.printf("=====================\n");
		// 1 2 3
		for(i=0;i<3;i=i+1) {
			System.out.printf("i:%d\n",i+1); //������ ���߱�
		}

		System.out.printf("=====================\n");
		// 0 2 4
		for(i=0;i<3;i=i+1) { 
			System.out.printf("i:%d\n",i*2); 
		}
		
	}
}
