import javax.swing.*;
import java.awt.*;

public class OrderPanel extends JPanel {

    void generateOrder(CardLayout cl, JPanel mainMenuP, Data data){

        setLayout(new BorderLayout());

        JPanel Panel1 = new JPanel();
        JButton home = new JButton("Home");

        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

        boolean flag = false;
        for (DataQuantum d: data.starters) { if(d.count != 0) flag = true;}
        for (DataQuantum d: data.mainCourse) { if(d.count != 0) flag = true;}
        if(flag){
            Panel1.add(new JLabel("Starters"));
            for (DataQuantum d: data.starters) {
                if(d.count != 0){
                    Panel1.add(new MenuDataQuantum(d));
                }
            }
            Panel1.add(new JLabel("Main Course"));
            for (DataQuantum d: data.mainCourse) {
                if(d.count != 0){
                    Panel1.add(new MenuDataQuantum(d));
                }
            }
        }else{
            Panel1.add(new JLabel("Oops! You Didn't order anything"));
        }

        home.addActionListener(e -> {
            this.remove(Panel1);
            cl.show(mainMenuP, "home");
        });

        add(Panel1, BorderLayout.CENTER);
        add(home, BorderLayout.SOUTH);
    }
}
