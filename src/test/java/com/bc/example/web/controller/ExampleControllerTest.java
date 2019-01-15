package com.bc.example.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ExampleControllerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleControllerTest.class);

    @Autowired
    private MockMvc mvc;

    @Test
    public void testProjectInfo() throws Exception {
        LOGGER.debug("test for project info");
        this.mvc.perform(get("/")).andExpect(status().isOk()).andExpect(
                content().string("{\"projectName\":\"Example Application\",\"version\":\"0.0.1-SNAPSHOT\"}"));
    }
}
