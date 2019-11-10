# CH II - Integer Utils

In this challenge, we were given an interface of static integer utility methods with example return values to implement.

This included some simple methods such as: 

- `isEven/Odd(n)`
- `isPrime(n)`
- `getGreatestCommonFactor(m, n)`
- `getGreatestConstrainedMultiple(k, maximum)`

It also included some array utility methods like: 

- `getMaximum(array)`
- `getMinimum(array)`
- `isSorted(array)`
- `getSmallestIndexOfMatch(array, target)`

As well, our teacher threw in a few methods that were only defined by a few example cases, and we had to figure out what they were supposed to do and how to implement them. These were defined as follows: 

```java
// EX: reverse(92) returns 29
// EX: reverse(48) returns 84
// EX: reverse(0) returns 0
// EX: reverse(-2) is undefined
public static int reverse(int k);

// EX: sumthing(7) = 7
// EX: sumthing(14) = 5
// EX: sumthing(29) = 2
public static int sumthing(int k);

// EX: getIntegerH(7, 3) returns 23 since 23/3 = 7 and 23 % 5 = 3
// EX: getIntegerH(15, 0) returns 45 since 45/3 = 15 and 45 % 5 = 0
public static int getIntegerH(int h_q_3, int h_r_5);
```

Please see [prompt](CHII-Prompt.pdf) and [results](CHII-Results.pdf) for more information.