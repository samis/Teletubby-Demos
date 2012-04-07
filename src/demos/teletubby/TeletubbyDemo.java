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
    Integer myint = new Integer(tubbyage);
    String age = myint.toString();
    int tubbyweight = d.getTubbyWeight();
    Integer myint2 = new Integer(tubbyweight);
    String weight = myint2.toString();
    String species = d.getSpecies();
}
