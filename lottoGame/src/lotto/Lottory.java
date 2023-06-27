package lotto;

import java.util.Arrays;

public class Lottory {

	
		
		public static void lottorun() {
		Logout o = Logout.getInstance();	// 다시하기와 종료하기
		int[] myLotto = new int[7]; // 출력 번호 7개의 숫자를 뽑는다. 
		System.out.println(" ");
		System.out.println("---------추첨 시작------------");
		
		for(int i = 0; i< myLotto.length; i++){	
		
		myLotto[i] = (int) (Math.random()*50+1);  // 1~50까지의 범위에서 숫자를 뽑는다.
		
		for(int j = 0; j<i; j++) {
		
		if(myLotto[j] == myLotto[i]) { 	// 숫자 중복이 나오지 않게 하기 위해
										//  중복인지 아닌지 체크하기.
			 i--; 
			 break; //중첩 for문에서 break 발생시, 다시 겉 for문으로 올라가서 다시 반복한다.
				}
			}
		}
		// 당첨 번호 7개의 숫자를 뽑는다. 
		int[] luklotto = new int[7]; 
		
		for(int i = 0; i< luklotto.length; i++){	
		
			luklotto[i] = (int) (Math.random()*45+1); 
		
		for(int j = 0; j<i; j++) {		// 숫자 중복이 나오지 않게 하기 위해
										//  중복인지 아닌지 체크하기.
		if(luklotto[j] == luklotto[i]) { 
			 i--; 
			 break; //중첩 for문에서 break 발생시, 다시 겉 for문으로 올라가서 다시 반복한다.
				}
			}
		}
		
		Arrays.sort(myLotto);
		System.out.println("[선택 번호] : " + Arrays.toString(myLotto));
		
		Arrays.sort(luklotto);
		System.out.println("[당첨 번호] : " + Arrays.toString(luklotto));
		
		int i = 0;
		int j = 0;
		int cnt = 0;

		// i와 j가 6이 아니여야 한다.
		while (i != 6 && j != 6) {
			
			
			// 로또 번호 한개 맞히면 cnt 1증가
			if (myLotto[i] == luklotto[j]) {
				cnt++;
				i++; 
				j++; 
			} else if (myLotto[i] > luklotto[j]) {
				j++; 
			} else {
				i++;
			}
			
		} 
		System.out.println("");
		System.out.println("맞힌 개수 : " + cnt + "개");
		
		
		if(cnt == 6) {
			System.out.println("[당첨 결과] 1등 당첨 ! 축하 드립니다.");
		} else if (cnt == 5) {
			System.out.println("[당첨 결과] 2등 당첨 ! 축하 드립니다.");
		} else if (cnt == 4) {
			System.out.println("[당첨 결과] 3등 당첨 ! 축하 드립니다.");
		} else if (cnt == 3) {
			System.out.println("[당첨 결과] 4등 당첨 ! 축하 드립니다.");
		} else System.out.println("[당첨 결과] 꽝! 다음 기회에..");
		
		
		o.LogoutGuide();
	}
		
			
}
		
		


