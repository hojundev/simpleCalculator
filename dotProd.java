import java.util.Scanner;

public class dotProd {
    int dimension;
    int[] vec1;
    int[] vec2;
    int[] result;
    Scanner scanner = new Scanner(System.in);

    public void setDotProd(int dimension) {
        this.dimension = dimension;
        setVec1();
        setVec2();
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

    public int[] getResult() {
        int[] result = new int[dimension];
        for (int i = 0; i < result.length; i++) {
            result[i] = vec1[i] * vec2[i];
        }
        return result;
    }
}