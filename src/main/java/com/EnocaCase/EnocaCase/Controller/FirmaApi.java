package com.EnocaCase.EnocaCase.Controller;

import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaRequest;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaResponse;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaUpdate;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;
import com.EnocaCase.EnocaCase.Services.FirmaManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/firma")//localhost:8080/firma

public class FirmaApi {
    private final FirmaManager firmaManager;



    @PostMapping("/save")//localhost:8080/firma/save
    public void saveFirma(@RequestBody FirmaRequest firmaRequest){
        this.firmaManager.saveFirma(firmaRequest);

    }

    @DeleteMapping("/delete")//localhost:8080/firma/delete
    public void deleteFirma(@RequestParam int id){
        this.firmaManager.deleteFirma(id);
    }
    void updateFirma(FirmaUpdate firmaUpdate){
        this.firmaManager.updateFirma(firmaUpdate);
    }









    @GetMapping("/getFirmaByName")//localhost:8080/firma/getFirmaByName
   public FirmaResponse getFirmaByName(@RequestParam String fimaAd){
        return this.firmaManager.getFirmaByName(fimaAd);
    }


    @GetMapping("/getFirmaById")//localhost:8080/firma/getFirmaById
    public FirmaResponse getById(@RequestParam int id){
        return this.firmaManager.getById(id);
    }


}
