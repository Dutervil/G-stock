/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wadson.gstock.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wadson Dutervil
 */
@Entity
public class Category implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     private String nom;

    public Category() {
    }

    public Category(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
     
     
    
}
