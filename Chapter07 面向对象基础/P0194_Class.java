public class P0194_Class {
	public static void main(String[] args) {
		
		/*	
			���а������Ժͷ���
			��Ķ��屾��������java�д���һ���µ��Զ�����������

			ʵ���������������﷨��
			���� ������ = new ����();

			��ֲ�������
			���� ������;           �˲���ջ����������ָ�򣬵���ַ��null
			������ = new ����();	  �˲��ڶ��п��ٿռ䣬������ַ���ظ�ջ
			
			ʵ����ջ��ֻ������ƺ͵�ַ����ַָ����пռ�
			����ڶ��е�����ֵ��һ����������
			���������������ڶ��д�����ǵ�ַ
			��ַָ�򷽷����еĴ洢�ռ�

			����String�������ͣ����ڶ��д���ĵ�ַ����ָ�򷽷����еĳ������е�ĳһ���ַ���
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