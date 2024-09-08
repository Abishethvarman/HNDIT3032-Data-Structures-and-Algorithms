
# Answers: Analyzing Time Complexity of Simple Code

---

### Task 1: Hello, World!
```java
System.out.println("Hello, World!");
```
**Answer**: O(1)  
**Explanation**: This is a single operation that executes in constant time, regardless of the size of the input.

---

### Task 2: Loop with `n` iterations
```java
int n = 10;
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
**Answer**: O(n)  
**Explanation**: The loop runs `n` times, where each iteration performs a constant time operation. Thus, the time complexity is proportional to `n`.

---

### Task 3: Nested Loops
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + ", " + j);
    }
}
```
**Answer**: O(n^2)  
**Explanation**: The outer loop runs `n` times, and for each iteration of the outer loop, the inner loop also runs `n` times. Therefore, the total number of operations is `n * n = n^2`.

---

### Task 4: Simple Increment
```java
int x = 5;
x++;
```
**Answer**: O(1)  
**Explanation**: This is a simple operation that takes constant time, as it involves incrementing the value of a variable by 1.

---

### Task 5: Loop with `n` iterations
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
**Answer**: O(n)  
**Explanation**: The loop runs `n` times, and each iteration performs a constant time operation. Therefore, the time complexity is linear.

---

### Task 6: Nested Loops with Summation
```java
int sum = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        sum += i + j;
    }
}
System.out.println("Sum: " + sum);
```
**Answer**: O(n^2)  
**Explanation**: The outer loop runs `n` times, and for each iteration of the outer loop, the inner loop also runs `n` times. The total operations are proportional to `n * n = n^2`.

---

### Task 7: Simple Assignment
```java
int y = 10;
```
**Answer**: O(1)  
**Explanation**: This is a simple assignment operation that takes constant time, regardless of the size of the input.

---

### Task 8: Two Separate Loops
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```
**Answer**: O(n)  
**Explanation**: Each loop runs independently `n` times. The time complexity of each loop is O(n), and since they are separate, their combined complexity remains O(n) (not O(n^2)).

---

### Task 9: More Nested Loops
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + ", " + j);
    }
}
```
**Answer**: O(n^2)  
**Explanation**: Like Task 3, the outer loop runs `n` times, and for each iteration of the outer loop, the inner loop also runs `n` times. Therefore, the total number of operations is `n * n = n^2`.

---

### Task 10: Return a Constant
```java
System.out.println(returnConstant(x));

public static int returnConstant(int value) {
    return value;
}
```
**Answer**: O(1)  
**Explanation**: The function `returnConstant` simply returns a value, which is a constant-time operation.

---
