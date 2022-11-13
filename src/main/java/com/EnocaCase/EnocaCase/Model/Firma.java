package com.EnocaCase.EnocaCase.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Firma")

public class Firma {
    //Firma: firmaID, firmaAd, firmaAdres, firmaWebSite


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fima_IId")
    private Long firmaIId;
    @Column(name = "firma_Ad")
    private String firmaAd;
    @Column(name = "firma_Adress")
    private String firmaAdres;
    @Column(name = "firma_Web_Site")
    private String firmaWebSite;


    @OneToMany(mappedBy = "firma")
    List<Personel>personels=new ArrayList<>();
}
