package com.ensat.entities;
// Generated 13 janv. 2019 00:12:28 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Post generated by hbm2java
 */
@Entity
@Table(name = "post")
public class Post  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer idPost;
    @ManyToOne
     private Utilisateur utilisateur;
     private String description;
     private Date date;
     private String titre;

    public Post() {
    }

	
    public Post(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Post(Utilisateur utilisateur, String description, Date date, String titre) {
       this.utilisateur = utilisateur;
       this.description = description;
       this.date = date;
       this.titre = titre;
    }
   
    public Integer getIdPost() {
        return this.idPost;
    }
    
    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    
}


