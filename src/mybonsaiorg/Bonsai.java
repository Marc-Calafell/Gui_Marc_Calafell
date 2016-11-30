
package mybonsaiorg;

import java.io.Serializable;

public class Bonsai implements Comparable<Bonsai>,Serializable{

    private static final long serialVersionUID = 1L;
    private int _1idBonsai;
    private String _2nomBonsai;
    private String _3nomBotBonsai;
    private String _4familiaBonsai;
    private String _5estilBonsai;
    
  

    public Bonsai(int _1idBonsai, String _2nomBonsai, String _3nomBotBonsai, String _4familiaBonsai, String _5estilBonsai) {
        this._1idBonsai = _1idBonsai;
        this._2nomBonsai = _2nomBonsai;
        this._3nomBotBonsai = _3nomBotBonsai;
        this._4familiaBonsai = _4familiaBonsai;
        this._5estilBonsai = _5estilBonsai;
    }
 
      
    @Override
    public int compareTo(Bonsai t) {
        return this._1idBonsai-t._1idBonsai;
    }
   
    public int get1idBonsai() {
        return _1idBonsai;
    }

    public void set1idBonsai(int _1idBonsai) {
        this._1idBonsai = _1idBonsai;
    }

    public String get2nomBonsai() {
        return _2nomBonsai;
    }

    public void set2nomBonsai(String _2nomBonsai) {
        this._2nomBonsai = _2nomBonsai;
    }

    public String get3nomBotBonsai() {
        return _3nomBotBonsai;
    }

    public void set3nomBotBonsai(String _3nomBotBonsai) {
        this._3nomBotBonsai = _3nomBotBonsai;
    }

    public String get4familiaBonsai() {
        return _4familiaBonsai;
    }

    public void set4familiaBonsai(String _4familiaBonsai) {
        this._4familiaBonsai = _4familiaBonsai;
    }

    public String get5estilBonsai() {
        return _5estilBonsai;
    }

    public void set5estilBonsai(String _5estilBonsai) {
        this._5estilBonsai = _5estilBonsai;
    }

 
    
    
    
    

    @Override
    public String toString() {
        return "_1idBonsai";
    }
    
    
}
