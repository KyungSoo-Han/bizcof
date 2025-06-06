package com.bizcof.wms.inventory.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class InventoryAdminControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void checkConsistency_shouldReturn200() throws Exception {

        mockMvc.perform(post("/api/admin/inventory/check-consistency", false))
               .andExpect(status().isOk());
    }
}