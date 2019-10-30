package com.montini.homework01.java.model;

import org.springframework.beans.factory.annotation.Value;

abstract public class TShirt {

    protected String logo = "nologo";

    abstract String displays();
}
