package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] result = new String[array.length];

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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] result = new String[array.length];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }

            if (count != exactNumberOfDuplications) {
                result[index++] = array[i];
            }
        }
        return Arrays.copyOf(result, index);
    }

}
