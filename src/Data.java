import java.util.ArrayList;

public class Data {
    ArrayList<DataQuantum> starters, mainCourse;
    Data(){
        starters = new ArrayList<DataQuantum>();
        starters.add(new DataQuantum("Manchurian", 80));
        starters.add(new DataQuantum("Peri Peri Momos", 140));
        starters.add(new DataQuantum("Pav Bhaji", 60));
        starters.add(new DataQuantum("Veg Chow Mein", 200));

        mainCourse = new ArrayList<DataQuantum>();
        mainCourse.add(new DataQuantum("Chiken Biryani", 170));
        mainCourse.add(new DataQuantum("Garlic Naan", 200));
        mainCourse.add(new DataQuantum("Rava Dosa", 120));
        mainCourse.add(new DataQuantum("Chole Bhature", 160));

    }
}
