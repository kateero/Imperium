package mephi.b22901.saver.imperium.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import mephi.b22901.saver.imperium.Controller.Controller;

public class View {

    Controller controller = new Controller();

    public View() {
        JFrame frame = new JFrame("Imperium");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JButton add = new JButton("Добавить преступника");
        add.setBackground(new Color(173, 216, 230)); 
        JButton print = new JButton("Вывести всех преступников");
        print.setBackground(new Color(100, 149, 237)); 
        JButton info = new JButton("Подробнее о преступнике");
        info.setBackground(new Color(90, 90, 200));

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
                frame.setVisible(false);

                JFrame frameAll = new JFrame("Разыскиваются!!!");
                frameAll.setSize(500, 300);
                frameAll.setLocationRelativeTo(null);
                frameAll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panelAll = new JPanel();
                JTextArea text = new JTextArea(20, 20);
                text.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
                text.setEditable(false);
                text.append(controller.printAll());
                JScrollPane scrollPane = new JScrollPane(text);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                panelAll.add(scrollPane, BorderLayout.CENTER);

                JButton exit = new JButton("back");
                exit.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
                exit.setBackground(new Color(173, 216, 230)); 
                panelAll.add(exit);

                frameAll.getContentPane().add(panelAll, BorderLayout.CENTER);
                frameAll.setVisible(true);
                exit.addActionListener(
                        new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        frameAll.dispose();
                        frame.setVisible(true);
                    }
                }
                );
            }
        }
        );

        info.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                frame.setVisible(false);

                JFrame frameInfo = new JFrame("Досье преступника");
                frameInfo.setSize(500, 300);
                frameInfo.setLocationRelativeTo(null);
                frameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panelInfo = new JPanel(new BorderLayout());
                JComboBox<String> selectEretic = new JComboBox<>(controller.getNames());
                selectEretic.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
                panelInfo.add(selectEretic, BorderLayout.NORTH);

                JButton check = new JButton("check");
                check.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
                check.setBackground(new Color(100, 149, 237)); 
                panelInfo.add(check, BorderLayout.EAST);

                JTextArea info = new JTextArea(20, 20);
                info.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
                info.setEditable(false);

                panelInfo.add(info, BorderLayout.CENTER);

                JButton exit = new JButton("back");
                exit.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
                exit.setBackground(new Color(173, 216, 230)); 
                panelInfo.add(exit, BorderLayout.SOUTH);

                frameInfo.getContentPane().add(panelInfo, BorderLayout.CENTER);
                frameInfo.setVisible(true);

                check.addActionListener(
                        new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        info.setText("");
                        int number = 0;
                        for (int i = 0; i < controller.getNames().length; i++) {
                            if (controller.getNames()[i].equals(selectEretic.getSelectedItem())) {
                                number = i;
                            }
                        }
                        info.append(controller.showInfo(number));
                    }
                }
                );

                exit.addActionListener(
                        new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        frameInfo.dispose();
                        frame.setVisible(true);
                    }
                }
                );
            }
        }
        );
    }

}
