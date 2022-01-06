import javax.swing.*;
import java.awt.*;

public class OrderPanel extends JPanel {

    JPanel homeP;
    JButton home;

    OrderPanel(CardLayout cl, JPanel mainMenuP, Data data){
        super(new GridLayout(2,1));
        setBackground(Color.CYAN);
        JLabel l = new JLabel("Orders..");

        homeP = new JPanel();
        home = new JButton("Home");
        homeP.add(home);
        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        add(homeP);
        add(l);
//        System.out.println(data.name);
    }
}
