package Fields;

public class Tabla {

    private boolean T[][];
    private boolean UresCella;

    public Tabla(boolean[][] T, boolean UresCella) {
        this.T = T;
        this.UresCella = UresCella;

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = UresCella;
                if (T[i][j]) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public void Elhelyez() {

    }

    public void Fajlbair() {

    }

    public void Megjelenit() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if (T[i][j]) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public void UresOszlop() {

    }

    public void UresSor() {

    }
}
