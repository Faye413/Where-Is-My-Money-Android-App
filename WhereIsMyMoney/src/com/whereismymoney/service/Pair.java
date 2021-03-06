package com.whereismymoney.service;

/**
 * utility class that holds a pair of unmodifiable objects.
 * @author Xinyi Chen
 *
 * @param <E> item1
 * @param <T> item2
 */
public class Pair<E, T> {
	/**
	 * first item contained in the pair.
	 */
    private final E item1;
    
    /**
     * second item contained in the pair.
     */
    private final T item2;
    
    /**
     * initialize the two items contained in the pair.
     * 
     * @param item1 first item
     * @param item2 second item
     */
    public Pair(E item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    /**
     * get the first item.
     * 
     * @return first item
     */
    public E getItem1() {
        return item1;
    }
    
    /**
     * get the second item.
     * 
     * @return second item
     */
    public T getItem2() {
        return item2;
    }
}
