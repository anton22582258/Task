public class Main {
    public static void main(String[] args) {
        System.out.println( " Практическая задача ");
        String str = "123456789";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (i == (chars.length-1) / 2 ) {
                System.out.print(" ");
            }

        }
    }
}