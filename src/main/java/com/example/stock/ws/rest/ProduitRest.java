package com.example.stock.ws.rest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.stock.Dao.ProduitDao;
import com.example.stock.bean.Produit;
import com.example.stock.service.facade.ProduitService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/produite-Api/Produit/")
public class ProduitRest {
@Autowired
private ProduitService produitService;
@Autowired
private ProduitDao produitDao;

@GetMapping("findByid/id/{id}")
public Produit findByid(@PathVariable Long id) {
	return produitService.findByid(id);
}
@GetMapping("findByName/name/{name}")
public Produit findByLibelle(@PathVariable String name) {
	return produitService.findByLibelle(name);
}
@GetMapping("findAll")
public List<Produit> findAll() {
	return produitService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Produit pr) {
	return produitService.save(pr);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return produitService.deleteById(id);
}

 
}
