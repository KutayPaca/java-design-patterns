# Facade Pattern

## Facade Pattern Nedir?
**Facade Pattern (Cephe Deseni)**, yapısal (structural) tasarım desenlerinden biridir.  
Amaç; **karmaşık sistemleri dış dünyaya daha basit ve tek bir arayüz ile sunmaktır**.

Bir sistemin içinde birçok farklı sınıf, metod veya alt sistem olabilir. İstemci (client) bu sınıfların tüm detaylarını bilmek zorunda kalmadan, sadece **tek bir Facade sınıfı** üzerinden bu işlemleri çağırabilir.

> Kısacası Facade Pattern: "Sistemin içindeki karmaşık yapıları saklar, dışarıya sade bir kapı açar."

---

## Neden Facade Pattern Kullanılır?

1. **Basitleştirme:**  
   Kullanıcıya gereksiz detayları açmadan sadece ihtiyacı olan fonksiyonları sunar.

2. **Bağımlılığı Azaltma (Loose Coupling):**  
   İstemci, alt sistemdeki sınıfları doğrudan kullanmak zorunda kalmaz. Yalnızca Facade’a bağımlı olur.

3. **Bakım Kolaylığı:**  
   Alt sistemde değişiklik yapılsa bile Facade arayüzü sabit kalır. Dış dünyadaki kod etkilenmez.

4. **Okunabilirlik:**  
   Kod daha temiz ve anlaşılır hale gelir. Kullanıcı neyin nerede olduğunu araştırmak zorunda kalmaz.

5. **Test Kolaylığı:**  
   Facade sınıfı üzerinden test yapmak daha kolaydır çünkü alt sistemin tüm detaylarına tek noktadan ulaşılır.

---

## Ne Zaman Kullanılmalıdır?

- **Alt sistem çok fazla sınıf ve metod içeriyorsa** ve bunların kullanımı karmaşıksa
- Kullanıcıya yalnızca **belirli işlevleri** göstermek istiyorsak
- Bir **kütüphane veya framework** kullanıyorsak ve bunu projeye daha basit sunmak istiyorsak
- Büyük projelerde modülleri birbirinden **ayırmak** ve bağımlılıkları azaltmak gerekiyorsa

---

## Kullanılmaması Gereken Durumlar

- Eğer sistem zaten **küçük ve basitse**, Facade gereksiz katman ekler.
- Yanlış tasarlanırsa, tüm işleri Facade’a yükleyerek **God Object** (her şeyi bilen dev sınıf) yaratılabilir.
- Fazla soyutlama, projenin **gereksiz karmaşık görünmesine** yol açabilir.

---

## Facade Pattern'in Avantajları
- Kullanımı kolay ve sade bir arayüz sağlar.
- Alt sistemdeki bağımlılıkları gizler.
- Büyük ve karmaşık kod tabanlarını düzenlemeye yardımcı olur.
- Dışarıdan bakıldığında sistemin **daha anlaşılır** görünmesini sağlar.

---

## Facade Pattern'in Dezavantajları
- Gereksiz yere kullanılırsa projeyi şişirir.
- Tüm işlevler tek noktada toplanırsa **esneklik azalır**.
- Yanlış kullanıldığında alt sistemin gücü ve esnekliği gizlenebilir.

---

## Diğer Tasarım Desenleri ile Karşılaştırma

- **Adapter Pattern:** Uyumsuz iki sınıfın arayüzünü uyumlu hale getirir. Facade ise zaten uyumlu olan ama karmaşık bir sistemi basitleştirir.
- **Proxy Pattern:** Aynı arayüzü sağlar ama ek işlevler (cache, güvenlik, erişim kontrolü vb.) ekler. Facade sadece basit bir kapıdır.
- **Mediator Pattern:** Objeler arasındaki iletişimi yönetir. Facade ise sistemin dışarıya açılan yüzünü düzenler.

---

## Örnek Senaryolar

- **Dosya İşlemleri:** Dosya açma, okuma, yazma, kapama gibi fonksiyonlar ayrı ayrı sınıflarda olabilir. Facade bunları tek metodda birleştirip dışarıya “dosyaYaz(…)” gibi bir fonksiyon sunar.
- **Veritabanı İşlemleri:** Bağlantı açma, sorgu çalıştırma, kapatma gibi işlemler Facade sınıfıyla sadeleştirilebilir.
- **Multimedya Uygulaması:** Ses, video ve grafik işlemleri tek tek alt sistemlerde olur ama Facade bunları tek `oynat()` metodu ile başlatabilir.

---

## Özet

- **Facade Pattern = Karmaşık sistemi basitleştiren tek kapı**
- **Avantajları:** Basitlik, bağımlılığı azaltma, bakım kolaylığı, okunabilirlik, test kolaylığı
- **Dezavantajları:** Gereksiz soyutlama, God Object riski
- **En uygun kullanım alanı:** Karmaşık sistemleri sadeleştirmek ve istemciye kolay bir arayüz sunmak  

