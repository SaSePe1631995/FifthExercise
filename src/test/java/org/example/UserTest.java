package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    static User user = null;

    @BeforeAll
    public static void setUp(){
        user = new User();
    }

    @Test
    @DisplayName("Проверка конструктора с параметрами")
    public void testUser  (){
        String login = "Semich";
        String email = "Em@i.l";
        User exp = new User("Semich", "Em@i.l");
        assertEquals(login, exp.GetLogin(), "Логин задан некорректно");
        assertEquals(email, exp.GetEmail(), "Е-майл задан некорректно");
    }

    @Nested
    @DisplayName("Проверка задания значений")
    class SetValues{
        @Test
        @DisplayName("Проверка задания логина")
        public void testSetLogin(){
            String login = "JoJo";
            assertEquals(false,user.SetLogin(login), "Логин не соответствует требованиям");
        }

        @Test
        @DisplayName("Проверка задания е-майла")
        public void testSetEmail(){
            String email = "somebody@nobody,com";
            assertEquals(false,user.SetEmail(email), "Е-майл не соответствует требованиям");
        }
    }

    @AfterAll
    public static void tearDown(){
        user = null;
    }
}