package case1;

public class Program {

    public static void main(String[] args) {

        TraditionalIterator<Integer> iterator = new EvensFrom(2);

        for (int i = 0; i < 3; i++) {
            if (iterator.hasNext()) {
                iterator.moveNext();
                System.out.println(iterator.getCurrent());
            }
        }

        iterator = new EvensFrom(1);

        for (int i = 0; i < 3; i++) {
            if (iterator.hasNext()) {
                iterator.moveNext();
                System.out.println(iterator.getCurrent());
            }
        }
    }
}
