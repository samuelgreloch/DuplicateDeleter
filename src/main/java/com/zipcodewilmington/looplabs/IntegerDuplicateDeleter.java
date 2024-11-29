package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] array) {
        super(array);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] result = new Integer[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }

                if (count < maxNumberOfDuplications) {
                    result[index++] = array[i];
                }
            }
            return Arrays.copyOf(result, index);
        }




    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];


    }
}
