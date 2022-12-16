package persnalTest;

public class TestSubString {
	public static void main(String[] args) {
		String s = "SachinTendulkar";
		System.out.println("원본 문자열 :" + s);
		System.out.println("인덱스 6부터 시작하는 하위 문자열" + s.substring(6));
		System.out.println("인덱스 0부터 6까지의 하위문자열" + s.substring(0,6));
	}
}
