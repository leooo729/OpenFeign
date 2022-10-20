package com.example.OpenFeign;

import com.example.OpenFeign.controller.dto.MgniListResponse;
import com.example.OpenFeign.controller.dto.SearchMgniRequest;
import com.example.OpenFeign.entity.Mgni;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OpenFeign {
    @Autowired
    private OpenFeignInterface openFeignInterface;

    private static ObjectMapper mapper = new ObjectMapper();

//    @Scheduled(cron = "0/10 * * * * *")
    public void getAllMgni() throws JsonProcessingException {
        MgniListResponse mgniListResponse = openFeignInterface.getAllMgni();
        mapper.findAndRegisterModules();
        String mgniList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mgniListResponse);
        System.out.println(mgniList);
    }

    //---------------------------------------------------restTemple

    public void searchTargetMgni(SearchMgniRequest request) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        List<Mgni>mgniList=restTemplate.postForObject("http://localhost:8080/produce/search",request,List.class);
        System.out.println(mgniList);
    }

}
