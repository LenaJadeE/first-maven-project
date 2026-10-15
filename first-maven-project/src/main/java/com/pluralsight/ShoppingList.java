package com.pluralsight;

import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        // Shopping List of 10
        // List String is needed
        // I shifted from printf to println because that is more python
        // I moved the println to the bottom because it was redundant
        List<String> tools = List.of( " ",
                "buttons",
                "sprite cherry",
                "juice",
                "ice cream",
                "candy",
                "popcorn",
                "plates",
                "jello",
                "keys",
                "plates");

        //System Print out of the list
        for (String item : tools) {
            System.out.println(item);

        }
    }
}
