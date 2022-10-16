## SOLID Principles

### 1. Single Responsibility

- It states that a class should only have one responsibility and furthermore, should only have one reason to change.
  Benefits include: (1) Fewer test cases per class (2) Lower coupling due to fewer dependencies (3) Better organization

### 2. Open/Closed

- Classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying
  existing code and causing potential new bugs.

### 3. Liskov Substitution

- Given a variable of a given type, one should be able to assign it to a value that is a subtype of that type.
- Differently put, if a class A is a subtype of class B, we should be able to replace B with A without disrupting the
  behaviour of our program.

### 4. Interface Segregation

- Larger interfaces should be split into smaller ones. By doing so, we can ensure that the implementing classes only
  need to be concerned about the methods that are of interest to them.

### 5. Dependency Inversion

- This principle states that we must use abstraction (abstract classes and interfaces) instead of concrete
  implementations. High-level modules should not depend on the low-level module but both should depend on the
  abstraction.

