## SOLID Principles

### 1. Single Responsibility

- It states that a class should only have one responsibility and furthermore, should only have one reason to change.
  Benefits include: (1) Fewer test cases per class (2) Lower coupling due to fewer dependencies (3) Better organization

### 2. Open/Closed

- Classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying
  existing code and causing potential new bugs.

### 3. Liskov Substitution Principle (LSP)

- Replacing objects of some superclass S with objects of any subclass of S should not alter any of the provable
  properties of a program.
- This principle was originally called `strong behavioral subtyping`
- Given a variable of a given type, one should be able to assign it to a value that is a subtype of that type.
- Differently put, if a class A is a subtype of class B, we should be able to replace B with A without disrupting the
  behaviour of our program.

### 4. Interface Segregation Principle(ISP)

- ISP simply states; _No client should be forced to depend on methods it does not use_
- Positively stated, _a client should depend on the smallest set of interfaces features_
- Larger interfaces should be split into smaller ones. By doing so, we can ensure that the implementing classes only
  need to be concerned about the methods that are of interest to them.
- Interfaces should be highly cohesive, meaning that they should have methods related to one another. Low cohesion
  interfaces, however, have many unrelated methods.
- The explicit goal of ISP is to _isolate_ ripples of change so that change in one class does not impact other classes.
- To observe ISP, once needs to examine a class from the viewpoint of the collaborators by answering the
  question, `What methods and attributes does this collaborator require?`

### 5. Dependency Inversion

- This principle states that we must use abstraction (abstract classes and interfaces) instead of concrete
  implementations. High-level modules should not depend on the low-level module but both should depend on the
  abstraction.
- This allows for changing of both high-level and low-level modules with little risk to the other.

## Other Design Principles

### 6. Encapsulate What Varies

- This principle suggests that one should identify the aspects of their application that vary and separate them from
  what stays the same.
- This enables one to later alter or extend the parts that vary, but do it without affecting the parts that don't.
- By pulling out and encapsulating the code that varies, we allow code that doesn't change to remain closed for
  modification, improving the stability of our code over time.

### 7. Favour composition over inheritance (HAS-A > IS-A)

- Even though inheritance is a powerful technique, it can easily be overused leading to rigid and inextensible designs.
- Composition is a powerful technique that one should use when extending the behaviour of a class.
- `IS-A` is an inheritance relationship while `HAS-A` is a relationship of composition.
