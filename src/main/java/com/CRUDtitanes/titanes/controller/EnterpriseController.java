package com.CRUDtitanes.titanes.controller;

import com.CRUDtitanes.titanes.model.Enterprise;
import com.CRUDtitanes.titanes.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/enterprise")
    private List<Enterprise> verEnterprise(){
        return enterpriseService.verEnterprise();
    }

    @PostMapping("/enterprise")
    private void createEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.create_UpdateEnterprise(enterprise);
    }

    @DeleteMapping("/enterprise/{id}")
    private void deleteEnterprise(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
    }

    @PutMapping("/enterprise")
    private void editarEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.create_UpdateEnterprise(enterprise);
    }
}
