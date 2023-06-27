package lotto;

import java.util.Scanner;

public class Login {
		private static Login l;
		public static Login getInstance() {
			if( l == null ) {
				l = new Login();
			}
		return l;
		}
		public static void freeInstance() {
			l = null;
		}
		private Login() {}
		
				
				String id1=null, id2 = null;
				String pw1=null, pw2=null;
				int num=0;
				boolean run = true;
				
				public void LoginGuide() {
					Scanner sc = new Scanner(System.in);
					
					System.out.println("로또369에 오신 것을 환영합니다.");
					
					
					
				while(run) {
					System.out.println(" ");
					System.out.println("[메뉴]");
					System.out.println("1.로그인");
					System.out.println("2.회원가입");
					System.out.println("3.나가기");
					System.out.println("---------------");
					num = sc.nextInt();
					if(num==1) {
						if(id1==null&&pw1==null) {
							System.out.println("회원가입부터 해주세요.");
							continue;
						}
						System.out.print("아이디: ");
						id2=sc.next();
						System.out.print("비밀번호: ");
						pw2=sc.next();
						if(id1.equals(id2)&&pw1.equals(pw2)) {
							System.out.println("로그인성공!");
							break;
						}else {
							System.out.println("다시입력해주세요.");
						}
					}else if(num==2) {
						System.out.print("아이디: ");
						id1=sc.next();
						System.out.print("비밀번호: ");
						pw1=sc.next();
						System.out.println("회원가입 성공!");
					}else if(num==3) {
						run=false;
						System.out.println("프로그램 종료!!");
					}
				}
				
			}
	}


