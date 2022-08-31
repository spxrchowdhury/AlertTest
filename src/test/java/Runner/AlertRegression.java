package Runner;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import tests.Add_Alert_Test;
import tests.Clone_Alert_Test;
import tests.Edit_Alert_Test;
import tests.Execute_Test;

public class AlertRegression {
    @Test
    @Factory
    public Object[] RunTests(){
        return   new Object[]{ new Add_Alert_Test(), new Clone_Alert_Test(), new Edit_Alert_Test(), new Execute_Test()};


    }
}
