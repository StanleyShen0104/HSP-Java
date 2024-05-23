package homework13;

public class Homework13 {
	public static void main(String[] args) {
		Test tt = new Test();
		System.out.println("--------Printing--------");
		tt.printing();
		System.out.println("------Age Ranking------");
		tt.descend();
	}
}

class Test {
	public void printing() {
		Person[] parr = new Person[2];
		parr[0] = new Teacher("张飞", 'm', 30, 5);
		parr[1] = new Student("小明", 'm', 15, "00023102");
		for (int i = 0; i < parr.length; i++) {
			if (parr[i] instanceof Teacher) {
				((Teacher)parr[i]).printing();
			} else if(parr[i] instanceof Student) {
				((Student)parr[i]).printing();				
			}
			System.out.println("-----------------------");
		}
	}

	public void work(Person p) {
		if (p instanceof Teacher) {
			((Teacher) p).teach();
		} else if (p instanceof Student) {
			((Student) p).study();
		}
	}

	public void descend() {
		Person[] arr = new Person[4];
		arr[0] = new Student("Jim", 'm', 17, "STU001");
		arr[1] = new Student("Carl", 'f', 16, "STU002");
		arr[2] = new Teacher("Lucy", 'f', 40, 12);
		arr[3] = new Teacher("Ann", 'f', 36, 10);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j].getAge() > arr[j - 1].getAge()) {
					Person temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
