| Day   | Topics                                             | Activities                               |
| ----- |----------------------------------------------------| ---------------------------------------- |
| Day 1 | Spring Boot Basics + Project Structure             | Create simple Spring Boot app            |
| Day 2 | Dependency Injection + Configuration               | Practice @Component, @Autowired, @Bean   |
| Day 3 | REST API Development + Exception Handling          | Build CRUD REST API                      |
| Day 4 | Spring Data JPA + H2/MySQL                         | Integrate DB and write custom queries    |
| Day 5 | Spring Security (Basic + JWT)                      | Secure your REST API                     |
| Day 6 | Testing + Actuator  -NEED TO ADD                   | Write unit tests, use Actuator endpoints |
| Day 7 | Docker + Review + Mock Interviews      NEED TO ADD | Containerize app, revision               |

---

## 📘 Topic 1 – Basics of Spring Boot

### 1️⃣ What is Spring Boot?

> **Definition:**
> Spring Boot is a framework built on top of the Spring Framework. It helps developers **create stand-alone, production-ready applications** with minimal configuration.

> **Key Features:**

* Auto-configuration
* Embedded servers (Tomcat, Jetty)
* Starter dependencies
* No XML configuration
* Actuator for monitoring
* Spring Initializr for quick project setup

---

### 2️⃣ Spring vs Spring Boot (Interview-Focused Comparison)

Here’s a **clear, interview-focused explanation** of the **difference between Spring and Spring Boot**, including examples and a comparison table.

| Feature               | **Spring Framework**                             | **Spring Boot**                                                     |
| --------------------- | ------------------------------------------------ | ------------------------------------------------------------------- |
| **Definition**        | Core Java framework for building enterprise apps | Extension of Spring for easy setup and faster development           |
| **Configuration**     | **Manual configuration** (XML, Java Config)      | **Auto-configuration** (minimal setup needed)                       |
| **Server Deployment** | Deploy WAR to **external servers**               | Runs with **embedded server** (e.g., Tomcat, Jetty)                 |
| **Setup Time**        | Requires more time to set up                     | **Quick setup** with Spring Initializr                              |
| **Build Files**       | Add each dependency manually                     | Uses **Starter dependencies** (e.g., `spring-boot-starter-web`)     |
| **Annotations**       | Uses many Spring annotations                     | Adds Spring Boot-specific annotations like `@SpringBootApplication` |
| **Purpose**           | Flexible for any Java application                | Simplifies **REST API, Microservices, Cloud Apps**                  |
| **Command Line**      | No built-in CLI                                  | Spring Boot provides a **CLI for quick testing**                    |
| **Monitoring**        | Not built-in                                     | Built-in **Spring Boot Actuator** for health, metrics, etc.         |

---

### 💬 When to Use Spring vs Spring Boot

| Use Case                          | Recommended Choice |
| --------------------------------- | ------------------ |
| Full control over configuration   | Spring             |
| Quick REST API development        | Spring Boot        |
| Microservices or Cloud deployment | Spring Boot        |
| Large enterprise legacy systems   | Spring             |

---

### 🎯 Common Interview Question

> **Q: Is Spring Boot replacing Spring Framework?**
> **A:** No. Spring Boot **uses Spring Framework internally**. It just makes it easier to work with. Think of Spring Boot as a **tool that accelerates Spring development**.

---

### 3️⃣ Auto-Configuration and Starters

#### 🔹 Auto-Configuration

Spring Boot automatically configures your application based on the libraries (dependencies) present in your build file. For example:

* If `spring-boot-starter-web` is added, Spring Boot auto-configures MVC, embedded Tomcat, etc.

#### 🔹 Starter Dependencies

Predefined dependency packages to simplify project setup.

| Starter                        | Purpose                    |
| ------------------------------ | -------------------------- |
| `spring-boot-starter-web`      | Web apps and REST APIs     |
| `spring-boot-starter-data-jpa` | JPA with Hibernate         |
| `spring-boot-starter-test`     | Unit & integration testing |

---
Perfect! Here's your updated README with **Topic 2** formatted and integrated cleanly, just like **Topic 1**. It includes all content in one structured block under **✅ Topic 2 – Dependency Injection + Configuration**, ready for use in a professional and interview-focused guide.

---

## ✅ Topic 2 – Dependency Injection + Configuration

### 1️⃣ Dependency Injection (DI) – Explained for Interviews

#### 🎯 What is Dependency Injection?

> **Definition:**
> Dependency Injection is a design pattern where **objects (dependencies) are injected** into a class instead of the class creating them.

➡️ In Spring, the **framework manages object creation** and wiring — reducing boilerplate code and improving flexibility, testability, and maintenance.

---

### 🔹 Types of Dependency Injection in Spring

| Type                  | Example Syntax                        |
| --------------------- | ------------------------------------- |
| Constructor Injection | Inject dependency via constructor     |
| Setter Injection      | Inject via setter method              |
| Field Injection       | Inject directly into a field (common) |

---

### 💻 Example – Constructor Injection

```java
@Component
public class UserService {
    private final UserRepository userRepository;

    // Constructor Injection
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

➡️ Spring automatically injects the `UserRepository` bean into `UserService`.

---

### ❓ Common Interview Questions – Dependency Injection

| Question                                                       | Answer                                                                                          |
| -------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Q1. What is dependency injection?**                          | A design pattern where dependencies are provided by the Spring container                        |
| **Q2. How does Spring perform DI?**                            | Using `@Autowired`, and via constructor/setter/field injection                                  |
| **Q3. Which DI type is recommended in Spring Boot?**           | **Constructor injection** (easier for testing and promotes immutability)                        |
| **Q4. What is the difference between @Autowired and @Inject?** | Both inject dependencies; `@Autowired` is Spring-specific, `@Inject` is Java standard (JSR-330) |
| **Q5. What happens if no bean is found during injection?**     | Spring throws **NoSuchBeanDefinitionException** (unless marked optional)                        |

---

### 2️⃣ Configuration in Spring Boot

#### 🎯 What is Configuration?

Spring Boot allows you to manage app settings using **configuration files** (`application.properties` or `application.yml`) and inject values into your code for flexibility.

---

### 💻 Example – Using `@Value`

```properties
# application.properties
app.name=SpringBootApp
```

```java
@Component
public class AppInfo {

    @Value("${app.name}")
    private String appName;

    public void printAppName() {
        System.out.println("App Name: " + appName);
    }
}
```

➡️ This injects the value `SpringBootApp` into the `appName` field.

---

### 💻 Example – Using `@ConfigurationProperties`

```properties
# application.properties
app.name=SpringBootApp
app.version=1.0
```

```java
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private String name;
    private String version;
    // Getters and Setters
}
```

➡️ Spring automatically binds the values to fields in `AppConfig`.

---

### ❓ Common Interview Questions – Configuration

| Question                                                                    | Answer                                                                                |
| --------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| **Q1. How do you read values from application.properties?**                 | Use `@Value` or `@ConfigurationProperties`                                            |
| **Q2. What is the difference between @Value and @ConfigurationProperties?** | `@Value` for single values; `@ConfigurationProperties` for grouped mapping            |
| **Q3. What is @Configuration used for?**                                    | Declares a class that defines **beans** using `@Bean` methods                         |
| **Q4. How does Spring Boot handle different environments?**                 | Using **profiles**: e.g., `application-dev.properties`, `application-prod.properties` |
| **Q5. What is externalized configuration in Spring Boot?**                  | Ability to **inject config from files, env variables, or command-line args**          |

---

### 💻 Example – `@Configuration` and `@Bean`

```java
@Configuration
public class MyConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```

➡️ Spring creates and manages the `MyService` bean via the configuration class.

---

### 🚀 Summary Cheat Sheet

| Annotation                 | Purpose                               |
| -------------------------- | ------------------------------------- |
| `@Autowired`               | Injects dependency automatically      |
| `@Value("${key}")`         | Injects a single configuration value  |
| `@Configuration`           | Declares a configuration class        |
| `@Bean`                    | Defines a bean manually               |
| `@ConfigurationProperties` | Binds multiple values from properties |

---
Excellent! Here’s your complete **Topic 3 – REST API Development in Spring Boot**, structured cleanly and professionally as part of your interview preparation README.

---

## ✅ Topic 3 – REST API Development in Spring Boot

---

### 1️⃣ What is a REST API?

> **Definition:**
> REST (Representational State Transfer) is a **web service architecture** where clients perform operations using standard **HTTP methods**.

| Method | Purpose              | Example          |
| ------ | -------------------- | ---------------- |
| GET    | Retrieve data        | Get user info    |
| POST   | Create new data      | Add a new user   |
| PUT    | Update existing data | Update user info |
| DELETE | Delete data          | Remove user      |

---

### 2️⃣ CRUD Operations – Explained

> **CRUD** stands for **Create, Read, Update, Delete** — the **four basic operations** supported by databases and REST APIs.

---

### 📊 Summary Table – CRUD Operation Comparison

| Operation | Action       | HTTP Method | REST Endpoint             | SQL Equivalent |
| --------- | ------------ | ----------- | ------------------------- | -------------- |
| Create    | Add new data | POST        | `/users`                  | INSERT         |
| Read      | Get data     | GET         | `/users` or `/users/{id}` | SELECT         |
| Update    | Modify data  | PUT/PATCH   | `/users/{id}`             | UPDATE         |
| Delete    | Remove data  | DELETE      | `/users/{id}`             | DELETE         |

---

### 🛠️ REST Status Codes for CRUD Operations

| Operation | Success Status Code     | Failure Status Code |
| --------- | ----------------------- | ------------------- |
| Create    | 201 Created             | 400 Bad Request     |
| Read      | 200 OK                  | 404 Not Found       |
| Update    | 200 OK / 204 No Content | 404 Not Found       |
| Delete    | 200 OK / 204 No Content | 404 Not Found       |

---

## 3️⃣ Basic CRUD Example – "User Management API"

Let’s create a REST API for a **User** entity with full CRUD operations.

---

### 💻 Entity Class – `User.java`

```java
public class User {
    private Long id;
    private String name;
    private String email;

    // Getters and Setters
}
```

---

### 💻 Controller – `UserController.java`

```java
@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long, User> userDB = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    @PostMapping
    public User createUser(@RequestBody User user) {
        long id = idCounter.incrementAndGet();
        user.setId(id);
        userDB.put(id, user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userDB.get(id);
        if (user == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User existingUser = userDB.get(id);
        if (existingUser == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        return existingUser;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        User removed = userDB.remove(id);
        if (removed == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        return "User deleted successfully.";
    }
}
```

---

## ✅ Exception Handling in Spring Boot REST API

---

### 1️⃣ Why Exception Handling?

> To return **custom, meaningful error responses** instead of generic server errors (500).

---

### 2️⃣ Custom Exception – `UserNotFoundException.java`

```java
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
```

---

### 3️⃣ Global Exception Handler – `GlobalExceptionHandler.java`

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```

---

## 📝 Most Repeated Interview Questions – REST API + Exception Handling

---

### 🔹 1. What is `@RequestBody` and `@ResponseBody`?

* `@RequestBody`: Converts **JSON request** → Java Object.
* `@ResponseBody`: Converts **Java Object → JSON** in response.

---

### 🔹 2. How do you handle exceptions globally?

Use `@RestControllerAdvice` + `@ExceptionHandler`.

```java
@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
}
```

---

### 🔹 3. What is `ResponseEntity`?

* Used to **customize HTTP status, headers, and body**.

```java
return new ResponseEntity<>("Created", HttpStatus.CREATED);
```

---

### 🔹 4. Common HTTP Status Codes

| Status Code               | Meaning          | Usage                    |
| ------------------------- | ---------------- | ------------------------ |
| 200 OK                    | Success          | GET, PUT, DELETE success |
| 201 Created               | Resource created | POST success             |
| 400 Bad Request           | Invalid input    | Client error             |
| 404 Not Found             | Resource missing | Resource not found in DB |
| 500 Internal Server Error | Server issue     | Unhandled exception      |

---

### 🔹 5. How to validate request data?

Use `javax.validation` with `@Valid`.

```java
public class User {
    @NotNull(message = "Name is required")
    private String name;
}

@PostMapping("/users")
public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
    // save user
}
```

➡️ Spring auto-validates and throws exception if validation fails.

---

### 🔹 6. Difference: `@RequestParam` vs `@PathVariable`

| `@RequestParam`   | `@PathVariable` |
| ----------------- | --------------- |
| From query params | From URL path   |
| `/users?id=1`     | `/users/1`      |

---

### 🔹 7. Custom Error Response JSON

```java
public class ErrorResponse {
    private String message;
    private Date timestamp;
}
```

```java
@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorResponse> handleError(Exception ex) {
    ErrorResponse error = new ErrorResponse("Server Error", new Date());
    return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
}
```

---

### 🔹 8. What is `@ResponseStatus`?

Set HTTP status **without using ResponseEntity**.

```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {}
```

---

## 🚀 Bonus Rapid Fire Q\&A

| Question                               | One-Line Answer                                               |
| -------------------------------------- | ------------------------------------------------------------- |
| How to secure REST API in Spring Boot? | Use Spring Security (JWT, OAuth, Basic Auth)                  |
| What is CORS? How to allow it?         | Cross-Origin Resource Sharing; use `@CrossOrigin`             |
| What is HATEOAS?                       | Adds **hyperlinks in REST responses** for resource navigation |

Perfect! Here’s a clear, detailed, and interview-focused explanation of **Spring Data JPA with H2/MySQL** — with setup steps, code examples, key concepts, and common interview questions.

---

# ✅ Topic 4 – Spring Data JPA + H2/MySQL Guide

---

## 🔹 What is Spring Data JPA?

> Spring Data JPA simplifies database access by providing ready-made **repository interfaces** (like `JpaRepository`) that implement common CRUD and pagination operations, so you don't write SQL manually.

---

## 🚀 Step-by-Step Setup (H2 and MySQL)

### 1️⃣ Add dependencies (`pom.xml` for Maven)

```xml
<!-- Spring Data JPA starter -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- H2 in-memory DB -->
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>

<!-- MySQL connector -->
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
</dependency>
```

---

### 2️⃣ Configure `application.properties`

**For H2:**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

*Access H2 Console:* `http://localhost:8080/h2-console`

---

**For MySQL:**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Create Entity Class — `User.java`

```java
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    // Getters and Setters
}
```

---

### 4️⃣ Create Repository Interface — `UserRepository.java`

```java
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);  // Custom finder method
}
```

*Inherited methods:* `save()`, `findById()`, `findAll()`, `deleteById()`, etc.

---

### 5️⃣ Service Layer (optional but recommended)

```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Additional methods: update, delete, findById, etc.
}
```

---

### 6️⃣ Controller — REST API Example

```java
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Add update, delete, getById methods similarly
}
```

---

# ✅ Interview Questions on Spring Data JPA + H2/MySQL

| Question                                        | Answer                                                                                         |
| ----------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| What is `JpaRepository`?                        | Interface that provides CRUD, pagination, and sorting methods for JPA entities.                |
| How does Spring Boot auto-configure JPA?        | Based on `spring.datasource.*` properties and presence of JPA starter dependency.              |
| Purpose of `@Entity` and `@Id`?                 | `@Entity` marks a class as a DB table, `@Id` marks the primary key field.                      |
| Difference between `save()` and `saveAll()`?    | `save()` persists one entity; `saveAll()` persists a collection of entities.                   |
| What is `@Query` used for?                      | Writing custom JPQL/SQL queries inside repository interfaces.                                  |
| Why use H2 database?                            | Lightweight in-memory DB useful for fast tests and development without installing a DB server. |
| How to handle schema creation?                  | Use `spring.jpa.hibernate.ddl-auto` with values like `update`, `create`, or `validate`.        |
| Difference between `findById()` and `getOne()`? | `findById()` returns `Optional`, `getOne()` returns a lazy proxy (now deprecated).             |

---

# ✅ Bonus: Custom Query Example Using `@Query`

```java
@Query("SELECT u FROM User u WHERE u.name = ?1")
List<User> findByName(String name);
```

---

# 🚀 Summary: Key Annotations

| Annotation        | Purpose                           |
| ----------------- | --------------------------------- |
| `@Entity`         | Marks class as DB table           |
| `@Id`             | Marks primary key field           |
| `@GeneratedValue` | Auto-generates primary key value  |
| `@Repository`     | Marks repository interface        |
| `@Query`          | Define custom JPQL/SQL queries    |
| `@Autowired`      | Inject dependencies automatically |

---
Absolutely! Let me **explain Spring Security from scratch** — step by step — with a **full working code example** for both **Basic Authentication** and **JWT Authentication**. This will be easy to follow even if you're a complete beginner.

---

# ✅TOPIC 5  SPRING SECURITY — BEGINNER TO ADVANCED EXPLANATION

---

# 1️⃣ What is Spring Security?

> **Spring Security** protects your application by handling:

* **Authentication** – Verifying who the user is.
* **Authorization** – Controlling what the user is allowed to do.

---

# 2️⃣ PART 1: BASIC AUTHENTICATION – Step-by-Step with Working Code

### 🔸 Basic Auth = username + password sent with every request.

---

### ✅ Project Setup – Spring Boot + Spring Security

### Required Dependencies in `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Security -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
</dependencies>
```

---

### ✅ Step 1: Create a Simple REST Controller

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, this is a secured API!";
    }
}
```

---

### ✅ Step 2: Security Configuration Class

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Define an in-memory user with username/password
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")                // username
            .password("{noop}password")     // password (noop = plain text)
            .roles("USER");                 // role
    }

    // Secure all requests using Basic Auth
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()               // disable CSRF for simplicity
            .authorizeRequests()
            .anyRequest().authenticated()   // all requests need authentication
            .and()
            .httpBasic();                   // enable Basic Auth
    }
}
```

---

### ✅ Run and Test

* URL: `http://localhost:8080/hello`
* Use browser OR tool like **Postman**.
* It will ask for **username: user**, **password: password**.

---

# 3️⃣ PART 2: JWT AUTHENTICATION – Step-by-Step with Working Code

---

## ✅ What is JWT?

* After login, the server gives a **token**.
* You use the token in future requests — no password needed again.
* JWT is **signed** to prevent tampering.

---

### ✅ Additional Dependency for JWT (pom.xml):

```xml
<!-- JWT Library -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

---

### ✅ Step 1: Create JWT Utility Class

```java
@Component
public class JwtUtil {
    private String secret = "mysecret";  // secret key for signing JWT

    // Generate JWT token
    public String generateToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
            .signWith(SignatureAlgorithm.HS256, secret)
            .compact();
    }

    // Extract username from token
    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey(secret)
            .parseClaimsJws(token)
            .getBody().getSubject();
    }

    // Validate token
    public boolean validateToken(String token, String username) {
        return extractUsername(token).equals(username);
    }
}
```

---

### ✅ Step 2: Create Login API Controller

```java
@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        // For simplicity, authenticate manually
        if ("user".equals(username) && "password".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(token);  // return JWT token
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
```

---

### ✅ Step 3: JWT Filter – Intercept Requests and Validate Token

```java
@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
        throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            String username = jwtUtil.extractUsername(token);

            if (username != null && jwtUtil.validateToken(token, username)) {
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }
        chain.doFilter(request, response);
    }
}
```

---

### ✅ Step 4: Configure Security for JWT

```java
@Configuration
@EnableWebSecurity
public class JwtSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/login").permitAll()   // allow login endpoint
            .anyRequest().authenticated();       // secure other APIs

        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
```

---

### ✅ Test JWT Auth

1. Send **POST `/login`** with correct credentials → get JWT token.
2. Call **GET `/hello`** with header:

   ```
   Authorization: Bearer <your-token>
   ```

# ✅ 1. OAuth2 Authentication (Google Login) – Spring Boot Example
---

# 🔐 1️⃣ OAuth2 Authentication – Login with Google (or GitHub, Facebook)

---

## ✨ What is OAuth2 Login?

* Allows users to log in using **Google, GitHub, Facebook**, etc.
* Spring Security handles **redirection**, **authentication**, and **user details** automatically.

---

## ✅ Setup: Spring Boot + Google Login (Full Example)

### Dependencies in `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Security OAuth2 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-oauth2-client</artifactId>
    </dependency>
</dependencies>
```

---

### ✅ Configuration in `application.properties`

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.registration.google.scope=openid, email, profile

# Redirect after successful login
spring.security.oauth2.client.registration.google.redirect-uri={baseUrl}/login/oauth2/code/google
```

---

### ✅ Controller Example

```java
@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Principal principal) {
        return "Hello, " + principal.getName();
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        return "Login successful with Google!";
    }
}
```

---

### ✅ How it Works:

1. Open: `http://localhost:8080`
2. Redirects to **Google login page**.
3. After login, redirected back to your app.
4. You can access **user info** from `Principal`.

---

## 🧠 Interview Tip: Explain OAuth2 Flow

* Client → Authorization Server (Google) → Authorization Code → Token → Client.
* Spring handles this with **OAuth2 Client module**.

---

| Feature       | OAuth2 Login                  | API Key Auth         |
| ------------- | ----------------------------- | -------------------- |
| Use case      | User login via Google, GitHub | Secure API with key  |
| Security      | High – token-based            | Moderate – key-based |
| Server checks | OAuth2 token + user info      | API key value        |
| Example usage | Web app login                 | 3rd-party API access |

---
# 🎯 Summary Table

| Feature     | Basic Auth          | JWT Auth                          |
| ----------- | ------------------- | --------------------------------- |
| Send Data   | Username + password | JWT Token                         |
| Secure?     | Needs HTTPS         | Signed token (more secure)        |
| Stateless   | Yes                 | Yes                               |
| Token?      | No                  | Yes                               |
| Scalability | Low                 | High (suitable for microservices) |

---

# ✅ Complete Clear Explanation of Spring Boot & Spring Data JPA Annotations

---

## 1️⃣ **@SpringBootApplication**

* **Purpose:**
  Marks the main class that bootstraps the Spring Boot application. It combines these three annotations internally:

    * `@Configuration`: Marks the class as a source of bean definitions.
    * `@EnableAutoConfiguration`: Automatically configures Spring based on dependencies present.
    * `@ComponentScan`: Scans the package for Spring components (@Service, @Repository, etc.)

* **Example:**

```java
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
```

---

## 2️⃣ **@RestController** vs **@Controller**

* **@Controller**:
  Marks a class as a Spring MVC controller that returns **views** (HTML pages). Used with templating engines like Thymeleaf.

* **@RestController**:
  Specialization of `@Controller` that returns **data directly** (usually JSON or XML) instead of a view. It’s shorthand for `@Controller + @ResponseBody`.

* **Example:**

```java
@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";  // Returns plain text or JSON response
    }
}
```

---

## 3️⃣ **@RequestMapping** and HTTP Method Specific Annotations

* **@RequestMapping**:
  Maps HTTP requests to controller methods. Can handle any HTTP method (GET, POST, etc.)

* **HTTP Method Shortcuts**:

    * `@GetMapping`: For GET requests
    * `@PostMapping`: For POST requests
    * `@PutMapping`: For PUT requests
    * `@DeleteMapping`: For DELETE requests

* **Example:**

```java
@GetMapping("/users")
public List<User> getUsers() { ... }

@PostMapping("/users")
public User createUser(@RequestBody User user) { ... }
```

---

## 4️⃣ **@Autowired** vs **@Inject**

* **@Autowired**:
  Spring’s annotation to **inject a dependency** automatically.

* **@Inject**:
  Standard Java annotation (JSR-330), similar to `@Autowired`.

* **Example:**

```java
@Service
public class UserService {

    @Autowired  // or @Inject
    private UserRepository userRepository;
}
```

---

## 5️⃣ **Stereotype Annotations: @Component, @Service, @Repository, @Controller**

* **@Component**:
  Generic Spring bean component. Use when no specific stereotype fits.

* **@Service**:
  Marks business logic/service layer beans.

* **@Repository**:
  Marks DAO/data access layer beans. Also enables Spring’s exception translation (converts low-level database exceptions into Spring’s DataAccessException).

* **@Controller**:
  Marks web controller classes for handling HTTP requests (MVC).

* **Example:**

```java
@Component
public class Helper {}

@Service
public class UserService {}

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
```

---

## 6️⃣ **@Value vs @ConfigurationProperties**

* **@Value**:
  Injects a **single** property value from application properties.

* **@ConfigurationProperties**:
  Binds **multiple related properties** into a POJO.

* **Example – @Value:**

```java
@Value("${app.name}")
private String appName;
```

* **Example – @ConfigurationProperties:**

```java
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private String name;
    private String version;
    // getters/setters
}
```

---

## 7️⃣ **@Bean vs @Component**

* **@Bean**:
  Define beans **manually** inside a configuration class.

* **@Component**:
  Annotate a class to let Spring detect and register it automatically.

* **Example – @Bean:**

```java
@Configuration
public class MyConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```

* **Example – @Component:**

```java
@Component
public class MyService {}
```

---

## 8️⃣ **@PathVariable vs @RequestParam**

* **@PathVariable**:
  Extracts data from URI path.

* **@RequestParam**:
  Extracts data from query parameters.

* **Example:**

```java
@GetMapping("/users/{id}")
public User getUser(@PathVariable Long id) { ... }

@GetMapping("/users")
public User getUser(@RequestParam Long id) { ... }
```

---

## 9️⃣ **@RestControllerAdvice + @ExceptionHandler**

* **@RestControllerAdvice**:
  Class-level annotation for handling exceptions globally for REST APIs.

* **@ExceptionHandler**:
  Method-level annotation to handle specific exceptions.

* **Example:**

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handle(UserNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
```

---

## 🔟 **@ResponseStatus**

* Sets HTTP response status on exceptions without manually returning `ResponseEntity`.

* **Example:**

```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {}
```

---

# 🔥 **Spring Data JPA Annotations (For H2/MySQL)**

---

## 1️⃣ **@Entity**

* Marks a Java class as a **database entity (table)**.

* **Example:**

```java
@Entity
public class User { ... }
```

---

## 2️⃣ **@Id**

* Marks the **primary key** field.

* **Example:**

```java
@Id
private Long id;
```

---

## 3️⃣ **@GeneratedValue**

* Specifies how the primary key is generated.

* Common strategies:

    * `GenerationType.IDENTITY` (auto-increment)
    * `GenerationType.SEQUENCE` (database sequence)
    * `GenerationType.AUTO` (JPA decides)

* **Example:**

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

---

## 4️⃣ **@Column**

* Customize column properties like:

    * `unique = true`
    * `nullable = false`
    * `length = 100`

* **Example:**

```java
@Column(unique = true, nullable = false)
private String email;
```

---

## 5️⃣ **@Table**

* Customize the table name and schema.

* **Example:**

```java
@Entity
@Table(name = "users")
public class User { ... }
```

---

## 6️⃣ **@Repository**

* Marks the **DAO/repository layer**.

* Enables Spring’s exception translation.

* **Example:**

```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
```

---

## 7️⃣ **@Query**

* Define custom JPQL or native SQL queries on repository methods.

* Supports positional (`?1`) and named (`:name`) parameters.

* **Example:**

```java
@Query("SELECT u FROM User u WHERE u.name = ?1")
List<User> findByName(String name);
```

---

## 8️⃣ **@Transactional**

* Defines **transaction boundaries** at class or method level.

* Ensures commits or rollbacks based on method success or failure.

* Typically used in service layer.

* **Example:**

```java
@Service
@Transactional
public class UserService {
    public void createUser(User user) {
        // transactional save logic
    }
}
```

---

## 9️⃣ **@Autowired**

* Injects Spring-managed beans (repositories, services) automatically.

* **Example:**

```

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
}
```

---
Sure! Here's a clear explanation of the difference between **One-to-Many** and **Many-to-One** mappings in JPA/Hibernate with examples:

---

# 10 Difference between One-to-Many and Many-to-One Mapping

---

## 1️⃣ **One-to-Many Mapping**

* **Definition:**
  One entity instance is related to **many** instances of another entity.

* **Example:**
  A **Department** has **many Employees**.

* **Usage:**
  Placed on the **"one" side** of the relationship.

* **Annotation:**
  `@OneToMany`

* **Example code:**

```java
@Entity
public class Department {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")  // department field in Employee class
    private List<Employee> employees;

    // getters and setters
}
```

* Here, one Department has many Employees.

---

## 2️⃣ **Many-to-One Mapping**

* **Definition:**
  Many instances of an entity relate to **one** instance of another entity.

* **Example:**
  Many **Employees** belong to one **Department**.

* **Usage:**
  Placed on the **"many" side** of the relationship.

* **Annotation:**
  `@ManyToOne`

* **Example code:**

```java
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")  // foreign key column in Employee table
    private Department department;

    // getters and setters
}
```

* Here, many Employees belong to one Department.

---

## 🔄 Summary Table

| Aspect               | One-to-Many                               | Many-to-One                               |
| -------------------- | ----------------------------------------- | ----------------------------------------- |
| Relationship type    | One entity → Many entities                | Many entities → One entity                |
| Annotated on         | The **one** side entity class             | The **many** side entity class            |
| Annotation used      | `@OneToMany`                              | `@ManyToOne`                              |
| Foreign key location | Stored in the **many** side (child table) | Stored in the **many** side (child table) |
| Example relationship | Department → List<Employee>               | Employee → Department                     |
| Mapping direction    | Parent holds collection of children       | Child holds reference to parent           |

---

## Important Notes:

* Usually, the **foreign key column** is stored in the **many-side** table (e.g., `employee` table has `department_id` column).
* The **one-side** maintains the collection using `mappedBy` attribute to avoid duplicate foreign keys.
* They represent **two sides of the same relationship** and are often used together.

---

# 📌 **Summary Table**

| Annotation                 | Purpose                                   | Example   |
| -------------------------- | ----------------------------------------- | --------- |
| `@SpringBootApplication`   | Main Spring Boot app entry point          | See above |
| `@RestController`          | REST API controller returning JSON/XML    | See above |
| `@RequestMapping`          | Maps HTTP requests                        | See above |
| `@GetMapping` etc.         | HTTP method-specific request mapping      | See above |
| `@Autowired`               | Dependency injection                      | See above |
| `@Component`               | Generic Spring bean                       | See above |
| `@Service`                 | Service layer bean                        | See above |
| `@Repository`              | DAO layer with exception translation      | See above |
| `@Value`                   | Inject single property                    | See above |
| `@ConfigurationProperties` | Bind multiple properties                  | See above |
| `@Bean`                    | Manual bean definition in config          | See above |
| `@PathVariable`            | Extract path variable from URL            | See above |
| `@RequestParam`            | Extract query parameter                   | See above |
| `@RestControllerAdvice`    | Global exception handling                 | See above |
| `@ExceptionHandler`        | Handle specific exceptions                | See above |
| `@ResponseStatus`          | Set HTTP status on exceptions             | See above |
| `@Entity`                  | Marks a database entity (table)           | See above |
| `@Id`                      | Marks primary key                         | See above |
| `@GeneratedValue`          | Configures auto-generation of primary key | See above |
| `@Column`                  | Customize DB column                       | See above |
| `@Table`                   | Customize table name/schema               | See above |
| `@Query`                   | Define custom queries                     | See above |
| `@Transactional`           | Define transactional scope                | See above |

---
