package com.clientui;

import com.clientui.beans.BookBean;
import com.clientui.beans.UserBean;
import com.clientui.web.proxies.MicroserviceConsumerProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableFeignClients("com.clientui")
public class SartClientApplication {


    // start everything
    public static void main(String[] args) {
        SpringApplication.run(SartClientApplication.class, args);
    }


}