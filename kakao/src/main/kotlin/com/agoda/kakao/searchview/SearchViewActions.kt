package com.agoda.kakao.searchview

import android.view.View
import android.widget.SearchView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.common.actions.BaseActions
import org.hamcrest.Matcher
import org.hamcrest.Matchers

interface SearchViewActions : BaseActions {

	fun typeQuery(query: String) {
		view.perform(object : ViewAction {
			override fun getConstraints(): Matcher<View> = Matchers.allOf(ViewMatchers.isDisplayed(), ViewMatchers.isAssignableFrom(SearchView::class.java))

			override fun getDescription(): String {
				return "type search query $query"
			}

			override fun perform(uiController: UiController?, view: View) {
				(view as SearchView).setQuery(query, false)
			}
		})
	}

	fun appendQuery(query: String) {
		view.perform(object : ViewAction {
			override fun getConstraints(): Matcher<View> = Matchers.allOf(ViewMatchers.isDisplayed(), ViewMatchers.isAssignableFrom(SearchView::class.java))

			override fun getDescription(): String {
				return "append search query $query"
			}

			override fun perform(uiController: UiController?, view: View) {
				val searchView = (view as SearchView)
				val finalQuery = searchView.query?.toString() + query
				searchView.setQuery(finalQuery, false)
			}
		})
	}
}
