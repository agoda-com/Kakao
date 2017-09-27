# Kakao

### Introduction
At Agoda, we have more that 800 automated tests to ensure our application's quality and give our best experience to the user. All of them are written with Espreeso from Google. Even though Espresso is working really well with our test, the code readability is quite low. Let's look at some of the example of how we write the test. 
```Java
onView(allOf(withId(R.id.price_item), hasDescendant(withText("Standard Rate"))))
        .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
```
This is an example just to check the visibility of the view and you can see that is not look that good. The readabiblity is decreasing as our tests are growing. As Agoda developer, we want to improve not just our codebase quality, but also our implementation of tests as well. This is why we are introducing Kakao. The library that will make you enjoy writing automated tests like you are drinking a hot chocolate.

#### Benefits
- Readabbility
- Reuseabbility
- Looks like DSL

### How to use it

### Setup
Maven
```xml
<dependency>
  <groupId>com.agoda.kakao</groupId>
  <artifactId>kakao</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
or Gradle:
```groovy
repositories {
    jcenter()
}
dependencies {
    compile 'com.agoda.kakao:kakao:1.0.0'
}
```

### Contibution Policy
TBD

### Thanks to
TBD