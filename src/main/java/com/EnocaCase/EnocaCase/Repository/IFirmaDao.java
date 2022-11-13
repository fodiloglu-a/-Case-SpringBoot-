package com.EnocaCase.EnocaCase.Repository;

import com.EnocaCase.EnocaCase.Model.Firma;
import com.EnocaCase.EnocaCase.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFirmaDao extends JpaRepository<Firma,Long> {
    Firma findByFirmaAd(String firmaAd);

//    List<Personel>findPersonelByFirmaAd(String firmaAd);



}
