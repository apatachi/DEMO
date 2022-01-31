/**
 * Created by cdorofte on 1/12/2017.
 */

import org.junit.Test;

import java.util.ResourceBundle;

public class ProjectTest {

    @Test
    public void testMethod() {
        System.out.println("DEFINED PROPERTIES WORK!");
        System.out.println("SYSTEM PROPERTIES WORK: " + System.getProperty("value1"));

        ResourceBundle rb = ResourceBundle.getBundle("config");
        System.out.println(".PROPERTIES VALUES WORK: " + rb.getString("thisiskey1"));

    }
}
