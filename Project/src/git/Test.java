package git;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	static int choice = 0;
	static int skill;
	static int power;
	static int defense;
	static int monster = 400;
	static int sum = 0;   
	  public static void attack() {
		  System.out.println("1.������ 2.���÷���");
		  choice = sc.nextInt();
		  if(choice == 1) {
			  sum += power*15;
		  }else if(choice ==2) {
			  sum += power *30;
		  }
	  }
	  
	
	
	  public static void gisa() {
		    
	  }

	public static void main(String[] args) {
		int User =0;
		String menu = "User: 0.���� 1.���ͼ�ȯ,2.����";
		while(true) {
			System.out.println(menu);
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("��� ������ �����Ͻðڽ��ϱ�?");
				System.out.println("1.����");
				choice = sc.nextInt();
				if(choice == 1) {
					
				}
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("���Ͱ� �����Ǿ����ϴ�");
				   System.out.println("����HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    monster-=20;
				    attack();
					System.out.println("����HP:"+ monster);
				}else if(monster == 0) {
					System.out.println("���Ͱ� �׾����ϴ�");
					break;
				}
		
	}

  }
 }
}	
	
	
