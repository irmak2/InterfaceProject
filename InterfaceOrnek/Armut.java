package InterfaceOrnek;

public class Armut implements IMeyveler {
    @Override
    public void ekle() {
        System.out.println("Armut eklendi.");
    }

    @Override
    public void çıkar() {
        System.out.println("Armut çıkartıldı.");
    }

    @Override
    public void sayiGuncelle() {
        System.out.println("Armut sayisi güncellendi.");

    }
}
