# XMLReader
XMLReader is a very simple RSS feed reader.

## General Information
- The project uses ROME, which is a Java framework for RSS and Atom feeds.
- The basic purpose of the project was to create a web service, which reads an RSS feed, and converts it into JSON

## Technologies Used
- Java - version 17
- Spring Boot - version 2.6.3
- Project Lombok - version 1.18.22
- Rome 1.18.0

## Steps to install and run

1. Build the project using `mvn clean package`
2. Run using `mvn spring-boot:run` OR `java -jar XMLReader-1.0-SNAPSHOT.jar`
3. The web application is accessible via localhost:8080

## Usage

- URL/getrss?url={URL}
- it takes a GET-request and returns a JSON object with title, description, etc...
- Example:
```json
[
  {
    "title": "Macron koalíciója győzött a második fordulóban",
    "description": "Emmanuel Macron francia elnök pártja és centrista szövetségeseinek Együtt! elnevezésű koalíciója az élen végzett a francia törvényhozási választások második fordulójában, de elvesztette az abszolút többséget a nemzetgyűlésben &#8211; derül ki a francia belügyminisztérium hétfőre virradóra közzétett hivatalos végeredményéből.     A kormánypártnak a következő öt évben 246 helye lesz az 577 fős nemzetgyűlésben, ahol eddig 345 képviselővel ...",
    "pubDate": "2022.06.20",
    "url": "https://www.amdala.hu/macron-koalicioja-gyozott-a-masodik-forduloban/",
    "author": "admin",
    "category": "Főhír,Külföld,elisabeth borne,macron,Marine Le Pen"
  },
  {
    "title": "Hat településen tartanak ma időközi önkormányzati választást",
    "description": "Hat településen tartanak időközi  polgármester- és önkormányzati képviselő-választást vasárnap. Azokat az időközi választásokat rendezik most meg, amelyeket a koronavírus-járvány miatt 2020. november 4-én hatályba lépett veszélyhelyzet idején, illetve idejére nem tudtak kiírni.     A koronavírus-járvány miatt nem lehetett időközi választást és népszavazást kitűzni, a kiírt választások pedig elmaradtak. Április 10-étől azonban ismét kitűzhetőek lettek az időközi önkormányzati ...",
    "pubDate": "2022.06.19",
    "url": "https://www.amdala.hu/hat-telepulesen-tartanak-ma-idokozi-onkormanyzati-valasztast/",
    "author": "admin",
    "category": "Főhír,Politika,Borsó András,Dézsi Gábor István (független),Evetovicsné Takács Zsuzsanna,fidesz,független,járvány,Kánya Zsolt (független) és Sipeki Zsolt (Fidesz-KDNP),Kőműves Sándor és Wimme Beáta,Körmendy Zsófia (Összefogás Szigethalomért Egyesület) és Rendek Zsolt (független),Kovács István (Mi Hazánk Mozgalom),Miszi Zsuzsanna (Fidesz-KDNP) és Takács Bernadett (Marcali az Otthonunk Egyesület),Péter Dávid Attila,Protárné Gaál Andrea,Szabó Szabolcs és Werner Renáta,Székely Róbert,tát margit,választás"
  }
]
```

## Project Status
Project is: _in progress_

## Room for Improvement

To do:
- more features

