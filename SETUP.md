
# Hospital Report Uygulaması Kurulum Talimatları

Bu talimatlar, Hospital Report Uygulamasını yerel makinenizde nasıl kuracağınızı gösterecektir.

## Gereksinimler

Başlamadan önce, sisteminizde aşağıdakilerin yüklü olduğundan emin olun:

- **Java JDK 8 veya üstü**: Java Development Kit'in kurulu olması gerekmektedir.
- **Maven**: Bu proje, bağımlılık yönetimi ve derleme için Maven kullanmaktadır.
- **Neo4j**: Uygulama, Neo4j veritabanına dayanmaktadır. Neo4j'in yüklü ve çalışır durumda olduğundan emin olun.
- **Git**: Eğer repoyu henüz klonlamadıysanız, Git'in yüklü olması gerekmektedir.

## Kurulum ve Ayar

Projeyi kurmak için aşağıdaki adımları izleyin:

### 1. Repoyu Klonlayın

```bash
git clone https://github.com/hbykl/HospitalReport.git
cd HospitalReport
```

### 2. Neo4j'i Yapılandırın

Neo4j veritabanınızın çalışır durumda olduğundan emin olun. Varsayılan olarak, uygulama veritabanının `bolt://localhost:7687` adresinden erişilebilir olmasını ve varsayılan kimlik bilgilerini (`neo4j/neo4j`) bekler. Kurulumunuza bağlı olarak bu yapılandırmayı güncellemeniz gerekebilir.

### 3. Projeyi Derleyin

Proje dizinine gidin ve projeyi derlemek için aşağıdaki Maven komutunu çalıştırın:

```bash
mvn clean install
```

### 4. Uygulamayı Çalıştırın

Derleme başarılı olduktan sonra, uygulamayı şu komutla çalıştırabilirsiniz:

```bash
mvn spring-boot:run
```

Alternatif olarak, uygulamayı derlenen JAR dosyasını kullanarak doğrudan çalıştırabilirsiniz:

```bash
java -jar target/HospitalReport-0.0.1-SNAPSHOT.jar
```

### 5. Uygulamaya Erişin

Uygulama çalıştıktan sonra, web tarayıcınız veya herhangi bir REST istemcisi ile şu adresten erişebilirsiniz:

```
http://localhost:8080
```

### 6. API'yi Test Edin

API ile etkileşim kurmak için Postman veya curl gibi araçları kullanabilirsiniz. Test edebileceğiniz bazı endpointler:

- **Tüm kişileri getir**: `GET /persons`
- **Yeni bir kişi ekle**: `POST /persons`
- **Raporu güncelle**: `POST /report/updateService`

## Ek Yapılandırmalar

### Veritabanı Yapılandırmasını Özelleştirme

Neo4j örneğiniz farklı bir ana bilgisayarda veya bağlantı noktasında çalışıyorsa ya da farklı kimlik bilgileriyle oturum açıyorsanız, uygulamanın yapılandırmasını `src/main/resources/application.properties` dosyasında güncelleyebilirsiniz.

```properties
spring.neo4j.uri=bolt://<your-neo4j-host>:7687
spring.neo4j.authentication.username=<your-username>
spring.neo4j.authentication.password=<your-password>
```

## Sonuç

Artık Hospital Report Uygulamasını yerel olarak çalıştırmalısınız. Kurulum sırasında herhangi bir sorunla karşılaşırsanız, tüm gereksinimlerin doğru bir şekilde yüklendiğinden ve yapılandırıldığından emin olun. Ayrıca, projenin GitHub deposunu daha fazla dokümantasyon ve güncellemeler için kontrol edebilirsiniz.
