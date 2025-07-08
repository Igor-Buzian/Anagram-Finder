# Anagram Finder — Project Design and Scalability

## Contents

- [English version en](#english-version)  
- [Русская версия 🇷🇺](#русская-версия)

---
# Anagram-Finder 

## Русская версия
<a name="русская-версия"></a>
Эта программа на Java находит и группирует анаграммы из заданного входного текстового файла.

Определение Анаграммы
Два слова считаются анаграммами, если они содержат одни и те же буквы, но в другом порядке (например, "race" и "care").

Ввод
Программа принимает один аргумент командной строки: путь к входному файлу.
Входной файл должен содержать одно слово на каждой строке.

# Пример входного файла words.txt
- `act`
- `cat`
- `tree`
- `race`
- `care`
- `acre`
- `bee`
  
# Вывод
Программа выводит группы анаграмм. Слова, которые являются анаграммами друг друга, будут напечатаны на одной строке, разделенные пробелами. Каждая группа анаграмм будет на новой строке.

### Примечание о порядке вывода групп: 
Группы анаграмм выводятся в алфавитном порядке их канонических форм (отсортированных по алфавиту представлений слов). Слова внутри каждой группы также сортируются по алфавиту.

- `acre care race`
- `act cat`
- `bee`
- `tree`

  # Как запустить программу

  ### Требования: 
Установленный Java Development Kit (JDK) версии 8 или выше. Вы можете проверить это, набрав java -version и javac -version в терминале. Если JDK не установлен, вы можете скачать его с oracle.com/java/technologies/downloads/ или использовать OpenJDK (например, adoptium.net/temurin/releases/).

### Шаги запуска

Клонируйте репозиторий или скачайте исходный код:

`git clone https://github.com/Igor-Buzian/Anagram-Finder`

`cd Anagram-Finder`

### Запуск через IntelliJ IDEA

Откройте проект в IntelliJ IDEA.

Убедитесь, что ваш входной файл (например, words.txt) находится в корневой папке проекта или по пути, указанному в конфигурации запуска (...\src\text\words.txt).

Откройте AnagramFinder.java.

Создайте или отредактируйте "Run Configuration" для AnagramFinder:

![{7A8F8F31-3817-4D9D-A5E8-FE72FEFD406F}](https://github.com/user-attachments/assets/26c6eb28-fc18-47ff-8f54-ae5bc9ad8c31)

Нажмите на `+` и выбирете Aplication

![{A87150B1-9DAD-4AC7-9EF0-86256B8A5AF9}](https://github.com/user-attachments/assets/45b1b970-234a-4888-be2b-5176f77031bd)


**Main class:** `AnagramFinder`

Program arguments: Укажите имя вашего входного файла (например, I:\github\Internship\Anagram-Finder\src\text\words.txt , в зависимости от его расположения).
![{3DF22495-1B2D-4F40-ADA5-B4EE09594E7D}](https://github.com/user-attachments/assets/626942ed-42c0-4acc-b909-91e0beaef03c)

Пример того как должен выглядеть новый Aplication

![{C9930E6E-01BE-47AC-A44F-EE79A19790B2}](https://github.com/user-attachments/assets/41892b55-79a9-4679-843f-b21b5d40876f)


Нажмите зеленую кнопку запуска. Вывод появится в окне "Run".

# Зависимости
Эта программа использует только стандартные библиотеки Java, поэтому никаких дополнительных установок не требуется

----
# Для того чтобы ознакомится с основными подходами их обоснованиями и потенциальной масштабируемостью проекта, нужно зайти в DESIGN_DECISIONS.md

-----

## English version
This Java program finds and groups anagrams from a given input text file.

Definition Anagrams
Two words are considered anagrams if they contain the same letters but in a different order (e.g. "race" and "care").

Input
The program takes one command line argument: the path to the input file.
The input file must contain one word per line.

# Example of input file words.txt
- `act`
- `cat`
- `tree`
- `race`
- `care`
- `acre`
- `bee`
  
# Output
The program outputs groups of anagrams. Words that are anagrams of each other will be printed on one line, separated by spaces. Each group of anagrams will be on a new line.

### Note on the order of group output:
Anagram groups are output in alphabetical order of their canonical forms (alphabetically sorted representations of words). Words within each group are also sorted alphabetically.

- `acre care race`
- `act cat`
- `bee`
- `tree`

  # How to run the program

  ### Requirements:
Java Development Kit (JDK) version 8 or higher installed. You can check this by typing java -version and javac -version in a terminal. If JDK is not installed, you can download it from oracle.com/java/technologies/downloads/ or use OpenJDK (e.g. adoptium.net/temurin/releases/).

### Steps to get started

Clone the repository or download the source code:

`git clone https://github.com/Igor-Buzian/Anagram-Finder`

`cd Anagram-Finder`

### Run via IntelliJ IDEA

Open your project in IntelliJ IDEA.

Make sure your input file (e.g. words.txt) is in the root folder of your project or in the path specified in the run configuration (...\src\text\words.txt).

Open AnagramFinder.java.

Create or edit the "Run Configuration" for AnagramFinder:

![{7A8F8F31-3817-4D9D-A5E8-FE72FEFD406F}](https://github.com/user-attachments/assets/26c6eb28-fc18-47ff-8f54-ae5bc9ad8c31)

Click on `+` and select Application

![{A87150B1-9DAD-4AC7-9EF0-86256B8A5AF9}](https://github.com/user-attachments/assets/45b1b970-234a-4888-be2b-5176f77031bd)


**Main class:** `AnagramFinder`

Program arguments: Specify the name of your input file (e.g. I:\github\Internship\Anagram-Finder\src\text\words.txt , depending on its location).
![{3DF22495-1B2D-4F40-ADA5-B4EE09594E7D}](https://github.com/user-attachments/assets/626942ed-42c0-4acc-b909-91e0beaef03c)

An example of what a new Application should look like

![{C9930E6E-01BE-47AC-A44F-EE79A19790B2}](https://github.com/user-attachments/assets/41892b55-79a9-4679-843f-b21b5d40876f)


Click the green run button. The output will appear in the "Run" window.

** Dependencies**

This program uses only standard Java libraries, so no additional installations are required.

----

# To get acquainted with the main approaches, their justifications and potential scalability of the project, you need to go to DESIGN_DECISIONS.md
----
