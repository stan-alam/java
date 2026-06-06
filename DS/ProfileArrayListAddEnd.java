public class ProfileArrayListAddEnd {

public static void profileArrayListAddEnd() {
    Timeable timeable = new TimeAble() {
        List<String> list;
        
        public void setup(int n) {
            list = new ArrayList<String>(); // you many not need to indicate String here, but it is clearer
        }

        public void timeMe(int n) {
            for (int i=0; i <n; i++) {
                list.add("a string");
            }
        }
    };

    String title = "ArrayList add end";
    Profiler profiler = new Profiler(title, timeable);

    int startN = 4000;
    int endMillis = 1000;
    XYSeries series = profiler.timingLoop(startN, endMillis);
    profiler.plotResults(series);
}

public static void main(String[] args) {
    profileArrayListAddEnd();
    }
}