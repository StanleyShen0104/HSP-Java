public class P0197_PropertiesDetail {
	public static void main(String[] args) {
		
		/*	
			�������η���������
			public��protected��private��Ĭ��ʲô����д

			��Ա��������ڶ���ʱ����ֵ��Ҳ��Ĭ��ֵ�������֮ǰ������Ĭ��ֵһ��
			char:\u0000 boolean:false String:null ����:0
			
			����������ʱ��
			1���ڷ��������ȼ�������Ϣ��ֻ�����׸��������ʱ����1�Σ������ظ�����
			2���ڶ��з���ռ䣬����Ĭ�ϳ�ʼ�����ѿռ��ַ���ظ�ջ
			3������ָ����ʼ��

		*/

		Cat c1 = new Cat();
		c1.name = "С��";
		c1.color = "��ɫ";
		c1.age = 3;
		c1.master = new String[3];
		c1.master[0] = "��Ȼ";
		c1.master[1] = "����";
		c1.master[2] = "ͨ��";
		System.out.print(c1.name + " " + c1.color + " " + c1.age + "��");
		System.out.println();
		System.out.print(c1.master[0] + c1.master[1] + c1.master[2]);
	}
}

class Cat { //������

	//���������� Ҳ�г�Ա�������е���Ҳ���ֶ�
	String name;
	String color;
	int age;
	String[] master;//����ʹ�����������ͣ�Ҳ��������������
}