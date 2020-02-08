package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {
    @DataProvider(name = "Registration2")
    public static Object[][] testRegistration2(){
        return new Object[][]{
                {Data.email, Data.username, true}, //username is the same
                {Data.email2, Data.username, false},
                {Data.email3, Data.username, true},
        };
    }

    @DataProvider(name = "Registration")
    public static Object[][] testRegistration() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s-> {

            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});

        });

        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "Search")
    public static Object[][] testSearchFeature(){
        return new Object[][]{
                {"18", "80", "Default"},
                {"18", "19", "Name"},
                {"30", "40", "Views"},
                {"60", "80", "Registration date"},

        };
    }

    @DataProvider(name = "ContactUs")
    public static Object[][] testContactUs(){
        return new Object[][]{
                {"Pre-Sales Questions", "Test contacting 1", "We missed you! first"},
                {"Technical support", "Test contacting 2", "We missed you! second"},
                {"Other", "Test contacting 3", "We missed you! third"},

        };
    }

    @DataProvider(name = "SignInNegative")
    public static Object[][] testSignInNeg(){
        return new Object[][]{
//                {Data.email, Data.password,true},
                {Data.email2, Data.password, false},
                {Data.email4, Data.password, false},
                {Data.email, Data.password,true}

        };
    }

}
