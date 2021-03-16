package com.company;

public class HtmlTag implements AutoCloseable {
    String znacznik;
    String znacznikKonczacy;
    public HtmlTag(String znacznik){
        this.znacznik = "<"+znacznik+">";
        znacznikKonczacy = "</"+znacznik+">";
        System.out.println(this.znacznik);
    }
    public void body(String text){
        System.out.println(text);

    }

    @Override
    public void close() throws Exception {
        System.out.println(znacznikKonczacy);
    }
}
