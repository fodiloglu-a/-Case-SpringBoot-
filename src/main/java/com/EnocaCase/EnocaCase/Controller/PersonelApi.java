package com.EnocaCase.EnocaCase.Controller;


import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelRequest;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelUpdate;
import com.EnocaCase.EnocaCase.Services.PersonelManger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/personel")//localhost:8080/personel
@RestController
@RequiredArgsConstructor
public class PersonelApi {
    private final PersonelManger personelManger;

    @PostMapping("/add")//localhost:8081/personel/add
    public void addPersonel(@RequestBody PersonelRequest personelRequest){
        this.personelManger.addPersonel(personelRequest);

    }


    @DeleteMapping("/deleteById")//localhost:8081/personel/deleteById
    void deleteById(@RequestParam int id ){
        this.personelManger.deleteById(id);

    }

    @PostMapping("/update")//localhost:8081/personel/update
    void updatePersonel(@RequestBody PersonelUpdate personelUpdate){
        this.personelManger.updatePersonel(personelUpdate);
    }

    @GetMapping("/getPersonelById")//localhost:8081/personel/getPersonelById
    public PersonelResponse getPersonelById(@RequestParam int id){
        return this.personelManger.getPersonelById(id);
    }

    // -Personel Adı “Ahmet” olan Personelleri siliniz.

    @DeleteMapping("/delteByName")//localhost:8081/personel/delteByName
    public void deletePersonelByName(@RequestParam String name){
        this.personelManger.deletePersonelByName(name);
    }

    //  -Personel Adı “Ahmet” olan Personellerin personelPuanlarını 0 olarak güncelleyin.

    @PutMapping("/updatePersonelPuan")//localhost:8081/personel/updatePersonelPuan
    void updatePersonelPuan(@RequestParam String name){
        this.personelManger.updatePersonelPuan(name);
    }

    //-Firma Adı “Enoca” olan personelleri getirin
    @GetMapping("/findByFirmaAd")//localhost:8081/personel/findByFirmaAd
    public List<PersonelResponse> findByFirmaAd(String firmaAd){
        return this.personelManger.findByFirmaAd(firmaAd);
    }
}
