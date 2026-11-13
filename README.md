# Beyblade Factory Game (Console Application)

*Note: This project was developed as a practical application of concepts learned during a Udemy Java course to strengthen my skills in Object-Oriented Programming (OOP) and software design patterns.*

A console-based Java application that simulates a Beyblade production factory. This project is a robust demonstration of core OOP principles, specifically designed to showcase the implementation of the **Factory Design Pattern**.

## Core Concepts Demonstrated

* **Factory Design Pattern:** Utilizes a central `Fabrika` (Factory) class to instantiate different Beyblade objects dynamically based on user input, hiding the creation logic from the main execution thread.
* **Inheritance:** Implements a base `Beyblade` superclass that shares common attributes (spinner name, rotation speed, attack power) and methods to specific subclass tops (`Dragon`, `Dranza`, `Drayga`, `Draciel`).
* **Polymorphism:** Method overriding is used extensively (e.g., `kutsalCanavarOrtayaCikar()`) to allow each specific Beyblade subclass to exhibit its unique behavior and special attacks while being treated as a generic `Beyblade` object by the factory.
* **Encapsulation:** Protects data integrity through private variables and public getter/setter methods.

## Tech Stack

* **Language:** Java (JDK 8+)
* **Architecture:** Factory Method Pattern
* **Interface:** Command Line Interface (CLI) / Console

## How to Run the Application

1. Clone this repository to your local machine.
2. Ensure you have the Java Development Kit (JDK) installed.
3. Compile the Java files or open the project in an IDE (NetBeans, IntelliJ, Eclipse).
4. Run the `BeybladeMain.java` file.
5. Follow the on-screen prompts to input the name of the Beyblade you want to produce (Dranza, Drayga, Draciel, or Dragon).
6. Observe the polymorphic output as the factory generates the specific object and displays its unique attributes and attack moves. Type 'q' to exit.
