package test08.cytech08;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += "0";
            }
            System.out.println(line);
        }
    }
}