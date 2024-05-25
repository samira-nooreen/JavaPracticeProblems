/*You need to group the methods in the StringUtils class.
To do this, create the following static classes in the StringUtils class: Validator, Formatter, and Encoder.
Move the isNullOrEmpty() and isPalindrome() methods to the Validator class.
Move the capitalize() and reverse() methods to the Formatter class.
Move the encodeBase64() and decodeBase64() methods to the Encoder class.
Requirements:
The StringUtils class should declare three static classes: Validator, Formatter, and Encoder.
The isNullOrEmpty() and isPalindrome() methods should be moved to the Validator class.
The capitalize() and reverse() methods should be moved to the Formatter class.
The encodeBase64() and decodeBase64() methods should be moved to the Encoder class.
The StringUtils class should not have any remaining methods.
 */
public class Q45 {

    public static void main(String[] args) {
        boolean isNullOrEmpty = StringUtils.Validator.isNullOrEmpty("Hello");
        boolean isPalindrome = StringUtils.Validator.isPalindrome("radar");

        String capitalized = StringUtils.Formatter.capitalize("hello world");
        String reversed = StringUtils.Formatter.reverse("Java");

        String encoded = StringUtils.Encoder.encodeBase64("secret");
        String decoded = StringUtils.Encoder.decodeBase64(encoded);
    }
}
