/**
 * A class of whose entries are stored in fixed-size array.
 * @author shinkeonkim
 */

public final class ArrayBag<T> implements BagInterface<T> {
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private boolean intialized = false;
    private static final int MAX_CAPACITY = 10000;

    /**
     * Creates an empty bag whose capacity is 25.
     */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty bag having a given capacity.
     * @param desiredCapacity the integer capacity desired.
     */
    public ArrayBag(int desiredCapacity) {

        if(desiredCapacity <= MAX_CAPACITY) {
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[])new Object[desiredCapacity];
            bag = tempBag;
            numberOfEntries = 0;
            intialized = true;
        }
        else {
            throw new IllegalStateException("Attempt tp create a bag whose capacity exceeds allowed maximum");
        }

    }

    private void checkInitialization() {
        if(!intialized) throw new SecurityException("ArrayBag object is not intialized properly");
    }

    /**
     * Get the current number of entries in this bag.
     * @return The integer number of entries currently in the bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }

    /**
     * Sees whether this bag is empty.
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    /**
     * Adds a new entry to this bag.
     * @param newEntry The object to be added as a new entry.
     * @return Trye if the addition is successful, of false if not.
     */
    public boolean add(T newEntry) {
        checkInitialization();
        boolean result = true;
        if(isArrayfull()) {
            result = false;
        }
        else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }


    private boolean isArrayfull() {
        return numberOfEntries >= bag.length;
    }

    /**
     * Removes one unspecified entry from this bag, if possible.
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T remove() {
        checkInitialization();
        T result = null;
        if(numberOfEntries > 0) {
            result = bag[numberOfEntries -1 ];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }
    
    /**
     * Removes one occurrence of a given entry from this bag, if possible.
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry) {
        checkInitialization();
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    private T removeEntry(int givenIndex) {
        T result = null;
        if(!isEmpty() && (givenIndex >=0)) {
            result = bag[givenIndex];
            bag[givenIndex] = bag[numberOfEntries - 1];

            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }

    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        int index = 0;
        while(!found && (index < numberOfEntries)) {
            if(anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
            index++;
        }
        return where;
    }

    /**
     * Removes all entries from this bag.
     */
    public void clear() {
        while(!isEmpty()) {
            remove();
        }
    }

    /**
     * Counts the number of times a given entry appears in this bag.
     * @param anEntry The entry to be counted.
     * @return True if the bag contains anEntry, or false if not.
     */
    public int getFrequencyOf(T anEntry) {
        checkInitialization();
        int counter = 0;
        for(int index = 0; index < numberOfEntries; index++) {
            if(anEntry.equals(bag[index])) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Tests whether this bag contains a given entry.
     * @param anEntry The entry to locate.
     * @return True if the bag contains anEntry, or false if not.
     */
    public boolean contains(T anEntry) {
        checkInitialization();
        boolean found = false;
        int index = 0;
        while(!found && (index < numberOfEntries)) {
            if(anEntry.equals(bag[index])) {
                found = true;
            }
            index++;
        }
        return found;
    }


    /**
     * Retrieves all entries that are in this bag.
     * @return A newly allocated array of all the entries in the bag. 
     */
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for(int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }
}