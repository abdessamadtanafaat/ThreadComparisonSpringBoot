# TP N° 6 : Tests de performance - Programmation synchrone : Threads classiques vs. Threads virtuels

 Contexte

Ce projet consiste à réaliser une étude de performance pour comparer l'efficacité des threads classiques (Platform threads) avec les threads virtuels (Virtual threads) dans le cadre de la programmation synchrone. L'objectif est de développer une API CRUD à l'aide de Spring Boot pour gérer les produits d'une boutique virtuelle et de comparer les performances des deux types de threads à travers des tests de charge.

 Prérequis

- JDK 21 ou supérieur
- Spring Boot 3.2.x ou supérieur
- MySQL pour la gestion des données
- Apache JMeter pour les tests de performance
- Apache Benchmark (ab) pour les tests de performance

 Installation

# Étape 1 : Création du projet Spring Boot

1. Créez un nouveau projet Spring Boot dans IntelliJ IDEA.
2. Utilisez la version Spring Boot 3.2.x.
3. Ajoutez les dépendances nécessaires dans le fichier `pom.xml`.

# Étape 2 : Ajout de la dépendance Apache Commons Lang

Ajoutez la dépendance suivante dans votre `pom.xml` :

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>
