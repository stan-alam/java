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
}