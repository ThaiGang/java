package ex3.io.escape;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		int kor1,kor2,kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("������������������������������");
		System.out.println("��   ���� �Է�    ��");
		System.out.println("������������������������������");
		System.out.printf("����1 : \n");
		kor1 = scan.nextInt();
		System.out.printf("����2 : \n");
		kor2 = scan.nextInt();
		System.out.printf("����3 : \n");
		kor3 = scan.nextInt();
	// ---------- ���� ��� �κ� ----------
		total= kor1+ kor2 + kor3;
		avg = total / 3;
		System.out.println("������������������������������");
		System.out.println("��   ���� ���    ��");
		System.out.println("������������������������������");
		System.out.printf("����1 : %d\n",kor1);
		System.out.printf("����2 : %d\n",kor2);
		System.out.printf("����3 : %d\n",kor3);
		System.out.printf("���� : %d\n",total);
		System.out.printf("��� : %3.2f\n",avg);
	}

}
