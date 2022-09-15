/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03trutheijansantoscalderon;

/**
 *
 * @author local.admin
 */
public class Song {
   public String songname;
   public String genre;
   public int songpopularity;
   public int artistpopularity;
   public boolean albumsong;
   
    public Song (String n, String g, int sp, boolean as){
       songname = n;
       genre = g;
       songpopularity = sp;
       albumsong = as;
   }
}
