package Assignment4;

import java.awt.Color;

import javax.swing.JPanel;

public class Tomatoes {
    JPanel tomatoes = new JPanel();

    public Tomatoes() {
        tomatoes.setBackground(Color.lightGray);
        tomatoes.setBounds(200, 160, 120, 60);
        tomatoes.setLayout(null);
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 5; j++){
                tomatoesBit(new Color(255, randNum(), 0), j * 20 + 10, i * 20 + 10);
            }
        }
    }

    public void tomatoesBit(Color color, int x, int y) {
        JPanel tomatoesBit = new JPanel();
        tomatoesBit.setBackground(color);
        tomatoesBit.setBounds(x, y, 20, 20);
        tomatoes.add(tomatoesBit);
    }
    public int randNum(){
int randNum = (int) (Math.random() * 100 + 40);
return randNum;
    }
}