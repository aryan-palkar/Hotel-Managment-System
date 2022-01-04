import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{

    CardLayout cl;
    JPanel mainMenuP;

    MainMenu(){
        MainMenuPanel home;
        MenuPanel menu;
        OrderPanel order;
        BillPanel bill;
        mainMenuP = new JPanel();
        cl = new CardLayout();
        mainMenuP.setLayout(cl);

        home = new MainMenuPanel(cl, mainMenuP);
        menu = new MenuPanel(cl, mainMenuP);
        order = new OrderPanel(cl, mainMenuP);
        bill = new BillPanel(cl, mainMenuP);


        mainMenuP.add(home , "home");
        mainMenuP.add(menu , "menu");
        mainMenuP.add(order, "order");
        mainMenuP.add(bill , "bill");

        add(mainMenuP);

        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
