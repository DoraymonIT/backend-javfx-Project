package com.example.stock.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
Produit findByLibelle(String libelle);

}
	