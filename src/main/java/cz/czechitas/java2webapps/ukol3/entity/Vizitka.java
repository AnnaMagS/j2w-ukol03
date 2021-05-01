package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    private String name;
    private String firma;
    private String ulice;
    private String PSC;
    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;


    public Vizitka() {
    }

    public Vizitka(String name, String firma, String ulice, String PSC, String email, String telefon, String web) {
        this.name = name;
        this.firma = firma;
        this.ulice = ulice;
        this.PSC = PSC;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
        this.celaAdresa = ulice + " " + PSC;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getPSC() {
        return PSC;
    }

    public void setPSC(String PSC) {
        this.PSC = PSC;
    }

    public String getCelaAdresa() {
        return ulice + " " + PSC;
    }


    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
