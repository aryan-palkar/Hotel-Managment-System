import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    JPanel homeP;
    JButton home;

    BillPanel(CardLayout cl, JPanel mainMenuP, Data data){
        // grid layout for homeP(Panel) and l (label)
        super(new GridLayout(2,1));

        // setting of BillPanel Background
        setBackground(new Color(168,202,255));

        // declaration of variables
        JLabel l = new JLabel("Bill..");
        homeP = new JPanel();
        home = new JButton();

        // configuration for home button
        home.setText("Home");
        home.setFont(new Font("Lucida Handwriting",Font.PLAIN,30));
        home.setFocusable(false);
        home.setBounds(300,80,200,130);

        // comfiguration for home panel (homeP)
        homeP.setBackground(new Color(168,202,255));
        homeP.setLayout(null);
        
        homeP.add(home);
        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        add(l);
        add(homeP);
    }
}
