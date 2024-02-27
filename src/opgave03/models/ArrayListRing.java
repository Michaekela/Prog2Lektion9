package opgave03.models;

import java.util.ArrayList;

public class ArrayListRing implements Ring {
    private ArrayList<Ring> list;

    public ArrayListRing(ArrayList<Ring> list) {
        this.list = list;
    }

    @Override
    public void advance() {

    }

    @Override
    public Object getCurrentItem() {
        return null;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public boolean removeItem(Object item) {
        return false;
    }

    @Override
    public Object removeCurrentItem() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
