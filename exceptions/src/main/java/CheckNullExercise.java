public class CheckNullExercise {

    /**
     * Napisz metodę `checkNull` rzucającą wyjątek `NullPointerException`, gdy argument jest równy **null**.
     */
    static void checkNull(Object o) {
        if(o == null) {
            throw new NullPointerException();
        }
    }


}
