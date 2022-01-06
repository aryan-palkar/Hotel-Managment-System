import javax.swing.*;

public class MenuDataQuantum extends JPanel {

    MenuDataQuantum(DataQuantum dq){
        JLabel name = new JLabel(dq.name);
        JLabel price = new JLabel("Rs. " + dq.price);
        JButton minus = new JButton("-");
        JLabel count = new JLabel(dq.count + "");
        JButton plus = new JButton("+");

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
        add(minus);
        add(count);
        add(plus);
    }
}
