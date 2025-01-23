package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public  void metodaTest(){
        Avion avion1 = new Avion("pasageri","Boeing",
                "B-127",260,"kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("pasageri","Boeing",
                "B-180",300,"eco");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("pasageri","Airbus",
                "A-180",280,"kerosen",50);
        avion3.prezentareAvion();

    }
}
