package lotto;

import java.util.Scanner;

public class Start {
	private static Start st;
	public static Start getInstance() {
		if( st == null ) {
			st = new Start();
		}
		return st;
	}
	public static void freeInstance() {
		st = null;
	}
	private Start() {}
	
	public void startqu() {
		
	Scanner sc = new Scanner(System.in);

	System.out.println( "\n 게임에 진입 하시겠습니까?"
			+ "\n[1] 예 \t [2] 아니요");		
	
	String answer = "";

	for(;;) {
		System.out.print("\n입력 : ");			
		answer = sc.next();
		
		if(answer.equals("1") || answer.equals("예")) {
			
			System.out.println("\n=================================================================");
			break;				
		}else if(answer.equals("2") || answer.equals("아니요")){
			System.out.println("\n [알림] 프로그램을 종료합니다.");
			System.exit(0);	
		}else {
			System.out.println("\n [오류] 잘못된 입력입니다. 다시 입력해주세요.");
		}
		
		}	
	
	}

 }
