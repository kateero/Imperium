package mephi.b22901.saver.imperium.Model;

public class Eretic {
    private String name;
    private String crimes;
    private String Location;
    private Integer uniqueID;
    private String threatLevel;
   
    public void setName(String name){
       this.name = name;
   }
    
    public void setCrimes(String crimes){
       this.crimes = crimes;
   }
   
    public void setLocation(String Location){
       this.Location = Location;
   }
    
    public void setUniqueID(Integer uniqueID){
       this.uniqueID = uniqueID;
   }
    
    public void setThreatLevel(String threatLevel){
       this.threatLevel = threatLevel;
   }
    
    public String getName(){
        return name;
    }
   
    @Override
    public String toString(){
        return "\nName:\t" + name + "\n\nCrime:\t" + crimes + "\n\nLast location:\t" + Location + "\n\nID:\t" 
                + uniqueID + "\n\nThreat level:\t" + threatLevel; 
    }
} 

