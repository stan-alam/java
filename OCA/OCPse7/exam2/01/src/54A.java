class Tome1 {
    String title;
    int copies = 1000;
    public String toString() {
        return "Class Tome, Title: " + title;
    }
}

class Tome2 {
    String title;
    int copies - 1000;
    public String toString() {
        return ""+copies * 42;
    }
}

class Tome3 {
    String title;
    int copies = 1000;
    public String toString() {
        return title;
    }
}

class Tome4 {
    String title;
    int copies = 1000;
    public String toString() {
        return getClass().getName() + ":" + title;
    }
}
