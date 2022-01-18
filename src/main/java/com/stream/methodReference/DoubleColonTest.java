package com.stream.methodReference;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DoubleColonTest {
    public static void main(String[] args) {
        String[] stringArray = { "James", "Mary", "John",
                "Patricia", "Robert", "Barbara", "Michael", "Linda", "George" };
        List<String> stringList = Arrays.asList(stringArray);
        List<String> stringList2 = Arrays.asList(stringArray);
//        stringList.sort(String::compareTo);
        System.out.println(stringList);
//        Collections.sort(stringList2);
        System.out.println(stringList2);

    }
}
