package Homework;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// ��� ��޿� ���� ����7,8�� 15000/�ð� ����5,6�� 20000/�ð� �����Ͽ� 40�ð��� �⺻ �ٹ�
		//�ʰ��ϴ� ��� �ð��� �޿��� 1.5������. �� �޿��� ���.
		//��, �ٹ��ð��� 40�ð��� �̴��ϸ� 40�ð����� ó��.
		
		Scanner sc = new Scanner(System.in);
		int level=0, work=0, tmoney=0; //�������� �ð��� �޿� �׳� �����ȿ��� �� �ٲ㼭 ����ߴµ� �̰� ������ �༭�� ��� �غ���
		
		System.out.print("���� : ");
		level = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ٹ� �ð� : ");
		work = Integer.parseInt(sc.nextLine());
		
		if ((work<=40)&&((level==5)||(level==6))) {
			System.out.println("�� �޿� : "+(40*20000));
		}
		else if ((work>40)&&((level==5)||(level==6))) {
			System.out.println("�� �޿� : "+((40*20000)+((work-40)*((int)(20000*1.5)))));
		}
		else if ((work<=40)&&((level==7)||(level==8))) {
			System.out.println("�� �޿� : "+(40*15000));
		}
		else if ((work>40)&&((level==7)||(level==8))) {
			System.out.println("�� �޿� : "+((40*15000)+((work-40)*((int)(15000*1.5)))));
		}
	//if�� ������ else if�� else���� �ݵ�� ����ؾ��ϳ�?
	//if ��ø�� �� �𸣰���. 
		
		/*if ((level==5)||(level==6)) {
			System.out.println("�� �޿� : "+(40*20000));
			if (work>40) {
				System.out.println("�� �޿� : "+((40*20000)+((work-40)*(20000*1.5))));
			}
		}
		else if ((level==7)||(level==8)) {
			System.out.println("�� �޿� : " + (40*15000));
			if (work>40) {
				System.out.println("�� �޿� : "+((40*15000)+((work-40)*(15000*1.5))));
			}
		}*/
		}
		
	}

//���ڿ��� �Է��� 00�ð� �� �̷��� ���� �տ� ����00�� ���ͼ� ����� ���� ����? 