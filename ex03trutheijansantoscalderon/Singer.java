/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03trutheijansantoscalderon;

/**
 *
 * @author local.admin
 */
public class Singer {
    public String singername;
    public int noOfPerformances;
    public double earnings;
    public Song favoriteSong;
    
    public void performForAudience(int people){
        noOfPerformances += people;
        earnings += 100*people;
        System.out.println("The singer named " + singername + " performed for " + people + " people, and earned " + earnings + " pesos.");
    }
    public void changeFavSong (Song favSong){
        favoriteSong = favSong;
        System.out.println("The singer named " + singername + " changed their favorite song to " + favoriteSong + "!");
    }
    
    public Singer (String sn, int nOP, double earn, Song fS){
        singername = sn;
        noOfPerformances = nOP;
        earnings = earn;
        favoriteSong = fS;
    }
}


