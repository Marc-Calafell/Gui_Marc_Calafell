/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybonsaiorg;

import java.util.ArrayList;

/**
 *
 * @author mark
 */
public class Tractament implements java.io.Serializable{

    private String _1IDBonsai;          //passat a string per poder fer-ho anar
    private String _2tipustractaments;
    private String _3motiutractament; 
    private ArrayList<Bonsai> _4Tractaments;

    public Tractament(String _1IDBonsai, String _2tipustractaments, String _3motiutractament) {
        this._1IDBonsai = _1IDBonsai;
        this._2tipustractaments = _2tipustractaments;
        this._3motiutractament = _3motiutractament;
        this._4Tractaments = _4Tractaments;
    }

    
    
    public String get1IDBonsai() {
        return _1IDBonsai;
    }

    public void set1IDBonsai(String _1IDBonsai) {
        this._1IDBonsai = _1IDBonsai;
    }

    public String get2tipustractaments() {
        return _2tipustractaments;
    }

    public void set2tipustractaments(String _2tipustractaments) {
        this._2tipustractaments = _2tipustractaments;
    }

    public String get3motiutractament() {
        return _3motiutractament;
    }

    public void set3motiutractament(String _3motiutractament) {
        this._3motiutractament = _3motiutractament;
    }

    public ArrayList<Bonsai> get4Tractaments() {
        return _4Tractaments;
    }

    public void set4Tractaments(ArrayList<Bonsai> _4Tractaments) {
        this._4Tractaments = _4Tractaments;
    }


    
 @Override
    public String toString() {
        return "_1idBonsai";
    }
    
       
    
}
