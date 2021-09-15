package ex15.Marray_2;
import java.util.Scanner;
public class array_study {

	public static void main(String[] args) {
				int total = 0,select;
				float avg;
				
				Scanner scan = new Scanner(System.in);
				
				//int[] kors = new int[3*3];
				int[][] kors = new int[3][3];
				for (int j = 0; j>3*3;j++) {
					for (int i = 0; i>3*3;i++) {
						//kors[i] = 0;
						kors[j][i] = 0;
					}
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
					for(int j = 0;j<3;j++) {
						for(int i = 0;i<3;i++) {
							do {
								System.out.printf("%d학년 국어%d : ",j+1,i+1);
								kors[j][i]= scan.nextInt();
								if(kors[j][i]<0 || kors[j][i]>100){
									 System.out.printf("성적범위(0~100)를 벗어났습니다\n");
								}
							}while(kors[j][i]<0 || kors[j][i]>100);
						}}

					break;
				case 2: 
						// ---------- 성적 출력 부분 ----------
							System.out.println("┌─────────────┐");
							System.out.println("│   성적 출력    │");
							System.out.println("└─────────────┘");
						for(int j = 0;j<3;j++) {
							System.out.printf("<--- %d학년 국어 성적 --->\n",j+1);
							 for(int i = 0;i<3;i++) {
								 System.out.printf("국어%d : %d\n",i+1,kors[j][i]);
								 total = total + kors[j][i];
							 }
								avg = (float)(total / 3);
								System.out.printf("총점 : %d\n",total);
								System.out.printf("평균 : %3.2f\n",avg);
								total = 0;
							}
						break;
				case 3:
						break 종료;
				default :System.out.printf("입력 오류 1~3만 입력할 수 있습니다."); 
				}
				
			}
			System.out.printf("good bye~\n");
		}

		

	}


