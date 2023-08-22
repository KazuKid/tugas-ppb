package com.example.menumakan;

import java.util.ArrayList;

public class MenuData {
    private static final String [] namaMenu = {
            "Nasi Goreng",
            "Ayam Goreng",
            "Bakmi Goreng",
            "Bakso",
            "Bebek Goreng",
            "Burger",
            "Cumi Goreng",
            "Udang Goreng",
            "Mie Ayam",
            "Omelet"


    };

    private static final String [] menuDetail = {
            "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin atau mentega.",
            "Ayam Goreng atau ayam goreng tepung adalah hidangan yang dibuat dari potongan daging ayam yang telah dilapisi dengan tepung atau adonan encer yang dibumbui dan digoreng, digoreng rendam, digoreng dengan penggorengan bertekanan, atau digoreng udara.",
            "Mi goreng berarti mi yang digoreng adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.",
            "Bebek goreng adalah daging bebek yang digoreng dan dihidangkan dengan lalapan (sayuran segar).",
            "Hamburger atau burger adalah sejenis roti berbentuk bundar yang diiris dua, dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai.",
            "Cumi goreng adalah makanan cumi-cumi yang digoreng dengan lezat.",
            "Udang goreng adalah makanan udang yang digoreng dengan lezat.",
            "Mie Ayam adalah hidangan khas Indonesia yang terbuat dari mie gandum yang dibumbui dengan daging ayam yang biasanya dipotong dadu.",
            "Telur dadar atau omelet adalah variasi hidangan telur goreng yang disiapkan dengan cara mengocok telur dan menggorengnya dengan minyak goreng atau mentega panas pada sebuah wajan."
    };
    private static final int[] menuImage = {
            R.drawable.nasigoreng,
            R.drawable.ayamgoreng,
            R.drawable.bakmigoreng,
            R.drawable.bakso,
            R.drawable.bebekgoreng,
            R.drawable.burger,
            R.drawable.cumigoreng,
            R.drawable.udanggoreng,
            R.drawable.mieayam,
            R.drawable.omelet
    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for (int position = 0; position <namaMenu.length; position++) {
            Menu menu = new Menu();
            menu.setName(namaMenu[position]);
            menu.setDetail(menuDetail[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    }
}
