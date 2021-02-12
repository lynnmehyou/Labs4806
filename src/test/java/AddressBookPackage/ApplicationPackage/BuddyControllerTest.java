package AddressBookPackage.ApplicationPackage;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class BuddyControllerTest {

    @Autowired
    private MockMvc mockMvc;

   // @Test
    //void getBuddy() throws Exception {
        //this.mockMvc.perform(post("/buddy").contentType(MediaType.APPLICATION_JSON).content("{\n" +
                //"\t\"name\":\"Chloe\",\n" +
                //"\t\"phoneNumber\":\"456\"\n" +
               //"}")).andDo(print()).andExpect(status().isOk());
        //this.mockMvc.perform(get("/buddy").param("id", "1")).andDo(print()).andExpect(status().isOk())
                //.andExpect(content().string(containsString("\"name\":\"Chloe\"")));
    //}

}