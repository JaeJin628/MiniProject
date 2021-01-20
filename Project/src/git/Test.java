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
		  System.out.println("1.슬래쉬 2.투플래쉬");
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
		  System.out.println("1.더블매직 2.썬콜");
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
		//1.몬스터와 유저가 턴제별로 공격하는 방식으로 만들고 싶음
		//2.몬스터의 정보와 유저의 정보를 담아서 출력하고 싶은데 아직 방법을 모르겠음
		//3.그나마 구현한걸로는 각 속성공격별 데미지 감소량 구현했고 직업을 선택해서 선택했다는 출력문은 만들었음 
		//4.그다음 피가 다닳으면 죽어야되는 조건도 구현은 했음.
		int User =0;
		String menu = "User: 0.입장 1.몬스터소환,2.공격";
		while(true) {
			System.out.println(menu);
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("어느 직업을 선택하시겠습니까?");
				System.out.println("1.전사 2.마법사");
				choice = sc.nextInt();
				if(choice == 1) {
		           System.out.println("전사를 선택하셨습니다");
				}else if( choice == 2) {
					System.out.println("마법사를 선택하셨습니다");
				}
			}else if(choice == 1) {
				    monster = 400;
				   System.out.println("몬스터가 생성되었습니다");
				   System.out.println("몬스터HP:" + monster);
		   }else if(choice == 2) {
			   if(User<monster) {
				    System.out.println("공격할사람 : 1.전사 2.마법사");
				    choice = sc.nextInt();
				    if(choice == 1) {
				    	gisa();
				    }else if(choice == 2) {
				    	magic();
				    }
				    System.out.println("몬스터HP:" + monster);
					
				}else if(monster <= 0) {
					System.out.println("몬스터가 죽었습니다");
					break;
				}
		
	}

  }
 }
}	
	
	
