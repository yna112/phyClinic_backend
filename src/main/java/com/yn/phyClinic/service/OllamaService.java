package com.yn.phyClinic.service;


import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.Therapy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class OllamaService {


    @Autowired
     OllamaChatModel ollamaChatModel;



    record OrderTherapiesPatient(Patient patient, List<Therapy> therapyLis){}



    public String chat(String query){
        String response= ollamaChatModel.call(query);

        return  response;
    }



//    public OrderTherapiesPatient orderTherapiesPatient() {
//        // שליחת בקשה למודל ומיפוי התוצאה לאובייקט OrderTherapiesPatient
//        OrderTherapiesPatient orderTherapiesAndPatient = chatClient.prompt()
//                .user("Please show me the patient with ID 4 and all his respective treatments arranged by date")
//                .call()
//                .entity(OrderTherapiesPatient.class);
//
//        // החזרת האובייקט שנוצר
//        return orderTherapiesAndPatient;
//    }




}
