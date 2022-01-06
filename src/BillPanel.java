import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    JPanel homeP;
    JButton home;

    BillPanel(CardLayout cl, JPanel mainMenuP, Data data){
        super(new GridLayout(2,1));
        setBackground(Color.MAGENTA);
        JLabel l = new JLabel("Bill..");

        homeP = new JPanel();
        home = new JButton("Home");
        homeP.add(home);
        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        add(homeP);
        add(l);
    }
}
