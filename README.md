
To repozytorium ma na celu pomóc zrozumieć podstawową konfigurację repozytorium na GitHubie, zawierającego:
- CI zrealizowane z wykorzystaniem GitHub Actions
- ustawienia polityki dostępu do gałęzi głównej
- deployment z wykorzystaniem GitHub Pages.

Pierwszym krokiem do zrealizowania jest wykonanie forka tego repozytorium do swojego profilu

![img.png](readme_images/fork_ss.png)
(trzeci przysik od lewej na ss)

Gdy repozytorium jest już sklonowane do naszego profilu możemy zacząć konfiguracje CI.

W repozytorium znajduje się kod który zawiera dwie częśći backednową oraz frontendową które dostarczają podsrawowe testy uruchamiane w różny sposób, co pozwoli nam zapoznać się z działaniem github actions.


Zanim zaczniemy musimy odpowiedzieć na pytanie czym są github actions, możemy je rozumieć jako małe programy których uruchomienie jest trigerowane przez konkretne wydarzenia (eventy) na naszym repozytorium i pozwalają nam na automatyzacje procesów związanych z rozwojem naszego projektu.

Precyzyjniejszy opis tego wszystkiego co znajduje się ponieżej można znaleźć w dokumetacji samych github actions:
https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions

Czym więc są eventy w naszym repozytorium, mówiąc ogólnie są to wszystkie acje wykonwane na kodzie i samym repo mogą to więc być:
- commity
- pull requesty
- otwarcia isue
- merge do jakiegoś konkretnego brancha itd..

**Eventy trigerują workflows** które wykonują konkretny kawałek roboty związany z automatyzacją.
Jeden workflow może składać się z **jednego lub więcej jobów** podzielownych na **wykonywane sekwencyjnie stepy**.

1. Przygotowanie pierwszego workflow
    
    Workflow któy teraz przygotujemy bęzie odpowaidał za uruchomienie testów
    i będzie się składał z dwóch jobów jednego odpowiedzialnego z frontend drugiego za backend.
    
    Wszystkie workflow opisujemy za pomocą plików `*.yml` i umieszczamy w katalogu
    `.github/workflows/`.

    Plik który będzie odpowiadał za realizację workflow nazwiemy `tests.yml`
    






