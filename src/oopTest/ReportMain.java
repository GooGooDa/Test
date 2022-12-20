package oopTest;

public class ReportMain {
public static void main(String[] args) {
	Report report = new Report();
	
	while(true) {
	report.mainMenu();
	switch(report.getMenu()) {
	case 1 : report.inputReport();
	
	}
	}
	
//	report.answerLoop();
}
}
