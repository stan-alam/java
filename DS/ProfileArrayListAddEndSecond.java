import java.util.ArrayList;
import java.util.List;

interface Timeable {
    void setup(int n);
    void timeMe(int n);
}

public class ProfileArrayListAddEndSecond {
    public static void profileArrayListAddEnd() {
        Timeable timeable = new Timeable() {
            List<String> list;

            public void setup(int n) {
                list = new ArrayList<String>();
            }

            public void timeMe(int n) {
                for (int i = 0; i < n; i++) {
                    list.add("a string");
                }
            }
        };
    }
}