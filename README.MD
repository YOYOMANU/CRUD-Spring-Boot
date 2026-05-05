# 📦 Gestion des recettes CRUD avec Spring Boot

Un projet CRUD simple développé avec **Spring Boot** permettant de gérer des recettes (création, lecture, mise à jour, suppression).

---

## 🚀 Fonctionnalités

- ✔️ Créer une recette
- ✔️ Lister les recettes
- ✔️ Modifier une recette
- ✔️ Supprimer une recette
- ✔️ Messages flash (succès / erreurs)
- ✔️ Redirection après actions
- ✔️ Interface web avec Thymeleaf

---

## 🛠️ Technologies utilisées

- Java 25
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- mariadb
- lombok
- Maven

---

## 📁 Structure du projet

src/
  ├── controller/
  ├── service/
  ├── repository/
  ├── model/
  ├── templates/
  │ ├── index.html
  │ ├── add.html
  │ ├── edit.html

---

## ⚙️ Installation

### 1. Cloner le projet

```bash
git https://github.com/YOYOMANU/CRUD-Spring-Boot.git
cd CRUD-Spring-Boot
```

### 2. Lancer docker compose

```
docker compose up -d
```

### 3. Acceder à adminer

```
http://localhost:8081/?server=db&username=root

```

### 4. Creer la BD YE

### 5. Lancer l’application

```
mvn spring-boot:run
```
