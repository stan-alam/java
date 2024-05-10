public class Invoice implements Payable {
    private final String partNum;
    private final String partDesc;
    private final String partQnty;
    private final double pricePerItem;

        // constructor
        public Invoice(String partNum, String partDesc, int partQnty, double pricePerItem) {
            //validate the partQnty
            if (partQnty < 0) {
                throw new IllegalArgumentException("Quantity must be >= 0");
            }
        
        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }

        this.partNum = partNum;
        this.partDesc = partDesc;
        this.partQnty = partQnty;
        this.pricePerItem = pricePerItem;
    }
    //lets get the partNumber
    public String getPartNum() {return partNum;}
    //lets get the part description
    public String getPartDeString() {return partDesc;}
    //lets get the part quantity
    public int getPartQnty() {return partQnty;}
    //lets get the price per item
    public double getPricePerItem() {return pricePerItem;}

    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", // CODE SMELL: Long Parameter List
        "invoice", "part number", getPartNum(), getPartDeString(), "quantity", getPartQnty(), "price per item", getPricePerItem());
    }   
    @Override
    public double getPaymentAmount() {
        return getPartQnty() * getPricePerItem();
    }
}