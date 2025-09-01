Alright — here are the **Top 10 Java String Interview Questions with Answers** so you can answer quickly and confidently.

---

## **1️⃣ Is String a data type in Java?**

**Answer:**
No, `String` is not a primitive data type. It’s a **class** in `java.lang`, and every string is an object (instance of `String`).

---

## **2️⃣ Why is String immutable in Java?**

**Answer:**
`String` is immutable so that:

* It can be safely stored in the **String Constant Pool** and reused without changes.
* Security: prevents modification of sensitive data like passwords.
* Thread safety: immutable objects can be shared between threads without synchronization.
* Allows caching of hash codes for faster `HashMap`/`HashSet` lookups.

---

## **3️⃣ Difference between String literal and `new String()`**

**Answer:**

```java
String s1 = "Java";             // Uses String Constant Pool, reuses existing object
String s2 = new String("Java"); // Creates a new object in heap memory
```

* Literal: reuses object if it already exists in SCP.
* `new`: always creates a new object.

---

## **4️⃣ How does String pool work?**

**Answer:**
The **String Constant Pool (SCP)** stores one copy of each unique string literal.
When you create a literal, Java checks SCP:

* If present → reuse reference.
* If not → create and store in SCP.

---

## **5️⃣ What is the difference between `==` and `.equals()` in Strings?**

**Answer:**

* `==` → Compares **references** (memory addresses).
* `.equals()` → Compares **contents** (character sequences).

Example:

```java
String a = "Java";
String b = new String("Java");
a == b         // false
a.equals(b)    // true
```

---

## **6️⃣ What is `String.intern()` method?**

**Answer:**
Returns a canonical (pooled) string reference from SCP.

```java
String s1 = new String("Java");
String s2 = s1.intern();
```

Here, `s2` will point to the SCP object `"Java"`.

---

## **7️⃣ Why is String final in Java?**

**Answer:**

* Prevents subclassing → avoids breaking immutability.
* Ensures security (no malicious override of methods like `hashCode()` or `equals()`).
* Guarantees consistent behavior in collections and the pool.

---

## **8️⃣ How many objects are created with `String s = new String("Java")`?**

**Answer:**

* If `"Java"` is not in SCP → **2 objects** (one in SCP, one in heap).
* If already in SCP → **1 object** (only heap object).

Got it! Here’s a **simple, clear diagram** to explain how many objects are created with:

```java
String s = new String("Java");
```

---

### Diagram: Objects Created and References

```
Step 1: Check String Constant Pool (SCP)

+-----------------------+
|    String Pool (SCP)  |
|  +-----------------+  |
|  |  "Java"         |  |  <-- 1 object (if not already present)
|  +-----------------+  |
+-----------------------+

Step 2: Create new String object in Heap

+-----------------------+
|      Heap Memory      |
|  +-----------------+  |
|  | new String obj   |  |  <-- 1 new object created here (copy of "Java")
|  +-----------------+  |
+-----------------------+

Step 3: Reference variable points to heap object

Stack (Reference Variables):

  s  ─────────────►  new String obj in Heap
```
---

## **9️⃣ Why is String a popular key in HashMap?**

**Answer:**

* Immutable → hash code never changes.
* Caching of hash code → faster lookups.
* Frequently used → memory-efficient with SCP.

---

## **🔟 How do you convert between String and other types?**

**Examples:**

* String → int: `int n = Integer.parseInt("123");`
* int → String: `String s = String.valueOf(123);`
* String → char array: `"Java".toCharArray();`
* char array → String: `new String(new char[]{'J','a','v','a'});`

---
