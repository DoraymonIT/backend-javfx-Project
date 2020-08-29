package com.example.stock.bean;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String libelle;
private Long price;
private String categorie;

public Produit() {
	super();
	// TODO Auto-generated constructor stub
}


public Produit(Long id, String libelle, Long price, String categorie) {
	super();
	this.id = id;
	this.libelle = libelle;
	this.price = price;
	this.categorie = categorie;
}








public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Long getPrice() {
	return price;
}
public String getCategorie() {
	return categorie;
}



public void setCategorie(String categorie) {
	this.categorie = categorie;
}



public void setPrice(Long price) {
	this.price = price;
}






@Override
public String toString() {
	return "Produit [id=" + id + ", libelle=" + libelle + ", price=" + price + ", categorie=" + categorie + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;

	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produit other = (Produit) obj;
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
		return false;

	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (libelle == null) {
		if (other.libelle != null)
			return false;
	} else if (!libelle.equals(other.libelle))
		return false;
	return true;
}



}
