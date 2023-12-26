import java.util.Scanner;

public class MethodExercise02 {
	public static void main(String[] args) {
		int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
		MyTools mt = new MyTools();
		mt.printArray(arr);
		Person p = new Person();
		Person p1 = mt.copyPerson(p);
		System.out.println(p == p1);
	}
}

class MyTools {
	public void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public Person copyPerson(Person p) {
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
}

class Person {
	String name = "A";
	int age = 18;
}