package wipro_questions;

public class UseridGenerator {
    public static String useridGeneration(String input1, String input2, String input3, int input4) {
        // Step 1 - Determine the smaller and longer names
        String smallerName;
        String longerName;
        
        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            // If names have equal lengths, compare alphabetically
            int comparisonResult = input1.compareTo(input2);
            
            if (comparisonResult < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }
        
        // Step 2 - Generate the user ID
        char firstLetter = smallerName.charAt(0);
        String pin = input3;
        char leftDigit = pin.charAt(input4 - 1);
        char rightDigit = pin.charAt(pin.length() - input4);
        String userId = firstLetter + longerName + leftDigit + rightDigit;
        
        // Step 3 - Toggle the alphabets
        StringBuilder toggledUserId = new StringBuilder();
        
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledUserId.append(Character.toLowerCase(c));
            } else {
                toggledUserId.append(Character.toUpperCase(c));
            }
        }
        
        return toggledUserId.toString();
    }

    public static void main(String[] args) {
        String firstName = "Rajiv";
        String lastName = "Roy";
        String pin = "560037";
        int n = 6;
        
        String userId = useridGeneration(firstName, lastName, pin, n);
        
        System.out.println("Generated User ID: " + userId);
    }
}

