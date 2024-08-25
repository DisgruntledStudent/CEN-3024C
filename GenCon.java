import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class GenCon<T> {

        private List<T> stuff;

        //Constructor
        public GenCon() {
            stuff = new ArrayList<>();
        }

        //Add something
        public void add(T arg) {
            stuff.add(arg);
        }

        //Remove something
        public void remove(T arg) {
            stuff.remove(arg);
        }

        //get from index
        public T get(int i) {
            return stuff.get(i);
        }

        //Get size
        public int size() {
            return stuff.size();
        }

        public void sort(Comparator<? super T> comp) {
            Collections.sort(stuff, comp);
        }

        //Print all
        public void print() {
            for (T element : stuff) {
                System.out.println(element);
            }
        }

}
