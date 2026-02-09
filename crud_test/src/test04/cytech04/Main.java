package test04.cytech04;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        long sec = Instant.now().getEpochSecond();

        switch ((int)(sec % 2)) {
            case 0:
                System.out.println("偶数です");
                break;
            case 1:
                System.out.println("奇数です");
                break;
        }
    }
}