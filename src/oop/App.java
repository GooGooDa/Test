package oop;

import java.io.IOException;

public class App {

public static void main(String[] args) throws IOException {
	Room room = new Room();
	room.load("res2/students.csv");
	room.shuffle();
	room.print();
	room.sort();
	room.print();

}
}
