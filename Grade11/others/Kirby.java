package Grade11.others;

import java.util.Scanner;

public class Kirby {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String run;
		int o = 1;
		String[][] character = new String[3][16];
		 character[0][0] = "            XXXXXXXXXX          ";
		 character[0][1] = "        XXXX..........XXXX      ";
		 character[0][2] = "      XX..................XX    ";
		 character[0][3] = "    XX....................XX    ";
		 character[0][4] = "    XX......................XX  ";
		 character[0][5] = "  XX..............XX..XX....XX  ";
		 character[0][6] = "XX................XX..XX......XX";
		 character[0][7] = "XX................XX..XX......XX";
		 character[0][8] = "XX............................XX";
		 character[0][9] = "XX............................XX";
		character[0][10] = "  XX....XX..........XX....XX..XX";
		character[0][11] = "    XXXXXX................XXXX  ";
		character[0][12] = "      XXXXXX............XXXX    ";
		character[0][13] = "    XX++++++XXXXXXXXXXXX++++XX  ";
		character[0][14] = "  XX++++++++++XXXXXXXX++++++++XX";
		character[0][15] = "    XXXXXXXXXX      XXXXXXXXXX  ";

		character[1][0] = "          XXXXXXXXXX            ";
		character[1][1] = "      XXXX..........XXXX        ";
		character[1][2] = "    XX..................XX      ";
		character[1][3] = "  XXXXXX................XXXXXX  ";
		character[1][4] = "XX..............XX..XX....XX..XX";
		character[1][5] = "XX..............XX..XX....XX..XX";
		character[1][6] = "XX..............XX..XX....XX..XX";
		character[1][7] = "XX........................XX..XX";
		character[1][8] = "  XXXX....................XXXX  ";
		character[1][9] = "    XX............XX......XX    ";
		character[1][10] = "  XXXX..................XX++XX  ";
		character[1][11] = "  XX++XX................XX++XX  ";
		character[1][12] = "  XX++++XXXX........XXXX++++XX  ";
		character[1][13] = "    XX++++++XXXXXXXX++++++XX    ";
		character[1][14] = "      XX++++++XX    XXXXXX      ";
		character[1][15] = "        XXXXXX                  ";

		 character[2][0] = "                                ";
		 character[2][1] = "          XXXXXXXXXXXX          ";
		 character[2][2] = "      XXXX............XX        ";
		 character[2][3] = "    XX..................XX      ";
		 character[2][4] = "  XX....................XX      ";
		 character[2][5] = "  XX..............XX..XX..XX    ";
		 character[2][6] = "XX................XX..XX....XX  ";
		 character[2][7] = "XX................XX..XX..XX..XX";
		 character[2][8] = "XX........................XX..XX";
		 character[2][9] = "XX......XX................XX..XX";
		character[2][10] = "  XX....XX..........XX....XX..XX";
		character[2][11] = "    XXXXXX................XXXX  ";
		character[2][12] = "      XXXXXX............XX      ";
		character[2][13] = "      XX++++XXXXXXXXXXXX        ";
		character[2][14] = "        XX++++++++XX++XX        ";
		character[2][15] = "          XXXXXXXXXXXX          ";

		do {
			for (int i = 0; i <= 15; i++) {
				System.out.println(character[0][i]);
			}
			run = sc.nextLine();
			while (run != "stop") {
				if (o == 1) {
					for (int i = 0; i <= 15; i++) {
						System.out.println(character[1][i]);
					}
					o = 2;
				} else {
					for (int i = 0; i <= 15; i++) {
						System.out.println(character[2][i]);
					}
					o = 1;
				}
				run = sc.nextLine();
			}
		} while (run != "end");
		sc.close();
	}
}
