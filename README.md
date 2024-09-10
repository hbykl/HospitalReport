# Hastane Rapor Uygulaması

## Genel Bakış

Bu proje, hastane içindeki kişisel ve tıbbi kayıtların yönetimini ve işlenmesini sağlamak için tasarlanmış bir Hastane Rapor Yönetim sistemidir. Sistem, backend geliştirme için Spring Boot kullanılarak oluşturulmuş ve grafik tabanlı ilişkileri yönetmek için Neo4j veritabanını kullanmaktadır.

### Kullanılan Başlıca Teknolojiler

- **Spring Boot**: Web uygulamalarının geliştirilmesini kolaylaştıran ve hazır yapılandırmalar sunan Java tabanlı bir framework.
- **Neo4j**: Karmaşık veri ilişkilerini verimli bir şekilde depolayan ve sorgulayan bir NoSQL grafik veritabanı.
- **Spring Data Neo4j**: Spring Boot ile Neo4j entegrasyonunu kolaylaştırır, veri işlemlerini yönetmeyi sağlar.
- **RESTful API Tasarımı**: Sisteme etkileşimli erişim sağlamak için CRUD işlemleri sunan RESTful uç noktalar.

## Proje Yapısı ve Ana Bileşenler

- **HospitalReportApplication.java**: Uygulamanın ana giriş noktası. Spring Boot uygulamasını başlatır.
- **Persons.java**: Neo4j veritabanında bir kişi varlığını temsil eden model sınıfı. Bu sınıf, grafikte bir düğüm olarak tanımlanmak için `@Node` anotasyonunu kullanır.
- **RelotionShip.java**: Kişiler arasındaki ilişkileri temsil eden ve hastalık türü gibi özellikleri depolayan sınıf.
- **Report.java**: Neo4j veritabanında bir tıbbi raporu temsil eden model sınıfı.
- **ReportRepository.java**: `Neo4jRepository` arayüzünü genişleten ve `Report` verilerini sorgulamak için yöntemler sağlayan repository arayüzü.
- **RepositoryPerson.java**: `ReportRepository` benzeri bir yapı ile, `Persons` varlıklarını yönetir.
- **Controller.java**: API isteklerini yönetir ve gerekli hizmetlere yönlendirir.
- **DBController.java**: Rapor güncelleme veya raporları alma gibi veritabanı ile ilgili işlemleri yönetir.

## Ana Tasarım Kararları

1. **Framework Seçimi**: Spring Boot, kullanım kolaylığı, hızlı geliştirme yetenekleri ve kurumsal düzeyde uygulamaları destekleyen geniş ekosistemi nedeniyle seçildi.
2. **Veritabanı Seçimi**: Neo4j, kişiler ve bunlara bağlı tıbbi kayıtlar gibi veri varlıkları arasındaki karmaşık ilişkileri verimli bir şekilde yönetebilmesi nedeniyle tercih edildi.
3. **Repository Deseni**: Veri erişim katmanını soyutlamak ve veriyi yönetmek için Spring Data Neo4j kullanıldı.
4. **RESTful API**: İstemci ve sunucu arasında açık, durumsuz bir iletişim protokolü sağlamak için standart RESTful mimarisi kullanıldı.

## Çalışma Şekli

Uygulama çalıştırıldığında:

1. **Başlatma**: Spring Boot uygulamayı başlatır, gerekli tüm yapılandırmaları ve bileşenleri kurar.
2. **Veritabanı Bağlantısı**: Uygulama, bir Neo4j veritabanı örneğine bağlanır ve istekleri karşılamaya hazır hale getirir.
3. **API Uç Noktaları**: RESTful API uç noktaları, istemcilerin sistemle etkileşime geçmesine olanak tanır, veri kaydı, okuma, güncelleme ve silme işlemleri yapılabilir.
4. **Veri İşleme**: Gelen bir istek, uygun kontrolör tarafından işlenir ve gerekli veri tabanı işlemleri gerçekleştirilir.
5. **Yanıt Yönetimi**: Her işlemin sonucu, veri alma, güncelleme onayı veya hata mesajları gibi istemciye geri döner.

## Sonuç

Bu proje, hastane ile ilgili verileri verimli, ölçeklenebilir ve yönetilebilir bir sistem sunmak üzere yapılandırılmıştır. Spring Boot ve Neo4j kombinasyonu, karmaşık veri ilişkilerini hızlı bir şekilde yönetirken kolay geliştirme imkanı sağlar.


## Katkı sağlayanlar
-/hbykl
-/z-muhammet
-/oykuatakk
