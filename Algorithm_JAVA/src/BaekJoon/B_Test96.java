package BaekJoon;

import java.util.Scanner;

public class B_Test96 {
	
//	# 주사위 게임
//	
//	문제
//	1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//	같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//	같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//	모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//	예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//	또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//	3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//	N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에는 참여하는 사람 수 N이 주어지고 그 다음 줄부터 N개의 줄에 사람들이 주사위를 던진 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
//
//	출력
//	첫째 줄에 가장 많은 상금을 받은 사람의 상금을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int topPrize = 0;
		for (int i = 0; i < len; i++) {
			int diceNum[] = new int[6];
			int top = 0;
			int topIdx = -1;
			diceNum[sc.nextInt()-1]++;
			diceNum[sc.nextInt()-1]++;
			diceNum[sc.nextInt()-1]++;
			for (int j = 0; j < diceNum.length; j++) {
				if(diceNum[j] >= top) {
					top = diceNum[j];
					topIdx = j;
				}
			}
			int prize = 0;
			switch(top) {
			case 1:
				prize = ++topIdx * 100;
				break;
			case 2:
				prize = ++topIdx * 100 + 1000;
				break;
			case 3:
				prize = ++topIdx * 1000 + 10000;
				break;
			}
			if(prize > topPrize) topPrize = prize;
		}
		System.out.println(topPrize);
	}

}
