import java.util.Scanner;
public class Ex408 {

	public static void main(String[] args) {
		System.out.println("영화를 입력하세요. q는 종료.");
		
		Scanner s = new Scanner(System.in);
		String choice = "";
		
		do {
			System.out.println("영화를 입력하세요. q는 종료.");
			choice = s.next();
		}while ( choice !="q");

	}

}
