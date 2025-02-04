package com.study.boardStudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.study")
public class AppConfig {

    /**
     * resources의 application.properties 설정
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    // 추가 설정이 필요하면 여기에 추가

//    @Bean
//    public UserDAO userDao() {
//        return new UserDAO() {
//            @Override
//            public JoinVO join(JoinVO joinVO) {
//                return null;
//            }
//
//            @Override
//            public void memberLogin(LoginVO loginVO) {
//
//            }
//        };
//    }

//    @Bean
//    public UserService userService() {
//        return new UserServiceImpl();
//    }

//    @Bean
//    public BoardDAO boardDao() {
//        return new BoardDAO() {
//            @Override
//            public void boardInsert(int id, String title, String content, String author) {
//            }
//        };
//    }

}

