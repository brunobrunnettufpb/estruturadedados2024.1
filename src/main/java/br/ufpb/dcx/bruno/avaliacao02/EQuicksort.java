package br.ufpb.dcx.bruno.avaliacao02;

public class EQuicksort {
    public void Quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = Particiona(A, p, r);
            Quicksort(A, p, q-1);
            Quicksort(A, q+1, r);

            for (int item : A) {
                System.out.print(item + " ");
            }
        }
    }

    /**
     *
     * @param A
     * @param p
     * @param r
     * @return
     */
    public int Particiona(int[] A, int p, int r) {
        int pivo = A[r];
        int i = p-1;
        for (int j=p; j < r-1;) {
            if (A[j] <= pivo) {
                i++;
                int x = A[j];
                int y = A[i];
            }
        }

        return i+1;
    }
}
