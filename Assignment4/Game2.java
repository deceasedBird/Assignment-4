package Assignment4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game2 implements ActionListener {
    ImageIcon logo = new ImageIcon("SubwayIcon.png");

    Lettuce lettuce = new Lettuce();
    Onions onions = new Onions();
    Peppers peppers = new Peppers();
    Tomatoes tomatoes = new Tomatoes();
    JPanel cuttingBoard = new JPanel();
    JLabel message = new JLabel();
    JButton continueButton = new JButton();

    public static void main(String[] args) {
        Game2 game = new Game2();
        game.start();
    }

    public void start() {
        cuttingBoard.setBackground(Color.lightGray);
        cuttingBoard.setBounds(0, 350, 1000, 100);

        message.setText("<html>You are an employee at a Subway in a theme park.<br> It is your job to prepare the sandwiches as per the customer's instruction");
        message.setBounds(30, 480, 450, 50);

        continueButton.setBounds(500, 475, 100, 50);
        continueButton.setVisible(true);
        continueButton.setText("Start");
        continueButton.addActionListener(e -> dialogue(breadReq(), "continue"));
        continueButton.addActionListener(e -> continueButton.setVisible(false));

        JFrame frame = new JFrame();
        frame.setTitle("Theme Park Subway");
        frame.setIconImage(logo.getImage());
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(cuttingBoard);
        frame.add(lettuce.lettuce);
        frame.add(onions.onions);
        frame.add(peppers.peppers);
        frame.add(tomatoes.tomatoes);
        frame.add(message);
        frame.add(continueButton);
    }

    public void dialogue(String text, String response) {
        message.setText(text);
        continueButton.setText(response);
    }

    public String breadReq() {
        int randNum = (int) (Math.random() * 1 + 1);
        System.out.print(randNum);
        return "blank";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // Do nothing for now
    }
}
