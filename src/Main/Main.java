package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rubric r=new Rubric();
        r.add(new Contact("sas","bca",1241));
        r.add(new Contact("sos","hbc", 12341));
        r.add(new Contact("sos", "acsdf", 12421));
        System.out.println(r.OutPut());
        r.sort();
        System.out.println(r.OutPut());
        r.modify("bca");
        System.out.println(r.OutPut());
        r.remove("hbc");
        System.out.println(r.OutPut());

    }
}
