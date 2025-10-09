import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener{

    private JButton[] buttons = new JButton[9];
    private boolean playerXTurn = true;
    private JLabel statusLabel;
    private JButton resetButton, modeButton;
    private boolean vsComputer = false;

    public TicTacToe(){
        setTitle("Tic Tac Toe");
        setSize(400,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 3));
        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        statusLabel = new JLabel("Mode: Player vs Player | Giliran: X", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        resetButton = new JButton("Reset");
        modeButton =  new JButton("Ubah ke VS Computer");
        resetButton.addActionListener(e -> resetGame());
        modeButton.addActionListener(e -> switchMode());
        bottomPanel.add(resetButton);
        bottomPanel.add(modeButton);

        add(statusLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();

        if (!clickedButton.getText().equals("") || checkWinner()) return;

        clickedButton.setText(playerXTurn ? "X" : "O");

        clickedButton.setForeground(playerXTurn ? Color.blue : Color.red);

        if (checkWinner()) {
            statusLabel.setText("Pemenang: " + (playerXTurn ? "X" : "O"));
            return;
        } else if (isBoardFull()){
            statusLabel.setText("Seri!");
            return;
        }

        playerXTurn = !playerXTurn;

        if (vsComputer && !playerXTurn) {
            computerMove();
        } else {
            statusLabel.setText("Giliran: "+ (playerXTurn ? "X" : "O"));
        }
    }

    private void computerMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestMove = -1;

        for(int i = 0; i < 9; i++){
            if (buttons[i].getText().equals("")) {
                buttons[i].setText("O");
                int score = minimax(false);
                buttons[i].setText("");
                if (score > bestScore) {
                    bestScore = score;
                    bestMove = i;
                }
            }
        }

        buttons[bestMove].setText("O");

        buttons[bestMove].setForeground(Color.red);

        if (checkWinner()) {
            statusLabel.setText("Pemenang: O (Computer)");
        }else if (isBoardFull()) {
            statusLabel.setText("Seri!");
        } else {
            playerXTurn = true;
            statusLabel.setText("Giliran X");
        }
    }

    private int minimax(boolean isMaximizing) {
        if(checkWinnerInstant("O")) return 1;
        if(checkWinnerInstant("X")) return -1;
        if(isBoardFull()) return 0;

        int bestScore = isMaximizing?
        Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 9; i++){
            if (buttons[i].getText().equals("")) {
                buttons[i].setText(isMaximizing? "O" : "X");
                int score = minimax(!isMaximizing);
                buttons[i].setText("");
                bestScore = isMaximizing? Math.max(score, bestScore) : Math.min(score, bestScore);
            }
        }

        return bestScore;
    }

    private boolean checkWinner(){
        int[][] winConditions = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] wc : winConditions){
            if (!buttons[wc[0]].getText().equals("") && buttons[wc[0]].getText().equals(buttons[wc[1]].getText()) && buttons[wc[1]].getText().equals(buttons[wc[2]].getText())) {
                buttons[wc[0]].setBackground(Color.GREEN);
                buttons[wc[1]].setBackground(Color.GREEN);
                buttons[wc[2]].setBackground(Color.GREEN);
                return true;
            }
        }
        return false;
    }

    private boolean checkWinnerInstant(String symbol) {
        int[][] winConditions = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] wc : winConditions){
            if (!buttons[wc[0]].getText().equals(symbol) && buttons[wc[1]].getText().equals(symbol) && buttons[wc[2]].getText().equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    private boolean isBoardFull(){
        for (JButton button : buttons){
            if (button.getText().equals("")) return false;
        }
        return true;
    }

    private void resetGame(){
        for (JButton button : buttons){
            button.setText("");
            button.setEnabled(true);
            button.setBackground(null);
        }

        playerXTurn = true;
        statusLabel.setText("Mode: " + (vsComputer ? "Player vs Computer" : "Player vs Player") + " | Giliran: X");
    }

    private void switchMode() {
        vsComputer = !vsComputer;
        resetGame();

        if (vsComputer) {
            modeButton.setText("Ubah ke Vs Player");
            statusLabel.setText("Mode: Player vs Computer | Giliran: X");
        } else{
            modeButton.setText("Ubah ke Vs Computer");
            statusLabel.setText("Mode: Player vs Player | Giliran: X");
        }
    }
    
    public static void main(String[] args) throws Exception {
        new TicTacToe();
    }
}
