# Kodövningar – OOP-grunder

Detta repository innehåller lösningar på examinationsuppgiften i OOP-grunder. Uppgifterna demonstrerar grundläggande objektorienterad programmering i Java med klasser, objekt, privata instansvariabler, konstruktorer samt getters och setters.

## Innehåll

- **UPPGIFT 1 – Matratt och lunchmeny**: En klass `Matratt` med namn, pris, typ och antal kalorier. Fyra maträtter läggs i en `ArrayList` och skrivs ut som en dagens lunchmeny.
- **UPPGIFT 2 – Student**: En klass `Student` med privata instansvariabler, en konstruktor som tar in alla parametrar samt getters och setters. I main skapas ett studentobjekt och all data skrivs ut via getters.
- **UPPGIFT 3 – Person och flytt**: En klass `Person` med födelsedatum, namn och adressuppgifter. Två personer skapas i main, får olika adresser, och den ena flyttar sedan in hos den andra.

## Struktur

Varje uppgift har sin egen klass med tillhörande main-klass:

- `Matratt.java` och `Lunchmeny.java`
- `Student.java` och `StudentMain.java`
- `Person.java` och `PersonMain.java`

## Hur man kör koden

Kompilera och kör respektive main-klass:

```
javac Lunchmeny.java
java Lunchmeny
```

Samma princip gäller för `StudentMain` och `PersonMain`.

## Versionshantering

Arbetet har delats upp i flera mindre commits med tydliga meddelanden för att göra utvecklingen spårbar, exempelvis:

- Lägg till klass Matratt
- Skapa lunchmeny med ArrayList
- Lägg till klass Student med getters och setters
- Skapa StudentMain och skriv ut data
- Lägg till klass Person med adresshantering
- Implementera flyttfunktion och testa i main

## Författare

Soma Dilshad Abdullah
