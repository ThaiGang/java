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
	// ---------- �޴��κ� ----------
		System.out.println("������������������������������");
		System.out.println("��   �޴� ����    ��");
		System.out.println("������������������������������");
		
		System.out.printf("1.���� �Է�\n");
		System.out.printf("2.���� ���\n");
		System.out.printf("3.����\n");
		System.out.printf("/>");
		select = scan.nextInt();
		����:
		switch(select) {
		case 1 :
			// ---------- ���� �Է� �κ� ----------
			System.out.println("������������������������������");
			System.out.println("��   ���� �Է�    ��");
			System.out.println("������������������������������");
			do 
			{
				System.out.println("����1 : ");
				kor1 = scan.nextInt();
				if(kor1<0 || kor1>100)
					System.out.println("��������(0~100)�� ������ϴ�");
				
			}while(kor1<0 || kor1>100);
			do 
			{
				System.out.println("����2 : ");
				kor2 = scan.nextInt();
				if(kor2<0 || kor2>100)
					System.out.println("��������(0~100)�� ������ϴ�");
				
			}while(kor2<0 || kor2>100);
			do 
			{
				System.out.println("����3 : ");
				kor3 = scan.nextInt();
				if(kor3<0 || kor3>100)
					System.out.println("��������(0~100)�� ������ϴ�");
				
			}while(kor3<0 || kor3>100);
		case 2: 
				// ---------- ���� ��� �κ� ----------
			total= kor1+ kor2 + kor3;
			avg = (float)(total / 3);
				System.out.println("������������������������������");
				System.out.println("��   ���� ���    ��");
				System.out.println("������������������������������");
				 
				System.out.printf("����1 : %d\n",kor1);
				System.out.printf("����2 : %d\n",kor2);
				System.out.printf("����3 : %d\n",kor3);
				System.out.printf("���� : %d\n",total);
				System.out.printf("��� : %3.2f\n",avg);
		case 3:
				break ����;
		default :System.out.printf("�Է� ���� 1~3�� �Է��� �� �ֽ��ϴ�."); 
		}
		System.out.printf("good bye~\n");
	}
}
}
