/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.teletubby.gui;
import java.util.ResourceBundle;
import lib.teletubbies.*;
import java.io.*;
/**
 *
 * @author samis
 */
public class guiHelper {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("demos/teletubby/Bundle");
    String profile = "";
    Dipsy d = new Dipsy(50, SpeciesEnum.Dipsy, 70);
    int tubbyage = d.getTubbyAge();
    String age = new Integer(tubbyage).toString();
    int tubbyweight = d.getTubbyWeight();
    String weight = new Integer(tubbyweight).toString();
    String species = d.getSpecies();
    String pofood = d.getPoFoodFavorite();
    double tubbystrength = d.getStrength();
    String strength = new Double(tubbystrength).toString();
    boolean ishybrid = d.isHybrid();
    String gender = d.gender();
    String hybrid = new Boolean(ishybrid).toString();
    public void LoadProfile(File profile_file) {
        try {
            FileReader fr = new FileReader(profile_file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                if(line != null) {
                    profile = profile.concat(line);
                }
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            return;
        }
    }
    public guiHelper() {
        LoadProfile(new File("profile_dipsy.txt"));
    }
}
