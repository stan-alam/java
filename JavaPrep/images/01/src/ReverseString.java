public class ReverseString {
    public static void main(String[] args) {
        String name = "Stan";
        System.out.println("This is the name : " + name);
        char[] charArray = name.toCharArray();
        int startIndex = 0;
        int endIndex = name.length() - 1;
        while (startIndex < endIndex) {
            char tempChar = charArray[startIndex];
            charArray[startIndex++] = charArray[endIndex];
            charArray[endIndex--] = tempChar;
        }
        System.out.println("Reverse of the name is : " + new String(charArray));
    }
}