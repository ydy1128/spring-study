package com.jyoon.server.springdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoconfigurationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;

    @Value("${noKey:default value}")
    private String defaultValue;

    @Value("${propertyTestList}")
    private String[] propertyTestArray;

    @Value("#{'${propertyTestList}'.split(',')}")
    private List<String> propertyTestList;


    @Test
    public void testValue() {
        System.out.println(""+propertyTestName);
        assertThat(propertyTestName, is("property depth test"));
//        assertThat(propertyTest, is("test"));
//        assertThat(defaultValue, is("default value"));
//
//        assertThat(propertyTestArray[0], is("a"));
//        assertThat(propertyTestArray[1], is("b"));
//        assertThat(propertyTestArray[2], is("c"));
//
//        assertThat(propertyTestList.get(0), is("a"));
//        assertThat(propertyTestList.get(1), is("b"));
//        assertThat(propertyTestList.get(2), is("c"));

    }

}
