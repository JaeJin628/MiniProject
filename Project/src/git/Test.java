package git;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	static int choice = 0;
	static int skill;
	static int power;
	static int HP;
	static int monster = 400;
	static int sum = 0;   
	 public static void attack() {
		  System.out.println("1.������ 2.���÷���");
		  choice = sc.nextInt();
		  if(choice == 1) {
			  sum += power*15;
			  monster -=15;
		  }else if(choice ==2) {
			  sum += power *30;
			  monster -=30;
		  }
	  }
	 public static void attack1() {
		  System.out.println("1.������� 2.����");
		  choice = sc.nextInt();
		  if(choice == 1) {
			  sum += power*20;
			  monster -=20;
		  }else if(choice ==2) {
			  sum += power *40;
			  monster -=40;
		  }
	  }
	  
	
	
	  public static void gisa() {
		   attack();
	  }
	  public static void magic() {
		  attack1();
	  }

	public static void main(String[] args) {
		//1.���Ϳ� ������ �������� �����ϴ� ������� ����� ����
		//2.������ ������ ������ ������ ��Ƽ� ����ϰ� ������ ���� ����� �𸣰���
		//3.�׳��� �����Ѱɷδ� �� �Ӽ����ݺ� ������ ���ҷ� �����߰� ������ �����ؼ� �����ߴٴ� ��¹��� ������� 
		//4.�״��� �ǰ� �ٴ����� �׾�ߵǴ� ���ǵ� ������ ����.
		int User =0;
		String menu = "User: 0.���� 1.���ͼ�ȯ,2.����";
		while(true) {
			System.out.println(menu);
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("��� ������ �����Ͻðڽ��ϱ�?");
				System.out.println("1.���� 2.������");
				choice = sc.nextInt();
				if(choice == 1) {
		           System.out.println("���縦 �����ϼ̽��ϴ�");
				}else if( choice == 2) {
					System.out.println("�����縦 �����ϼ̽��ϴ�");
				}
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("���Ͱ� �����Ǿ����ϴ�");
				   System.out.println("����HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    System.out.println("�����һ�� : 1.���� 2.������");
				    choice = sc.nextInt();
				    if(choice == 1) {
				    	gisa();
				    }else if(choice == 2) {
				    	magic();
				    }
				    System.out.println("����HP:" + monster);
					
				}else if(monster <= 0) {
					System.out.println("���Ͱ� �׾����ϴ�");
					break;
				}
		
	}

  }
 }
}	
	
	
