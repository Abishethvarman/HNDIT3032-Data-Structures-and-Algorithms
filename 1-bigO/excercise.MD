# Exercise: Analyzing Time Complexity of Simple Code

## Objective
Analyze the time complexity of each code snippet provided below and explain the reasoning behind the complexity.

---

### Task 1: Hello, World!
```java
// 1. 
System.out.println("Hello, World!");
```
**Question**: What is the time complexity of this operation?  
**Hint**: This is a single print statement.

---

### Task 2: Loop with `n` iterations
```java
// 2. 
int n = 10;
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
**Question**: What is the time complexity of this loop?  
**Hint**: This loop runs `n` times.

---

### Task 3: Nested Loops
```java
// 3. 
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + ", " + j);
    }
}
```
**Question**: What is the time complexity of this nested loop?  
**Hint**: Think about how many times the inner loop runs for each outer loop iteration.

---

### Task 4: Simple Increment
```java
// 4. 
int x = 5;
x++;
```
**Question**: What is the time complexity of incrementing a variable?

---

### Task 5: Loop with n iterations
```java
// 5. 
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
**Question**: What is the time complexity of this loop?

---

### Task 6: Nested Loops with Summation
```java
// 6. 
int sum = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        sum += i + j;
    }
}
System.out.println("Sum: " + sum);
```
**Question**: What is the time complexity of this nested loop that calculates the sum?

---

### Task 7: Simple Assignment
```java
// 7. 
int y = 10;
```
**Question**: What is the time complexity of this assignment?

---

### Task 8: Two Separate Loops
```java
// 8.
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```
**Question**: What is the time complexity of these two separate loops?  
**Hint**: The loops are independent of each other.

---

### Task 9: More Nested Loops
```java
// 9. 
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + ", " + j);
    }
}
```
**Question**: What is the time complexity of this nested loop structure?

---

### Task 10: Return a Constant
```java
// 10.
System.out.println(returnConstant(x));

public static int returnConstant(int value) {
    return value;
}
```
**Question**: What is the time complexity of returning a constant?

---

