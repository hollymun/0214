
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
		
		//1���� 10���� �հ� ���ϱ�
		i=1;
		//�հ踦 ������ ���� ���� 
		int sum=0;
		while(i<11) {
			//�հ踦 ���� ���� �հ�=�հ�+���� ���� ����
			sum=sum+i;
			i=i+1;
		}
		System.out.printf("�հ�: %d\n", sum);

		//���� ������ �����ؼ� 
		//1���� 10������ ���� �߿��� ¦���� �� 
		i=1;
		int sum2=0;
		sum2=0;
		while(i<6) {
			sum2=sum2+i*2;
			i=i+1;
		}
		System.out.printf("¦���� ��: %d\n", sum2);
		
		//1���� 10������ ����� �Ҽ� ù° �ڸ����� ���ؼ� ��� 
		double avg=(double)sum/10;
		System.out.printf("���: %f\n", avg);
			
				
	}
}
