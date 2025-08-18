# Builder Pattern

**Builder Pattern**, özellikle **karmaşık nesnelerin oluşturulmasını kolaylaştırmak** için kullanılan bir tasarım desenidir. Üç ana amacı vardır:

1. **Immutable nesneler oluşturmak**  
2. **Constructor cehenneminden kurtulmak**  
3. **Kod tekrarını azaltmak**  

---

## Immutable Nesneler Nasıl Sağlanır?

Immutable nesneler, oluşturulduktan sonra **değiştirilemeyen** nesnelerdir. Örneğin bir `Pizza` sınıfını ele alalım:

- Sınıftaki alanlar `private final` olarak tanımlanır.
- Nesnede `setter` metotları bulunmaz.
- Constructor yalnızca Builder aracılığıyla veri alır.
- Nesne oluşturulduktan sonra alanları değiştirilemez.

---

## Builder'ın Rolü

Builder pattern burada iki büyük kolaylık sağlar:

1. **Çok parametreli immutable nesneleri okunabilir bir şekilde oluşturmak**  
2. **Final alanları, constructor parametre karmaşasını gizleyerek nesne oluşturmayı basitleştirmek**

---

### Özet

- Karmaşık nesneleri adım adım ve okunabilir şekilde inşa eder.  
- Immutable nesneleri güvenli ve yönetilebilir şekilde yaratmayı sağlar.  
- Kod tekrarını ve hatalı constructor kullanımını azaltır.
