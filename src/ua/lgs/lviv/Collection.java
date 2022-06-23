package ua.lgs.lviv;

public class Collection {
    public static Integer[] arr;

    Collection (Integer[] arr){
        this.arr = arr;
    }

    public class Forward implements Iterator{
        int count = 0;
        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Object next() {
            return arr[count++];
        }
    }

    public Forward forward(){
        return new Forward();
    }

    public class Backward implements Iterator{
        int count = arr.length - 1;
        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Object next() {
            count -=1;
            return arr[count--];
        }
    }

    public Backward backward(){
        return new Backward();
    }


}
