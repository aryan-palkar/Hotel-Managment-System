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
        Panel1.setBackground(new Color(168, 202, 255));
        JLabel starters = new JLabel("Starters");
        starters.setFont(new Font("Cambria",Font.BOLD,35));
        JLabel mainCourse = new JLabel("Main Course");
        mainCourse.setFont(new Font("Cambria",Font.BOLD,35));

        boolean flag = false;
        for (DataQuantum d: data.starters) { if(d.count != 0) flag = true;}
        for (DataQuantum d: data.mainCourse) { if(d.count != 0) flag = true;}
        if(flag){
            Panel1.add(starters);
            for (DataQuantum d: data.starters) {
                if(d.count != 0){
                    JPanel temp = new JPanel();
                    temp.setBackground(new Color(168, 202, 255));
                    total += d.count * d.price;
                    JLabel temp1 = new JLabel(d.name);
                    temp1.setFont(new Font("Cambria",Font.BOLD,20));
                    JLabel temp2 = new JLabel("Rs. " +  d.price + " X"+ d.count + " = Rs." + d.price * d.count);
                    temp2.setFont(new Font("Cambria",Font.BOLD,20));
                    temp.add(temp1);
                    temp.add(temp2);
                    Panel1.add(temp);
                }
            }

            Panel1.add(mainCourse);
            for (DataQuantum d: data.mainCourse) {
                if(d.count != 0){
                    JPanel temp = new JPanel();
                    temp.setBackground(new Color(168, 202, 255));
                    total += d.count * d.price;
                    JLabel temp1 = new JLabel(d.name);
                    temp1.setFont(new Font("Cambria",Font.BOLD,20));
                    JLabel temp2 = new JLabel("Rs. " +  d.price + " X"+ d.count + " = Rs." + d.price * d.count);
                    temp2.setFont(new Font("Cambria",Font.BOLD,20));
                    temp.add(temp1);
                    temp.add(temp2);
                    Panel1.add(temp);
                }
            }
        }else{
            Panel1.add(new JLabel("Oops! You Didn't order anything"));
        }
        JLabel totalall = new JLabel("Total = " + total);
        totalall.setFont(new Font("Cambria",Font.BOLD,25));
        Panel1.add(totalall);

        home = new JButton("Home");
        home.addActionListener(e -> {
            this.remove(Panel1);
            cl.show(mainMenuP, "home");
        });
        add(home, BorderLayout.SOUTH);
        add(Panel1, BorderLayout.CENTER);
    }
}
