package ua.lgs.lviv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {3, -13, 43, 54,-23, 16, 13, 4, -6, 11};

        Collection collection = new Collection(array);

        Iterator iteratorForward = collection.forward();

        System.out.println(Arrays.toString(array) + "\n");
        while (iteratorForward.hasNext()){
            int next = (int) iteratorForward.next();
            if (next % 2 !=0){
                next = 0;
            }
            System.out.println(next +"\n");
        }

        Iterator iteratorBackward = collection.backward();

        while (iteratorBackward.hasNext()){
            int next = (int) iteratorBackward.next();
            System.out.println(next);
        }
    }
}
