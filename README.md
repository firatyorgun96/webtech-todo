# webtech-todo

Eine einfache To-Do-Webanwendung, entwickelt im Modul Webtechnologien an der HTW Berlin.

## Projektbeschreibung
Mit der App können Aufgaben (Tasks) verwaltet werden. Jede Aufgabe hat einen Titel
und einen Status (erledigt / nicht erledigt).

## Technologien
- Backend: Java 17, Spring Boot, Gradle

## Aktueller Stand (Milestone 1)
- Entity-Klasse `Task` (id, title, done)
- GET-Route `/tasks`, die eine Liste von Beispiel-Tasks als JSON zurückgibt