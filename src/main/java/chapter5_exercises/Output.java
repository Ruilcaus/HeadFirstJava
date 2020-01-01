package chapter5_exercises;

public class Output {
    public static void main(String [] args) {
        Output o = new Output();
        o.go();
    }
    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++; // 12, 14,
            if (x > 4) { // 5, 6
                System.out.print(++y + " "); //13 15
            }
            if (y > 14) { // 15
                System.out.println(" x = " + x); // 6
                break;
            }
        }
    }
}