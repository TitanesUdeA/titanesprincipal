package com.CRUDtitanes.titanes.service;

import com.CRUDtitanes.titanes.model.Enterprise;
import com.CRUDtitanes.titanes.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EnterpriseService {

    @Autowired
    EnterpriseRepository enterpriseRepository;

    //Metodos
    public void create_UpdateEnterprise(Enterprise enterprise){

        enterpriseRepository.save(enterprise);
    }

    public List<Enterprise> verEnterprise(){
        List<Enterprise> enterprises = new ArrayList<>();
        enterprises.addAll(enterpriseRepository.findAll());
        return enterprises;
    }

    public void deleteEnterprise(Long id){
        enterpriseRepository.deleteById(id);
    }


}
