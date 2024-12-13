package InterfaceOrnek;

public class Elma implements IMeyveler {

    @Override
    public void ekle() {
        System.out.println("Elma eklendi.");
    }
    @Override
    public void çıkar() {
        System.out.println("Elma çıkartıldı.");
    }
    @Override
    public void sayiGuncelle() {
        System.out.println("Elma sayisi güncellendi.");

    }
}
