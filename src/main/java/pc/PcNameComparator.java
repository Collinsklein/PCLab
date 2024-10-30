package pc;

import java.util.Comparator;

public class PcNameComparator implements Comparator<PC> {
    @Override
    public int compare(PC o1, PC o2) {
        return o1.getMonitor().compareTo(o2.getMonitor());
    }
//    @Override
//    public int compare(PC o1, PC o2) {
//        return o1.getPcCase().compareTo(o2.getPcCase());
//    }
}
