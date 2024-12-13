package InterfaceOrnek;

public class Manav {
    public void ekleMeyveler(IMeyveler meyveler){
        meyveler.ekle();
    }
    public void cikarMeyveler(IMeyveler meyveler){
        meyveler.çıkar();
    }
    public void guncelleMeyveler(IMeyveler meyveler){
        meyveler.sayiGuncelle();
    }
}
