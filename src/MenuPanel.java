import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    CardLayout menuCL;
    MenuData startersP = new MenuData();
    MenuData mainCourseP = new MenuData();

    MenuPanel(CardLayout cl, JPanel mainMenuP, Data data){
        
        menuCL = new CardLayout();
        setLayout(menuCL);

        JPanel menuPanelHome = new JPanel();
        menuPanelHome.setLayout(new BorderLayout());

        JButton starterBtn = new JButton("Starters");
        starterBtn.setFont(new Font("Century Gothic",Font.BOLD,30));
        starterBtn.setBounds(300, 200, 200, 60);
        starterBtn.setFocusable(false);
        JButton mainCourseBtn = new JButton("Main Course");
        mainCourseBtn.setFont(new Font("Century Gothic",Font.BOLD,30));
        mainCourseBtn.setBounds(275,300,250,60);
        mainCourseBtn.setFocusable(false);
        JButton home = new JButton("Home Page");
        home.setFont(new Font("Cambria",Font.PLAIN,25));
        home.setFocusable(false);
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(168, 202, 255));
        panel1.setLayout(null);

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
