# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Kas gali būti svarbu

- Apsirašome klasę implementuojančią interfeisą __CommandLineRunner__, t.y. realizuojančią metodą __void run(String... args)__,
kuris ir bus paleistas kaip Spring pilnai startuos, t.y. bus sukurtas application context'as.

- Atkreipkite dėmesį į __application.properties__  parametro __spring.datasource.url__ reikšmę. Prie jos pridėtas
naujas parametras __useSSL=false__. Jis ženkliai sumažina klaidų/įspėjimų skaičių konsolėje kai aplikacija užsidarinėja