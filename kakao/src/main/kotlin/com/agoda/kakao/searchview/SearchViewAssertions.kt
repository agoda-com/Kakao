package com.agoda.kakao.searchview

import android.os.Build
import android.view.View
import android.widget.SearchView
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.test.espresso.matcher.BoundedMatcher
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.common.utilities.getResourceString
import org.hamcrest.Description
import org.hamcrest.Matcher

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
interface SearchViewAssertions : BaseAssertions {
    fun hasHint(hint: String): Matcher<View> = object : BoundedMatcher<View, SearchView>(SearchView::class.java), Matcher<View> {
        var realHint: String? = null

        override fun describeTo(description: Description) {
            description.appendText("with SearchView hint: $hint, but was: $realHint")
        }

        override fun matchesSafely(item: SearchView): Boolean {
            return item.queryHint?.toString() == hint
        }
    }

    fun hasHint(@StringRes queryHintId: Int): Matcher<View> = hasHint(getResourceString(queryHintId))

    fun hasQuery(query: String): Matcher<View> = object : BoundedMatcher<View, SearchView>(SearchView::class.java), Matcher<View> {
        var foundQuery: String? = null

        override fun describeTo(description: Description) {
            description.appendText("with SearchView query: $query, but was: $foundQuery")
        }

        override fun matchesSafely(item: SearchView): Boolean {
            foundQuery = item.query.toString()
            return foundQuery == query
        }
    }
}
