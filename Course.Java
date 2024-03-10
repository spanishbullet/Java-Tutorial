// Define the Course class
public class Course {
    // Declare private variables for name and credits
    private String name;
    private int credits;

    // Constructor for the Course class
    public Course(String name, int credits) {
        this.name = name; // Initialize name
        this.credits = credits; // Initialize credits
    }

    // Method to get the name of the course
    public String getName() {
        return this.name;
    }

    // Method to get the credits of the course
    public int getCredits() {
        return this.credits;
    }
}
