import java.util.ArrayList;

public class Data {
    ArrayList<DataQuantum> starters, mainCourse;
    Data(){
        starters = new ArrayList<DataQuantum>();
        starters.add(new DataQuantum("A", 100));
        starters.add(new DataQuantum("B", 120));
        starters.add(new DataQuantum("C", 140));
        starters.add(new DataQuantum("D", 160));
        starters.add(new DataQuantum("E", 180));

        mainCourse = new ArrayList<DataQuantum>();
        mainCourse.add(new DataQuantum("A", 100));
        mainCourse.add(new DataQuantum("B", 120));
        mainCourse.add(new DataQuantum("C", 140));
        mainCourse.add(new DataQuantum("D", 160));
        mainCourse.add(new DataQuantum("E", 180));
    }
}
