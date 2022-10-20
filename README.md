## SOLID Principles

### 1. Single Responsibility Principle (SRP)

- It states that a class should only have one responsibility and furthermore, should only have one reason to change.
- A class should have responsibility over a single part of the functionality provided by the software, and that
  responsibility should be entirely encapsulated by the class.
- Single in this sense is a question about finding the right level of abstraction.
- The goal should be to have a class which can be summarized with a **concise** _responsibility statement_.
- To identify the right levels of abstraction, one should make use of **GRASP** (General Responsibility Assignment
  Software
  Patterns)
- Benefits include: (1) Fewer test cases per class (2) Lower coupling due to fewer dependencies (3) Better organization

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
- In **Python** there is a unique feature called `Duck Typing` which permits classes with no formal superclass-subclass
  relationship to be used in place of each other. It allows substitution without being part of a class hierarchy. This
  is shown below:

  ```python
  class X:
      def meth(self, a):
          return 2*a
  
  class Y:
      def meth(self, a):
          return a+a
  ```

- An explicit superclass-subclass relationship for the code above would look like so:

  ```python
  class A(abc.ABC):
      @abc.abstractmethod
      def meth(self, a): ...
  
  class X(A):
      def meth(self, a): 
          return 2*a 
  
  class Y(A): 
      def meth(self, a):
          return a+a
  ```

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

### 5. Dependency Inversion Principle (DIP)

- Robert C. Martin defines DIP as "High level modules should not depend on low-level modules. Both should depend on
  abstractions. Abstractions should not depend on details. Details should depend on abstractions."
- The common theme in the above definition is the **dependency on abstractions**.
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

## GRASP Patterns

- Generally, responsibility can be (1) accomplished by a single object (2) a group of objects collaboratively working
- GRASP helps us in deciding which responsibility should be assigned to which object/class
- The objects and responsibilities should be identified from the _problem domain_ and how various objects interact with
  each other
- The blueprints for those objects should then be defined, i.e. the class with methods implementing those
  responsibilities.
- Responsibility can be thought of as `an obligation to perform a task or know information` (Rebecca Wirfs-Brock)

### 1. Creator

### 2. Information Expert

### 3. Low Coupling

### 4. Controller

### 5. High Cohesion

- This principle should be used as a reason for combining objects.
- Cohesion is a measure of how strongly all responsibilities of an element are related or the degree to which the parts
  inside an element belong together.
- Classes with _low cohesion_ have unrelated data or behaviours
- The principle attempts to answer the question, _How do we keep objects focused, understandable, manageable and as a
  side effect support low coupling?_

### 6. Indirection

- Indirection provides a reason for separating features into distinct classes.
- Here, a new class that is not part of the problem domain is introduced to support certain technical considerations.
- It relates to the [mediator](https://en.wikipedia.org/wiki/Mediator_pattern) pattern where communication between
  objects is encapsulated within a mediator object and objects no longer
  communicate directly with each other, but instead communicate through the mediator. This in turn reduces the
  dependencies between communicating objects, thereby reducing coupling
- It is worth noting that while indirection reduces coupling, it reduces readability and reasoning about the whole
  system.

### 7. Polymorphism

### 8. Protected Variations

### 9. Pure Fabrication

