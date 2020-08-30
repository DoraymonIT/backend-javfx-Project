package com.example.stock.service.facade;

import com.example.stock.bean.Produit;

import java.util.List;

public interface ProduitService {
    Produit findByid(Long id);

    Produit findByLibelle(String libelle);

    List<Produit> findAll();

    int save(Produit produit);

    int deleteById(Long id);
}
