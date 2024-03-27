public class reversingstr {
    public static void main(String[] args) {
        String os = "hello";
        String rs = "";

        for (int i = 0; i < os.length(); i++) {
            rs = os.charAt(i) + rs;
        }

        System.out.println("Reversed string: " + rs);
    }
}
