package ru.gb.pugacheva.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGraphic extends JFrame {
    int aiNumber;

    public GuessGraphic() {
        this.setTitle("Игра 'Угадай число'");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 400, 400);
        JButton start = new JButton("НАЧАТЬ ИГРУ");
        start.setForeground(Color.BLUE);
        this.add(start, BorderLayout.NORTH);
        JPanel mainField = new JPanel(new GridLayout(2, 1));
        this.add(mainField, BorderLayout.CENTER);
        JLabel gameField = new JLabel();
        JTextField userField = new JTextField();  // появляется, когди игрок согласен начать игру
        userField.setBackground(Color.YELLOW);
        mainField.add(gameField);
        this.setVisible(true);

        int range = 10;

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainField.add(userField);
                aiNumber = (int) (Math.random() * range);
                gameField.setText("Угадайте число от 0 до " + range + ". Введите свой вариант в желтом поле");
            }
        });

        userField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input_number = Integer.parseInt(userField.getText());
                if (input_number == aiNumber) {
                    gameField.setText("Вы угадали!. Для новой игры нажмите кнопку 'НАЧАТЬ ИГРУ'");
                    userField.setText(null);
                    return;
                } else if (input_number > aiNumber) {
                    gameField.setText("Не угадали. Загаданное число меньше");
                    userField.setText(null);
                } else {
                    gameField.setText("Не угадали. Загаданное число больше");
                    userField.setText(null);
                }
            }
        });

    }



    public static void main(String[] args) {

        new GuessGraphic();
    }

}
