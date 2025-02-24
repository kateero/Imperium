package mephi.b22901.saver.imperium.View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import mephi.b22901.saver.imperium.Controller.Controller;

public class View {

    Controller controller = new Controller();

    public View() {
        JFrame frame = new JFrame("Simple calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JButton add = new JButton("Добавить преступника");
        JButton print = new JButton("Вывести всех преступников");
        JButton info = new JButton("Подробнее о преступнике");

        panel.add(add);
        panel.add(print);
        panel.add(info);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        add.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                controller.addEretic();
                JOptionPane.showMessageDialog(frame, "Преступник добавлен",
                        "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        );

        print.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                JFrame frameAll = new JFrame("Разыскиваются!!!");
                frameAll.setSize(400, 200);
                JPanel panelAll = new JPanel(); 
                
                JTextArea text = new JTextArea(100, 100);
                text.append(controller.printAll());
                panelAll.add(text);
                
                frameAll.getContentPane().add(panelAll);
                frameAll.setVisible(true);
            }
        }
        );
        
        
    }
}
