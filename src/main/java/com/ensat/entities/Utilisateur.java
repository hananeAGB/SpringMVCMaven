package com.ensat.entities;
// Generated 13 janv. 2019 00:12:28 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer idUser;
     private String nom;
     private String prenom;
     private String profession;
     private String photo;
     @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="idUser")
    private Set<Post> posts;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String profession, String photo, Set posts) {
       this.nom = nom;
       this.prenom = prenom;
       this.profession = profession;
       this.photo = photo;
       this.posts = posts;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getProfession() {
        return this.profession;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Set getPosts() {
        return this.posts;
    }
    
    public void setPosts(Set posts) {
        this.posts = posts;
    }




}


