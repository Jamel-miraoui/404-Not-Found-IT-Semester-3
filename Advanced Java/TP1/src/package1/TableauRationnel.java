package package1;

public class TableauRationnel extends Tableau {

    public TableauRationnel(Rationnel[] tableau) {
        super(tableau);
    }

    public boolean inf(Object x, Object y) {
        Rationnel r1 = (Rationnel) x;
        Rationnel r2 = (Rationnel) y;
        return (r1.getNum()*r2.getDeum() < r2.getNum()*r1.getDeum());
    }
    
    public static void main(String[] args) {
        Rationnel[] r = {new Rationnel(1, 2), new Rationnel(2, 3), new Rationnel(3, 4), 
                         new Rationnel(4, 5), new Rationnel(5, 6)};
        TableauRationnel t = new TableauRationnel(r);
        Rationnel min = (Rationnel) t.minimum();
        System.out.println("Le plus petit rationnel est : " + min);
    }
}
