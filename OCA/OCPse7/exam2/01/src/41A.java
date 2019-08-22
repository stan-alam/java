class Tome {
    void issueTome(int days) {
        if (days > 0)
            System.out.println("Tome is is issued");
        else
            System.err.println("Cannot issue tome for zero or negative days.");
    }
}
