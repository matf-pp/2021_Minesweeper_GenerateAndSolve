# 2021_Minesweeper_GenerateAndSolve

## Inspiracija za ovaj projekat

Inspiracija za ovaj projekat je igrica Minesweeper.Cilj igre je da se otvore sva polja bez detoniranja mina.Postoje tri stanja polja: otvoreno, neotvoreno i flagged (postavljena zastavica na tom polju).Zastavice nam sluze kao pomoc da odredimo gde se nalaze mine i njihov broj je jednak broju mina.Svako otvoreno polje koje nije mina sadrzi podatak o tome koliko mina se nalazi u susednim poljima.Detaljnije o igri na sledecem linku: https://en.wikipedia.org/wiki/Minesweeper_(video_game).

## O projektu

Ovaj projekat se sastoji iz *dva dela*:
* Nasumicni generator mape za igru Minesweeper koju korisnik moze da resava
* Automatski resavac za nasumicno generisanu mapu

Za oba dela postoje tri *nivoa tezine* koji se mogu izabrati: Beginner, Intermediate i Advanced. U zavisnosti od nivoa tezine, odredjuju se dimenzije table za igru, kao i broj mina koje treba pronaci.

![image](https://user-images.githubusercontent.com/80039017/118365430-157df000-b59d-11eb-8aad-cef1e1080048.png)

### Generator

Igracu se dopusta da odabere prvo polje na tabli. To polje ne sme biti mina. Zatim, generisu se nasumicne koordinate X i Y, i na taj nacin se postavljaju mine na tabli. Nakon toga se sva ostala polja azuriraju tako da u sebi imaju broj koji odgovara ukupnom broju mina u njihovih 8 susednih polja.

Igrac moze nastaviti da otvara polja i oznacava mine, bas kao i u poznatoj igri. Igrac pobedjuje ukoliko oznaci sve mine, a gubi ukoliko otvori minu.

Primer igre za igraca tezine Beginner:

![image](https://user-images.githubusercontent.com/80039017/118365942-fe400200-b59e-11eb-9e30-73036e32c6d7.png)

### Resavac

Kako bi univerzalni resavac koji resava zadatu tablu kao covek bilo veoma tesko napisati (Postoje slucajevi u kojima je nemoguce odabrati tacnu lokaciju mine bez "nagadjanja"), resavac u sklopu ovog projekta ima malo drugaciji pristup.
Ovaj resavac primice tablu na cijim poljima su brojevi od 0 do 9. Ovi brojevi predstavljaju *broj mina u okolini tog polja, ukljucujuci i to konkretno polje*.
Nakon pokretanja resavaca, dobija se mapa sa jednim mogucim rasporedom mina u tako postavljenoj tabli.

Primer resavaca za tezinu Intermediate:

![image](https://user-images.githubusercontent.com/80039017/118367066-2892bf00-b5a1-11eb-8333-4d7b5f6129bd.png)

## Jezik i Tehnologije

Projekat je radjen u jeziku Kotlin, u okruzenju IntelliJ IDEA. Od biblioteka, za GUI je koriscen TornadoFX.

## Pokretanje

Za pokretanje potrebno je imati JavaFX biblioteku, koju mozete preuzeti sa sajta:
https://gluonhq.com/products/javafx/ 
Preuzeti jar fajl (koji se nalazi u sekciji relases) se pokrece uz komande u terminalu tako sto se prvo pozicionirate u direktorijum u kom ste ga preuzeli, pa potom uneti komandu:
java -p /Users/tara/Desktop/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.base,javafx.fxml,javafx.graphics,javafx.media,javafx.web -jar 2021_Minesweeper_GenerateAndSolve.jar , 
gde je /Users/tara/Desktop/javafx-sdk-11.0.2/lib put do Vaseg JavaFX lib foldera.

## Autori
* Mila Lukic (milalukic222@gmail.com)
* Tara Menjak Maksimovic (taramm19@gmail.com)
