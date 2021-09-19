package data.testData;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class DataProviders {
    @DataProvider(name = "websitesList")
    public static Object[][] websitesList() {
        //======================================================
        ArrayList<String> list = new ArrayList<>();
        list.add("PHP Travels");
        list.add("Mercury tours");
        list.add("Internet");
        list.add("E-commerce");
        list.add("Passion Tea Company");
        list.add("Saucedemo");
        list.add("Shopping Cart");

        //======================================================
        Object[][] data = new Object[1][1];
//        test.data[0][0] = "Admin";
//        test.data[0][1] = "admin123";
        data[0][0] = list;

        return data;
    }
}
