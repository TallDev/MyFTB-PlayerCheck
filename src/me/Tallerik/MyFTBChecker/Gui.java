package me.Tallerik.MyFTBChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Gui.
 */
public class Gui {
    private JLabel label;
    private JTextField player;
    private JButton submit;
    private JPanel root;
    private JButton refresh;
    private JLabel outputText;

    /**
     * Instantiates a new Gui.
     */
    public Gui() {

        JFrame frame = new JFrame("MyFTB-Checker");
        frame.add(root);
        frame.setResizable(false);
        //frame.setSize(188, 578);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String online = Var.relook(player.getText());
                    if (online != "") {
                        outputText.setText("Der/Die Spieler " + online + " sind online");
                    } else {
                        outputText.setText("Der/Die angegebenen Spieler sind nicht online");
                    }
                } catch (Exception ex) {}
            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.refresh();
                String online = Var.relook(player.getText());
                if(online != "") {
                    outputText.setText("Der/Die Spieler " + online + " sind online");
                } else {
                    outputText.setText("Der/Die angegebenen Spieler sind nicht online");
                }

            }
        });
    }

}
