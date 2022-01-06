import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    private JPanel Panel1;
    private JPanel Panel2;
    JButton home;

    BillPanel(CardLayout cl, JPanel mainMenuP, Data data){
        
        setLayout(null);

        // declaration of variables
        JLabel billLabel = new JLabel();
        Panel1 = new JPanel();
        Panel2 = new JPanel();
        home = new JButton();

        // configuration for Panels
        Panel1.setBackground(new Color(255,255,255));
        Panel1.setBounds(0, 0, 800, 450);
        Panel2.setBackground(new Color(168,202,255));
        Panel2.setBounds(0, 450, 800, 150);
        Panel2.setLayout(null);

        // configuration for home button
        home.setText("Home");
        home.setFont(new Font("Tekton Pro",Font.PLAIN,30));
        home.setFocusable(false);
        home.setBounds(330,30,140,50);
        home.setVerticalTextPosition(JButton.CENTER);
        
        // configuration for label bill
        billLabel.setText("BILL");
        billLabel.setHorizontalAlignment(JLabel.CENTER);
        billLabel.setFont(new Font("Lucida Handwriting",Font.BOLD,25));
        billLabel.setVerticalAlignment(JLabel.TOP);

        
        // adding home button to Panel2 panel
        Panel2.add(home);

        // action listener for home button
        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        // adding elements to panel
        add(Panel1);
        add(Panel2);
    }
}
