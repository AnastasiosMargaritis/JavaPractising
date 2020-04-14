package com.generics;

import com.generics.employee.AdidasEmployee;
import com.generics.employee.Business;
import com.generics.employee.Store;

public class Main {

    public static void main(String[] args) {
        Business<Store<AdidasEmployee>> Adidas = new Business<>("Adidas");

        Store<AdidasEmployee> george = new Store<>("George");
        Store<AdidasEmployee> panos = new Store<>("Panos");
        Store<AdidasEmployee> nikos = new Store<>("Nikos");

        george.shirtSales(15);
        panos.shirtSales(30);
        nikos.shirtSales(0);

        Adidas.addStore(george);
        Adidas.addStore(panos);
        Adidas.addStore(nikos);

        Adidas.showBestBusiness();

    }
}
