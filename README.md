# Kakao
[![CircleCI](https://circleci.com/gh/agoda-com/Kakao/tree/master.svg?style=shield&circle-token=0d0ed659625be4efe54fe706c16894cd54213690)](https://circleci.com/gh/agoda-com/Kakao/tree/master)
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.1.51-blue.svg)](http://kotlinlang.org/)

Nice and simple DSL for Espresso in Kotlin

### Introduction
At Agoda, we have more that 1000 automated tests to ensure our application's quality and give our best experience to the user. All of them are written with Espresso from Google. Even though Espresso is working really well with our test, the code readability is quite low. Let's look at some of the example of how we write the test. 
```Java
onView(allOf(withId(R.id.price_item), hasDescendant(withText("Standard Rate"))))
        .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
```
This is an example just to check the visibility and you can see that it's not looking that good. As Agoda developers, we want to improve not just our codebase quality, but also our implementation of tests as well. This is why we are introducing Kakao. The library that will make you enjoy writing automated tests like you are drinking a hot chocolate.

![coco](https://user-images.githubusercontent.com/2812510/30947310-3825724c-a433-11e7-8a0d-3c3bfe00d584.png)

#### Benefits
- Readability
- Reusability
- Extensible DSL

### How to use it
#### Create Screen
Create your entity `Screen` where you will add the views involved in the interactions of the tests:
```Kotlin
class FormScreen : Screen<FormScreen>(){}
```
 `Screen` can represent the whole user interface or a portion of UI.
If you are using [Page Object pattern](https://martinfowler.com/bliki/PageObject.html) you can put the interactions of Kakao inside the Page Objects.

#### Create KViews
`Screen` contains `KViews`, these are the Android Framework views where you want to do the interactions:
```Kotlin
class FormScreen : Screen<FormScreen>(){
  val phone = KView { withId(R.id.phone)}
  val email = KEditTex { withId(R.id.email)}
  val submit = KButton { withId(R.id.submit)}
}
```
Kakao provides different types depending on the type of view:
* KView
* KEditText
* KTextView
* KButton
* KImageView
* KWebView
* KCheckbox
* KViewPager


Every KView contains matchers to retrieve the view involved in the ViewInteraction. Some examples of matchers provided
by Kakao:

* withId
* withText
* withContentDescription
* withDrawable

Like in Espresso you can combine different matchers:
```Kotlin
  val email = KEditTex { 
               withId(R.id.email)
               withText(R.string.email)
   }

```

And you can use your custom matchers:

```Kotlin
  val email = KEditTex { 
               withId(R.id.email)
               matches { MyCustomMatcher.matches(position) }
  }

```

#### Write the interaction. 

The syntax of the test with Kakao is very easy, once you have the `Screen` and the `KViews` defined, you only have to apply 
the actions or assertions like in Espresso: 
```Kotlin
val screen = FormScreen()
screen {
    phone {
       hasText("971201771")
    }
    button {
       click()
    }
}
```
Kakao provides multiple actions/assertions based on Espresso. Furthermore, you can combine them, just like the matchers. 
You can use your custom assertions or your custom actions too:
```Kotlin
val screen = FormScreen()
screen {
    phone {
       assert { MyCustomAssertion.isThaiNumber() }
    }
    button {
       act { MyCustomAction.clickOnTheCorner() }
    }
}
```

#### Advanced 

##### ListViews/RecyclersViews

Kakao offers an easy way to interact with yout RecyclerViews and ListViews  

###### Create the KListView/KRecyclerView 
Inside your `Screen` create the KView matching with your view:

For `KListView`:
```Kotlin
val list = KListView ({
            builder = { withId(R.id.list) } }
```
For `KRecyclerView`:
```Kotlin
val myList = KRecyclerView ({
             builder = { withId(R.id.recycler_view) } }
```

You can combine different matchers to retrieve your view.

###### Create KAdapterItem/KRecyclerItem 

Every adapter contains different Items, Kakao provides an easy way to define the different items of your adapter 
with `KAdapterItem` and `KRecyclerItem`.
If your adapter contains multiple Items but your interactions in your tests only works with 
one is not required to create all of them. 

`KAdapterItem`
```Kotlin
class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val title = KTextView(i) { withId(R.id.title) }
        val subtitle = KTextView(i) { withId(R.id.subtitle) }
        val button = KButton(i) { withId(R.id.button) }
}
```
    
`KRecyclerItem`    
```Kotlin
   class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
}
```

The `KView` defined in the Item corresponds views used on the Item. You can assign the `KItems` to the
 `KListView`/ `KRecyclerView` like:

```Kotlin
  val recycler: KRecyclerView = KRecyclerView({
        withId(R.id.recycler_view)
    }, itemTypeBuilder = {
        itemType(::Item)
    })
```

And finally your final interaction will be:
```Kotlin
   screen {
            recycler {
                firstChild<TestRecyclerScreen.Item> {
                    isVisible()
                    title { hasText("Title 1") }
                }
             }
   }
```
Kakao provides different accessors in the adapter:
* childAt
* firstChild
* lastChild
* childWith


##### Custom KViews
If you have custom Views in your tests and you want to create your own `KView`, we have KBaseView. Just extend 
this class and implement as much additional Action/Assertion interfaces as you want. 
You also need to override constructors that you need.

```Kotlin
class KMyView : KBaseView<KView>, MyActions, MyAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
```
 
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

### Contribution Policy
TBD

### Code of Conduct

Please refer to [Code of Conduct](https://github.com/agoda-com/Kakao/blob/master/CODE_OF_CONDUCT.md) document.

### License

Kakao is open source and available under the [Apache License, Version 2.0](https://github.com/agoda-com/Kakao/blob/master/LICENSE).

### Thanks to

* [Alviere](https://github.com/Alviere) - **Ilya Lim** 
* [VerachadW](https://github.com/VerachadW) - **Verachad Wongsawangtham**
* [Сdsap](https://github.com/cdsap) - **Inaki Villar** 
* [Vacxe](https://github.com/Vacxe) - **Konstantin Aksenov** 
* [JuDrummer](https://github.com/judrummer) - **Tipatai Puthanukunkit** 



