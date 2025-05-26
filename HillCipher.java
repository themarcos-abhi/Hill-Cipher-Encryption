public class HillCipher {
    static int[][] key = {{3, 3}, {2, 5}};
    static int[][] invKey = {{15, 17}, {20, 9}};

    public static int[] multiply(int[][] matrix, int[] vector) {
        int[] result = new int[2];
        result[0] = (matrix[0][0]*vector[0] + matrix[0][1]*vector[1]) % 26;
        result[1] = (matrix[1][0]*vector[0] + matrix[1][1]*vector[1]) % 26;
        return result;
    }

    public static String process(String text, int[][] matrix) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "");
        if (text.length() % 2 != 0) text += "X";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            int[] pair = {text.charAt(i) - 'A', text.charAt(i+1) - 'A'};
            int[] transformed = multiply(matrix, pair);
            result.append((char)(transformed[0] + 'A'));
            result.append((char)(transformed[1] + 'A'));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String msg = "Long Range Balestic Missile";
        String enc = process(msg, key);
        String dec = process(enc, invKey);
        System.out.println("C:\\User\\The-Marcos\\Abhishek\\Java\\jdk-23\\bin\\java.exe");
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
