package Assignment4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game implements ActionListener {
    ImageIcon logo = new ImageIcon("SubwayIcon.png");

        Lettuce lettuce = new Lettuce();
        Onions onions = new Onions();
        Peppers peppers = new Peppers();
        Tomatoes tomatoes = new Tomatoes();
        JPanel cuttingBoard = new JPanel();
        JLabel message = new JLabel();
        JButton continueButton = new JButton();
        int sequence = 0;
        int points = 0;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    public void start(){
        cuttingBoard.setBackground(Color.lightGray);
        cuttingBoard.setBounds(0, 350, 1000, 100);

        message.setText("<html>You are an employee at a Subway in a theme park.<br> It is your job to prepare the sandwhiches as per the customer's instruction");
        message.setBounds(30, 480, 450, 50);

        continueButton.setBounds(500, 475, 100, 50);
        continueButton.setText("Start");
        
        continueButton.addActionListener(this);

        JFrame game = new JFrame();
        game.setTitle("Theme Park Subway");
        game.setIconImage(logo.getImage());
        game.setSize(1000, 600);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setLayout(null);
        game.setVisible(true);
        game.add(cuttingBoard);
        game.add(lettuce.lettuce);
        game.add(onions.onions);
        game.add(peppers.peppers);
        game.add(tomatoes.tomatoes);
        game.add(message);
        game.add(continueButton);

    }
    public void dialogue(int sequence){
        String text = "error";
        String response = "error";
        switch(sequence){
            case 0: text = breadReq(); response = "continue";
            break;

        }
        message.setText(text);
        continueButton.setText(response);
    }
    public String breadReq(){
        int breadTypeNum = (int) (Math.random() * 2 + 1);
        String breadType = "brown";
        if (breadTypeNum == 1){
            breadType = "white";
        }
        return "I would like " + breadType + " bread";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continueButton){
            dialogue(sequence);
            sequence++;
        }
    }
}