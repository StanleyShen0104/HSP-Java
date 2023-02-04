import java.util.Scanner;
public class P0175_SeqSearch {
	public static void main(String[] args) {
		
		/*	
			顺序查找，返回下标值
		*/
		System.out.println("请输入搜索名：");
		Scanner mys = new Scanner(System.in);
		String name = mys.next();
		String[] a = { "白眉狮王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		for (int i = 0; i < a.length; i++) {
			if (name.equals(a[i])) {
				System.out.println("找到"+a[i]+" 索引值为"+i);
				break;
			} else if (i == a.length -1) {
				System.out.println("不存在");
				break;
			}
		}	
	}	
}