package test.main;
/*
 *  run 했을때 콘솔창에 경과 시간이 출력되는 프로그래밍을 해 보세요.
 *  
 *  0 분 1초
 *  0 분 2초
 *  0 분 3초
 *  .
 *  .
 *  0 분 59초
 *  1 분 0초
 *  1 분 1초
 *  .
 *  .
 *  2 분 0초
 *  2 분 1초
 */
public class QuizMain {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		int sec=0;
		int min=0;
		while(true) {
			
			//반복문 loop 를 초당 한번씩 돌게 하고 싶으면 스레드를 1초 잡아둔다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			sec++;
			//만일 sec 가 60 이면 0으로 바꿔준다.
			if(sec == 60) {
				sec=0;
				min++;
			}
			System.out.println(min+"분 "+sec+"초");
		}
		
	}
}






















