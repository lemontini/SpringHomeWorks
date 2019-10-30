package com.montini.homework01.java.model;

public class NationalTeamTShirt extends TShirt {

    public NationalTeamTShirt(final String logo) {
        super.logo = logo;
    }

    @Override
    public String displays() {
        return this.logo;
    }
}
