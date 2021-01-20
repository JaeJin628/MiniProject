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
		  System.out.println("1.슬래쉬 2.투플래쉬");
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
		String menu = "User: 0.입장 1.몬스터소환,2.공격";
		while(true) {
			System.out.println(menu);
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("어느 직업을 선택하시겠습니까?");
				System.out.println("1.전사");
				choice = sc.nextInt();
				if(choice == 1) {
					
				}
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("몬스터가 생성되었습니다");
				   System.out.println("몬스터HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    monster-=20;
				    attack();
					System.out.println("몬스터HP:"+ monster);
				}else if(monster == 0) {
					System.out.println("몬스터가 죽었습니다");
					break;
				}
		
	}

  }
 }
}	
	
	
