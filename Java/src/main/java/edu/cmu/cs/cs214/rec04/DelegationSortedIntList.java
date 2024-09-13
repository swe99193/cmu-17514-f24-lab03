package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private int totalAdded;
    private SortedIntList sortedIntListlist;

    public DelegationSortedIntList () {
        sortedIntListlist = new SortedIntList();
    }

    @Override
    public boolean add(int num){
        totalAdded++;
        return sortedIntListlist.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return sortedIntListlist.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public int get(int index){
        return sortedIntListlist.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedIntListlist.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntListlist.removeAll(list);
    }

    @Override
    public int size() {
        return sortedIntListlist.size();
    }

}