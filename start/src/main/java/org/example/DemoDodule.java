package org.example;


public class DemoDodule {

    private String version;
    private String name;


    public String exeM() {
        return version + name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
