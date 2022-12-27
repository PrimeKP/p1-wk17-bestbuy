package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost"; //can be move to config file
        RestAssured.port = 3030;
        //RestAssured.basePath = "/stores"; //this will be set up in individual class // this is common here so setup here
                                            //else we can set up this in MyFirstTest (respective test)
    }
}
