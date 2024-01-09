package mytools;

import java.util.Arrays;

import com.xiaoming.Dog;

public class test {
	public static void main(String[] args) {
		Dog dq = new Dog();
		int[] arr = {1, -4, 9, 0};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
