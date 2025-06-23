# Домашнее задание по Kotlin №1
Проект состоит из трёх отдельных задач, каждая из которых оформлена в своём пакете (`task1`, `task2`, `task3`)

##  Задача 1: Подсчёт количества символов в строке

Файл: `task1/CharCounter.kt`

Функция `countCharInString` принимает:
- строку (`inputString`)
- символ для поиска (`targetChar`)

Проверка производится с учётом регистра. Если символ найден — выводится количество вхождений. Если нет — сообщение, что символ не найден.

### Пример использования:

```kotlin
countCharInString("Молоко", 'м') // → Количество символов ‘М’ в строке "Молоко" == 1
countCharInString("Молоко", 'а') // → Символ ‘а’ в строке "Молоко" не найден
```

### Запуск:
Открыть файл `task1/CharCounter.kt` → нажать правой кнопкой мыши → `Run 'CharCounterkt'`.

---

## Задача 2: Обработка произвольного типа (`Any?`)

Файл: `task2/TypeProcessor.kt`

Функция `processAnyType` принимает параметр типа `Any?` и:
- для `String` — выводит строку и её длину;
- для `Int` — квадрат значения;
- для `Double` — округляет до двух знаков;
- для `LocalDate` — сравнивает с датой основания Tinkoff (24.12.2006);
- для `null` — выводит сообщение, что объект равен `null`;
- для других типов — сообщает, что тип неизвестен.

### Пример использования:

```kotlin
processAnyType("Привет, друг")  // String
processAnyType(9)              // Int
processAnyType(7.777)          // Double
processAnyType(LocalDate.of(2007, 9, 26)) // LocalDate
processAnyType(null)           // null
processAnyType(true)           // неизвестный тип
```

### Запуск:
Открыть файл `task2/TypeProcessor.kt` → правый клик → `Run 'TypeProcessorkt'`.

---

## Задача 3: Иерархия животных (Pet, Cat, Fish)

Файл: `task3/PetHierarchy.kt`

Реализована объектно-ориентированная структура:
- Абстрактный класс `Pet` с вычисляемым свойством `totalSpeed`
- Интерфейсы:
    - `Runnable` с `runSpeed` и методом `run()`
    - `Swimmable` с `swimSpeed` и методом `swim()`
- Абстрактные классы:
    - `Cat` (может бегать и плавать)
    - `Fish` (только плавает)
- Реализации:
    - `Tiger`, `Lion` — наследники `Cat`
    - `Salmon`, `Tuna`, `Shark` — наследники `Fish`

Каждое животное реализует нужные интерфейсы и печатает сообщение в методах `run` и `swim`.

### Пример использования:

```kotlin
val tiger = Tiger(runSpeed = 50.0, swimSpeed = 10.0)
val salmon = Salmon(swimSpeed = 25.0)

tiger.run()     // I am a Tiger, and I am running
tiger.swim()    // I am a Tiger, and I am swimming
println(tiger.totalSpeed) // 60.0

salmon.swim()   // I am a Salmon, and I am swimming
println(salmon.totalSpeed) // 25.0
```

### Запуск:
Открыть файл `task3/PetHierarchy.kt` → `Run 'PetHierarchykt'`.

---

## Как запустить проект

1. Открыть проект в IntelliJ IDEA.
2. Перейти в `task1/CharCounter.kt`, `task2/TypeProcessor.kt` или `task3/PetHierarchy.kt`.
3. Запустить нужный файл через `main()` (зелёная стрелка или пкм → Run).

