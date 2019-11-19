package _11SharpieSet;

import _04Sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> nameSharpieSet = new ArrayList<>();

    public SharpieSet() {
    }

    public SharpieSet(List<Sharpie> nameSharpieSet) {
        this.nameSharpieSet = nameSharpieSet;
    }

//    public void add(Sharpie name) {
//        this.nameSharpieSet.add(name);
//    }

//    public int size() {
//        return this.nameSharpieSet.size();
//    }
//
//    public String get(int index) {
//        return this.nameSharpieSet.get(index);
//    }

    public int countUsable() {
        int counterOfUsable = 0;
        for (int i = 0; i < nameSharpieSet.size(); i++) {
            if (nameSharpieSet.get(i).inkAmount != 0) {
                counterOfUsable ++;
            }
        }
        return counterOfUsable;
    }

    public void removeTrash() {
        for (int i = 0; i < nameSharpieSet.size(); i++) {
            if (nameSharpieSet.get(i).inkAmount == 0){
                nameSharpieSet.remove(i);           // indexek változnak így?
                i--;
            }
        }
    }
}
