package pc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC();
        pc.description();

        pc.powerUp();
        List<PC> pc1 = new ArrayList<>();
        pc1.add(new PC());

        PcNameComparator nameComparator = new PcNameComparator();
        Collections.sort(pc1,nameComparator);


    }
}
