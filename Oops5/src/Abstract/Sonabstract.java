package Abstract;

import Abstract.ParentAbstract;

public class Sonabstract extends ParentAbstract {

    @Override
    void career(String name) {
        System.out.println("The name of the champion is " +name);
    }
    
}
