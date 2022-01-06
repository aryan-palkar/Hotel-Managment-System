import javax.swing.*;
import java.util.*;

public class Main {

    ArrayList<DataQuantum> starters;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Loading();
            }
        });
    }

}

