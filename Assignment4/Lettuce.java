package Assignment4;

import java.awt.Color;

import javax.swing.JPanel;

public class Lettuce {
    JPanel lettuce = new JPanel();

    public Lettuce() {
        lettuce.setBackground(Color.lightGray);
        lettuce.setBounds(50, 250, 120, 60);
        lettuce.setLayout(null);
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                lettuceBit(new Color(0, randNum(), 0), j * 10 + 10, i * 10 + 10);
            }
        }
    }

    public void lettuceBit(Color color, int x, int y) {
        JPanel lettuceBit = new JPanel();
        lettuceBit.setBackground(color);
        lettuceBit.setBounds(x, y, 10, 10);
        lettuce.add(lettuceBit);
    }
    public int randNum(){
int randNum = (int) (Math.random() * 100 + 130);
return randNum;
    }
}