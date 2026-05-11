# Roman Number

[![Java CI with Maven](https://github.com/niccoloobassan/Roman-Numbers/actions/workflows/ci.yml/badge.svg)](https://github.com/niccoloobassan/Roman-Numbers/actions/workflows/ci.yml)
[![Coverage Status](https://coveralls.io/repos/github/niccoloobassan/Roman-Numbers/badge.svg?branch=main)](https://coveralls.io/github/niccoloobassan/Roman-Numbers?branch=main)

Convertitore di numeri arabi (1-1000) in numeri romani con stampa ASCII art su 6 righe.

Progetto per il corso di **Metodi e Tecnologie per lo Sviluppo Software** — Università degli Studi di Padova.

## Funzionalità

- **IntegerToRoman**: conversione di numeri interi (1-1000) nella corrispondente notazione romana
- **RomanPrinter**: stampa in formato ASCII art dei numeri romani, con larghezza fissa di 10 caratteri per lettera e 6 righe di altezza

## Requisiti

- Java 11+
- Maven 3.6+

## Build

```bash
mvn compile
```

## Test

```bash
mvn test
```

## Checkstyle

```bash
mvn checkstyle:check
```

## Build completa (compile + test + checkstyle)

```bash
mvn package
```

## Coverage

```bash
mvn jacoco:report
```

Il report di coverage è generato in `target/site/jacoco/index.html`.

## Autori

- **Niccolò Bassan** — 2145599 — [@niccoloobassan](https://github.com/niccoloobassan)
- **Giacomo Miola** — 2145603 — [@jack-mio](https://github.com/jack-mio)
