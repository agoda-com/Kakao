package com.agoda.sample.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.slider.KSlider
import com.agoda.kakao.text.KButton
import com.agoda.sample.R

class SliderScreen : Screen<SliderScreen>() {
    val slider = KSlider { withId(R.id.slider) }
    val buttonValue5 = KButton { withId(R.id.button_value_5) }
}
