package com.inheritance;

public class Exercise {
	public static void main(String[] args) {
		PC pc = new PC();
		NotePad np = new NotePad();
		pc.setBrand("HP");
		pc.setCpu("i-7700");
		pc.setRam("4092mb");
		pc.setHardDrive("3T");
		np.setColor("Silver");
		np.setCpu("i-3300m");
		np.setRam("1024mb");
		np.setHardDrive("1T");
		pc.showInfo();
		np.showInfo();
	}
}

class Computer {
	private String cpu;
	private String ram;
	private String hardDrive;

	public void getDetails() {
		System.out.print(cpu + "\t" + ram + "\t" + hardDrive);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

}

class PC extends Computer {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void showInfo() {
		getDetails();
		System.out.print("\tbrand:" + brand);
		System.out.println();
	}
}

class NotePad extends Computer {
	private String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void showInfo() {
		getDetails();
		System.out.print("\tcolor:" + Color);
		System.out.println();
	}
}