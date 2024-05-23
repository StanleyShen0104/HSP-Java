package homework01;

import java.util.ArrayList;
import java.util.List;

public class Homework01 {
	public static void main(String[] args) {
		Person[] parray = new Person[3];
		parray[0] = new Person("Jim", "Police", 21);
		parray[1] = new Person("Cara", "Teacher", 23);
		parray[2] = new Person("Kay", "Cook", 50);
		new Tools().sort(parray);
		for (int i = 0; i < parray.length; i++) {
			System.out.println(parray[i]); // 直接打印对象，默认调用toString方法
		}
	}

}

class Tools {
	public void sort(Person... parray) {
		for (int j = 0; j < parray.length - 1; j++) {
			for (int i = 1; i < parray.length - j; i++) {
				if (parray[i].getAge() > parray[i - 1].getAge()) {
					Person temp = parray[i - 1];
					parray[i - 1] = parray[i];
					parray[i] = temp;
				}
			}
		}
	}
}
