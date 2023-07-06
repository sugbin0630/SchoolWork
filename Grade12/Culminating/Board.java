package Grade12.Culminating;

import java.awt.*;
import javax.swing.*;

public class Board extends JFrame {
    final static String FILE_NAME = "ChessGame_Records.txt";
    private Container c = getContentPane();
    private static RecordGroup recordGroup = RecordGroup.getRecordGroup();
    static Game_Record loaded_Game_Record;
    static boolean isLoaded = false;
    static JPanel page1 = new JPanel() {
    };

    Board(Game_Record game) {
        c.setLayout(null);
        setTitle("Chess Board");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(45, 45, 45));
        setButton(game);
        setPieces(game);
        setBoard();
        setVisible(true);
    }

    /**
     * disply save, load, and record buttons on screen
     * add save function to saveButton
     * add load function to loadButton
     * add sort records function to recordButton
     */
    void setButton(Game_Record game) {
        Dialog loadWindow = new MyDialog(this);

        JButton saveButton = new JButton("Save");
        JButton loadButton = new JButton("Load");
        JButton recordButton = new JButton("Records");

        saveButton.setBounds(80, 480, 120, 40);
        loadButton.setBounds(230, 480, 120, 40);
        recordButton.setBounds(380, 480, 120, 40);

        c.add(saveButton);
        c.add(loadButton);
        c.add(recordButton);
        JLabel j = new JLabel();
        j.setBounds(0, 0, 100, 100);
        j.setIcon(null);
        c.add(j);
        j.setEnabled(false);

        saveButton.addActionListener(event -> {
            if (recordGroup.saveGame(game, FILE_NAME)) {
                JOptionPane.showMessageDialog(this, "Saved successfully!", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save", "Message", JOptionPane.ERROR_MESSAGE);
            }
        });

        loadButton.addActionListener(event -> {
            loadWindow.setVisible(true);
        });
    }

    /**
     * display chess pieces on screen
     * 
     * @param game loaded Game_Record
     */
    void setPieces(Game_Record game) {
        JLabel pieces_icon[][] = new JLabel[8][8];
        JButton pieces_Button[][] = new JButton[8][8];
        int[] index = new int[2];
        boolean[] isSelected = new boolean[1];
        isSelected[0] = false;

        game.setPieces();

        for (int index_Y = 0; index_Y < game.boardData[0].length; index_Y++) {
            for (int index_X = 0; index_X < game.boardData.length; index_X++) {
                pieces_icon[index_Y][index_X] = new JLabel();
                pieces_icon[index_Y][index_X].setIcon(new ImageIcon(game.pieces[index_Y][index_X].getImage()));
                pieces_icon[index_Y][index_X].setBounds(92 + index_X * 50, 45 + index_Y * 50, 50, 60);

                pieces_Button[index_Y][index_X] = new JButton();
                pieces_Button[index_Y][index_X].setIcon(null);
                pieces_Button[index_Y][index_X].setBounds(92 + index_X * 50, 45 + index_Y * 50, 50, 60);
                pieces_Button[index_Y][index_X].setContentAreaFilled(false);
                pieces_Button[index_Y][index_X].setOpaque(false);
                pieces_Button[index_Y][index_X].setBorderPainted(false);
                pieces_Button[index_Y][index_X].setEnabled(false);
                if (game.pieces[index_Y][index_X].checkIndex(index_X, index_Y) == 1) {
                    pieces_Button[index_Y][index_X].setEnabled(true);
                }

                c.add(pieces_icon[index_Y][index_X]);
                c.add(pieces_Button[index_Y][index_X]);
            }
        }

        for (int index_Y = 0; index_Y < game.boardData[0].length; index_Y++) {
            for (int index_X = 0; index_X < game.boardData.length; index_X++) {
                final int Y = index_Y;
                final int X = index_X;

                pieces_Button[Y][X].addActionListener(event -> {
                    if (isSelected[0] == false) {
                        buttonAction(game, pieces_Button, Y, X, index, isSelected);
                        c.repaint();
                    } else if (isSelected[0] == true) {
                        if (game.pieces[index[1]][index[0]].moveable(X, Y)) {
                            game.move(index[0], index[1], X, Y);
                            pieces_icon[index[1]][index[0]]
                                    .setIcon(new ImageIcon(game.pieces[index[1]][index[0]].getImage()));
                            pieces_icon[Y][X].setIcon(new ImageIcon(game.pieces[Y][X].getImage()));
                        }
                        for (int i = 0; i < pieces_Button.length; i++) {
                            for (int j = 0; j < pieces_Button.length; j++) {
                                pieces_Button[j][i].setIcon(null);
                            }
                        }
                        isSelected[0] = false;
                        c.repaint();
                    }
                });
            }
        }

    }

    void buttonAction(Game_Record game, JButton[][] pieces_Button, int Y, int X, int[] index, boolean[] isSelected) {
        isSelected[0] = true;
        for (int i = 0; i < pieces_Button.length; i++) {
            for (int j = 0; j < pieces_Button.length; j++) {
                pieces_Button[j][i].setIcon(null);
                pieces_Button[j][i].setEnabled(false);
                if (game.pieces[j][i].checkIndex(i, j) == 1) {
                    pieces_Button[j][i].setEnabled(true);
                }

            }
        }

        pieces_Button[Y][X]
                .setIcon(new ImageIcon("/Java/src/Grade12/Culminating/images/moveable_pressed.png"));
        for (int i = 0; i < pieces_Button.length; i++) {
            for (int j = 0; j < pieces_Button.length; j++) {
                if (game.pieces[Y][X].moveable(i, j)) {
                    index[0] = X;
                    index[1] = Y;
                    pieces_Button[j][i].setIcon(new ImageIcon("/Java/src/Grade12/Culminating/images/moveable.png"));
                    pieces_Button[j][i].setEnabled(true);
                }
            }
        }
    }

    /**
     * display board on screen
     */
    void setBoard() {
        JLabel board = new JLabel();

        board.setIcon(new ImageIcon("/Java/src/Grade12/Culminating/images/board.png"));
        board.setBounds(92, -50, 600, 600);

        c.add(board);
    }

    class MyDialog extends JDialog {
        JTextField textField = new JTextField(10);
        JButton records[] = new JButton[recordGroup.getArrayList().size()];

        public MyDialog(JFrame frame) {
            setLayout(new FlowLayout());
            add(textField);
            for (int i = 0; i < records.length; i++) {
                records[i] = new JButton(recordGroup.getArrayList().get(i).getPlayer1() + " vs "
                        + recordGroup.getArrayList().get(i).getPlayer2() + "   "
                        + recordGroup.getArrayList().get(i).getCode() + "   "
                        + recordGroup.getArrayList().get(i).getDate());
                records[i].setPreferredSize(new Dimension(400, 40));

                records[i].addActionListener(event -> {
                    loaded_Game_Record = recordGroup.getArrayList().get(0);
                    isLoaded = true;
                });
                add(records[i]);
            }

            setSize(500, 400);
        }
    }

    public static void main(String[] args) {
        Game_Record newGame = new Game_Record("player1", "player2", 0, 1,
                recordGroup.getArrayList());

        recordGroup.fileLoad(FILE_NAME);

        String player1 = JOptionPane.showInputDialog("Enter player1 name");
        String player2 = JOptionPane.showInputDialog("Enter player2 name");
        if (player1 != null) {
            newGame.setPlayer1(player1);
        }
        if (player2 != null) {
            newGame.setPlayer2(player2);
        }

        Board newBoard = new Board(newGame);
        while (true) {
            if (isLoaded) {
                isLoaded = false;
                newBoard.removeAll();
                new Board(loaded_Game_Record);
            }
        }

    }
}