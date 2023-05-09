package Assignment4;

import java.awt.Color;

import javax.swing.JPanel;

public class Onions {
    JPanel onions = new JPanel();

    public Onions() {
        onions.setBackground(Color.lightGray);
        onions.setBounds(200, 250, 120, 60);
        onions.setLayout(null);
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                onionsBit(new Color(randNum(), 0, randNum()), j * 10 + 10, i * 10 + 10);
            }
        }
    }

    public void onionsBit(Color color, int x, int y) {
        JPanel onionsBit = new JPanel();
        onionsBit.setBackground(color);
        onionsBit.setBounds(x, y, 10, 10);
        onions.add(onionsBit);
    }
    public int randNum(){
int randNum = (int) (Math.random() * 100 + 70);
return randNum;
    }
}