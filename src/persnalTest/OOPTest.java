package persnalTest;

public class OOPTest {
public static void main(String[] args) {
	Member member = new Member();
	
	int total = 0;
	
	member.id = 1;
	member.email = "whddn35789@gmail.com";
	member.addr = "화성시";
	member.name = "고종우";
	
	total = printMember(member);
	
	System.out.println(member.name + " "+  member.addr);
}

private static int printMemner(Memeber member) {
	
	return 0;
}


}
