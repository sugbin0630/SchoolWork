package Grade11.culminating;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Checker.java
Made by Austin
Made in 2022 06/02 - 2022 06/22
Purpose : Make Checker game
*/
public class Checker {
    static boolean relayCatch = false;
    static boolean cancel = false;
    static boolean ff = false;
    static int iX = 0; // import index_X from aDirection
    static int iY = 0; // import index_Y from aDirection
    static int direction = 1; // direction that piece move
    public static void main(String[] args) {
        /*
         * 1 = player 1 piece 2 = player 2 piece 3 = pleyer 1 king 4 = player 2 king
         */

        // Variables
        char loadAns; // load or not
        int index_X; // index x of user
        int index_Y; // index y of user
        int play_With = 0; // player 1 or 2
        boolean check_X = false; // check index_X data
        boolean check_Y = false; // check index_Y data
        boolean turn = true; // true : player 1, false, player 2 or A.I.
        String saveAns; // save or not
        String direction; // LU, LD, RU, RD
        String fileName;
        String p1Name;
        String p2Name = null;

        Scanner sc = new Scanner(System.in);

        int[] enemy = { 2, 4 }; // enemy pieces
        int[] team = { 1, 3 }; // team pieces
        int[][] boardData = { { 0, 2, 0, 2, 0, 2, 0, 2 },
                { 2, 0, 2, 0, 2, 0, 2, 0 },
                { 0, 2, 0, 2, 0, 2, 0, 2 },
                { 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 0 } };
        // load game
        System.out.print("Enter your name : ");
        p1Name = sc.nextLine();
        fileName = p1Name;
        while (play_With != 1 && play_With != 2) { // player 1 or 2
            try {
                System.out.println("1 : play with A.I.");
                System.out.println("2 : play with Player 2");
                System.out.print("Enter player number : ");
                play_With = sc.nextInt();
                sc.nextLine(); // bugfix
                System.out.print("\n");
                if (play_With != 1 && play_With != 2) {
                    System.out.println("Please write right answer\n");
                    play_With = 0;
                }
                if (play_With == 2) {
                    System.out.print("Enter Player 2 name : ");
                    p2Name = sc.nextLine();
                    fileName += "-" + p2Name;
                }
            } catch (InputMismatchException e) {
                sc.nextLine(); // bugfix
                System.out.println("Please write right answer\n");
                play_With = 0;
            }
        } // player 1 or 2
        do { // while y, Y, n, N
            try {
                Scanner rd = new Scanner(new File(fileName + ".txt"));
                System.out.println("Y : load perivous game");
                System.out.println("N : start new game");
                System.out.print("Do you want to load game? : ");
                loadAns = sc.nextLine().charAt(0);
                System.out.print("\n");

                switch (loadAns) {
                    case 'y':
                    case 'Y':
                        p1Name = rd.nextLine();
                        p2Name = rd.nextLine();
                        play_With = rd.nextInt();
                        turn = rd.nextBoolean();
                        // read boardData
                        for (int i = 0; i <= 7; i++) { // row
                            for (int j = 0; j <= 7; j++) { // column
                                boardData[i][j] = rd.nextInt();
                            }
                        }
                        System.out.println("load successfully\n");
                        break;
                    case 'n':
                    case 'N':
                        break; // skip
                    default:
                        System.out.println("Please write right answer\n");
                        break;
                }
            } catch (IOException e) {
                System.out.println(fileName + ".txt not founded\nstart new game\n");
                loadAns = 'N';
            } catch (InputMismatchException e) {
                System.out.println("Error!\nError type : file format\n");
                loadAns = '0'; // loop again
            }

        } while (loadAns != 'y' && loadAns != 'Y' && loadAns != 'n' && loadAns != 'N');

        do { // least 1 movable

            if (play_With == 2 || (play_With == 1 && turn == true)) { // Not A.I.
                setEnemy(turn, enemy, team);
                drawBoard(boardData); // print board
                // save game
                System.out.println("Enter s to save, sf to save and end, ff to end, press any key to skip");
                saveAns = sc.nextLine();
                if (saveAns.equals("s")) {
                    System.out.println(save(play_With, turn, boardData, fileName, p1Name, p2Name));
                }
                if (saveAns.equals("sf")) {
                    System.out.println(save(play_With, turn, boardData, fileName, p1Name, p2Name));
                    ff = true;
                }
                if (saveAns.equals("ff")) {
                    ff = true;
                } else {
                    ff = false;
                }
                if (ff != true) {
                    do { // cancel selection
                        cancel = false; // reset cancel
                        System.out.print(printTurn(play_With, turn, p1Name, p2Name)); // print turn
                        do { // ask y and check
                            System.out.print("Row : ");
                            try {
                                index_Y = sc.nextInt();
                                sc.nextLine(); // bugfix
                                check_Y = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please write integer");
                                sc.nextLine(); // bugfix
                                index_Y = 0;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Out of index");
                                index_Y = 0;
                            }
                        } while (!check_Y);
                        do { // ask x and check
                            System.out.print("Column : ");
                            try {
                                index_X = sc.nextInt();
                                sc.nextLine(); // bugfix
                                check_X = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please write integer");
                                sc.nextLine(); // bugfix
                                index_X = 0;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Out of index");
                                index_X = 0;
                            }
                        } while (!check_X);

                        if (checkIndex(boardData, index_X, index_Y, enemy, team).equals("")) { // if some message,, go
                                                                                               // back to loop
                            System.out.print("able to move : ");
                            System.out.print(movable(boardData, index_X, index_Y, enemy, team));
                            System.out.print("able to catch : ");
                            System.out.print(catchable(boardData, index_X, index_Y, enemy, team));

                            if ((movable(boardData, index_X, index_Y, enemy, team).equals("none\n")
                                    || relayCatch == true)
                                    && catchable(boardData, index_X, index_Y, enemy, team).equals("none\n")) {
                                if (relayCatch != true) {
                                    System.out.print("You can't move this piece\n");
                                    cancel = true;
                                }
                                relayCatch = false;
                            } else {
                                // ask move, catch, or cancel
                                System.out.print("\n(Enter cancel to go back)\nEnter the direction : ");
                                direction = sc.nextLine();
                                System.out.println(askDirection(boardData, index_X, index_Y, enemy, team, direction));
                                index_X = iX;
                                index_Y = iY;
                            }
                        } else {
                            System.out.print(checkIndex(boardData, index_X, index_Y, enemy, team));
                            cancel = true;
                        }

                    } while (cancel == true); // cancel selection

                    do { // relay catch, change turn
                        if (relayCatch == false) {
                            // change turn
                            if (turn == true) {
                                turn = false;
                            } else if (turn == false) {
                                turn = true;
                            }
                        } else if (relayCatch == true
                                && catchable(boardData, index_X, index_Y, enemy, team).equals("none\n") != true) { // relayCatch
                                                                                                                   // ==
                                                                                                                   // true
                            drawBoard(boardData);
                            System.out.print(printTurn(play_With, turn, p1Name, p2Name)); // print turn
                            System.out.print("able to catch : ");
                            System.out.print(catchable(boardData, index_X, index_Y, enemy, team));

                            System.out.print("\n(Enter stop to stop catching)\nEnter the direction : ");
                            direction = sc.nextLine();
                            System.out.println(askDirection(boardData, index_X, index_Y, enemy, team, direction));
                            index_X = iX;
                            index_Y = iY;
                            if (relayCatch == false) { // when user enter stop
                                // change turn
                                if (turn == true) {
                                    turn = false;
                                } else if (turn == false) {
                                    turn = true;
                                }
                            }
                        } else {
                            relayCatch = false;
                            // change turn
                            if (turn == true) {
                                turn = false;
                            } else if (turn == false) {
                                turn = true;
                            }
                        }
                    } while (relayCatch == true);
                }
                setEnemy(turn, enemy, team); // set again before lastOne
            } // ff
            else { // A.I.
                drawBoard(boardData); // print board
                turn = false;
                setEnemy(turn, enemy, team); // set again before lastOne
                ai(boardData, enemy, team);
                System.out.print(printTurn(play_With, turn, p1Name, p2Name)); // print turn
                turn = true;
                setEnemy(turn, enemy, team); // set again before lastOne
            }
        } while (lastOne(boardData, enemy, team) != 0); // least 1 movable
        System.out.print(winner(play_With, turn, p1Name, p2Name)); // output winner after game
        sc.close();
    }

    /*
     * drawBoard return void return data : void parameter : int[][] boardData
     * Purpose : draw gameboard with given data
     */
    public static void drawBoard(int[][] boardData) {
        System.out.println("     0   1   2   3   4   5   6   7 "); // print grid
        System.out.println("   |---+---+---+---+---+---+---+---| ");
        for (int i = 0; i <= 7; i++) { // row
            System.out.print(" " + i); // print grid
            for (int j = 0; j <= 7; j++) { // column
                System.out.print(" | ");
                System.out.print(pieceShape(boardData, i, j));
            }
            System.out.print(" | ");
            System.out.println("\n   |---+---+---+---+---+---+---+---| ");
        }
    }

    /*
     * lastOne return int return data : number of movable piece parameter : int[][]
     * boardData, int index_X, index_Y Purpose : check there is least 1 piece that
     * can move
     */
    public static int lastOne(int[][] boardData, int[] enemy, int[] team) {
        int moveNum = 0; // return Data
        // move
        for (int i = 0; i <= 7; i++) { // row
            for (int j = 0; j <= 7; j++) { // column
                if (checkIndex(boardData, j, i, enemy, team).equals("")) { // check it is mine
                    if (movable(boardData, j, i, enemy, team).equals("none\n")) { // check movable
                    } // skip
                    else {
                        moveNum++;
                    }
                }
            } // for loop row
        } // for loop column

        // catch
        for (int i = 0; i <= 7; i++) { // row
            for (int j = 0; j <= 7; j++) { // column
                if (checkIndex(boardData, j, i, enemy, team).equals("")) { // check it is mine
                    if (catchable(boardData, j, i, enemy, team).equals("none\n")) { // check catchable
                    } // skip
                    else {
                        moveNum++;
                    }
                }
            } // for loop column
        } // for loop row

        // ff
        if (ff == true) {
            moveNum = 0;
        }
        return moveNum;
    }

    /*
     * movable return String return data : LU, LD, RU, RD directions parameter :
     * int[][] boardData, int index_X, index_Y Purpose : check selected piece is
     * able to move
     */
    public static String movable(int[][] boardData, int index_X, int index_Y, int[] enemy, int[] team) {
        String move = ""; // return message
        if (boardData[index_Y][index_X] == team[0]) { // normal piece
            try { // out of index
                if (boardData[index_Y + direction][index_X - 1] == 0) {
                    if (direction > 0) {
                        move += "LD ";
                    } else {
                        move += "LU ";
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // skip
            }
            try {
                if (boardData[index_Y + direction][index_X + 1] == 0) {
                    if (direction > 0) {
                        move += "RD ";
                    } else {
                        move += "RU ";
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // skip
            }
            if (move.equals("")) {
                move = "none";
            }
            move += "\n";
        } else if (boardData[index_Y][index_X] == team[1]) { // king piece
            try { // out of index
                if (boardData[index_Y + 1][index_X - 1] == 0) {
                    move += "LD ";
                }
                if (boardData[index_Y - 1][index_X - 1] == 0) {
                    move += "LU ";
                }
                if (boardData[index_Y + 1][index_X + 1] == 0) {
                    move += "RD ";
                }
                if (boardData[index_Y - 1][index_X + 1] == 0) {
                    move += "RU ";
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // skip
            }
            if (move.equals("")) {
                move += "none";
            }
            move += "\n";
        } else {
            move = "Error!\nError type : movable";
        }
        return move;
    }

    /*
     * catchable return String return data : LU, LD, RU, RD directions parameter :
     * int[][] boardData, int index_X, int index_Y, int[] enemy, int[] team, int[] y
     * Purpose : check selected piece is able to catch enemy
     */
    public static String catchable(int[][] boardData, int index_X, int index_Y, int[] enemy, int[] team) {
        String cc = ""; // return message CatCh
        if (boardData[index_Y][index_X] == team[0]) { // normal piece
            try { // out of index
                if (boardData[index_Y + 2 * (direction)][index_X - 2] == 0
                        && (boardData[index_Y + direction][index_X - 1] == enemy[0]
                                || boardData[index_Y + direction][index_X - 1] == enemy[1])) {
                    if (direction > 0) {
                        cc += "LD ";
                    } else {
                        cc += "LU ";
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // skip
            }
            try {
                if (boardData[index_Y + 2 * (direction)][index_X + 2] == 0
                        && (boardData[index_Y + direction][index_X + 1] == enemy[0]
                                || boardData[index_Y + direction][index_X + 1] == enemy[1])) {
                    if (direction > 0) {
                        cc += "RD ";
                    } else {
                        cc += "RU ";
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // skip
            }
            if (cc.equals("")) {
                cc = "none";
            }
            cc += "\n";
        } else if (boardData[index_Y][index_X] == team[1]) { // king piece
            try {
                if (boardData[index_Y - 2][index_X - 2] == 0 && (boardData[index_Y - 1][index_X - 1] == enemy[0]
                        || boardData[index_Y - 1][index_X - 1] == enemy[1])) {
                    cc += "LU ";
                }
            } catch (ArrayIndexOutOfBoundsException e) { // skip
            }
            try {
                if (boardData[index_Y + 2][index_X - 2] == 0 && (boardData[index_Y + 1][index_X - 1] == enemy[0]
                        || boardData[index_Y + 1][index_X - 1] == enemy[1])) {
                    cc += "LD ";
                }
            } catch (ArrayIndexOutOfBoundsException e) { // skip
            }
            try {
                if (boardData[index_Y - 2][index_X + 2] == 0 && (boardData[index_Y - 1][index_X + 1] == enemy[0]
                        || boardData[index_Y - 1][index_X + 1] == enemy[1])) {
                    cc += "RU ";
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
            try {
                if (boardData[index_Y + 2][index_X + 2] == 0 && (boardData[index_Y + 1][index_X + 1] == enemy[0]
                        || boardData[index_Y + 1][index_X + 1] == enemy[1])) {
                    cc += "RD ";
                }
            } catch (ArrayIndexOutOfBoundsException e) { // skip
            }
            if (cc.equals("")) {
                cc = "none";
            }
            cc += "\n";
        } else {
            cc = "Error!\nError type : catchable";
        }
        return cc;
    }

    /*
     * checkIndex return boolean nothing : work parameter : int[][] boardData, int
     * index_X, index_Y, int[] enemy, team Purpose : check selected piece is mine or
     * enemy, or empty, or else
     */
    public static String checkIndex(int[][] boardData, int index_X, int index_Y, int[] enemy, int[] team) {
        String message;
        if (boardData[index_Y][index_X] == team[0] || boardData[index_Y][index_X] == team[1]) {
            message = "";
        } else if (boardData[index_Y][index_X] == enemy[0] || boardData[index_Y][index_X] == enemy[1]) {
            message = "That piece is enemy's piece\n";
        } else if (boardData[index_Y][index_X] == 0) {
            message = "There is empty space\n";
        } else {
            message = "Error! \nUnexcepted value!\n";
        }
        return message;
    }

    /*
     * askDirection return String return nothing when it works, when answer is
     * incorrect, print try again parameter : int[][] boardData, int index_X, int
     * index_Y, int[] enemy, int[] team, String direction, boolean[]
     * cancel, boolean[] relayCatch Purpose : change boardData according to the
     * answer
     */
    public static String askDirection(int[][] boardData, int index_X, int index_Y, int[] enemy, int[] team,
            String userDirection) {
        String message = "";
        if (userDirection.compareToIgnoreCase("cancel") == 0) {
            cancel = true;
        }
        if (userDirection.compareToIgnoreCase("stop") == 0 && relayCatch == true) {
            relayCatch = false;
        } else if (userDirection.compareToIgnoreCase("LU") == 0) {
            if (movable(boardData, index_X, index_Y, enemy, team).indexOf("LU") >= 0 && relayCatch == false) {
                message = "";
                boardData[index_Y - 1][index_X - 1] = boardData[index_Y][index_X];
                boardData[index_Y][index_X] = 0;
            } else if (catchable(boardData, index_X, index_Y, enemy, team).indexOf("LU") >= 0) {
                message = "";
                boardData[index_Y - 2][index_X - 2] = boardData[index_Y][index_X];
                boardData[index_Y - 1][index_X - 1] = 0;
                boardData[index_Y][index_X] = 0;
                relayCatch = true;
                iY = index_Y - 2;
                iX = index_X - 2;
            } else {
                message = "Wrong direction\n";
                cancel = true;
            }
        } else if (userDirection.compareToIgnoreCase("LD") == 0) {
            if (movable(boardData, index_X, index_Y, enemy, team).indexOf("LD") >= 0 && relayCatch == false) {
                message = "";
                boardData[index_Y + 1][index_X - 1] = boardData[index_Y][index_X];
                boardData[index_Y][index_X] = 0;
            } else if (catchable(boardData, index_X, index_Y, enemy, team).indexOf("LD") >= 0) {
                message = "";
                boardData[index_Y + 2][index_X - 2] = boardData[index_Y][index_X];
                boardData[index_Y + 1][index_X - 1] = 0;
                boardData[index_Y][index_X] = 0;
                relayCatch = true;
                iY = index_Y + 2;
                iX = index_X - 2;
            } else {
                message = "Wrong direction\n";
                cancel = true;
            }
        } else if (userDirection.compareToIgnoreCase("RU") == 0) {
            if (movable(boardData, index_X, index_Y, enemy, team).indexOf("RU") >= 0 && relayCatch == false) {
                message = "";
                boardData[index_Y - 1][index_X + 1] = boardData[index_Y][index_X];
                boardData[index_Y][index_X] = 0;
            } else if (catchable(boardData, index_X, index_Y, enemy, team).indexOf("RU") >= 0) {
                message = "";
                boardData[index_Y - 2][index_X + 2] = boardData[index_Y][index_X];
                boardData[index_Y - 1][index_X + 1] = 0;
                boardData[index_Y][index_X] = 0;
                relayCatch = true;
                iY = index_Y - 2;
                iX = index_X + 2;
            } else {
                message = "Wrong direction\n";
                cancel = true;
            }
        } else if (userDirection.compareToIgnoreCase("RD") == 0) {
            if (movable(boardData, index_X, index_Y, enemy, team).indexOf("RD") >= 0 && relayCatch == false) {
                message = "";
                boardData[index_Y + 1][index_X + 1] = boardData[index_Y][index_X];
                boardData[index_Y][index_X] = 0;
            } else if (catchable(boardData, index_X, index_Y, enemy, team).indexOf("RD") >= 0) {
                message = "";
                boardData[index_Y + 2][index_X + 2] = boardData[index_Y][index_X];
                boardData[index_Y + 1][index_X + 1] = 0;
                boardData[index_Y][index_X] = 0;
                relayCatch = true;
                iY = index_Y + 2;
                iX = index_X + 2;
            } else {
                message = "Wrong direction\n";
                cancel = true;
            }
        } else {
            message = "Please wirte the right answer\n";
            cancel = true;
        }
        return message;
    }

    /*
     * pieceShape return char pieceShape return data : char character of pieces
     * parameter : int[][] boardData, int i, j Purpose : transform value to shape
     */
    public static char pieceShape(int[][] boardData, int i, int j) {
        switch (boardData[i][j]) {
            case 1:
                return 'a';

            case 2:
                return 'b';

            case 3:
                return 'A';

            case 4:
                return 'B';

            case 0:
                return ' ';

            default:
                System.out.print("Error!");
                return '!';
        }
    }

    /*
     * setEnemy return void parameter : boolean turn, int[] enemy, int[] team, int[]
     * y purpose : set enemy value, team value
     */
    public static void setEnemy(boolean turn, int[] enemy, int[] team) {
        if (turn == true) {
            enemy[0] = 2;
            enemy[1] = 4;
            team[0] = 1;
            team[1] = 3;
            direction = -1;
        } else if (turn == false) {
            enemy[0] = 1;
            enemy[1] = 3;
            team[0] = 2;
            team[1] = 4;
            direction = 1;
        }
    }

    /*
     * printTurn return String return "Player 1 turn" or "Player 2 turn" or
     * "A.I. turn" parameter : play_With, turn String p1Name, p2Name purpose : print
     * whose turn right now
     */
    public static String printTurn(int play_With, boolean turn, String p1Name, String p2Name) {
        String message;
        if (turn == true) {
            message = p1Name + "'s turn\n";
        } else {
            if (play_With == 1) {
                message = "A.I. turn\n";
            } else if (play_With == 2) {
                message = p2Name + "'s turn\n";
            } else {
                message = "Error!\nError type : printTurn\n";
            }
        }
        return message;
    }

    /*
     * winner return String return "Player 1 Win!" or "Player 2 win!" or "A.I. Win!"
     * parameter : int play_With, boolean turn purpose : set enemy value, team value
     */
    public static String winner(int play_With, boolean turn, String p1Name, String p2Name) {
        String win;
        if (turn != true) { // opposite side win
            win = p1Name + " Win!";
        } else if (turn != false) {
            if (play_With == 1) {
                win = "A.I. Win!";
            } else if (play_With == 2) {
                win = p2Name + " Win!";
            } else {
                win = "Error!\nError type : play_With value";
            }
        } else {
            win = "Error!\nError type : turn value";
        }
        return win;
    }

    /*
     * save return void parameter : int play_With, boolean turn, int[][] boardData,
     * String p1Name, String p2Name purpose : set enemy value, team value
     */
    public static String save(int play_With, boolean turn, int[][] boardData, String fileName, String p1Name,
            String p2Name) {
        String message;
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(fileName + ".txt"));

            wr.write(p1Name);
            wr.newLine();
            wr.write(p2Name);
            wr.newLine();
            wr.write(String.valueOf(play_With));
            wr.newLine();
            wr.write(String.valueOf(turn));
            wr.newLine();
            for (int i = 0; i <= 7; i++) { // row
                for (int j = 0; j <= 7; j++) { // column
                    wr.write(String.valueOf(boardData[i][j]));
                    wr.write(" ");
                }
                wr.newLine();
            }
            wr.close();
            message = "save successfully";
        } catch (IOException e) {
            message = "Error!\nError type : " + e;
        }
        return message;
    }

    /*
     * ai return void parameter : int[][] boardData, int index_X, int index_Y, int[]
     * enemy, int[] team purpose : set enemy value, team value
     */
    public static void ai(int[][] boardData, int[] enemy, int[] team) {
        String[] directionArray = { "LU", "LD", "RU", "RD" };
        boolean again = false;
        int[][] catchList = { { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, // [0][] y of catchable piece
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 } }; // [1][] x of catchable piece

        int[][] moveList = { { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, // [0][] y of movable piece
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 } }; // [1][] x of movable piece
        int index_X, index_Y;
        int rC; //
        int cN = 12;
        int numOfMovable = 0;
        int numOfCatchable = 0;

        // fill lists
        for (int i = 0; i <= 7; i++) { // row
            for (int j = 0; j <= 7; j++) { // column
                if (checkIndex(boardData, j, i, enemy, team).equals("")) {
                    if (catchable(boardData, j, i, enemy, team).equals("none\n") != true) {
                        if (catchList[0][numOfMovable] == -1) {
                            catchList[0][numOfMovable] = i;
                            catchList[1][numOfMovable] = j;
                            numOfMovable++;
                        }
                    }
                    if (movable(boardData, j, i, enemy, team).equals("none\n") != true) {
                        if (moveList[0][numOfCatchable] == -1) {
                            moveList[0][numOfCatchable] = i;
                            moveList[1][numOfCatchable] = j;
                            numOfCatchable++;
                        }
                    }
                }
            } // column
        } // row
          // check it is empty or not
        cN = 12;
        for (int k = 0; k <= 11; k++) {
            if (catchList[0][k] == -1) {
                cN--;
            }
        }
        // chose 1 from catchlist, go to random direction
        if (cN != 0) {
            rC = (int) (Math.random() * numOfMovable);

            index_Y = catchList[0][rC];
            index_X = catchList[1][rC];

            do {
                relayCatch = false;
                int randomNum = (int)(Math.random() * 4);
                if (askDirection(boardData, index_X, index_Y, enemy, team, directionArray[randomNum]).equals("")) {
                } else {
                    again = true;
                }

            } while (again == true || relayCatch == true);
        }
        if (cN == 0) {
            // chose 1 from movelist, go to random direction
            do {
                rC = (int) (Math.random() * 12);
            } while (moveList[0][rC] == -1);

            index_Y = moveList[0][rC];
            index_X = moveList[1][rC];

            do {
                int randomNum = (int) (Math.random() * 4);
                if (askDirection(boardData, index_X, index_Y, enemy, team, directionArray[randomNum]).equals("")) {
                    again = false;
                } else {
                    again = true;
                }
            } while (again == true);
        }
    }
}
