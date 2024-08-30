package com.yehorychev.spring.spring_selenium.props;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class PropsTest extends SpringBaseTestNGTest {

    @Autowired
    private ResourceLoader loader;

    @Test
    public void propsTest() throws IOException {
        System.out.println(PropertiesLoaderUtils.
                loadProperties(loader.getResource("my.properties")));
    }
}
