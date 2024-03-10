# Overview

The Java program in this project is a simple demonstration of various fundamental concepts in Java programming. It defines a Student class with properties such as name and grades, and methods to manipulate these properties. The Student class demonstrates the use of variables, expressions, conditionals, loops, functions, and classes. The grades property is an ArrayList, which is a data structure from the Java Collection Framework. The program also includes a Main class with a main method, which is the entry point of the program. One of the methods, generateReportCard, demonstrates creating a new file and writing to it. It uses the PrintWriter class in Java to create a file named \[StudentName\]_ReportCard.txt (where \[StudentName\] is the name of the student) and writes the student’s name, grades, and average grade to the file. If an error occurs during this process, the program prints an error message and the stack trace of the exception.

The purpose of writing this software was to help you understand and see a practical example of these Java concepts in action. By demonstrating these concepts in a cohesive program, I aimed to provide a more contextual and comprehensive learning experience. 

[Software Demo Video](https://studio.youtube.com/video/0T2o6kR-ZDQ/edit)

# Development Environment

Having completed this Java project, I found a few tools to be essential. First and foremost, the Java Development Kit (JDK) was indispensable. It provided all the necessary tools for developing Java applications, including the Java compiler and runtime environment.

For writing and organizing my code, I used Visual Studio Code (VSCode), a powerful yet lightweight IDE. It was particularly helpful because of its extensive support for Java and its user-friendly interface.

To enhance my coding experience in VSCode, I utilized several extensions. The Java Extension Pack was a game-changer, offering intelligent code completion, refactoring, and linting. For project management, the Maven for Java extension proved invaluable. And when it came to debugging my code, the Debugger for Java extension was a lifesaver.

This program uses the Java Language and two libraries: java.util.ArrayList and java.io.PrintWriter. 

The java.util.ArrayList library is part of Java’s Collection Framework. It provides a resizable array, which is an array that can grow as needed. In our Student class, I used an ArrayList to store the grades of a student. I chose ArrayList because of its dynamic nature - it allows us to add grades on the fly and it automatically resizes. Additionally, ArrayList provides methods that make it easy to access and manipulate data, such as adding an element, removing an element, or getting the size of the list.

The java.io.PrintWriter library is part of Java’s I/O library and is used to write formatted text output to a variety of output streams, including file output streams. In the generateReportCard method of our Student class, I used a PrintWriter to create a new file and write the student’s details to it. I chose PrintWriter because it simplifies file writing operations, making writing to a file as easy as writing to the console using System.out.println. These libraries enhanced the functionality of the program and made the code more efficient and easier to read.

- [Codecademy](https://codefinity.com/start/java?utm_source=bing&utm_medium=cpc&utm_campaign=566758054&utm_content=1174280112715058&utm_term=computer%20java%20course&msclkid=d6d61a76972b1e1c5e457f9b84369178)
- [Stackify](https://stackify.com/java-tutorials/)
- [W3Schools](https://www.w3schools.com/java/default.asp)
- [Oracle Java Implementation](https://docs.oracle.com/en/java/)
- [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/)

# Future Work


 - Error Handling: Add more comprehensive error handling. For example, check if the grade being added is within a valid range (0-100).
 - More Classes: Introduce more classes such as Course or Teacher to make the program more robust and closer to a real-world school system.
 - Inheritance: Use inheritance to create subclasses of Student, like Undergraduate and Graduate, each with their own unique properties and methods.
 - Interfaces: Implement interfaces to define behaviors that classes like Student, Course, or Teacher might have in common.
 - Database Integration: Instead of storing the data in memory, integrate a database to store the student information persistently.
 - User Interaction: Create a user interface (UI) for interaction. This could be a simple console-based UI or a more complex graphical UI.
 - Unit Tests: Write unit tests to ensure your code is working as expected and makes debugging easier.