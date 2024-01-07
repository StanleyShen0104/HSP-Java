import java.util.Scanner;

public class ChapterExercise06 {
	public static void main(String[] args) {
		Tom t = new Tom();
		Scanner mysc = new Scanner(System.in);
		char yn;
		do {
			t.fight();
			System.out.println("another round ? y/n");
			yn = mysc.next().charAt(0);
			if (yn == 'n') {
				break;
			}
		}while(true);
	}
}

class Tom {
	//0 Rock 1 Scissors 2 Paper
	int win, total;
	public int movement() {
		return (int)(3*Math.random());
	}
	public String translate(int n) {
		switch(n) {
			case 0:
				return "Rock";
			case 1:
				return "Scissors";
			case 2:	
				return "Paper";
		}
		return null;
	}
	
	public void judge(int tom, int com) {
		int j = tom - com;
		if (j == -1 || j == 2) {
			System.out.println("Winer is Tom...");
			this.win+= 1;
		}
		else if (j == 1 || j == -2) {
			System.out.println("Winer is Computer...");
		}
		else {
			System.out.println("Tie...");
		}
		this.total += 1;
	}
	
	public void fight() {
		System.out.println("-----Round " + (this.total + 1) + "-----");
		int com = this.movement();
		int tom = this.movement();
		System.out.println("Computer's Action:\t" + translate(com));
		System.out.println("Tom's Action:\t" + translate(tom));
		this.judge(tom, com);
		System.out.println("Tom wins " + this.win + " rounds");
	}
}