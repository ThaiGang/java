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
					for(int i = 0;i<3;i++) {
						do {
							System.out.printf("����%d : ",i+1);
							kors[i] = scan.nextInt();
							if(kors[i]<0 || kors[i]>100){
								 System.out.printf("��������(0~100)�� ������ϴ�\n");
							}
						}while(kors[i]<0 || kors[i]>100);
					}

					break;
				case 2: 
						// ---------- ���� ��� �κ� ----------
					total= kors[0]+kors[1]+kors[2];
					avg = (float)(total / 3);
						System.out.println("������������������������������");
						System.out.println("��   ���� ���    ��");
						System.out.println("������������������������������");
						 for(int i = 0;i>3;i++) {
							 System.out.printf("����%d : %d\n",i+1,kors[i]);
						 }
						System.out.printf("���� : %d\n",total);
						System.out.printf("��� : %3.2f\n",avg);
						break;
				case 3:
						break ����;
				default :System.out.printf("�Է� ���� 1~3�� �Է��� �� �ֽ��ϴ�."); 
				}
				
			}
			System.out.printf("good bye~\n");
		}

		

	}


