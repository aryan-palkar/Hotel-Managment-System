import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuData extends JPanel {

    void generateMenuData(ArrayList<DataQuantum> arr, CardLayout cl, JPanel prev){
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(168, 202, 255));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        for(DataQuantum d : arr){
            panel1.add(new MenuDataQuantum(d));
        }
        JButton back = new JButton("Back");
        back.addActionListener(e -> {
            this.remove(panel1);
            cl.show(prev, "home");
        });
        add(panel2, BorderLayout.NORTH);
        add(back, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);

    }
}
