public class GenFun {


    //Finds value in array using generics. Inputs are an array and a value, output is the position as an int.
    public static <T> int Find(T[] set, T tgt) {
        for (int i = 0; i < set.length; i++) { //run through array
            if (tgt.equals(set[i])) {
                return i; //if found return position
            }
        }
        return -1; //if not found, return -1
    }

    //print function meant to be wrapped around Find
    public static <T> void Say(T tgt, int i) {
        if (i == -1) {
            System.out.println(tgt + " is not present.");
        }
        else {
            System.out.println(tgt + " found at position " + i + ".");
        }
    }

    //lists all entries in list
    public static <T> void List(T[] set) {
        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i]);
        }
    }

}