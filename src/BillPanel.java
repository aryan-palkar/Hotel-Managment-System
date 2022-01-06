import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    private JPanel Panel1;
    private JPanel Panel2;
    private JPanel Panel3;
    JButton home;

    BillPanel(CardLayout cl, JPanel mainMenuP, Data data){
        
        setLayout(null);

        // declaration of variables
        JLabel billLabel = new JLabel();
        Panel1 = new JPanel();
        Panel2 = new JPanel();
        Panel3 = new JPanel();
        home = new JButton();

        // configuration for Panels
        Panel1.setBackground(new Color(168,202,255));
        Panel1.setBounds(0, 0, 800, 70);
        Panel2.setBackground(new Color(168,202,255));
        Panel2.setBounds(0, 70, 800, 380);
        Panel2.setLayout(new GridLayout(6,4,10,10));
        Panel3.setBackground(new Color(168,202,255));
        Panel3.setBounds(0, 450, 800, 150);
        Panel3.setLayout(null);

            // configuration for home button
            home.setText("Home");
            home.setFont(new Font("Tekton Pro",Font.PLAIN,30));
            home.setFocusable(false);
            home.setBounds(330,30,140,50);
            home.setVerticalTextPosition(JButton.CENTER);
        
        // configuration for label bill
        billLabel.setText("BILL");
        billLabel.setHorizontalAlignment(JLabel.CENTER);
        billLabel.setVerticalAlignment(JLabel.CENTER);
        billLabel.setFont(new Font("Lucida Handwriting",Font.BOLD,25));

            Panel2.add(new JLabel("STARTER"));
            Panel2.add(new JLabel("PRICE"));
            Panel2.add(new JLabel("QUANTITY"));
            Panel2.add(new JLabel("AMOUNT"));
            Panel2.add(new JLabel("Manchurian"));
            Panel2.add(new JLabel("250"));
            Panel2.add(new JLabel("1"));
            Panel2.add(new JLabel("250"));
            Panel2.add(new JLabel("MAIN COURSE"));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel("Naan"));
            Panel2.add(new JLabel("40"));
            Panel2.add(new JLabel("2"));
            Panel2.add(new JLabel("80"));
            Panel2.add(new JLabel("DESSERT"));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel(""));
            Panel2.add(new JLabel("Cheese Cake"));
            Panel2.add(new JLabel("150"));
            Panel2.add(new JLabel("1"));
            Panel2.add(new JLabel("150"));
        
        Panel1.add(billLabel);
        Panel3.add(home);

        // action listener for home button
        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        // adding elements to panel
        add(Panel1);
        add(Panel2);
        add(Panel3);
    }
}
