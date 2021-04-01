package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import com.microsoft.azure.functions.annotation.TimerTrigger;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;

public class SendMailHandler extends AzureSpringBootRequestHandler<String, String> {

    @FunctionName("sendMail")
    public String execute(
            @TimerTrigger(name = "timerInfo", schedule = "0 0 0/2 * * *") String timerInfo,
            ExecutionContext context) {

        return handleRequest("exmaple@gamil.com", context);
    }
}
