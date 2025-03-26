# Decorator Pattern

The **Decorator Pattern** attaches additional responsibilities to an object dynamically without modifying their class. Decorators provide alternative to subclassing for extending functionality.

This pattern is useful in cases where object behaviour needs to be extended without modifying existing code.

---

### **Concept Overview**
The **Decorator Pattern** works by wrapping an object that provides additional functionality. Instead of modifying the original object, we create a new decorator object that enhances it's behaviour.

### **Key Concept**
- **Component**: The main abstract or interface class
- **Concrete Component**: The base class that implements the component.
- **Decorator**: The abstract class that wraps The Component
- **Concrete Decorator**: Additional behaviour, added dynamically.

### **Advantages** 
- ✅ **Extends behaviour dynamically** - New functionality can be added without modifying existing code.
- ✅ **Promotes reusability** - Decorators can be combined in different ways to create new behaviour.
- ✅ **Adherence to SOLID Principles**:
   - **Open/Closed Principle** - New decorators can be introduced without modifying the base class.
   - **Single Responsibility Principle** - Each class has a well-defined role.

---

## **Decorator Pattern in Action: Coffee shop System**

## **How it Works**
Instead of creating multiple subclasses for different type of coffee, we dynamically add condiments like **Mocha** and **Whip** using decorators.

### **1️⃣ Define the Component**
We create an abstract class `Beverage`, which defines a description and a `cost()` method.

### **2️⃣ Create Concrete Components**
The `Espresso` and `HouseBlend` classes implements the `Beverage` interface.

### **3️⃣ Define the Abstract Decorator**
The `CondimentDecorator` class extends `Beverage` and holds a reference to a `Beverage` object.

### **4️⃣ Implement Concrete Decorators**
Classes like `Mocha` and `Whip` extends `CondimentDecorator` and modify the description and cost dynamically.

---

## **Conclusion**
The **Decorator Pattern** enhances flexibility, reusability, and maintainability by allowing functionality to be added at runtime without modifying existing code. It ensures better **code organization** and follows **SOLID Principles**, making it an ideal choice for extensible system.

By applying this pattern to the **Coffee Shop** simulation, I built a system where multiple decorators can be combined to create various coffee flavours, resulting in **cleaner and more scalable code**. 🚀
