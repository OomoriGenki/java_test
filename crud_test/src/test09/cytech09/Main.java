package test09.cytech09;

public class Main {
    public static void main(String[] args) {

        int[][] scores = {
            {80, 70, 90, 85},
            {60, 75, 88, 92},
            {95, 85, 80, 70},
            {55, 65, 60, 75},
            {88, 90, 85, 95}
        };

        String[] subjects = {"国語", "数学", "理科", "社会"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("学生" + (i + 1) + "の点数：");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("  " + subjects[j] + ": " + scores[i][j]);
            }
            System.out.println();
        }
    }
}