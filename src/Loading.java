import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loading extends JFrame implements ActionListener{

    JLabel label;
    JProgressBar progressBar;
    int i;

    Loading(){
        setLayout(null);

        ImageIcon image = new ImageIcon("restaurant.png");

        progressBar = new JProgressBar(0, 20);
        progressBar.setBounds(0, 580, 600, 20);
        progressBar.setBackground(new Color(255, 255, 255));
        progressBar.setForeground(new Color(010101));
        progressBar.setBorder(null);

        label = new JLabel();
        label.setText("Welcome");
        label.setFont(new Font("Helvetica",Font.BOLD,30));
        label.setBounds(200, 140, 200, 240);
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(10);

        i=0;
        Timer t = new Timer(100,this);
        t.start();

        add(label);
        add(progressBar);

        setSize(600,600);
        getContentPane().setBackground(new Color(168, 202, 255));
        setTitle("Loading");
        setDefaultCloseOperation(3);

        setUndecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(i==20){
            dispose();
            new MainMenu();
        }
        i++;
        progressBar.setValue(i);
    }
}