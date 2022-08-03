package Bai4;

import java.util.Scanner;

public class Employee {
	private static Scanner sc = new Scanner(System.in);
	private String id;
	private String name;
	private int age;
	private int workingDays;
	private double salary;
	public static final int PRICE = 50;

	public Employee(String id, String name, int age, int workingDays) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDays = workingDays;
	}

	public Employee() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public double Salary(int workingDays, int PRICE) {

		return workingDays * PRICE;
	}

	public void input() {
		id = sc.nextLine();
		name = sc.nextLine();
		age = sc.nextInt();
		workingDays = sc.nextInt();
	}

	public void output() {
		System.out.printf("%-10s%-10s%-10d%-10d%-10f\n", id, name, age, workingDays,
				Salary(workingDays, PRICE));
	}

	public static void main(String[] args) {
		Employee Employee1 = new Employee("st1", "HĐM", 18, 23);
		Employee Employee2 = new Employee("st2", "VMT", 19, 24);
		Employee Employee3 = new Employee("st3", "VKH",20,22);
		
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Mã nv", "Tên", "Tuổi", "Ngày làm", "Lương");
		Employee1.output();
		Employee2.output();
		Employee3.output();
	}
}
