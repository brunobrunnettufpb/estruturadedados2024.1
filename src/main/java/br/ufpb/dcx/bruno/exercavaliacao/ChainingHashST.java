package br.ufpb.dcx.bruno.exercavaliacao;

public class ChainingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;
    private int m;
    private DequeSearch<Key, Value> [] st;

    /**
     * Initializes an empty symbol table.
     */
    public ChainingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * @param m the initial number of chains
     */
    public ChainingHashST(int m) {
        this.m = m;
        st = (DequeSearch<Key, Value>[]) new DequeSearch[m];
        for (int i = 0; i < m; i++ )
            st[i] = new DequeSearch<Key, Value>();
    }
    // resize the has table to have the given number of chain,
    // rehashing all of the keys
    private void resize(int chains) {
        ChainingHashST<Key, Value> temp = new ChainingHashST<Key, Value>(chains);
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }
        this.m = temp.m;
        this.n = temp.n;
        this.st = temp.st;
    }

    // hash function for keys - return value between 0 and m-1
    private int hashTextbook(Key key) {
        return (Math.abs(key.hashCode())) % m;
    }

    // hash function for keys - returns value between 0 and m-1 (assumes m is a power of 2)
    // (from java 7 implementation, protect against poor quality hashCode() implementations)
    private int hash(Key key) {
        int h = Math.abs(key.hashCode());
        double ftmp = ((Math.sqrt(5) - 1) / 2) * h;
        int itmp = (int) ftmp;
        ftmp = ftmp - itmp;
        return itmp;

        /*int h = (Math.abs(key.hashCode()));
        h ^= (h >>> 20) ^ (h >>> 12) ^ (h >>> 7) ^ (h >>> 4);
        return h & (m-1);*/
    }

    /**
     * Return the number of key-value pairs in this symbol table.
     *
     * @return Return the number of key-value pairs in this symbol table.
     */
    public int size() {
        return n;
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean inEmpty() {
        return size() == 0;
    }

    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argumento to contains() is null");
        return
    }
}
