package com.example.OpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "leo",url = "http://localhost:8080/produce")
public interface OpenFeign {
@RequestMapping(method = RequestMethod.GET)
    public MgniListResponse getAllMgni();


}
