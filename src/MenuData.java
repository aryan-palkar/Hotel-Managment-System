import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuData extends JPanel {
    MenuData(ArrayList<DataQuantum> arr, CardLayout cl, JPanel prev){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for(DataQuantum d : arr){
            add(new MenuDataQuantum(d));
        }
        JButton back = new JButton("Back");
        back.addActionListener(e -> {
            cl.show(prev, "home");
        });

        add(back);
    }
}
