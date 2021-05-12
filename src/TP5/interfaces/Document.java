package TP5.interfaces;

import TP5.exceptions.AuteurException;

public interface Document {

    void ajoutAuteur(String auteur) throws AuteurException;

    void suppresionAuteur(String auteur) throws AuteurException;
}
