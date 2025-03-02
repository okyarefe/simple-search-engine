# The goal of the project

The goal of this project is to create a fully functional basic search engine that can efficiently locate and retrieve data from a structured dataset. The application will not only search for specific files but also sort the data using selected algorithms, providing users with an organized view of the information.
a Search engine with the following capabilities will be built:
Data Retrieval: The application will have the ability to read and parse data from a file, populate a data structure, and create objects representing the data.

Sorting: Sorting algorithms will be implemented to organize the data based on user-defined criteria.

User Interaction: It will contain a user-friendly menu that allows users to search, view, and sort data.

User Activity Logging: The application will also have a system to log and save user interactions for future analysis and debugging.

Data Persistence: Serialize and deserialize data, ensuring that user progress and application state are maintained across sessions.

## Scenario

The digital library system manages a collection of books, with all book data stored in a single file named “books.txt”.
Each line in this file represents a book, including its title, author, and publication year; for example:
- The Great Gatsby,F. Scott Fitzgerald,1925

- To Kill a Mockingbird,Harper Lee,1960

- 1984,George Orwell,1949
  


Search engine program will allow users to search for specific books within this file and view their details. Users should be able to sort the list of books based on various criteria, such as title, author, or publication date.

To ensure that user data and interactions are preserved across sessions,serialization will be implemented to save the current state of the library to a file named “library.ser.” 
