/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.github.ekeane21.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paraic
 */
public class part1Test {
    
    public part1Test() {
    }
    
        // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void nameteste() {
    Student john = new Student("john","030394",22);
    
    String testing =john.getusername();
    System.out.println("Test result: "+testing);
    String expected = ("john030394");
    System.out.println("Expected result: " + expected);
    
    }
}
