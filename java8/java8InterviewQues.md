

| Feature                             | Explanation                                                    | Example                        |
| ----------------------------------- | -------------------------------------------------------------- | ------------------------------ |
| 1. **Lambda Expressions**           | Anonymous functions, used to pass behavior (functions) as data | `(a, b) -> a + b`              |
| 2. **Functional Interfaces**        | Interface with **only one abstract method**                    | `Runnable`, `Comparable`       |
| 3. **Stream API**                   | Process collections in a **declarative way** (like SQL)        | `list.stream().filter().map()` |
| 4. **Optional Class**               | Handle **null safely**, avoids NullPointerException            | `Optional.ofNullable(val)`     |
| 5. **Method Reference**             | Shorthand for lambda expressions                               | `System.out::println`          |
| 6. **Default Methods**              | Interface methods with **default implementation**              | `default void print() {}`      |
| 7. **Static Methods in Interfaces** | Interface with **static utility methods**                      | `static void help() {}`        |
| 8. **Date and Time API**            | New **java.time** package replaces old `Date` & `Calendar`     | `LocalDate.now()`              |
| 9. **Collectors API**               | Used with Streams to **collect** data in list/set/string       | `collect(Collectors.toList())` |
| 10. **Nashorn JS Engine**           | Run **JavaScript** inside Java code                            | `engine.eval("print('Hi')")`   |
| 11. **Repeatable Annotations**      | Apply **same annotation multiple times**                       | `@Hint("A") @Hint("B")`        |
