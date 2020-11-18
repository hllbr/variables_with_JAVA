
public class Main {
    public static void main(String[] args) {
        System.out.println("değişkenler");
        /*
        Javada çoklu yorum satırı ...
        JAVA diğer dillerde de olduğu gibi yorum satırları bulunan bir yapıya sahiptir yorum satırları derleyiciler tarafından görülmez ve okunmazlar...!!!
        JAVADA BİR MAİN METHODU OLUŞTURMAMIZ ŞARTTIR.
        main methodu olmadğı taktirde projelerimizi derleyemeyiz.
        java programı çalıştırıldığında bellekte bir yer ayrılır işlemler gerçekleştirilir ve program sonlandığında bu bellek silinir ve yok olurlar.
        veri tipleri ile belirlediğimiz değişkenler üzerinde depolamak istediğimiz veriyi depolayabiliyoruz.
        Python gibi dillerde değişken türü belirlenmeden direkt olarak değişkenler oluşturulabiliyor.
        Ancak JAVA,C dillerde değişkenin türünü direkt olarka belirtmemiz gerekmektedir.
        Değişkenler isimlendirilirken evrensel kurallar çerçevesinde isimlendirlimelidirler.
        Örneğin sayılar ile başlayarak değişken ismi belirlenmez
        JAVA bunu kesinlikle kabul etmez...
        
        */
        int a =  4;
        System.out.println("a değişkenimizin değeri = " +a);
        //Tekli Yorum Satırı...
        //direkt olarka değişkene değer atayabildiğimiz gibi aynı zamanda önce değişkeni oluşturup daha sonra değer atama işleminide gerçekleştirebiliriz.
        int b ;
        b = 5;
        System.out.println("b değişkenimizin değeri = " +b);
        //değişken tanımlamaları esnektir tek bir standart yöntemi bulunmamaktadır.
        int c = 3+5;
        System.out.println("c değişkenimizin değeri = " +c);
        
        int d = (c+b-a)*2;
        System.out.println("d değişkenimizin değeri = " +d);
        /*
        değişken belirlerken hata yaparsanız java sizi zaten uyarır.
        javada hem ingilizce hemde türkçe isimlendirmeler yapılabilir.
        Open Source projeler için türkçe karakter kullanmamak doğru bir yöntemdir.
        PYTHON da türkçe karakter kullanmak için utf-8 kullanılırken javada buna gerek yoktur.
        
        */
        a = 10;
        System.out.println("a nin yeni değeri = "+a);
        b = a*2;
        System.out.println("b nin yeni değeri = "+b);
        c = b-3;
        System.out.println("c nin yeni değeri = "+c);
        int toplam =a+b+c;
        System.out.println("toplam değişkenimizin değeri == " +toplam);
        
    }
    
}
