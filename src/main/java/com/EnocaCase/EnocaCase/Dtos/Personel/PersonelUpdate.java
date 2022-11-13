package com.EnocaCase.EnocaCase.Dtos.Personel;

import lombok.Data;

@Data
public class PersonelUpdate {
    private int updateId;
    private int firmaId;
    private String personelAd;
    private String personelSoyad;
    private int personelPuan;
}
