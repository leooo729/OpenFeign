package com.example.OpenFeign;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@XmlRootElement
public class MgniListResponse {
    List<Mgni> mgniList;
}
