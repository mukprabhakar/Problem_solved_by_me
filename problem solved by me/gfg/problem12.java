// Given a list of names, display the longest name. 
// If there are multiple names of the longest size then return the first occurring name .

public class problem12 {
    public static String longest(int n, String[] names) {
        if (names == null || n == 0) {
            return "";  // Return an empty string if the list is null or empty
        }

        String longestName = names[0];  // Initialize the longest name with the first name in the list

        for (int j = 1; j < n; j++) {  // Start from the second element
            if (names[j].length() > longestName.length()) {
                longestName = names[j];  // Update the longest name if the current name is longer
            }
        }

        return longestName;  // Return the longest name found
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Catherine", "Daniel"};  // Example list of names
        int n = names.length;
        String result = longest(n, names);  // Call the method
        System.out.println("The longest name is: " + result);
    }
}
