#  Factory Pattern Nedir?

**Factory Pattern**, tasarım desenlerinden biri ve **“yaratıcı (Creational) bir desendir”**.

- Temel amacı: **Nesne oluşturmayı merkezi bir noktaya taşımak** ve **doğrudan `new` kullanmayı azaltmak**.
- Böylece kod, nesne yaratma mantığından ayrılır ve **daha esnek, yönetilebilir ve genişletilebilir** olur.

**Özetle:**  
Factory Pattern → “Bir nesneye ihtiyacım var ama tam hangi concrete class olduğunu runtime’da belirlemek istiyorum, onu bir Factory oluşturacak” demektir.

---

#  Neden Kullanmalıyım?

- Kodda **çok fazla `new` varsa**, nesne oluşturma mantığını tek bir yerde toplamak için.
- Eğer **ileride yeni bir concrete class ekleyeceksek**, mevcut kodu değiştirmek zorunda kalmadan ekleme yapmak için.
- Nesne yaratma süreci karmaşıksa (parametreler farklı, şartlara göre değişiyorsa) bunu **soyutlamak** için.

**Örnek senaryo:**  
Bir oyun yazıyorsun, farklı türde düşmanlar var: `Goblin`, `Dragon`, `Troll`.

- Kodda her yerde `new Goblin()` veya `new Dragon()` yazarsan, ileride `Vampire` eklediğinde kodu her yerde değiştirmek zorunda kalırsın.
- Factory kullanırsan tek bir yerden tüm düşmanları yaratabilirsin:

```java
EnemyFactory.createEnemy("Goblin");
```
---

Sonra `Dragon` veya `Troll` eklemek çok kolay.

---

###  Kodu yazarken “Factory Pattern kullanmalıyım” demen gereken durumlar

1. **Nesne yaratma karmaşıksa**
    - Constructor’lar çok parametre alıyor, veya hangi concrete class’ın seçileceği koşullara bağlıysa.

2. **Kod genişlemeye açık ve değişime duyarlıysa**
    - Yeni bir concrete class eklenirse mevcut kodu bozmadan ekleyebilmek istiyorsan.

3. **Bir nesne oluşturma mantığını merkezi yapmak istiyorsan**
    - Tüm nesne oluşturmayı tek bir sınıfta toplamak için.

---

###  Factory Pattern’in En Önemli Özellikleri

- **Soyutlama (Abstraction):** Kullanıcı `new` ile uğraşmaz, sadece factory’den istekte bulunur.
- **Merkezi kontrol:** Tüm nesneler tek bir noktadan yaratılır → yönetimi kolay.
- **Esneklik:** Yeni nesne tipleri eklemek kolaydır.
- **Karmaşık nesne oluşturmayı gizleme:** Constructor’lar karmaşık olsa bile kullanıcı basit bir metod çağrısı ile nesne alır.

---

## Factory Pattern Nasıl Kullanılır?
### Adım 1: Interface veya Abstract Class oluştur

````java
public interface Enemy {
    void attack();
}
````

### Adım 2: Concrete Class’lar

````java
public class Goblin implements Enemy {
    public void attack() {
        System.out.println("Goblin saldırıyor!");
    }
}

public class Dragon implements Enemy {
    public void attack() {
        System.out.println("Dragon ateş püskürtüyor!");
    }
}
````
### Adım 3: Factory Sınıfı

````java
public class EnemyFactory {
    public static Enemy createEnemy(String type) {
        switch(type) {
            case "Goblin": return new Goblin();
            case "Dragon": return new Dragon();
            default: throw new IllegalArgumentException("Unknown enemy type");
        }
    }
}
````

### Adım 4: Kullanım

````java
public class Main {
    public static void main(String[] args) {
        Enemy enemy1 = EnemyFactory.createEnemy("Goblin");
        Enemy enemy2 = EnemyFactory.createEnemy("Dragon");

        enemy1.attack();  // Goblin saldırıyor!
        enemy2.attack();  // Dragon ateş püskürtüyor!
    }
}
````
Kullanıcı new ile uğraşmıyor.
Yeni bir düşman eklemek → sadece Factory’ye bir case eklemek yeterli.

