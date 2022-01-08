import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainMenu extends JFrame{

    CardLayout cl;
    JPanel mainMenuP;
    Data data;
    HomePanel home;
    MenuPanel menu;
    OrderPanel order = new OrderPanel();;
    BillPanel bill = new BillPanel();

    MainMenu(){
        data = new Data();

        mainMenuP = new JPanel();
        cl = new CardLayout();
        mainMenuP.setLayout(cl);

        home = new HomePanel(cl, mainMenuP, data, bill, order);
        menu = new MenuPanel(cl, mainMenuP, data);


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
