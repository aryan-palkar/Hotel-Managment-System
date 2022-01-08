import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    CardLayout menuCL;
    MenuData startersP = new MenuData();
    MenuData mainCourseP = new MenuData();

    MenuPanel(CardLayout cl, JPanel mainMenuP, Data data){
        menuCL = new CardLayout();
        setLayout(menuCL);
        setBackground(Color.ORANGE);

        JPanel menuPanelHome = new JPanel();
        menuPanelHome.setLayout(new BorderLayout());

        JButton starterBtn = new JButton("Starters");
        JButton mainCourseBtn = new JButton("Main Course");
        JButton home = new JButton("Home Page");
        JPanel panel1 = new JPanel();


        starterBtn.addActionListener(e -> {
            startersP.generateMenuData(data.starters, menuCL, this);
            menuCL.show(this, "starter");
        });

        mainCourseBtn.addActionListener(e -> {
            mainCourseP.generateMenuData(data.mainCourse, menuCL, this);
            menuCL.show(this, "mainCourse");
        });

        home.addActionListener(e -> {
            cl.show(mainMenuP, "home");
        });


        panel1.add(starterBtn);
        panel1.add(mainCourseBtn);
        menuPanelHome.add(panel1, BorderLayout.CENTER);
        menuPanelHome.add(home, BorderLayout.SOUTH);

        add(menuPanelHome, "home");
        add(startersP, "starter");
        add(mainCourseP, "mainCourse");

    }
}
