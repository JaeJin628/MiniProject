package git;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monster = 100;
		int User = 200;
		int choice = 0;
		while(true) {
			System.out.println("1.����,2.���,3.���ǸԱ�");
			choice = sc.nextInt();
			if(choice == 1) {
				if(User>monster || monster==User ) {
					monster-=10;
					User-=5;
				}
			}else if(choice == 2) {
				monster -=3;
			}else if(choice == 3) {
				monster +=5;
			}
			System.out.println("���� Hp: "+ monster);
			System.out.println("���� HP: " + User);
		}
		

	}

}
