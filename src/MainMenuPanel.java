import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel{


    MainMenuPanel(CardLayout cl, JPanel mainMenuP){
        super(new GridLayout(2,1));

        JLabel welcome;
        JPanel buttonSection, menuP, ordersP, billP;
        JButton menu, orders, bill;


        welcome = new JLabel("Home");
        welcome.setHorizontalAlignment(SwingConstants.CENTER);


        buttonSection = new JPanel(new GridLayout(3,1));

        menuP = new JPanel();
        menu = new JButton("Menu");
        menuP.add(menu);
        menu.addActionListener(e -> {
            cl.show(mainMenuP, "menu");
        });


        ordersP = new JPanel();
        orders = new JButton("Orders");
        ordersP.add(orders);
        orders.addActionListener(e -> {
            cl.show(mainMenuP, "order");
        });

        billP = new JPanel();
        bill = new JButton("Bill");
        billP.add(bill);
        bill.addActionListener(e -> {
            cl.show(mainMenuP, "bill");
        });

        buttonSection.add(menuP);
        buttonSection.add(ordersP);
        buttonSection.add(billP);

        add(welcome);
        add(buttonSection);

    }
}
