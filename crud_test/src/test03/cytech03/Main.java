package test03.cytech03;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        long sec = Instant.now().getEpochSecond();

        if (sec % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    }
}