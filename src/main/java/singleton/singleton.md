# Singleton Pattern

Singleton Pattern, bir sınıftan **uygulama boyunca yalnızca bir nesne oluşturulmasını garanti eden** bir tasarım desenidir.

## Amaçları

- Tek bir nesne üzerinden erişim sağlamak
- Uygulama genelinde paylaşılan kaynakların kontrolünü kolaylaştırmak
- Thread-safe bir şekilde çalışarak, aynı anda birden fazla nesne oluşturulmasını önlemek

## Önemli Noktalar

- Singleton’ın amacı, **iki veya daha fazla nesnenin oluşturulmasını engellemektir**
- Multi-threaded uygulamalarda, aynı anda birden fazla thread sınıftan nesne oluşturmak isteyebilir
- `synchronized` metodun kullanımı, metodun tamamen bitene kadar diğer threadlerin girişini engeller ve **tek bir nesnenin oluşturulmasını garanti eder**

## Avantajları

- Kaynak kullanımı kontrol altında tutulur
- Tek bir nesne üzerinden global erişim sağlanır
- Çoklu thread ortamında güvenli çalışır

## Kullanım Alanları

- **Logger sınıfları**: Uygulama genelinde tek bir log kaynağı kullanmak için
- **Configuration yönetimi**: Uygulama ayarlarının tek bir nesneden okunması
- **Database bağlantıları**: Tek bir bağlantı havuzu veya bağlantı nesnesi oluşturmak
- **Cache yönetimi**: Global önbellek nesnesi
- **Thread pool yönetimi**: Tek bir thread havuzu üzerinden iş dağıtımı

## Özet

Singleton Pattern, **uygulama boyunca tek bir nesnenin yaratılmasını sağlar** ve thread-safe mekanizmalarla çoklu thread kullanımında bile bu garantiyi korur.
