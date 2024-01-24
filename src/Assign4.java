public class Assign4 {
    public static void main(String[] args) {
        // Bio-data using primitive data types
        String name = "John Doen";
        int age = 20;
        char gender = 'M';
        boolean isInternational = false;
        double height = 5.8;

        // Print bio-data
        System.out.println("Bio-data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Is International? " + isInternational);
        System.out.println("Height: " + height + " feet");
        System.out.println();

        // Array to store 10 student names
        String[] studentNames = {
                "Alice Johnson",
                "Bob Smith",
                "Charlie Brown",
                "David Lee",
                "Eva Williams",
                "Frank White",
                "Grace Davis",
                "Henry Taylor",
                "Ivy Clark",
                "Jack Robinson"
        };

        // Print the first and last names from the array
        System.out.println("First Student: " + studentNames[0]);
        System.out.println("Last Student: " + studentNames[studentNames.length - 1]);

    }
}