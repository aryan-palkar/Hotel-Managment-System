import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    private JPanel Panel1;
    private JPanel Panel2;
    private JPanel Panel3;
    JButton home;

    BillPanel(){
//        setLayout(null);
//
//        // declaration of variables
//        JLabel billLabel = new JLabel();
//        Panel1 = new JPanel();
//        Panel2 = new JPanel();
//        Panel3 = new JPanel();
//        home = new JButton();
//
//        // configuration for Panels
//        Panel1.setBackground(new Color(168,202,255));
//        Panel1.setBounds(0, 0, 800, 70);
//        Panel2.setBackground(new Color(168,202,255));
//        Panel2.setBounds(0, 70, 800, 380);
//        Panel2.setLayout(new GridLayout(6,4,10,10));
//        Panel3.setBackground(new Color(168,202,255));
//        Panel3.setBounds(0, 450, 800, 150);
//        Panel3.setLayout(null);
//
//            // configuration for home button
//            home.setText("Home");
//            home.setFont(new Font("Tekton Pro",Font.PLAIN,30));
//            home.setFocusable(false);
//            home.setBounds(330,30,140,50);
//            home.setVerticalTextPosition(JButton.CENTER);
//
//        // configuration for label bill
//        billLabel.setText("BILL");
//        billLabel.setHorizontalAlignment(JLabel.CENTER);
//        billLabel.setVerticalAlignment(JLabel.CENTER);
//        billLabel.setFont(new Font("Lucida Handwriting",Font.BOLD,25));
//
//            Panel2.add(new JLabel("STARTER"));
//            Panel2.add(new JLabel("PRICE"));
//            Panel2.add(new JLabel("QUANTITY"));
//            Panel2.add(new JLabel("AMOUNT"));
//            Panel2.add(new JLabel("Manchurian"));
//            Panel2.add(new JLabel("250"));
//            Panel2.add(new JLabel("1"));
//            Panel2.add(new JLabel("250"));
//            Panel2.add(new JLabel("MAIN COURSE"));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel("Naan"));
//            Panel2.add(new JLabel("40"));
//            Panel2.add(new JLabel("2"));
//            Panel2.add(new JLabel("80"));
//            Panel2.add(new JLabel("DESSERT"));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel(""));
//            Panel2.add(new JLabel("Cheese Cake"));
//            Panel2.add(new JLabel("150"));
//            Panel2.add(new JLabel("1"));
//            Panel2.add(new JLabel("150"));
//
//        Panel1.add(billLabel);
//        Panel3.add(home);
//
//        // action listener for home button
//        home.addActionListener(e -> {
//            cl.show(mainMenuP, "home");
//        });
//
//        // adding elements to panel
//        add(Panel1);
//        add(Panel2);
//        add(Panel3);
    }

    void GenerateBill(CardLayout cl, JPanel mainMenuP, Data data){
        setLayout(new BorderLayout());

        Integer total = new Integer(0);
        Panel1 = new JPanel();
        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

        boolean flag = false;
        for (DataQuantum d: data.starters) { if(d.count != 0) flag = true;}
        for (DataQuantum d: data.mainCourse) { if(d.count != 0) flag = true;}
        if(flag){
            Panel1.add(new JLabel("Starters"));
            for (DataQuantum d: data.starters) {
                if(d.count != 0){
                    JPanel temp = new JPanel();
                    total += d.count * d.price;
                    temp.add(new JLabel(d.name));
                    temp.add(new JLabel("Rs. " +  d.price + " X"+ d.count + " = Rs." + d.price * d.count));
                    Panel1.add(temp);
                }
            }

            Panel1.add(new JLabel("Main Course"));
            for (DataQuantum d: data.mainCourse) {
                if(d.count != 0){
                    JPanel temp = new JPanel();
                    total += d.count * d.price;
                    temp.add(new JLabel(d.name));
                    temp.add(new JLabel("Rs. " +  d.price + " X"+ d.count + " = Rs." + d.price * d.count));
                    Panel1.add(temp);
                }
            }
        }else{
            Panel1.add(new JLabel("Oops! You Didn't order anything"));
        }

        Panel2 = new JPanel(new BoxLayout(Panel2, BoxLayout.Y_AXIS));
        Panel2.add(Panel1);
        Panel2.add(new JLabel("Total = " + total));

        home = new JButton("Home");
        home.addActionListener(e -> {
            this.remove(Panel1);
            cl.show(mainMenuP, "home");
        });
        add(home, BorderLayout.SOUTH);
        add(Panel2, BorderLayout.CENTER);
    }
}
