/**
 * A class of bags whose entries are stored in a chain of linked nodes.
 * The bag is never full.
 * @author shinkeonkim
 */
public class LinkedBag<T> implements BagInterface<T> {
    private Node firstNode;
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }
    
    /**
     * Get the current number of entries in this bag.
     * @return The integer number of entries currently in the bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }


    public T replace(T anEntry) {
        T result = firstNode.data;
        firstNode.data = anEntry;
        return result;
    }

    /**
     * Sees whether this bag is empty.
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    /**
     * Adds a new entry to this bag
     * @param newEntry The object to be added as a new entry.
     * @return True.
     */
    public boolean add(T newEntry) //OutofMemory Error possible
    {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;
        firstNode = newNode; // Make new node reference rest of chain(first node is full if chain is empty)
        numberOfEntries++; 
        return true;
    }

    /**
     * Removes one unspecified entry from this bag, if possible.
     * @return Either the removed object, if the removal was successful. or null.
     */
    public T remove() {
        T result = null;
        if(firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        }
        return result;
    }

    private Node getreferenceTo(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while(!found && currentNode != null) {
            if(anEntry.equals(currentNode.data)) {
                found = true;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

    /**
     * Removes one occurence of a given entry from this bag, if possible.
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false otherwise.
     */
    public boolean remove(T anEntry) {
        boolean result = false;
        Node nodeN = getreferenceTo(anEntry);
        
        if(nodeN != null) {
            nodeN.data = firstNode.data;

            firstNode = firstNode.next;
            numberOfEntries--;
            result = true;
        }
        return result;
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
     * @return The number of times an Entry appears in the bag. 
     */
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;

        while((loopCounter < numberOfEntries) && (currentNode != null)) {
            if(anEntry.equals(currentNode.data)) {
                frequency++;
            }
            loopCounter++;
            currentNode = currentNode.next;

        }
        return frequency;
    }

    /**
     * Tests whether this bag contains a given entry.
     * @param anEntry The entry to locate.
     * @return True if the bag contains anEntry, or false if not.
     */
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while(!found && (currentNode != null)) {
            if(anEntry.equals(currentNode.data)) {
                found = true;
            }
            else {
                currentNode = currentNode.next;
            }
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
        int index = 0;
        Node currentNode = firstNode;
        while((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }
        return result;

    }

    private class Node {
        private T data;
        private Node next;

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node (T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    }
}