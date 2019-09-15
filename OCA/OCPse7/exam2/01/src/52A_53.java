class Tome {
    String title;
    String isbn;
    String[] author;
    java.util.Date.publishDate;
    double price;
    int version;
    String publisher;
    boolean eBookVersion;
    @Override
    public String toString() {
        return title + ", ISBN:"+isbn + ", Lead Author:"+author[0];
    }
}

class Testing {
    public static void main(String[] args) {
        Tome tome = new Tome();
        tome.title = "Necronomicon Ex-mortis";
        tome.author = new String[] {"Bruce", "Campbell"};
        tome.isbn = "666";
        System.err.println(tome); // Prints Necronomicon Ex-mortis, ISNB:666, Lead Author: "Bruce"
   }
} 

