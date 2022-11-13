package com.EnocaCase.EnocaCase.Services;

import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelRequest;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelUpdate;

import java.util.List;

public interface IPersonelServices {


    //-Personel tablosuna bir personel ekleyin, Firması boş olsun

    void addPersonel(PersonelRequest personelRequest);
    void deleteById(int id );
    void updatePersonel(PersonelUpdate personelUpdate);

    PersonelResponse getPersonelById(int id);

    // -Personel Adı “Ahmet” olan Personelleri siliniz.

    void deletePersonelByName(String name);

    //  -Personel Adı “Ahmet” olan Personellerin personelPuanlarını 0 olarak güncelleyin.
    void updatePersonelPuan(String name);

    List<PersonelResponse> findByFirmaAd(String firmaAd);



}
