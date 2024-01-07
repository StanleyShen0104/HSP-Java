public class ChapterExercise03 {
	public static void main(String[] args) {
		Dog d = new Dog("S", "red", 4);
		d.show();
		
		Music m = new Music("Valhalla", 120);
		m.play();
		System.out.println("Song: " + m.getInfo()[0]);
		System.out.println("Seconds: " + m.getInfo()[1]);
	}
}

class Dog {
	String name, color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age =age;
	}
	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}
}

class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println("Now Playing " + name + "...");
	}
	public String[] getInfo() {
		String[] r = new String[2];
		r[0] = this.name;
		r[1] = this.times +"";
		return r;
	}
}