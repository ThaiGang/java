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
			����:
			while(true) {
			// ---------- �޴��κ� ----------
				System.out.println("������������������������������");
				System.out.println("��   �޴� ����    ��");
				System.out.println("������������������������������");
				
				System.out.printf("1.���� �Է�\n");
				System.out.printf("2.���� ���\n");
				System.out.printf("3.����\n");
				System.out.printf("/>");
				select = scan.nextInt();
				switch(select) {
				case 1 :
					// ---------- ���� �Է� �κ� ----------
					System.out.println("������������������������������");
					System.out.println("��   ���� �Է�    ��");
					System.out.println("������������������������������");
					for(int j = 0;j<3;j++) {
						for(int i = 0;i<3;i++) {
							do {
								System.out.printf("%d�г� ����%d : ",j+1,i+1);
								kors[j][i]= scan.nextInt();
								if(kors[j][i]<0 || kors[j][i]>100){
									 System.out.printf("��������(0~100)�� ������ϴ�\n");
								}
							}while(kors[j][i]<0 || kors[j][i]>100);
						}}

					break;
				case 2: 
						// ---------- ���� ��� �κ� ----------
							System.out.println("������������������������������");
							System.out.println("��   ���� ���    ��");
							System.out.println("������������������������������");
						for(int j = 0;j<3;j++) {
							System.out.printf("<--- %d�г� ���� ���� --->\n",j+1);
							 for(int i = 0;i<3;i++) {
								 System.out.printf("����%d : %d\n",i+1,kors[j][i]);
								 total = total + kors[j][i];
							 }
								avg = (float)(total / 3);
								System.out.printf("���� : %d\n",total);
								System.out.printf("��� : %3.2f\n",avg);
								total = 0;
							}
						break;
				case 3:
						break ����;
				default :System.out.printf("�Է� ���� 1~3�� �Է��� �� �ֽ��ϴ�."); 
				}
				
			}
			System.out.printf("good bye~\n");
		}

		

	}


