package Application.Modele;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tremie 
{

    private boolean plein;

    //Constructeur
    public Tremie(boolean p) 	
        {	
		this.plein=p;
	}
    
    public Tremie()
    {
        this.plein = false;
    }
    
    //Methodes
    public Cereale trie(double NoLot){
        return null;
    }
    
    //Get-set 
    public boolean getPlein()
	{
		return this.plein;
	}
    
    public void setPlein(boolean plein) {
        this.plein = plein;
    }
 
}
