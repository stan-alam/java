## 07

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%201.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%202.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%203.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%204.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%205.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%206.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%207.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%208.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%209.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2010.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2011ed.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2012.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2013A.png" width="80%" height="80%">
</a>

```Java
//cb 314.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2014.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2015.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2016A.png" width="80%" height="80%">
</a>

```Java
//cb 315.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2016B.png" width="80%" height="80%">
</a>

```Java
//cb 316.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2017.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2018A.png" width="80%" height="80%">
</a>

```Java
//cb 333.A
```

```Java
//cb 342.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2018B.png" width="80%" height="80%">
</a>

```Java
//cb 317.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2019.png" width="80%" height="80%">
</a>

```Java
//cb 318.A
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2020.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/deitelJava11/early_objects/chap07/images/deitelJava11th07%20-%20page%2021.png" width="80%" height="80%">
</a>

```Java
//cb 319.A
import java.security.SecureRandom;
// 319..A program that simulates the rolling of a die 70,000,000 times and displays the frequency of each face.
public class RollDie {
    public static void main(String[] args)
    {
        SecureRandom randomNumbs = new SecureRandom();
        int[] frequency = new int[7]; // array of freq counters

        //roll die 70,000,000 times
        for (int roll = 1; roll <= 70_000_000; roll++)
        {
            ++frequency[1 + randomNumbs.nextInt(6)];
        }
    

        System.out.printf("%s%10s\n", "Face", "Frequency");

        //output each array element's value
        for (int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%4d%10d\n", face, frequency[face]);
        }

    }
}
```
