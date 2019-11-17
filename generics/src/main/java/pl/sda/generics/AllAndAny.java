package pl.sda.generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class AllAndAny {

    static <T> boolean all(Collection<T> collection, Predicate<T> predicate) {
        return true;
    }

    static <T> boolean any(Collection<T> collection, Predicate<T> predicate) {
        return false;
    }

    public static void main(String[] args) {

        System.out.println(all(Set.of("raz", "dwa", "trzy"), s -> s.length() >= 2)); //true
        System.out.println(all(Set.of("raz", "d", "trzy"), s -> s.length() >= 2)); //false
        System.out.println(all(List.of(5, 3, 1, 27), i -> i % 2 != 0)); //true
        System.out.println(all(List.of(1, 8, 5), i -> i % 2 != 0)); //false

        System.out.println(any(List.of(5, 4, 1, 27), i -> i % 2 == 0)); //true
        System.out.println(any(List.of(5, 1, 27), i -> i % 2 == 0)); //false
        System.out.println(any(Set.of("raz", "dwa", "trzy"), s -> s.equals("dwa")));//true
        System.out.println(any(Set.of("raz", "trzy"), s -> s.equals("dwa"))); //false

    }

}
