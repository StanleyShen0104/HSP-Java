public class Homework05 {
	public static void main(String[] args) {
		
		/*	
			�������10����������1-100�������ӡ�������ƽ��ֵ�������ֵ�����±꣬���������Ƿ���8
		*/
		//����+��λ
		int[] a = new int[10];
		int[] ori = new int[10];
		//��������
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(100 * Math.random()) + 1;
			ori[i] = a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//ð�ݵ���
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			temp = a[0];
			for (int j = 1; j < a.length - i; j++) {
				if (a[j-1] < a[j]) {
					a[j-1] = a[j];
					a[j] = temp;
				}
				temp = a[j];
			}
		}

		//����ֵ
		int maxnum = a[0];
		int indexmax = -1;
		String indexeight = "������";
		int sum = 0;
		boolean haveeight;
		for (int i = 0; i < ori.length; i++) {
			//�����ӡ
			System.out.print(a[i]+" ");
			sum += ori[i];
			if (ori[i] == 8) {
				haveeight = true;
				indexeight = "����";
			} else if (ori[i] == maxnum) {
				indexmax = i;
			}
		}
		System.out.println();
		System.out.print("���ֵ��" + maxnum + " ���±���" + indexmax 
			+ " ƽ��ֵ��" + (sum/10.0) + " " + indexeight + "����8");	
	}			
}