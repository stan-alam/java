class Pencil {
    public Pencil() {
        System.err.println("Pencil:constructor");
    }
    public Pencil(String a) {
        System.err.println("Pencil:constructor2");
    }
    {
        System.err.println("Pencil:init1");
    }
    { 
        System.err.println("Pencil:init2");
    }

    public static void main(String[] args) {
        new Pencil();
        new Pencil("a Value");
    }
}
