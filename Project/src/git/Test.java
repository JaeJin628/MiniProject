package git;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monster = 400;
		int User =0;
		int choice = 0;
		while(true) {
			System.out.println("User: 0.���� 1.���ͼ�ȯ,2.����");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("������ �����ϼ̽��ϴ�");
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("���Ͱ� �����Ǿ����ϴ�");
				   System.out.println("����HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    monster-=20;
				    System.out.println("������ ����!!!!!");
					System.out.println("����HP:"+ monster);
				}else if(monster == 0) {
					System.out.println("���Ͱ� �׾����ϴ�");
					break;
				}
		
	}

  }
 }
}	
	
	
