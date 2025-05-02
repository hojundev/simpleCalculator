import java.util.Arrays;
import java.util.Scanner;

public class dotProd {
    private int dimension;
    private int[] vec1;
    private int[] vec2;
    private final Scanner scanner = new Scanner(System.in);

    public void setDotProd() {
        System.out.println("Please enter the dimension: ");
        this.dimension = scanner.nextInt();
        while (this.dimension <= 0) {
            System.err.println("Please enter a valid dimension: ");
            this.dimension = scanner.nextInt();
        }
        setVec1();
        setVec2();
        scanner.close();
        getResult();
    }

    private void setVec1() {
        vec1 = new int[dimension];
        System.out.println("Please enter all elements of this vector");
        for (int i = 0; i < vec1.length; i++) {
            this.vec1[i] = scanner.nextInt();
        }
    }

    private void setVec2() {
        vec2 = new int[dimension];
        System.out.println("Please enter all elements of this vector");
        for (int i = 0; i < vec2.length; i++) {
            this.vec2[i] = scanner.nextInt();
        }
    }

    private void getResult() {
        int[] result = new int[dimension];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.vec1[i] * this.vec2[i];
        }
        System.out.println("The resulting vector is: " + Arrays.toString(result));
    }
}