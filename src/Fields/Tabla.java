package Fields;

import java.util.Random;

public class Tabla {
    private boolean T[][];
    private boolean UresCella;

    public Tabla(boolean[][] T, boolean UresCella) {
        this.T = T;
        this.UresCella = UresCella;
    }

    public void Elhelyez(int N) {
        Random r = new Random();
        int numRows = T.length;
        int numCols = T[0].length;

        N = Math.min(N, numRows * numCols);

        for (int count = 0; count < N; count++) {
            int row, col;
            do {
                row = r.nextInt(numRows);
                col = r.nextInt(numCols);
            } while (T[row][col]);

            T[row][col] = true;
        }
    }

    public void Fajlbair() {
        // Implement file writing logic here
    }

    public void Megjelenit() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if (T[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public int UresOszlop() {
        for (int j = 0; j < T[0].length; j++) {
            boolean isEmpty = true;
            for (int i = 0; i < T.length; i++) {
                if (T[i][j]) {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) return j;
        }
        return -1; // No empty column found
    }

    public int UresSor() {
        for (int i = 0; i < T.length; i++) {
            boolean isEmpty = true;
            for (int j = 0; j < T[i].length; j++) {
                if (T[i][j]) {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) return i;
        }
        return -1; // No empty row found
    }
}