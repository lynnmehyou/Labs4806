package AddressBookPackage.ApplicationPackage;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class AddressBookControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void createAddressBook() throws Exception {
        this.mockMvc.perform(put("/addressBook")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("id")));
    }

    @Test
    void getAddressBook() throws Exception {
        this.mockMvc.perform(put("/addressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("id")));
        this.mockMvc.perform(get("/addressBook?id=1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("id")));
    }
}