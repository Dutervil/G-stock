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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 

/**
 *
 * @author Wadson Dutervil
 */
@Entity
public class Produit implements Serializable {
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String description;
    private double prix_achat_unite;
    private double prix_vente_unite;
    private int quantite;
    private String mois;
    private String jour;
    private String annee;
    @OneToOne
    @JoinColumn(name = "Id_category")
    private Category category;
    
}
