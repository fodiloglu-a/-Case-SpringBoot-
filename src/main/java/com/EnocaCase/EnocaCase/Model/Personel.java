package com.EnocaCase.EnocaCase.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Personel")
public class Personel {
    //Personel: personelID, firmaID, personelAd, personelSoyad, personelPuan

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personelId;

    private String personelAd;
    private String personelSoyad;
    private int personelPuan;
    @ManyToOne
    @JoinColumn(name = "firma_IId")
    private Firma firma;
}
