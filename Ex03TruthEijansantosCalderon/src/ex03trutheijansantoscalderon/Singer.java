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

    Singer(String aspen, int i, int i0, Song mrloverman) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void performForAudience(int people){
        noOfPerformances += people;
        earnings += 100*people;
    }
    public void changeFavSong (Song favSong){
        favoriteSong = favSong;
    }
    
    public Singer (String sn, int nOP, double earn, Song fS){
        singername = sn;
        noOfPerformances = nOP;
        earnings = earn;
        favoriteSong = fS;
    }
}


