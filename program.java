package ex3.io.escape;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		int kor1,kor2,kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("┌─────────────┐");
		System.out.println("│   성적 입력    │");
		System.out.println("└─────────────┘");
		System.out.printf("국어1 : \n");
		kor1 = scan.nextInt();
		System.out.printf("국어2 : \n");
		kor2 = scan.nextInt();
		System.out.printf("국어3 : \n");
		kor3 = scan.nextInt();
	// ---------- 성적 출력 부분 ----------
		total= kor1+ kor2 + kor3;
		avg = total / 3;
		System.out.println("┌─────────────┐");
		System.out.println("│   성적 출력    │");
		System.out.println("└─────────────┘");
		System.out.printf("국어1 : %d\n",kor1);
		System.out.printf("국어2 : %d\n",kor2);
		System.out.printf("국어3 : %d\n",kor3);
		System.out.printf("총점 : %d\n",total);
		System.out.printf("평균 : %3.2f\n",avg);
	}

}
