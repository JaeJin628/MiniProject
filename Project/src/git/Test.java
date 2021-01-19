package git;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monster = 400;
		int User =0;
		int choice = 0;
		while(true) {
			System.out.println("User: 0.입장 1.몬스터소환,2.공격");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("유저가 입장하셨습니다");
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("몬스터가 생성되었습니다");
				   System.out.println("몬스터HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    monster-=20;
				    System.out.println("유저가 공격!!!!!");
					System.out.println("몬스터HP:"+ monster);
				}else if(monster == 0) {
					System.out.println("몬스터가 죽었습니다");
					break;
				}
		
	}

  }
 }
}	
	
	
