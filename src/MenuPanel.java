import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    JPanel homeP;
    JButton home;

    MenuPanel(CardLayout cl, JPanel mainMenuP, Data data){
        super(new GridLayout(2,1));
        setBackground(Color.ORANGE);
        JLabel l = new JLabel("menu..");

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
