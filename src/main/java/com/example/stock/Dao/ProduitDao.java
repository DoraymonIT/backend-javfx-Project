package com.example.stock.Dao;


import com.example.stock.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
    Produit findByLibelle(String libelle);

}
	