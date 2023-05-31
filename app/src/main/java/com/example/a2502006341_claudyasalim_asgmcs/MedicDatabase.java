package com.example.a2502006341_claudyasalim_asgmcs;

import java.io.Serializable;
import java.util.ArrayList;

public class MedicDatabase implements Serializable {

    private ArrayList<Medic> medicList = new ArrayList<>();

    public ArrayList<Medic> getMedicList() {
        return medicList;
    }

    public void addMedic(){

        medicList.add(new Medic(medicList.size()+1, R.drawable.obat_batuk,
                "Obat batuk", "Kalbe", 20000,
                "Menyembuhkan batuk & dahak ringan"));

        medicList.add(new Medic(medicList.size()+1, R.drawable.obat_flu,
                "Obat flu", "Kimia Farma", 50000,
                "Minum 3x sehari"));

        medicList.add(new Medic(medicList.size()+1, R.drawable.obat_demam,
                "Obat pil demam", "Kalbe", 20000,
                "Minum 2 pil sebanyak 2 kali sehari setelah makan, diminum dengan saran dokter"));
    }

    public Medic getMedic(int id){
        for (Medic medic: medicList) {
            if(medic.getId()==id){
                return medic;
            }
        }
        return null;
    }
}
