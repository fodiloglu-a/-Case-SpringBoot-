package com.EnocaCase.EnocaCase.Dtos.Personel;

import lombok.Data;

@Data
public class PersonelRequest {

    private int firmaId;
    private String personelAd;
    private String personelSoyad;
    private int personelPuan;
}
