package hw;

/*
 * Topic: 輸入一段文字 ( 限制為 ASCII 表中，編號 32 至 125 之字元 ) ，將它們每個字元 依照鍵盤的位置，印出它們右邊的字元，若右邊按鍵有兩層字元 ( 如 : 和 ; 位於同 一按鍵上 ) ，則輸出下層字元，即 ”;” ，若該按鍵為上層字元 ( 如 !) 則輸出其右 邊按鍵之上層字元 ( 如 @) ，若輸入的字元右邊的鍵為不可視按鍵，如 shift, enter,backspace 或右邊已無按鍵，如不做更動，照樣輸出。
 * Date: 2016/12/26
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		for (int i = 0; i < str.length(); i++) {
			char n = str.charAt(i);
			// int x = (int)n;
			System.out.print(fun(n));

		}

	}

	public static char fun(char n) {
		char a = ' ';
		switch (n) {
		case 'a':
			a = 's';
			break;
		case 'b':
			a = 'n';
			break;
		case 'c':
			a = 'v';
			break;
		case 'd':
			a = 'f';
			break;
		case 'e':
			a = 'r';
			break;
		case 'f':
			a = 'g';
			break;
		case 'g':
			a = 'h';
			break;
		case 'h':
			a = 'j';
			break;
		case 'i':
			a = 'o';
			break;
		case 'j':
			a = 'k';
			break;
		case 'k':
			a = 'l';
			break;
		case 'l':
			a = 'a';
			break;
		case 'm':
			a = 'z';
			break;
		case 'n':
			a = 'm';
			break;
		case 'o':
			a = 'p';
			break;
		case 'p':
			a = 'q';
			break;
		case 'q':
			a = 'w';
			break;
		case 'r':
			a = 't';
			break;
		case 's':
			a = 'd';
			break;
		case 't':
			a = 'y';
			break;
		case 'u':
			a = 'i';
			break;
		case 'v':
			a = 'b';
			break;
		case 'w':
			a = 'e';
			break;
		case 'x':
			a = 'c';
			break;
		case 'y':
			a = 'u';
			break;
		case 'z':
			a = 'x';
			break;
		case '1':
			a = '2';
			break;
		case '2':
			a = '3';
			break;
		case '3':
			a = '4';
			break;
		case '4':
			a = '5';
			break;
		case '5':
			a = '6';
			break;
		case '6':
			a = '7';
			break;
		case '7':
			a = '8';
			break;
		case '8':
			a = '9';
			break;
		case '9':
			a = '0';
			break;
		case '0':
			a = '1';
			break;
		case'!':
			a = '@';
			break;
		case'@':
			a = '#';
			break;
		case'#':
			a = '$';
			break;
		case '$':
			a = '%';
			break;
		case'%':
			a = '^';
			break;
		case'^':
			a = '&';
			break;
		case'&':
			a = '*';
			break;
		case'*':
			a = '!';
			break;
		case 'A':
			a = 'S';
			break;
		case 'B':
			a = 'N';
			break;
		case 'C':
			a = 'V';
			break;
		case 'D':
			a = 'F';
			break;
		case 'E':
			a = 'R';
			break;
		case 'F':
			a = 'G';
			break;
		case 'G':
			a = 'H';
			break;
		case 'H':
			a = 'J';
			break;
		case 'I':
			a = 'O';
			break;
		case 'J':
			a = 'K';
			break;
		case 'K':
			a = 'L';
			break;
		case 'L':
			a = 'A';
			break;
		case 'M':
			a = 'Z';
			break;
		case 'N':
			a = 'M';
			break;
		case 'O':
			a = 'P';
			break;
		case 'P':
			a = 'Q';
			break;
		case 'Q':
			a = 'W';
			break;
		case 'R':
			a = 'T';
			break;
		case 'S':
			a = 'D';
			break;
		case 'T':
			a = 'Y';
			break;
		case 'U':
			a = 'I';
			break;
		case 'V':
			a = 'B';
			break;
		case 'W':
			a = 'E';
			break;
		case 'X':
			a = 'C';
			break;
		case 'Y':
			a = 'U';
			break;
		case 'Z':
			a = 'X';
			break;
		}
		return a;
	}

}
