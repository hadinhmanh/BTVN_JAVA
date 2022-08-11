package Bai2;

import java.util.Scanner;

public class Student {
	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private int age;
	private Address address = new Address();

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void input() {
		System.out.print("Nhập id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		age = sc.nextInt();
		sc.nextLine();
		address.input();
	}

	public void output() {
		System.out.println("id sinh viên là: " + id);
		System.out.println("tên sinh viên là: " + name);
		System.out.println("tuổi sinh viên là: " + age);
		address.output();
	}

	public static void xoaMang(Student[] student, int pos) {
		for(int i=pos; i<student.length-1; i++) {
			student[i]=student[i+1];
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Nhập số sinh viên: ");
		n = sc.nextInt();
		sc.nextLine();
		Student[] studentMang = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh viên " + (i + 1));
			studentMang[i] = new Student();
			studentMang[i].input();
			for (int j = 0; j < i; j++) {
				if (studentMang[i].getId() == studentMang[j].getId()) {
					System.out.println("Bạn nhập trùng id!! Mời nhập lại");
					studentMang[i].input();
				}
			}
		}
		System.out.println("-------------------------------------");
		for (int i = 0; i < n; i++) {
			studentMang[i].output();
		}
		System.out.println("-------------------------------------");
		int x;
		System.out.print("Nhập id cần tìm: ");
		x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (studentMang[i].getId() == x) {
				studentMang[i].output();
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Sau khi sửa là:");
		for(int i=0; i<n; i++) {
			if(studentMang[i].getAddress().getProvince().equals("Thanh Hóa")) {
				studentMang[i].address.setProvince("Hải Phòng");
			}
			studentMang[i].output();
		}
		System.out.println("-------------------------------------");
		int k;
		System.out.println("nhập id cần xóa:");
		k = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(studentMang[i].getId()==k) {
				xoaMang(studentMang,i);
			}
		}
		n--;
		for(int i=0; i<n; i++) {
			studentMang[i].output();
		}
	}
}
