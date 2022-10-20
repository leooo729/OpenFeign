package com.example.OpenFeign.controller.dto;


import com.example.OpenFeign.entity.Mgni;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MgniListResponse {
    List<Mgni> mgniList;
}
