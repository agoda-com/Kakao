# Kakao

### Introduction
At Agoda, we have more that 800 automated tests to ensure our application's quality and give our best experience to the user. All of them are written with Espresso from Google. Even though Espresso is working really well with our test, the code readability is quite low. Let's look at some of the example of how we write the test. 
```Java
onView(allOf(withId(R.id.price_item), hasDescendant(withText("Standard Rate"))))
        .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
```
This is an example just to check the visibility of the view and you can see that is not look that good. The readabiblity is decreasing as our tests are growing. As Agoda developer, we want to improve not just our codebase quality, but also our implementation of tests as well. This is why we are introducing Kakao. The library that will make you enjoy writing automated tests like you are drinking a hot chocolate.

![coco](https://user-images.githubusercontent.com/2812510/30947310-3825724c-a433-11e7-8a0d-3c3bfe00d584.png)

#### Benefits
- Readabbility
- Reuseabbility
- Looks like DSL

### How to use it
#### Create Screen
Create your entity `Screen` from where you will add the views involved in the interactions in 
the tests:
```Kotlin
class FormScreen : Screen<FormScreen>(){}
```
 `Screen` can represents the whole user interface or a portion of one user interface.
If you are using Page Object pattern you can place the interactions of Kakao inside the Page Objects.

#### Create KViews
 Create the `KViews` within your `Screen` of the Screen you want to provide interactions
```Kotlin
class FormScreen : Screen<FormScreen>(){
  val phone = KView { withId(R.id.phone)}
  val email = KEditTex { withId(R.id.email)}
  val submit = KButton { withId(R.id.submit)}
}
```
Kakao provides different types depending of the type of view:
* KView
* KEditText
* KTextView
* KButton
* KImageView
* KWebView
* KCheckbox
* KViewPager

If you want to create your custom type for your interactions

Every KView contains matchers to retrieve the view involved in the ViewInteraction. The matchers provided
by Kakao are very similar from the ones provided by Espresso:


* withId
* withText
* withContentDescription
* withContentDescription
* withDrawable

You can check more ViewMatchers in Builders. KT



// TODO CREATE CUSTOM VIEW 

#### Write the interaction. 

The final syntax of the test with Kakao is very easy, once you have the `Screen` and the views you only have to apply 
the ViewActions or ViewAssertions like in Espresso. 
```Kotlin
val screen = FormScreen()
screen {
    phone{
       hasText("971201771")
    }
    button{
       click()
    }
}
```

#### Advanced 

##### ListViews/RecyclersViews

Espresso includes different ways to , Kakao offers an easy way to interact  
Kakao offers this way to interact with the ListViews/RecyclerViews

- Inside your screen create KListView/KRecyclerView matching with your view:
```Kotlin
val myList = KRecyclerView({
                     withId(R.id.recycler_view)
             }
```
-- Create as many KRecycler/KList items as you have on your adapter. Each of them is represented by a class.
If your adapter contains multiple Items/ViewHolders but your interactions in your tests only works with 
one is not required to create all of them. 
```Kotlin
   class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
    }
```
-- You have to update the KRecyclerView telling which Items you want to use

```Kotlin
  val recycler: KRecyclerView = KRecyclerView({
        withId(R.id.recycler_view)
    }, itemTypeBuilder = {
        itemType(::Item)
    })
```

What is the last 
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

* childAt
* firstChild
* lastChild
* childWith
* child


##### Custom KViews

 
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
