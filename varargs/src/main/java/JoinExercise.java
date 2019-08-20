public class JoinExercise {

    /**
     * 2. Stwórz metodę `String join(String... elements)`, która będzie łaczyć wszystkie podane łańcuchy za pomocą łącznika " i ":
     *
     * `["Ania", "Kasia", "Beata"] -> "Ania i Kasia i Beata"`
     */
    static String join(String... names){
        String result = "";

        for (int i = 0; i < names.length; i++) {
            result += (names[i]);
            if(i != names.length - 1) {
                result += " i ";
            }
        }

        return result;
     }
}
