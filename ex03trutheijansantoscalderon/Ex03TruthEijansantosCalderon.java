/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03trutheijansantoscalderon;

/**
 *
 * @author local.admin
 */
public class Ex03TruthEijansantosCalderon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diablo3Character jalla = new Diablo3Character ("Jalla", "Monk", 70);
        Diablo3Character orcus = new Diablo3Character ("Orcus", "Necromancer", 67);
        Diablo3Character will = new Diablo3Character ("Will", "Wizard", 1);
        
        System.out.println("Character Name: " + jalla.charactername + "\n" + "Character Class: " + jalla.characterclass + "\n" + "Character Level: " + jalla.characterlevel + "\n");
        System.out.println("Character Name: "+ orcus.charactername + "\n" + "Character Class: " + orcus.characterclass + "\n" + "Character Level: " + orcus.characterlevel + "\n");
        System.out.println("Character Name: " + will.charactername + "\n" + "Character Class: " + will.characterclass + "\n" + "Character Level: " + will.characterlevel);
        
        Song mrloverman = new Song("Mr. Loverman", "Indie Pop", 0, true);
        Song devildoesntbargain = new Song("Devil Doesn't Bargain", "Indie Pop", 95, true);
        
        Singer aspen = new Singer("Aspen", 0, 0, mrloverman);
        
        aspen.performForAudience(12);
        aspen.changeFavSong(devildoesntbargain);
    }
    
}
