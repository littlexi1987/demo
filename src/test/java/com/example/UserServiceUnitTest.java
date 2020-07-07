package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = TestConfiguration.class)
public class UserServiceUnitTest {
    @Autowired
    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        User expectedUser = new User(9527L, "mghio");
        when(userRepository.findUserById(9527L)).thenReturn(expectedUser);
        User actualUser = userService.findUserById(9527L);
        assertEquals(expectedUser, actualUser);
    }
}
