package pl.sda.modify;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ModifyExercise {

    public static List<String> modifyUppercase(List<String> strings, int index) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(strings.get(i).toUpperCase());
            } else {
               result.add(strings.get(i));
            }
        }

        return result;
    }

    public static List<String> modifyRepeat(List<String> strings, int index) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(strings.get(i)+strings.get(i));
            } else {
                result.add(strings.get(i));
            }
        }

        return result;
    }

    interface Modification {
        String modify(String input);
    }

    public static List<String> modify(List<String> strings, int index, Modification modification) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(modification.modify(strings.get(i)));
            } else {
                result.add(strings.get(i));
            }
        }
        return result;
    }

    public static List<String> modifyFind(List<String> strings, Predicate<String> where, Modification modification) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (where.test(strings.get(i))) {
                result.add(modification.modify(strings.get(i)));
            } else {
                result.add(strings.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("raz", "dwa", "trzy", "cztery");

        System.out.println(modifyUppercase(strings, 3));
        System.out.println(modifyRepeat(strings, 2));

        System.out.println(modify(strings, 1, new Modification() {
            @Override
            public String modify(String input) {
                return input.toUpperCase();
            }
        }));

        System.out.println(modify(strings, 0, input -> input.toUpperCase()));

        System.out.println(modifyFind(strings, s -> s.startsWith("c"), s -> s.toUpperCase()));
    }


}
