import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuData extends JPanel {

    void generateMenuData(ArrayList<DataQuantum> arr, CardLayout cl, JPanel prev){
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        for(DataQuantum d : arr){
            panel1.add(new MenuDataQuantum(d));
        }
        JButton back = new JButton("Back");
        back.addActionListener(e -> {

            cl.show(prev, "home");
        });
        add(back, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);

    }
}
