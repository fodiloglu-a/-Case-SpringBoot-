package com.EnocaCase.EnocaCase.Repository;

import com.EnocaCase.EnocaCase.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonelDao  extends JpaRepository<Personel,Long> {
    @Query("select p from Personel p where p.personelAd = ?1")
    List<Personel> findByPersonelAd(String personelAd);

    @Query("select p from Personel p where p.firma.firmaAd = ?1")
    List<Personel> findByFirma_FirmaAd(String firmaAd);

}
