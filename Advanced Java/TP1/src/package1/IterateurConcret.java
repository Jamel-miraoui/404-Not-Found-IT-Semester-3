package package1;

class IterateurConcret implements Iterateur {
    private Object[] data;
    private int index;

    public IterateurConcret(Object[] data) {
        this.data = data;
    }

    @Override
    public void init() {
        index = 0;
    }

    @Override
    public Object suivant() {
        return data[index++];
    }

    @Override
    public boolean fini() {
        return index == data.length;
    }

    @Override
    public Object courant() {
        return data[index];
    }
}