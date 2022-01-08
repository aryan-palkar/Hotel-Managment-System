import javax.swing.*;
import java.awt.*;

public class MenuDataQuantum extends JPanel {

    MenuDataQuantum(DataQuantum dq){
        JLabel name = new JLabel(dq.name);
        JLabel price = new JLabel("Rs. " + dq.price);
        JButton minus = new JButton("-");
        JLabel count = new JLabel(dq.count + "");
        JButton plus = new JButton("+");
        JPanel right = new JPanel();

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

//        right.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        add(name);
        add(price);
        right.add(minus);
        right.add(count);
        right.add(plus);
        add(right);
    }
}
