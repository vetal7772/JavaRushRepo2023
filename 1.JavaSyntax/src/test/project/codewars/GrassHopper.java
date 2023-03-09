package test.project.codewars;

public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(getGrade(65, 88, 70));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int result = (s1 + s2 + s3) / 3;


        if (result >= 90 && result <= 100) {
            return 'A';
        } else if (result >= 80 && result < 90) {
            return 'B';
        } else if (result >= 70 && result < 80) {
            return 'C';
        } else if (result >= 60 && result < 70) {
            return 'D';
        } else if (result >= 0 && result < 60) {
            return 'F';
        } else {
            return '0';
        }
    }
}
