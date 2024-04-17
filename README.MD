<h3> Application Gestion de comptes bancaires </h3>
<h5> basée sur une architecture de microservices </h5>
<p>

Ce projet vise à développer une application de gestion de comptes bancaires basée sur une architecture de microservices. L'objectif principal est de fournir une API REST pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur des objets Compte. Chaque compte est défini par un identifiant, un solde, une date de création, un type et une devise.
</p>
<p>
L'API permet aux clients d'effectuer les opérations suivantes :

    - Lire la liste de tous les comptes via une requête GET sur /api/comptes
    - Lire les détails d'un compte via une requête GET sur /api/comptes/{id}
    - Créer un nouveau compte via une requête POST sur /api/comptes
    - Mettre à jour un compte existant via une requête PUT sur /api/comptes/{id}
    - Supprimer un compte via une requête DELETE sur /api/comptes/{id}
</p>
 <h3> Prerequisites </h3>

- IDE (IntelliJ)
- Java 17
- Maven
- Postman
- SwaggerAPI

## Installation
#### Clone the repository

```git clone https://github.com/soukainatronnebati/Microservice_BankAccount.git```

#### Build the project

```mvn clean install```

#### Run the application

```mvn spring-boot:run```

The application will start on port 8081.

## Usage
### Création d'une Entité :

<img src="Capture/1.PNG">

### Création de Repository:

<img src="Capture/2.PNG">

### Création de Service:

<img src="Capture/3.PNG">
<img src="Capture/4.PNG">
### Test avec Postman:
#### Afficher tous les comptes:

<img src="Capture/5.PNG">
<img src="Capture/6.PNG">

#### Afficher un comptes:

<img src="Capture/8.PNG">
<img src="Capture/9.PNG">

### Swagger Documentation:

<img src="Capture/11.PNG">

### Création des dto et Mappers:
#### RequestDTO:
<img src="Capture/12.PNG">

#### ResponseDTO:
<img src="Capture/13.PNG">

#### Mapper:
<img src="Capture/15.PNG">

### Création de Service:
#### Interface Service:
<img src="Capture/16.PNG">

#### Service Implementation:
<img src="Capture/17.PNG">

### GraphQL:
#### schema:
<img src="Capture/18.PNG">

#### Test des schemas:
<img src="Capture/19.PNG">

<img src="Capture/20.PNG">
