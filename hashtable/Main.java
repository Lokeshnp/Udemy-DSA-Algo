package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tile", 100);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 40);
        hashTable.set("paints", 20);
//        hashTable.set("screws", 140);
 //       hashTable.printHashTable();
//        System.out.println(hashTable.get("lumber"));
//        System.out.println(hashTable.get("bolts"));
        System.out.println(hashTable.key());
    }
}
