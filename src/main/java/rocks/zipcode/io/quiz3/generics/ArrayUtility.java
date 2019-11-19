package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        return null;
    }

    public SomeType findEvenOccurringValue() {
/*
        for(int i = 0; i < array.length; i++){
            for(int j = 0; i < array.length; j++){

            }
        }

 */

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
