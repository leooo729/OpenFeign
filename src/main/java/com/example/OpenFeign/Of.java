package com.example.OpenFeign;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Of {
    @Autowired
    private OpenFeign openFeign;

    private static ObjectMapper mapper = new ObjectMapper();

    @Scheduled(cron = "0/10 * * * * *")
    public void ggggg() throws JsonProcessingException {
        MgniListResponse mgniListResponse = openFeign.getAllMgni();
        mapper.findAndRegisterModules();
        String mgniList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mgniListResponse);
        System.out.println(mgniList);
    }
}
