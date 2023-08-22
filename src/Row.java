import java.util.ArrayList;
import java.util.List;

public class Row {
    ArrayList<Field> fields;

    public Row() {
        this.fields = new ArrayList<>();
    }

    public void initialize(int size) {
        for (int i = 0; i < size; i++) {
            Field field = new Field("_");
            fields.add(field);
        }
    }

    public void show() {
        for (int i = 0; i < fields.size(); i++) {
            System.out.print(fields.get(i).getSymbol() + " ");
        }
    }
}