package com.EnocaCase.EnocaCase.Services;

import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelRequest;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelResponse;
import com.EnocaCase.EnocaCase.Dtos.Personel.PersonelUpdate;
import com.EnocaCase.EnocaCase.Model.Firma;
import com.EnocaCase.EnocaCase.Model.Personel;
import com.EnocaCase.EnocaCase.Repository.IFirmaDao;
import com.EnocaCase.EnocaCase.Repository.IPersonelDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor

public class PersonelManger implements  IPersonelServices{
    private final IPersonelDao iPersonelDao;
    private final ModelMapper modelMapper;
    private final IFirmaDao iFirmaDao;



    //-Personel tablosuna bir personel ekleyin, Firması boş olsun
    @Override
    public void addPersonel(PersonelRequest personelRequest) {


        //Model mapper bug dolayısı ile teker teker kayıt edilmiştir.
        //Personel personel=this.modelMapper.map(personelRequest,Personel.class);
        Personel personel=new Personel();
        Firma firma=this.iFirmaDao.findAll().get(personelRequest.getFirmaId());
        personel.setFirma(firma);
        personel.setPersonelSoyad(personelRequest.getPersonelSoyad());
        personel.setPersonelAd(personelRequest.getPersonelAd());
        personel.setPersonelPuan(personelRequest.getPersonelPuan());

        this.iPersonelDao.save(personel);

    }

    @Override
    public void deleteById(int id) {
        Personel personel=this.iPersonelDao.findAll().get(id);
        this.iPersonelDao.delete(personel);

    }

    @Override
    public void updatePersonel(PersonelUpdate personelUpdate) {

        Personel personel=this.iPersonelDao.findAll().get(personelUpdate.getUpdateId());
        personel.setPersonelAd(personelUpdate.getPersonelAd());
        personel.setPersonelPuan(personelUpdate.getPersonelPuan());
        Firma firma=this.iFirmaDao.findAll().get(personelUpdate.getFirmaId());
        personel.setFirma(firma);
        personel.setPersonelSoyad(personelUpdate.getPersonelSoyad());

        this.iPersonelDao.save(personel);

    }

    @Override
    public PersonelResponse getPersonelById(int id) {
        Personel personel=this.iPersonelDao.findAll().get(id);
        PersonelResponse personelResponse=this.modelMapper.map(personel,PersonelResponse.class);

        return personelResponse;
    }





    //-Personel Adı “Ahmet” olan Personelleri siliniz.
    @Override
    public void deletePersonelByName(String name) {
        List<Personel> personels=this.iPersonelDao.findByPersonelAd(name);

        for (Personel personel : personels) {
            this.iPersonelDao.delete(personel);

        }


    }




    //-Personel Adı “Ahmet” olan Personellerin personelPuanlarını 0 olarak güncelleyin.
    @Override
    public void updatePersonelPuan(String name) {
        List<Personel> personels=this.iPersonelDao.findByPersonelAd(name);
        for (Personel personel : personels) {
            personel.setPersonelPuan(0);
            this.iPersonelDao.save(personel);

        }


    }








    //-Firma Adı “Enoca” olan personelleri getirin
    @Override
    public List<PersonelResponse> findByFirmaAd(String firmaAd) {
        List<PersonelResponse> personelResponses=new ArrayList<>();
        List<Personel>personels=this.iPersonelDao.findByFirma_FirmaAd(firmaAd);
        for (Personel personel : personels) {
            PersonelResponse personelResponse=this.modelMapper.map(personel,PersonelResponse.class);
            personelResponses.add(personelResponse);
        }

        return personelResponses;
    }
}
