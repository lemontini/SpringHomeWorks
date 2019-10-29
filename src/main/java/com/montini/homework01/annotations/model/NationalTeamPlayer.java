package com.montini.homework01.annotations.model;

public class NationalTeamPlayer extends Footballer {

    private TShirt countryTshirt = null;

    public NationalTeamPlayer(String name) {
        super(name);
    }

    public String wears( final NationalTeamTShirt countryLogo) {

        this.countryTshirt = countryLogo;
        return this.getName() + " wears " + countryLogo.displays() + "'s colours.";

    }

    @Override
    public String toString() {

        return super.toString() + " plays for " + countryTshirt.displays();

    }

}
