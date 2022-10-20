package com.example.OpenFeign.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cashi implements Serializable{

    private String mgniId;

    private String accNo;

    private String ccy;

    private BigDecimal amt;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "mgni_id")
//    private Mgni mgni;
}
