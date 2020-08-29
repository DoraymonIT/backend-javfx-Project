package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.Produit;

public interface ProduitService {
	Produit findByid(Long id);
	Produit findByLibelle(String libelle);
	List<Produit> findAll();
	int save(Produit produit);
	int deleteById(Long id);
}
