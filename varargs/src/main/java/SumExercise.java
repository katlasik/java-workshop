public class SumExercise {

    /**
     * Stwórz metodę `int sumAll(int... elements)`, która będzie zwracać sumę wszyskich podanych elementów.
     */
    static int sumAll(int... ints) {
        int sum = 0;
        for(int i: ints) {
            sum += i;
        }
        return sum;
    }

}
