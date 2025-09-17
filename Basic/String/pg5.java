class First{
    public static String firstNonRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character's first and last occurrence are same → non-repeating
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return String.valueOf(ch);
            }
        }
        return "None";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss"));   // Output: w
        System.out.println(firstNonRepeatingChar("aabbcc"));  // Output: None
        System.out.println(firstNonRepeatingChar("engineer")); // Output: g
    }
}
