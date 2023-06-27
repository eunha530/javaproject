package lotto;

import java.util.Scanner;

public class Logout {
		private static Logout o;
		public static Logout getInstance() {
			if( o == null ) {
				o = new Logout();
			}
		return o;
		}
		public static void freeInstance() {
			o = null;
		}
		private Logout() {}
		
				
				
				int num=0;
				boolean run = true;
				
				
				public void LogoutGuide() {
					
					Lottory loto = new Lottory();
					Scanner sc = new Scanner(System.in);
					
				
					
					
					
				while(run) {
					System.out.println(" ");
					System.out.println("[메뉴]");
					System.out.println("1.다시하기");
					System.out.println("2.종료하기");
					System.out.println("---------------");
					num = sc.nextInt();
					if(num==1) {
						loto.lottorun();
							break;
						}
					else if(num==2) {
					run=false;
					System.out.println("프로그램 종료!!");
				} else {
					System.out.println("다시 입력 해주세요.");
				}
			}
		}
}
				
				
	
	
