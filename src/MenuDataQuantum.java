import javax.swing.*;
import java.awt.*;

public class MenuDataQuantum extends JPanel {

    MenuDataQuantum(DataQuantum dq){
        setBackground(new Color(168, 202, 255));
        
        JLabel name = new JLabel(dq.name);
        name.setFont(new Font("Californian FB",Font.BOLD,20));
        name.setFocusable(false);
        JLabel price = new JLabel("Rs. " + dq.price);
        price.setFont(new Font("Californian FB",Font.BOLD,20));
        price.setFocusable(false);
        JButton minus = new JButton("-");
        minus.setFont(new Font("Calibri",Font.BOLD,20));
        minus.setFocusable(false);
        JLabel count = new JLabel(dq.count + "");
        count.setFont(new Font("Californian FB",Font.BOLD,20));
        count.setFocusable(false);
        JButton plus = new JButton("+");
        plus.setFont(new Font("Calibri",Font.BOLD,20));
        plus.setFocusable(false);
        JPanel right = new JPanel();
        right.setBackground(new Color(168, 202, 255));

        plus.addActionListener(ae -> {
            dq.count++;
            count.setText(dq.count + "");
        });

        minus.addActionListener(ae -> {
            if(dq.count != 0){
                dq.count--;
                count.setText(dq.count + "");
            }
        });

        add(name);
        add(price);
        right.add(minus);
        right.add(count);
        right.add(plus);
        add(right);
    }
}
