package com.example.OpenFeign.entity;

import com.example.OpenFeign.entity.Cashi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//@XmlAccessorType(XmlAccessType.FIELD) //表明哪些可以被轉化為xml
public class Mgni {

    private String id;

//    @JsonSerialize(using = LocalDateTimeSerializer.class)
//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDateTime time;
    private String type;
    private String cmNo;
    private String kacType;
    private String bankNo;
    private String ccy;
    private String pvType;
    private String bicaccNo;
    private String iTYPE;
    private String pReason;
    private BigDecimal amt;
    private String ctName;
    private String ctTel;
    private String status;
    private LocalDateTime uTime;
    private List<Cashi> cashiList;

}
