import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
    private JLabel label;
    private JButton botao;


    public Tela() {
        super("Primeiro JFrame - Tela Principal");

        Container container = getContentPane();
        container.setLayout((new FlowLayout()));

        label = new JLabel();
        botao = new JButton();


        label.setText("Descubra quem você é!!!");
        botao.setText("Clique Aqui!");

        botao.addActionListener(new GerenciadorDeBotoes());


        container.add(label);
        container.add(botao);

        setSize(360, 150);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class GerenciadorDeBotoes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
                    JOptionPane.showMessageDialog(null,"Veadão!");
                            }
    }
}
