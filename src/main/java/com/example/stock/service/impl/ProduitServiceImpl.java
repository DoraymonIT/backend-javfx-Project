package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.ProduitDao;
import com.example.stock.bean.Produit;
import com.example.stock.service.facade.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
@Autowired
private ProduitDao produitDao;


@Override
public int save(Produit produit) {
	if(findByid(produit.getId())!= null) {
return -1;
}else {
	produitDao.save(produit);
		return 1;
}
	}

@Override
public Produit findByid(Long id) {
	if (produitDao.findById(id).isPresent()) {
		return produitDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	produitDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}



@Override
public List<Produit> findAll() {
	return produitDao.findAll();
}

@Override
public Produit findByLibelle(String libelle) {
	return produitDao.findByLibelle(libelle);
}




}
