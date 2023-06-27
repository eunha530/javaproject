package lotto;

public class Main {

	public static void main(String[] args) {
		
		Login l = Login.getInstance();  	// 회원가입과 로그인
		l.LoginGuide();
		
		Start st = Start.getInstance(); 	//  게임 진입 의사
		st.startqu();
		
		Lottory loto = new Lottory();				// 게임 진입 실행
		
		loto.lottorun();
		
		
		
	}

}
