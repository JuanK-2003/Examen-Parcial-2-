package Clases;

import java.util.function.Predicate;

/**
 *
 * @author Juan_K
 */
public class productUtils {
    public static Predicate<Integer> isInStock = x -> x > 0;
}
