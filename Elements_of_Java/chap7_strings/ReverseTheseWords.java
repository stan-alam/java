public class ReverseTheseWords {

 public static void reverseWords(char[] input) {

  //reverse the whole string first

  reverse(input, 0, input.length);

  int start = 0, end;
  while ((end = find(input, '', start)) != -1) {
   //Reverse each word in the string.
   reverse(input, start, end);
   start = end + 1;
  }

  // Reverse the last word.
  reverse(input, start, input.length);
 }

 public static void reverse(char array, int start, int stopIndex) {
  if (start >= stopIndex) {
   return;
  }

  int last = stopIndex - 1;
  for (int i = start; i <= start + (last - start) / 2; i++) {
   char tmp = array[i];
   array[i] = array[last - i + start];
   array[last - i + start] = temp;

  }

  public static int find(char[] array, char c, int start) {
   for (int i = start; i < array.length; i++) {
    if (array[i] == c) {
     return i;
    }
   }
  }
  return -1;
 }

}