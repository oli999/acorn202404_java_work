package test.main;

import java.util.Random;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		// -10 ~ 10 사이의 랜덤한 정수를 얻어내 보세요
		int ranNum = ran.nextInt(21) - 10;
		// 75 ~ 100 사이의 랜덤한 정수를 얻어내 보세요
		int ranNum2 = ran.nextInt(26) + 75;
		// 1 ~ 45 사이의 랜덤한 정수를 얻어내 보세요.
		int ranNum3 = ran.nextInt(45) + 1;
		
	}
}
