import java.util.List;

public class OddSizeExercise {

    static class OddSizeException extends RuntimeException {
        public OddSizeException(String message) {
            super(message);
        }
    }

    /**
     * Napisz własny wyjątek `OddSizeException`. Napisz metodę `checkList` wyrzucającą go,
     * jeżeli liczba elementów jest nieparzysta. Podczas rzucania wyjątku napisz informację, dlaczego został rzucony.
     *
     * @param ints
     */
    public static void checkList(List<Integer> ints) {

        if (ints.size() % 2 != 0) {
            throw new OddSizeException("Nieparzysta liczba elementów");
        }
    }

}
