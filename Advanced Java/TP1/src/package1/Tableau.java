package package1;

public abstract class Tableau {
    protected Object[] tableau;

    public Tableau(Object[] tableau) {
        this.tableau = tableau;
    }

    public abstract boolean inf(Object x, Object y);

    public Object minimum() {
        Object min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (inf(tableau[i], min)) {
                min = tableau[i];
            }
        }
        return min;
    }
}
