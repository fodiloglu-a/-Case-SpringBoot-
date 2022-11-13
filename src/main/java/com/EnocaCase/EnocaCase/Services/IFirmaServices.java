package com.EnocaCase.EnocaCase.Services;

import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaRequest;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaResponse;
import com.EnocaCase.EnocaCase.Dtos.Firmaa.FirmaUpdate;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;

import java.util.List;

public interface IFirmaServices {
    //-Firma Adı “Enoca” olan personelleri getirin


    FirmaResponse getFirmaByName(String name);
    FirmaResponse getById(int id);
    void saveFirma(FirmaRequest firmaRequest);
    void deleteFirma(int id);
    void updateFirma(FirmaUpdate firmaUpdate);

}
