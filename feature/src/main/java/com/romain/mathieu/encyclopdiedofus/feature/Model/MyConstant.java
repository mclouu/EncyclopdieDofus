package com.romain.mathieu.encyclopdiedofus.feature.Model;

import java.util.Hashtable;

class MyConstant {

    String BASE_URL = "http://api.nytimes.com/";

    String GET_SECTION(int section) {
        Hashtable<Integer, String> category = new Hashtable<>();
        category.put(25, "home");

        return category.get(section);
    }

}
