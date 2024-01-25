# Otel Rezervasyon Uygulama Api'si
Otel rezervasyon işlemlerini yöneten bir RESTful API sunan bir Spring Boot uygulamasıdır. Proje, otel rezervasyonları, odalar, müşteri bilgileri ve ödemeler gibi temel varlıkları yönetmek için bir dizi API endpoint'i sağlar.
## Gerekli Teknolojiler
### 1.Spring için Gerekli Dependency'leri Eklemek için: [Spring.io](https://start.spring.io/)https://start.spring.io/ Kullanabilirsiniz
Asagıdaki gibi eklentileri eklememiz ve Generate etmemiz gerekiyor.
![Inıtializer](https://github.com/okanokta/hotelReservation/assets/100216485/88c970e6-d1d5-4884-bfc8-c297839c58b5)
### 2.PostgreSQL 
### 4.Lombok
### 3.Postman 
## Veritabanı UML Diyagramı
![Başlıksız Diyagram drawio](https://github.com/okanokta/hotelReservation/assets/100216485/beab45a7-22fe-40ee-aea0-a8eb4a77d113)
## API TEST ETME 
#### POST: localhost:8081/reservation/saveReservation
![reservation_post](https://github.com/okanokta/hotelReservation/assets/100216485/c3b4b750-7b73-44c0-a415-861f79d57d17)
#### GET: localhost:8081/reservation/getAllReservation
![reservation_GET](https://github.com/okanokta/hotelReservation/assets/100216485/c7445573-d736-4d45-b07b-9832e5216820)
#### PUT: localhost:8081/reservation/updateReservation
![newReservation_put](https://github.com/okanokta/hotelReservation/assets/100216485/883177c5-f396-47d9-81f7-0bc514d35088)

#### DELETE: localhost:8081/reservation/{id}
![reservation_delete](https://github.com/okanokta/hotelReservation/assets/100216485/94f7f7fe-7fe6-4ab2-9b30-69ce10694d9f)
#### GET: localhost:8081/reservation/getAllReservation
![newDelete_Get](https://github.com/okanokta/hotelReservation/assets/100216485/9425e7ee-6835-48d9-96ff-d45e247af21d)







