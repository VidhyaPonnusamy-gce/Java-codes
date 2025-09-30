
public class Compare {
    String s1 = new String("java");
    String s2 = new String("java");

    void compareStrings() {
        if (s1==s2) {
            System.out.println("Two strings are same");
        } else {
            System.out.println("Not same");
        }
    }

    public static void main(String args[]) {
        Compare s = new Compare();  // Create object of Compare class
        s.compareStrings();         // Call the method
    }
}
