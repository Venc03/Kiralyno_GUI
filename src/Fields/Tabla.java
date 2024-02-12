package Fields;

public class Tabla {

    private boolean T[][];
    private boolean UresCella = true;


    
    public Tabla(boolean[][] T, boolean UresCella) {
        this.T = T; 
        this.UresCella = UresCella;
    }
    


    public void Elhelyez() {
        
    }
    
    
    
    public void Fajlbair() {
        
    }
    
    
    
    public void Megjelenit() {
        
    }

    
    
    public void UresOszlop() {
        for (int j = 0; j < T.length; j++) { 
            for (int i = 0; i < T[j].length; i++) { 
                T[i][j] = UresCella;
            }
        }
    }

    
    
    public void UresSor(int rowI) {
        for (int j = 0; j < T[rowI].length; j++) {
            T[rowI][j] = UresCella;
        }
    }
}
