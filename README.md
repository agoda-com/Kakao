# Kakao project is now being developed here: [KakaoCup/Kakao](https://github.com/KakaoCup/Kakao).
### Kudos to all contributors and maintainers!

### This repo is no longer supported.
### Archived versions are available in maven central, for new releases please follow a new repo.

# Kakao
[ ![Download](https://api.bintray.com/packages/agoda/maven/kakao/images/download.svg) ](https://bintray.com/agoda/maven/kakao/_latestVersion)
[![CircleCI](https://circleci.com/gh/agoda-com/Kakao/tree/master.svg?style=shield&circle-token=0d0ed659625be4efe54fe706c16894cd54213690)](https://circleci.com/gh/agoda-com/Kakao/tree/master)
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.4.10-blue.svg)](http://kotlinlang.org/)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Kakao-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/6314)

Nice and simple DSL for Espresso in Kotlin

### Introduction
At Agoda, we have more than 1000 automated tests to ensure our application's quality and give our best experience to the user. All of them are written with Espresso from Google. Even though Espresso is working really well with our test, the code readability is quite low. Let's look at some of the examples of how we write the test. 
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
class FormScreen : Screen<FormScreen>()
```
 `Screen` can represent the whole user interface or a portion of UI.
If you are using [Page Object pattern](https://martinfowler.com/bliki/PageObject.html) you can put the interactions of Kakao inside the Page Objects.

#### Create KView
`Screen` contains `KView`, these are the Android Framework views where you want to do the interactions:
```Kotlin
class FormScreen : Screen<FormScreen>() {
    val phone = KEditText { withId(R.id.phone) }
    val email = KEditText { withId(R.id.email) }
    val submit = KButton { withId(R.id.submit) }
}
```
Kakao provides different types depending on the type of view:
* `KView`
* `KEditText`
* `KTextView`
* `KButton`
* `KImageView`
* `KWebView`
* `KCheckbox`
* `KViewPager`
* `KSeekBar`
* `KSwitch`
* <b>and more</b>


Every `KView` contains matchers to retrieve the view involved in the `ViewInteraction`. Some examples of matchers provided
by Kakao:

* `withId`
* `withText`
* `withContentDescription`
* `withDrawable`
* `withBackgroundColor`
* <b>and more</b>

Like in Espresso you can combine different matchers:
```Kotlin
val email = KEditText { 
    withId(R.id.email)
    withText(R.string.email)
}
```

And you can use your custom matchers:

```Kotlin
val email = KEditText { 
    withId(R.id.email)
    matches { MyCustomMatcher.matches(position) }
}
```

#### Write the interaction. 

The syntax of the test with Kakao is very easy, once you have the `Screen` and the `KView` defined, you only have to apply 
the actions or assertions like in Espresso: 
```Kotlin
onScreen<FormScreen> {
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
onScreen<FormScreen> {
    phone {
       assert { MyCustomAssertion.isThaiNumber() }
    }
    button {
       act { MyCustomAction.clickOnTheCorner() }
    }
}
```

#### Advanced 

##### ListView/RecyclersView

Kakao offers an easy way to interact with your `RecyclerView` and `ListView`

###### Create the KListView/KRecyclerView 
Inside your `Screen` create the KView matching with your view:

For `KListView`:
```Kotlin
val list = KListView { builder = { withId(R.id.list) } }
```
For `KRecyclerView`:
```Kotlin
val recycler = KRecyclerView { builder = { withId(R.id.recycler_view) } }
```

You can combine different matchers to retrieve your view.

###### Create KAdapterItem/KRecyclerItem 

Every adapter contains different Items, Kakao provides an easy way to define the different items of your adapter 
with `KAdapterItem` and `KRecyclerItem`.
If your adapter contains multiple Items but your interactions in your tests only work with 
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
onScreen<RecyclerScreen> {
    recycler {
        firstChild<TestRecyclerScreen.Item> {
            isVisible()
            title { hasText("Title 1") }
        }
    }
}
```
Kakao provides different accessors in the adapter:
* `childAt`
* `firstChild`
* `lastChild`
* `childWith`

##### Custom KView

If you have custom Views in your tests and you want to create your own `KView`, we have `KBaseView`. Just extend 
this class and implement as much additional Action/Assertion interfaces as you want. 
You also need to override constructors that you need.

```Kotlin
class KMyView : KBaseView<KView>, MyActions, MyAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
```

##### Intercepting

If you need to add custom logic during the `Kakao -> Espresso` call chain (for example, logging) or
if you need to completely change the `ViewAssertion` or `ViewAction` that are being sent to Espresso
during runtime in some cases, you can use the intercepting mechanism.

Interceptors are lambdas that you pass to a configuration DSL that will be invoked before `ViewInteraction`,
`DataInteraction` or `Web.WebInteraction` classes' `perform` and `check` calls happening from inside Kakao.

You have the ability to provide interceptors at 3 different levels: Kakao runtime, your 'Screen' classes
and any individual `KView` instance.

On each invocation of Espresso function that can be intercepted, Kakao will aggregate all available interceptors
for this particular call and invoke them in descending order: `KView interceptor -> Active Screens interceptors ->
Kakao interceptor`.

Each of the interceptors in the chain can break the chain call by setting `isOverride` to true during configuration.
In that case Kakao will not only stop invoking remaining interceptors in the chain, **but will not perform the Espresso
call**. It means that in such case, the responsibility to actually invoke Espresso lies on the shoulders
of the developer.

Here's the examples of intercepting configurations:
```Kotlin
class SomeTest {
    @Before
    fun setup() {
        Kakao { // Kakao runtime
            intercept {
                onViewInteraction { // Intercepting calls on ViewInteraction classes across whole runtime
                    onPerform { interaction, action -> // Intercept perform() call
                        Log.d("KAKAO", "$interaction is performing $action")
                    }
                }
            }
        }
    }
    
    @Test
    fun test() {
        onScreen<MyScreen> {
            intercept {
                onViewInteraction { // Intercepting calls on ViewInteraction classes while in the context of MyScreen
                    onCheck { interaction, assertion -> // Intercept check() call
                        Log.d("KAKAO", "$interaction is checking $assertion")
                    }
                }
            }
            
            myView {
                intercept { // Intercepting ViewInteraction calls on this individual view
                    onPerform(true) { interaction, action -> // Intercept perform() call and overriding the chain 
                        // When performing actions on this view, Kakao level interceptor will not be called
                        // and we have to manually call Espresso now.
                        Log.d("KAKAO_VIEW", "$interaction is performing $action")
                        interaction.perform(action)
                    }
                }
            }
        }
    }
}
```
For more detailed info please refer to the documentation.

### Setup
Following archived versions are available in maven central:
- 2.4.0
- 2.3.4
- 2.2.0
- 2.1.0
- 2.1.0-support
- 1.4.0-androidx

Maven
```xml
<dependency>
  <groupId>com.agoda.kakao</groupId>
  <artifactId>kakao</artifactId>
  <version><latest version></version>
  <type>pom</type>
</dependency>
```
or Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
    androidTestImplementation 'com.agoda.kakao:kakao:<latest version>'
}
```

### AndroidX
Default artifact starting from `2.0.0` includes AndroidX libraries to build upon. If you're still using
old support libraries, please use `2.X.X-support` artifact.
```
dependencies {
    androidTestImplementation 'com.agoda.kakao:kakao:2.1.0-support'
}
```
**IMPORTANT:** We stopped the development for the `-support` artifact and version `2.1.0-support` is the
latest version available with usage of support libraries. Please consider migrating to AndroidX.

### Contribution Policy

**Kakao** is an open source project, and depends on its users to improve it. We are more than happy to find you interested in taking the project forward.

Kindly refer to the [Contribution Guidelines](https://github.com/agoda-com/kakao/blob/master/CONTRIBUTING.md) for detailed information.

### Code of Conduct

Please refer to [Code of Conduct](https://github.com/agoda-com/Kakao/blob/master/CODE_OF_CONDUCT.md) document.

### License

Kakao is open source and available under the [Apache License, Version 2.0](https://github.com/agoda-com/Kakao/blob/master/LICENSE).

### Thanks to

* [Unlimity](https://github.com/Unlimity) - **Ilya Lim** 
* [Vacxe](https://github.com/Vacxe) - **Konstantin Aksenov** 
* [Сdsap](https://github.com/cdsap) - **Inaki Villar** 
* [VerachadW](https://github.com/VerachadW) - **Verachad Wongsawangtham**
* [JuDrummer](https://github.com/judrummer) - **Tipatai Puthanukunkit** 

