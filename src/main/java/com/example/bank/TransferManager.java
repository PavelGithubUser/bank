package com.example.bank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransferManager {

    @RequestMapping("/transferpage")
    public String transferPage(){
        return "transferpage";
    }

}
