package demogame;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        JFrame G= new JFrame();
        G.setTitle("Breakout Ball");
        G.setSize(700,600);
        G.setLocationRelativeTo(null);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        G.setVisible(true);
        G.setResizable(false);

        Gameplay gameplay=new Gameplay();
        G.add(gameplay);

    }
}
