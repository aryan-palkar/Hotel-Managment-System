import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainMenu extends JFrame{

    CardLayout cl;
    JPanel mainMenuP;
    Data data;
    MainMenu(){
        data = new Data();
        HomePanel home;
        MenuPanel menu;
        OrderPanel order;
        BillPanel bill;
        mainMenuP = new JPanel();
        cl = new CardLayout();
        mainMenuP.setLayout(cl);

        home = new HomePanel(cl, mainMenuP, data);
        menu = new MenuPanel(cl, mainMenuP, data);
        order = new OrderPanel(cl, mainMenuP, data);
        bill = new BillPanel(cl, mainMenuP, data);


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
