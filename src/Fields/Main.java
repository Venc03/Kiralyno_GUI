package Fields;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean[][] table = new boolean[8][8];
        Tabla t = new Tabla(table, true);
        System.out.println("Original Table:");
        System.out.println(t.Megjelenit()); 
        t.Elhelyez(8); 
        System.out.println("Modified Table:");
        System.out.println(t.Megjelenit());
        int emptyColumn = t.UresOszlop();
        int emptyRow = t.UresSor();
        System.out.println("Empty Column: " + emptyColumn);
        System.out.println("Empty Row: " + emptyRow);
        t.Fajlbair("table64.txt"); 
    }
}
