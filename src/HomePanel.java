import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{


    HomePanel(CardLayout cl, JPanel mainMenuP, Data data, BillPanel billPanel, OrderPanel orderPanel){
        super(new GridLayout(2,1));

        JLabel homeText; // this will show as Home in main menu
        JPanel buttonSection, menuP, ordersP, billP;
        JButton menu, orders, bill;


        homeText = new JLabel("Home");
        homeText.setFont(new Font("Brush Script Std",Font.PLAIN,85));
        homeText.setHorizontalAlignment(SwingConstants.CENTER);


        buttonSection = new JPanel(new GridLayout(3,1));

        menuP = new JPanel();
        menu = new JButton("Menu");
        menu.setFont(new Font("Goudy Old Style",Font.BOLD,40));
        menuP.setBackground(new Color(168, 202, 255));
        menuP.add(menu);
        menu.addActionListener(e -> {
            cl.show(mainMenuP, "menu");
        });


        ordersP = new JPanel();
        orders = new JButton("Orders");
        orders.setFont(new Font("Goudy Old Style",Font.BOLD,40));
        orders.setFocusable(false);
        ordersP.setBackground(new Color(168, 202, 255));
        ordersP.add(orders);
        orders.addActionListener(e -> {
            orderPanel.generateOrder(cl, mainMenuP, data);
            cl.show(mainMenuP, "order");
        });

        billP = new JPanel();
        bill = new JButton("Bill");
        bill.setFont(new Font("Goudy Old Style",Font.BOLD,40));
        bill.setFocusable(false);
        billP.setBackground(new Color(168, 202, 255));
        billP.add(bill);
        bill.addActionListener(e -> {
            billPanel.GenerateBill(cl,mainMenuP,data);
            cl.show(mainMenuP, "bill");
        });
        buttonSection.add(menuP);
        buttonSection.add(ordersP);
        buttonSection.add(billP);

        add(homeText);
        add(buttonSection);

        setBackground(new Color(168, 202, 255));
        menu.setFocusable(false);

    }
}
