package com.tew;

import com.tew.pojo.User;
import com.tew.service.TicketService;
import com.tew.service.UserDAOService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private UserDAOService userDAOService;
    @Test
    public void contextLoads() {
        System.out.println("++++++++++++++++++++++++++++++++"+ticketService.getTicket());
    }

    @Test
    public void test2(){
        User user= userDAOService.findByName("Anon2");
        System.out.println(user);
    }

}
