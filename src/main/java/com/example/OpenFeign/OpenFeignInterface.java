package com.example.OpenFeign;

import com.example.OpenFeign.controller.dto.MgniListResponse;
import com.example.OpenFeign.controller.dto.SearchMgniRequest;
import com.example.OpenFeign.entity.Mgni;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "leo",url = "http://localhost:8080/produce")
public interface OpenFeignInterface {
    @GetMapping
    MgniListResponse getAllMgni();





}
