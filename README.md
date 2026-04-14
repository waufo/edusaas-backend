# EduSaaS Backend

![CI](https://github.com/waufo/edusaas-backend/actions/workflows/ci.yml/badge.svg?branch=develop)

Plateforme SaaS de gestion scolaire — Java 21 · Spring Boot 3 · Clean Architecture · Kafka · Keycloak

## Stack technique
- **Backend :** Java 21, Spring Boot 3, Architecture Hexagonale
- **Base de données :** PostgreSQL 16, Redis 7
- **Messaging :** Apache Kafka (Sprint 2)
- **Auth :** Keycloak (Sprint 2)
- **Frontend :** Angular 17 (Sprint 3)
- **Mobile :** Flutter 3 (Sprint 4)

## Lancer en local

### Prérequis
- Java 21+
- Docker Desktop

### Démarrage

```bash
# 1. Cloner le repo
git clone git@github.com:waufo/edusaas-backend.git
cd edusaas-backend

# 2. Copier les variables d'environnement
cp .env.example .env

# 3. Démarrer les services Docker
docker compose up -d

# 4. Lancer l'application
mvn spring-boot:run
```

### Vérification
- API Health : http://localhost:8080/api/v1/health
- Swagger UI : http://localhost:8080/swagger-ui.html
- Mailhog : http://localhost:8025

## Architecture
src/main/java/com/edusaas/
├── domain/          # Entités, Value Objects — aucune dépendance externe
│   ├── model/
│   └── port/
│       ├── in/      # Interfaces Use Cases
│       └── out/     # Interfaces Repositories
├── application/
│   └── service/     # Implémentation des Use Cases
├── adapter/
│   ├── in/web/      # Controllers REST
│   └── out/persistence/ # Repositories JPA
└── infrastructure/
└── config/      # Configuration Spring

## Modules fonctionnels
| Module | Statut |
|--------|--------|
| Fondations & Infrastructure | ✅ Sprint 1 |
| Authentification & Keycloak | 🔄 Sprint 2 |
| Module Academic | ⏳ Sprint 3 |
| Module Students | ⏳ Sprint 3 |
| Module Grades | ⏳ Sprint 4 |
| Module Attendance & QR Code | ⏳ Sprint 4 |
| Angular Web Frontend | ⏳ Sprint 5 |
| Flutter Mobile Apps | ⏳ Sprint 6 |