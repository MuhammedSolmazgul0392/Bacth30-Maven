package day05;

import org.junit.Test;

public class C01_Notasyon {
    //Javadaki gibi selenium da da belirle islevleri yapan methodlar olusturabilriz
    // ancak bu method lar cagrilmadikca CALISMAZLAR
    public void ilkTestMethodu() {
        System.out.println("Ilk Test Methodumuz");
    }
    //JUnit ile notasyon kullanarak siradan method lari test methodu una donusturebiliriz
    //Bir Test methodu bagimsiz olarak calisabilen test yapmamiza imkan verir
    //@Test notasyonu sayesinde main method mecburiyeti ortadan kalkar
    @Test
    public void notasyonluIlkTestMethodu(){
        System.out.println("notasyonlu ilk test methodumuz");
    }
}
