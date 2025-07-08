# Anagram Finder — Project Design and Scalability

## Contents

- [English version en](#english-version)  
- [Русская версия 🇷🇺](#русская-версия)

---

## English version

<a name="english-version"></a>

### 🔍 Main Approach: Canonical Word Form

**Algorithm:**

- Convert the word to lowercase (`toLowerCase()`).
- Convert the string to a character array (`toCharArray()`).
- Sort the characters (`Arrays.sort()`).
- Convert back to a string.
- Use this canonical form as a key in `HashMap<String, List<String>>`.
- After reading all words, sort each anagram list (`Collections.sort()`).
- Print groups line-by-line with words separated by spaces.

**Justification:**

✅ Simple and readable.  
✅ Correct grouping of anagrams.  
✅ Efficient for moderate data sizes.

---

### ⏱ Time Complexity

- O(N × Lmax log Lmax) due to sorting each word’s characters.  
- HashMap operations average O(1).

---

### 🧠 Space Complexity

- O(N × Lavg) to store words and keys (Lavg = average word length).

---

### 🛠 Maintainability

- Modular: methods `findAnagrams`, `getCanonicalForm`, `printAnagramGroups`.  
- Uses standard Java APIs familiar to developers.  
- Javadoc comments for easy understanding.

---

### 📦 External Libraries

❌ None — fully based on standard JDK for dependency minimization, simple deployment, and clean Java approach.

---

### 📈 Scalability

#### Processing 10 million words

- Java handles ~10^7 sorts easily for average word length ~10-15 chars.
- Memory: approx. 1-2 GB total.
- Optimizations: increase JVM heap (`-Xmx4G`), BufferedReader is efficient.

#### Processing 100 billion words (100B)

- Requires distributed computing (MapReduce).
- Use Google Cloud Storage or similar for file storage.
- Use NoSQL (PostgreSQL, HBase, MongoDB) for results storage.
- Optimize network traffic and memory usage.

---

### 🧠 Potential refactoring for large-scale processing

Consider extracting `AnagramFinder` into a separate service class called from `main` for better readability, maintainability, and testability when processing 100M+ words. Not crucial for small demos but recommended in real projects.

---

## Русская версия

<a name="русская-версия"></a>

### 🔍 Основной подход: Каноническая форма слова

**Алгоритм:**

- Приведение слова к нижнему регистру (`toLowerCase()`).
- Преобразование в массив символов (`toCharArray()`).
- Сортировка символов (`Arrays.sort()`).
- Получение отсортированной строки.
- Сохранение слова в `HashMap<String, List<String>>` с канонической формой в качестве ключа.
- После чтения всех слов — сортировка списков анаграмм (`Collections.sort()`).
- Вывод групп анаграмм — каждая на новой строке, слова разделены пробелами.

**Обоснование:**

✅ Простота — интуитивный и читаемый подход.  
✅ Корректность — все анаграммы однозначно попадают под одну каноническую форму.  
✅ Производительность — эффективен при умеренном объёме данных.

---

### ⏱ Временная сложность

- O(N × Lₘₐₓ log Lₘₐₓ) — сортировка символов в каждом слове.  
- HashMap — вставка и доступ работают в среднем за O(1).

---

### 🧠 Пространственная сложность

- O(N × Lₐᵥg) — с учётом хранения слов и канонических форм в памяти (Lₐᵥg — средняя длина слова).

---

### 🛠 Поддерживаемость

- Модульность: методы `findAnagrams`, `getCanonicalForm`, `printAnagramGroups`.  
- Стандартные API, знакомые большинству Java-разработчиков.  
- Javadoc для понимания и сопровождения кода.

---

### 📦 Использование внешних библиотек

❌ Не используются.  
Полностью основан на стандартном JDK для минимизации зависимостей, упрощения сборки и демонстрации чистого Java-подхода.

---

### 📈 Масштабируемость

#### Обработка 10 миллионов слов

- Java легко справляется с ~10⁷ операций сортировки слов длиной 10–15 символов.  
- Память — около 1–2 ГБ.  
- Оптимизации: увеличить память JVM (`-Xmx4G`), BufferedReader достаточно эффективен.

#### Обработка 100 миллиардов слов (100B)

- Требуется распределённая обработка (MapReduce).  
- Использовать Google Cloud Storage для файлов, NoSQL (PostgreSQL, HBase, MongoDB) для хранения результатов.  
- Оптимизировать трафик и память.

---

### 🧠 Потенциальный рефакторинг кода

Рассмотреть выделение `AnagramFinder` в отдельный класс-сервис, вызываемый из `main`, для лучшей читаемости и тестируемости при обработке больших объёмов данных (100M+ слов). В простом примере это не обязательно.

---

# Навигация

- [English version en](#english-version)  
- [Русская версия 🇷🇺](#русская-версия)
