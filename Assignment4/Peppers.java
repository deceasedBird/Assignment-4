package Assignment4;

import java.awt.Color;

import javax.swing.JPanel;

public class Peppers {
    JPanel peppers = new JPanel();

    public Peppers() {
        peppers.setBackground(Color.lightGray);
        peppers.setBounds(50, 160, 120, 60);
        peppers.setLayout(null);
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                peppersBit(new Color(204, randNum(), 0), j * 10 + 10, i * 10 + 10);
            }
        }
    }

    public void peppersBit(Color color, int x, int y) {
        JPanel peppersBit = new JPanel();
        peppersBit.setBackground(color);
        peppersBit.setBounds(x, y, 10, 10);
        peppers.add(peppersBit);
    }
    public int randNum(){
int randNum = (int) (Math.random() * 204 + 1);
return randNum;
    }
}