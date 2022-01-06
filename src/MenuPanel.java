import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    CardLayout menuCL;

    MenuPanel(CardLayout cl, JPanel mainMenuP, Data data){
        menuCL = new CardLayout();
        setLayout(menuCL);
        setBackground(Color.ORANGE);

        JPanel menuPanelHome = new JPanel();
        MenuData startersP = new MenuData(data.starters, menuCL, this);
        MenuData mainCourseP = new MenuData(data.mainCourse, menuCL, this);

        JButton starterBtn = new JButton("Starters");
        JButton mainCourseBtn = new JButton("Main Course");
        JButton home = new JButton("Home Page");

        menuPanelHome.add(starterBtn);
        menuPanelHome.add(mainCourseBtn);
        menuPanelHome.add(home);

        starterBtn.addActionListener(e -> {
            menuCL.show(this, "starter");
        });

        mainCourseBtn.addActionListener(e -> {
            menuCL.show(this, "mainCourse");
        });

        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });

        add(menuPanelHome, "home");
        add(startersP, "starter");
        add(mainCourseP, "mainCourse");

    }
}
