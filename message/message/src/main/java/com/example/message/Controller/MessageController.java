package com.example.message.Controller;

import com.example.message.service.C;
import com.example.message.service.D;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private final C serviceC;
    private final D serviceD;

    public MessageController(C serviceC, D serviceD) {
        this.serviceC = serviceC;
        this.serviceD = serviceD;
    }

    @GetMapping("/call-service-D")
    public String callServiceD(){
        return serviceC.callServiceD();
    }

    @GetMapping("/service-d")
    public String getServiceDResponse(){
        return serviceD.getServiceDResponse();
    }
}
