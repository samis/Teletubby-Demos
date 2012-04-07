/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.teletubby;
import lib.teletubbies.*;
/**
 *
 * @author samis
 */
public class TeletubbyDemo {
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
    boolean isfemale = d.isFemale();
    String gender = new Boolean(isfemale).toString();
    String hybrid = new Boolean(ishybrid).toString();
}
