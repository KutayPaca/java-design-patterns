# Strategy Pattern

##  Strategy Pattern Nedir?
**Strategy**, aynı işi yapan fakat farklı yolları/algoritmaları olan davranışları ayrı sınıflara koyup, ortak bir arayüz üzerinden birbirinin yerine geçebilir hale getiren **davranışsal (behavioral)** bir tasarım desenidir.

- **Kompozisyon** kullanır (context içine bir strateji enjekte edilir).
- **Çalışma zamanında (runtime)** strateji değiştirilebilir.
- **Open/Closed Principle (OCP)**'ye uygundur (yeni strateji eklemek kolaydır, mevcut kodu değiştirmez).

---

##  Neden Strategy Kullanmalıyım?

1. **If–else / switch çöplüğünden kurtulmak için**
    - Farklı yöntemleri tek yerde toplamak yerine her birini bağımsız sınıflar yapar.

2. **Davranışı runtime’da değiştirmek için**
    - Kullanıcı ayarına, konfigürasyona veya koşullara göre algoritma anında değişebilir.

3. **Açık/Kapalı İlkesi (OCP)**
    - Yeni strateji eklemek için sadece yeni bir sınıf eklersin. Mevcut kod bozulmaz.

4. **Test edilebilirlik**
    - Her strateji ayrı ayrı test edilebilir.

5. **Bağımlılıkların yönetimi**
    - Context sadece arayüzü bilir, algoritmanın detayını bilmez → gevşek bağlılık.

---

## “Burada Strategy Kullanmalıyım” Demek İçin Kontrol Listesi

- Aynı görevi yapan birden fazla algoritma/yöntem var mı?
- Bu yöntemler koşullara göre değişecek mi?
- Yeni yöntem ekleme ihtimali yüksek mi?
- Kodda uzun if-else veya switch zinciri var mı?
- Stratejileri birbirinden bağımsız test etmek istiyor musun?
- Davranışı runtime’da değiştirme ihtiyacın var mı?

Eğer bunlardan 3 veya daha fazlası "evet" ise → Strategy pattern düşünülmeli.

---

## Strategy Pattern’in Önemli Özellikleri
- Algoritma ailesini kapsüller.
- Her algoritma ayrı sınıfta, tek sorumluluk ilkesine uygun.
- Context algoritmayı bilmez, sadece arayüz üzerinden çalışır.
- Runtime’da strateji değiştirilebilir.
- Yeni algoritma eklemek kolaydır.

---

##  Strategy Pattern Nasıl Kullanılır?

### 1. Arayüz Tanımla
```java
public interface PaymentStrategy {
    void pay(int amount);
}
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " TL kredi kartıyla ödendi.");
    }
}
```
### 2. Strateji Implementasyonlarını Yaz

```java
public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " TL Paypal ile ödendi.");
    }
}
```
### 3. Context Sınıfı
```java
public class ShoppingCart {
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}
```
### 4. Kullanım

```java
ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
cart.checkout(100); // Kredi kartıyla ödeme

cart.setStrategy(new PaypalPayment());
cart.checkout(200); // Paypal ile ödeme
```

## Ne Zaman Kullanılmamalı?

- Eğer tek bir yöntem varsa ve değişme ihtimali yoksa.
- Küçük ve tek seferlik işlerde.
- Stratejiler aşırı bağlıysa (çok ortak state paylaşıyorsa).

---

## Strategy Pattern Örnek Kullanım Senaryoları

- Ödeme sistemleri (kredi kartı, PayPal, kripto).
- Sıralama algoritmaları (QuickSort, MergeSort, BubbleSort).
- Dosya sıkıştırma (zip, rar, 7z).
- Şifreleme yöntemleri (AES, RSA, SHA).
- Oyunlarda hareket/atak stilleri (agresif AI, defansif AI).
- Loglama (konsola, dosyaya, veritabanına).

---

## Strategy ve Polymorphism

- **Polymorphism**: Dilin özelliği; farklı implementasyonları tek tip üzerinden çağırabilirsin.
- **Strategy**: Bu özelliği bir **tasarım amacına** göre organize eder → algoritmalar değiştirilebilir hale gelir.

---

## Özet

- **Ne?** Farklı algoritmaları ortak arayüzle kapsülleyen tasarım deseni.
- **Neden?** If-else karmaşasından kurtul, algoritmaları kolay değiştir, yeni eklemeleri basitleştir.
- **Nasıl?** Arayüz → Implementasyonlar → Context → Runtime seçim.
- **Ne zaman?** Bir işin birden fazla yolu varsa ve bunlar koşula göre değişecekse.  



