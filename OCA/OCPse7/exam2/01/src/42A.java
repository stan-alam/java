class SpellBook extends Tome {
    boolean onlyForReference;
    SpellBook(boolean value) {
        onlyForReference = value;
    }
    @Override
    void issueTome(int days) {
    if (onlyForReference)
        System.out.println("Reference Tome");
    else
        if (days < 666)
            super.issueTome(days);
        else
            System.err.println("days => 666");
    }
}
