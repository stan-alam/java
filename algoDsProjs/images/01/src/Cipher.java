public class Cipher {

    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * we're gonna perform a Casear-style cipher rotation
     * 
     * @param ascii the input String of uppercase letters
     * @param shift number of positions to rotate
     * @return the encrypted String cipherascii
     * 
     */
public static String encrypt(String ascii, int shift) {

}
/*
* decrypt --reverse rotation
* @param cipherascii the input String 
* @param shift rotation used for the encryption
*/
}
public static String decrypt(String cipherascii, int shift) {

}
/*
* * main method to test the encrypt and decrypt methods
 * @param args command line arguments
 */

public static void main(String[] args){

    String message = "TRAVELEAST";
    int rotation = 3;

    System.out.println(message);

    // encrypt the message
    String cipher = encrypt(message, rotation);
    System.out.println(cipher);

    // decrypt the message
    System.out.println(decrypted);

}