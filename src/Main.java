import javax.swing.*;
        import java.util.*;

public class Main {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Loading();
            }
        });
    }
}