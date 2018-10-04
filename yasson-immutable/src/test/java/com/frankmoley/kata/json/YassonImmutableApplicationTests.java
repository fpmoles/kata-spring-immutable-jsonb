package com.frankmoley.kata.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class YassonImmutableApplicationTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void addPresident() throws Exception {
        String president = "{\"number\": 1, \"firstName\": \"George\", \"lastName\": \"Washington\"}";
        this.mockMvc.perform(put("/presidents/1")
                .content(president)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

    @Test
    public void addVicePresident() throws Exception {
        String vp = "{\"number\": 1, \"firstName\": \"John\", \"lastName\": \"Adams\"}";
        this.mockMvc.perform(put("/vps/1")
                .content(vp)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

}
