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

```git clone https://github.com/DevClube/Microservice_app.git```

#### Build the project

```mvn clean install```

#### Run the application

```mvn spring-boot:run```

The application will start on port 8081.

## Usage
### Création d'une Entité :

<img src="./Capture/1.png">

### Création de Repository:

<img src="./Capture/2.png">

### Création de Service:

<img src="./Capture/3.png">
<img src="./Capture/4.png">
### Test avec Postman:
#### Afficher tous les comptes:

<img src="./Capture/5.png">
<img src="./Capture/6.png">

#### Afficher un comptes:

<img src="./Capture/8.png">
<img src="./Capture/9.png">

### Swagger Documentation:

<img src="./Capture/11.png">

### Création des dto et Mappers:
#### RequestDTO:
<img src="./Capture/12.png">

#### ResponseDTO:
<img src="./Capture/13.png">

#### Mapper:
<img src="./Capture/15.png">

### Création de Service:
#### Interface Service:
<img src="./Capture/16.png">

#### Service Implementation:
<img src="./Capture/17.png">

### GraphQL:
#### schema:
<img src="./Capture/18.png">

#### Test des schemas:
<img src="./Capture/19.png">

<img src="./Capture/20.png">
