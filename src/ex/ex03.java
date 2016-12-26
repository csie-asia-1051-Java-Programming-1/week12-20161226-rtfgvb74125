package ex;

/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int data[][] = new int[3][3];
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = scn.nextInt();
			}
		}
			for (int k = 0; k < 3; k++) {
				for (int h = 0; h < 3; h++) {
					if (data[k][h] == 0) {
						sum++;
					}
				}
			}
				if (sum < 4 && sum > 5) {
					System.out.print("False");
				} else if (data[0][0] == data[1][1] && data[1][1] == data[2][2] && data[2][2] == data[0][0]) {
					System.out.print("True");
				} else if (data[0][0] == data[0][1] && data[0][1] == data[0][2] && data[0][2] == data[0][0]) {
					System.out.print("True");
				} else if (data[0][0] == data[1][0] && data[1][0] == data[2][0] && data[2][0] == data[0][0]) {
					System.out.print("True");
				} else if (data[0][1] == data[1][1] && data[1][1] == data[2][0] && data[2][0] == data[0][1]) {
					System.out.print("True");
				} else if (data[0][1] == data[1][1] && data[1][1] == data[2][1] && data[2][1] == data[0][1]) {
					System.out.print("True");
				} else if (data[0][2] == data[1][2] && data[1][2] == data[2][2] && data[2][2] == data[0][2]) {
					System.out.print("True");
				} else if (data[1][0] == data[1][1] && data[1][1] == data[1][2] && data[1][2] == data[1][0]) {
					System.out.print("True");
				} else if (data[2][0] == data[2][1] && data[2][1] == data[2][2] && data[2][2] == data[2][0]) {
					System.out.print("True");
				}else{
					System.out.print("False");
				}

			

	}
}
