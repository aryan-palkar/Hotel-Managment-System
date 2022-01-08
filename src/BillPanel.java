import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {
    private JPanel Panel1;
    JButton home;

    BillPanel(){
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

        Panel1.add(new JLabel("Total = " + total));

        home = new JButton("Home");
        home.addActionListener(e -> {
            this.remove(Panel1);
            cl.show(mainMenuP, "home");
        });
        add(home, BorderLayout.SOUTH);
        add(Panel1, BorderLayout.CENTER);
    }
}
