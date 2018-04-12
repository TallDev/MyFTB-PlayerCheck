package me.Tallerik.MyFTBChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JLabel label;
    private JTextField player;
    private JButton submit;
    private JPanel root;
    private JButton refresh;
    private JLabel outputText;

    public Gui() {

        JFrame frame = new JFrame("MyFTB-Checker");
        frame.add(root);
        frame.setVisible(true);
        frame.pack();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.relook(player.getText());
            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.refresh();
                String online = Var.relook(player.getText());
                if(online != "") {
                    outputText.setText("Die Spieler " + online + " sind online");
                } else {
                    outputText.setText("Die angegebenen Spieler sind nicht online");
                }

            }
        });
    }

}
