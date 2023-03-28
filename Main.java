class Main {
    public static void main(String[] args) {
        int n = 10; // rozmiar tabliczki mnożenia
        
        // pętla iterująca po wierszach
        for (int row = 1; row <= n; row++) {
            
            // pętla iterująca po kolumnach
            for (int col = 1; col <= n; col++) {
                int mnozenie = row * col;
                System.out.print(mnozenie + "\t"); // wypisz wynik mnożenia i tabulator
            }
            System.out.println();
        }
    }
}