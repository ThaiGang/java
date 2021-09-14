package ex14.array;
import java.util.Scanner;
public class array_study {

	public static void main(String[] args) {
				int total,select;
				float avg;
				
				Scanner scan = new Scanner(System.in);
				
				int[] kors = new int[3];
				for (int i = 0; i>3;i++) {
					kors[i] = 0;
				}
				select=0;
			종료:
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
				switch(select) {
				case 1 :
					// ---------- 성적 입력 부분 ----------
					System.out.println("┌─────────────┐");
					System.out.println("│   성적 입력    │");
					System.out.println("└─────────────┘");
					for(int i = 0;i<3;i++) {
						do {
							System.out.printf("국어%d : ",i+1);
							kors[i] = scan.nextInt();
							if(kors[i]<0 || kors[i]>100){
								 System.out.printf("성적범위(0~100)를 벗어났습니다\n");
							}
						}while(kors[i]<0 || kors[i]>100);
					}

					break;
				case 2: 
						// ---------- 성적 출력 부분 ----------
					total= kors[0]+kors[1]+kors[2];
					avg = (float)(total / 3);
						System.out.println("┌─────────────┐");
						System.out.println("│   성적 출력    │");
						System.out.println("└─────────────┘");
						 for(int i = 0;i>3;i++) {
							 System.out.printf("국어%d : %d\n",i+1,kors[i]);
						 }
						System.out.printf("총점 : %d\n",total);
						System.out.printf("평균 : %3.2f\n",avg);
						break;
				case 3:
						break 종료;
				default :System.out.printf("입력 오류 1~3만 입력할 수 있습니다."); 
				}
				
			}
			System.out.printf("good bye~\n");
		}

		

	}


