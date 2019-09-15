class Tome {
    String title;
    static int tomeCopies = 666;
    @Override
    public String toString() {
        return title + ", Copies: " + tomeCopies; //Overrides toString() uses static variable of Tome
    }
}

class SpellBook extends Tome {
    static int tomeCopies = 42; // static variable tomeCopies also defined in SpellBook
}

class TomeOverrideToString {
    public static void main(String[] args) {
    SpellBook spellbook = new SpellBook();
    spellbook.title = "Necronomicon Ex-mortis";
    System.err.println(spellbook); // Prints "Necronomicon:666"
