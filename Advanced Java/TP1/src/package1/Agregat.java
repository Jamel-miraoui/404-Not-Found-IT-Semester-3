package package1;

abstract class Agregat {

    abstract public boolean inf(Object x, Object y);

    abstract protected Iterateur getIterateur();

    public Object minimum() {
        Iterateur it = getIterateur();
        it.init();
        Object min = it.courant();
        while (!it.fini()) {
            Object obj = it.suivant();
            if (inf(obj, min)) {
                min = obj;
            }
        }
        return min;
    }
}
