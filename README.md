# GUI_Developer

GUI
Projekt 1

Napisz program, który bedzie słuzył do zarzadzania przez dewelopera siecia osiedli mieszkaniowych.
Deweloper moze posiadac wiele osiedli, a w ramach osiedli moze istniec wiele bloków, w
których istnieje dowolna (skonczona) liczba mieszkan do wynajmu. Kazde pomieszczenie moze
byc zamieszkane przez dowolna liczbe osób, o których informacje nalezy przechowywac (obiekty
klasy Osoba), jednak zawsze pierwsza osoba, która rozpoczyna najem mieszkania jest osoba
odpowiedzialna za opłaty dot. wynajmu.

W ramach najmu mieszkania (tylko jezeli osoba najmuje mieszkanie w ramach osiedla) jest
mozliwosc dodatkowego najmu zamknietego miejsca parkingowego, w ramach którego mozna
przechowywac pojazdy, ale równiez rózne przedmioty.

Kazde mieszkanie jak i miejsce parkingowe posiadaja informacje o swojej powierzchni uzytkowej
jak i unikalny numer identyfikacyjny, dzieki któremu mozemy jednoznacznie zdefiniowac
obiekt symbolizujacy mieszkanie lub miejsce parkingowe.

Najemca moze dowolnie zameldowywac i wymeldowywac osoby z mieszkania, jak i równiez,
jesli posiada miejsce parkingowe, to moze wkładac i wyjmowac przedmioty oraz pojazdy. Kazda
osoba moze miec wynajetych wiele mieszkan i miejsc parkingowych, o ile sumaryczna liczba
wynajmowanych mieszkan i miejsc parkingowych przez dana osobe (najemce) nie jest wieksza
niz 5. Kazde pomieszczenie moze miec tylko jednego najemce w jednym czasie.

Nalezy zapewnic, aby identyfikatory pomieszczen były unikalne oraz tworzone automatycznie
podczas tworzenia obiektu typu Mieszkanie i MiejsceParkingowe. Rozmiar powierzchni
uzytkowej w przypadku oby wspomnianych typów pomieszczen nalezy dostarczac podczas tworzenia
obiektu pomieszczenia.

Mozliwe sa dwa sposoby wskazania rozmiaru pomieszczenia:
• poprzez podanie objetosci w metrach szesciennych
• poprzez podanie rozmiarów pomieszczenia w postaci długosci, szerokosci i wysokosci pomieszczenia
(dla uproszczenia zakładamy, ze pomieszczenie jest prostopadłoscianem. Przy
tym podejsciu powierzchnia uzytkowa pomieszczenia zostaje wyliczona podczas tworzenia
obiektu na podstawie przekazanych wartosci).

Pomieszczenie dla okreslonego najemcy posiada równiez LocalDate rozpoczecia najmu oraz LocalDate
zakonczenia najmu. Jesli data zakonczenia najmu sie przedawniła, to zostaje wystosowane pismo
(obiekt typu File), które zostaje zapisane do obiektu klasy Osoba definiujacego konkretnego
najemce.

W zadaniu równiez nalezy zaimplementowac mechanizm upływajacego czasu za posrednictwem
watków. Watek powinien co 5 sekund przesuwac LocalDate o 1 dzien do przodu, symulujac
upływ czasu. Równolegle powinny byc co 10 sekund sprawdzane kwestie wynajmu, czy wszystkie
pomieszczenia nadal sa w trakcie najmu, czy moze wynajem pomieszczenia juz ustał.


Jesli najem zostanie odnowiony lub najem zostanie anulowany przez najemce, pismo dot.
zadłuzenia zostaje usuniete z akt osoby.

Jesli najemca nie odnowi najmu w przeciagu 30 dni, nalezy wyczyscic pomieszczenie, którego
najem sie zakonczyło, a pismo pozostaje w aktach.

W przypadku mieszkania przeprowadzamy eksmisje osób zamieszkałych w tym mieszkaniu.
W przypadku miejsca parkingowego, w pierwszej kolejnosci sprawdzamy czy znajduje sie
na miejscu parkingowym pojazd. Jesli tak, to w zwiazku z przyspieszona decyzja komornicza
zostaje on sprzedany (z punktu widzenia programu usuwamy obiekt z pomieszczenia), a koszt
sprzedazy pokrywa najem pomieszczenia na najblizsze 2 miesiace. Jesli nie było pojazdu, to
utylizacji podlegaja wszystkie przechowywane rzeczy na miejscu parkingowym.

Osoba posiada ponad wymienione wczesniej informacje takie dane jak imie, nazwisko, pesel,
adres, LocalDate urodzenia.

Jesli najem bedzie chciała rozpoczac osoba z wiecej niz trzema zadłuzeniami (co najmniej 3
obiekty typu File) na przestrzeni najmów na tle całego osiedla, rzucony powinien zostac wyjatek
ProblematicTenantException z komunikatem – „Osoba X posiadała juz najem pomieszczen:
lista_pomieszczen”, gdzie X to imie i nazwisko danej osoby, zas lista_pomieszczen definiuje wynajmowane
pomieszczenia, które zostały wynajete.

Kazdy z przedmiotów i pojazdów posiadaja zapisana informacje o nazwie oraz polu powierzchni
jaka zajmuje. Powierzchnia zajmowana przez przedmiot/pojazd moze byc dostarczona
na dwa sposoby tak jak w przypadku pomieszczenia.

Pojazdy sa podzielone na rozrózniajace je typy:
• samochód terenowy,
• samochód miejski,
• łódz,
• motocykl,
• amfibia

Kazdy z pojazdów poza nazwa oraz powierzchnia musi posiadac cechy charakterystyczne dla
danego typu pojazdu (np. pojemnosc silnika, typ pojazdu, typ silnika itp.). Dla kazdego typu
pojazdu moga powtarzac sie cechy charakterystyczne, jednak co najmniej jedna powinna byc
rózna na tle innych pojazdów.

W przypadku wkładania kazdego przedmiotu lub pojazdu do pomieszczenia musimy sie
upewnic, ze pomieszczenie jest w stanie pomiescic ten obiekt. Jesli tak nie jest, zostaje rzucony
wyjatek TooManyThingsException z komunikatem „Remove some old items to insert a new
item”.

Stan osób zamieszkujacych osiedle wraz ze wszelkimi danymi dot. osoby, wynajmowanych
pomieszczen, przedmiotów, itp. musi byc zapisywane po wybraniu z menu odpowiedniej funkcjonalnosci.
Informacje zapisane w pliku powinny byc zapisane przejrzyscie i czytelnie dla człowieka
z zachowaniem ponizszych reguł:
• Pomieszczenia powinny byc posortowane rosnaco według rozmiaru pomieszczenia.
• Zawartosc pomieszczenia powinna byc posortowana malejaco według rozmiaru przedmiotu
jesli jest taki sam to według nazwy.

Zasada działania programu:
• W metodzie main nalezy utworzyc osiedle wraz z co najmniej dziesiecioma gotowymi pomieszczeniami
róznego typu i rozmiaru oraz kilka (minimum 5) gotowych osób. Ze wstepnie
przydzielonymi najmami oraz umiejscowionymi przedmiotami na miejscach parkingowych.
• Po uruchomieniu programu, uzytkownik powinien miec mozliwosc za posrednictwem konsoli
polecen wywołania wszystkich wspomnianych funkcjonalnosci. Sa to m.in:
– zakonczenia programu w dowolnym momencie
– wybrania która jest osoba (nie jest potrzebne zadne logowanie, wystarczy wskazanie
np. unikalnego numeru osoby)
– wypisania swoich danych łacznie z wynajetymi pomieszczeniami
– wyswietlenia wolnych pomieszczen
– wynajecia nowego pomieszczenia, po uprzednim jego wybraniu
– wybrania pomieszczenia które wynajmuje dana osoba oraz wyswietlenia zawartosci
pomieszczenia
– włozenia nowych pojazdów/przedmiotów pamietajac, aby nie przepełnic pomieszczenia
– wyjecia przedmiotów lub pojazdów.
– wykonania polecenia zapisujacego aktualny stan osiedla do pliku
