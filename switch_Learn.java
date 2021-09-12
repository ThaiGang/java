package ex12.control_switch;

import java.util.Scanner;

public class switch_Learn {
	public static void main(String[] args) {
		
		int kor1,kor2,kor3,total,select;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1=0;
		kor2=0;
		kor3=0;
		select=0;
	while(true) {
	// ---------- 메뉴부분 ----------
		System.out.println("┌─────────────┐");
		System.out.println("│   메뉴 선택    │");
		System.out.println("└─────────────┘");
		
		System.out.printf("1.성적 입력\n");
		System.out.printf("2.성적 출력\n");
		System.out.printf("3.종료\n");
		System.out.printf("/>");
		select = scan.nextInt();
		종료:
		switch(select) {
		case 1 :
			// ---------- 성적 입력 부분 ----------
			System.out.println("┌─────────────┐");
			System.out.println("│   성적 입력    │");
			System.out.println("└─────────────┘");
			do 
			{
				System.out.println("국어1 : ");
				kor1 = scan.nextInt();
				if(kor1<0 || kor1>100)
					System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(kor1<0 || kor1>100);
			do 
			{
				System.out.println("국어2 : ");
				kor2 = scan.nextInt();
				if(kor2<0 || kor2>100)
					System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(kor2<0 || kor2>100);
			do 
			{
				System.out.println("국어3 : ");
				kor3 = scan.nextInt();
				if(kor3<0 || kor3>100)
					System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(kor3<0 || kor3>100);
		case 2: 
				// ---------- 성적 출력 부분 ----------
			total= kor1+ kor2 + kor3;
			avg = (float)(total / 3);
				System.out.println("┌─────────────┐");
				System.out.println("│   성적 출력    │");
				System.out.println("└─────────────┘");
				 
				System.out.printf("국어1 : %d\n",kor1);
				System.out.printf("국어2 : %d\n",kor2);
				System.out.printf("국어3 : %d\n",kor3);
				System.out.printf("총점 : %d\n",total);
				System.out.printf("평균 : %3.2f\n",avg);
		case 3:
				break 종료;
		default :System.out.printf("입력 오류 1~3만 입력할 수 있습니다."); 
		}
		System.out.printf("good bye~\n");
	}
}
}
