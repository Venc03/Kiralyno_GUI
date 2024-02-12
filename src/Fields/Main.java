package Fields;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean[][] table = new boolean[8][8];
        Tabla t = new Tabla(table, true);
        t.Megjelenit();
        t.Elhelyez(8);
        t.Megjelenit();
        int emptyColumn = t.UresOszlop();
        int emptyRow = t.UresSor();
        System.out.println("Empty Column: " + emptyColumn);
        System.out.println("Empty Row: " + emptyRow);
        t.Fajlbair(); 
    }
}