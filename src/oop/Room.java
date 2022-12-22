package oop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Room {
	private Student[] students;

	public Room() {
		students = new Student[10];
	}

	public void shuffle() {
		Random rand = new Random();
		for (int i = 0; i < students.length; i++) {
			int a = rand.nextInt(10);
			int b = rand.nextInt(10);
			Student temp = students[a];
			students[a] = students[b];
			students[b] = temp;

		}
	}

	public void print() {
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println("----------------------------------------------");
	}

	public void sort() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getId() > students[j + 1].getId()) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	public void load(String string) throws IOException {
		FileInputStream fis = new FileInputStream(string);
		Scanner scan = new Scanner(fis);
		String temp = scan.nextLine();

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			String line = scan.nextLine();
			String arr[] = line.split(",");
			students[i].setId(Integer.parseInt(arr[0]));
			students[i].setName(arr[1]);
			// while말고 for로 변환도가능
			// length는 배열값이 항상 차있는것이 아니기때문에 length 사용지양
		}
	}
}
