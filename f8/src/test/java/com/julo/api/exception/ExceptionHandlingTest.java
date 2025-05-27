package com.julo.api.exception;

import com.julo.api.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ProductController.class)
class ExceptionHandlingTest {
    @Autowired
    MockMvc mvc;

    @Test
    void notFoundGivesProblemJson() throws Exception {
        mvc.perform(get("/api/products/42"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType("application/problem+json"))
                .andExpect(jsonPath("$.status").value(404))
                .andExpect(jsonPath("$.type").value("https://api.example.com/errors/ProductNotFoundException"));
    }
}