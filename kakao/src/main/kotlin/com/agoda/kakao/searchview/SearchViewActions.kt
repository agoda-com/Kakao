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

	fun typeQuery(query: String, append: Boolean = false) {
		view.perform(object : ViewAction {
			override fun getConstraints(): Matcher<View> = Matchers.allOf(ViewMatchers.isDisplayed(), ViewMatchers.isAssignableFrom(SearchView::class.java))

			override fun getDescription(): String {
				val action = if (append) {
					"append"
				} else {
					"type"
				}
				return "$action search query $query"
			}

			override fun perform(uiController: UiController?, view: View) {
				var finalQuery = query
				val searchView = (view as SearchView)
				if (append) {
					finalQuery = searchView.query?.toString() + finalQuery
				}
				searchView.setQuery(finalQuery, false)
			}
		})
	}
}
