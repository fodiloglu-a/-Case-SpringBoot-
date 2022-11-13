package com.EnocaCase.EnocaCase.Services;

import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaRequest;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaResponse;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaUpdate;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;
import com.EnocaCase.EnocaCase.Model.Firma;
import com.EnocaCase.EnocaCase.Model.Personel;
import com.EnocaCase.EnocaCase.Repository.IFirmaDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FirmaManager implements IFirmaServices {
    private final IFirmaDao firmaDao;
    private final ModelMapper modelMapper;






    //-Firma Adı “Enoca” olan personelleri getirin



    @Override
    public FirmaResponse getFirmaByName(String firmaAd) {
      Firma firma=  this.firmaDao.findByFirmaAd(firmaAd);
      FirmaResponse firmaResponse=this.modelMapper.map(firma,FirmaResponse.class);
      return firmaResponse;

    }

    @Override
    public FirmaResponse getById(int id) {
        Firma firma= this.firmaDao.findAll().get(id);
        FirmaResponse firmaResponse=this.modelMapper.map(firma,FirmaResponse.class);
        return firmaResponse;
    }

    @Override
    public void saveFirma(FirmaRequest firmaRequest) {
        Firma firma=this.modelMapper.map(firmaRequest,Firma.class);
        this.firmaDao.save(firma);
    }

    @Override
    public void deleteFirma(int id) {
        Firma firma=this.firmaDao.findAll().get(id);
        this.firmaDao.delete(firma);;


    }

    @Override
    public void updateFirma(FirmaUpdate firmaUpdate) {
        Firma firma= this.firmaDao.findAll().get(firmaUpdate.getUpdateId());
        firma.setFirmaAd(firmaUpdate.getFirmaAd());
        firma.setFirmaAdres(firmaUpdate.getFirmaAdres());
        firma.setFirmaWebSite(firmaUpdate.getFirmaWebSite());
        this.firmaDao.save(firma);

    }
}

