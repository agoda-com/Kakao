import android.widget.TimePicker
import androidx.test.espresso.contrib.PickerActions
import com.agoda.kakao.common.views.KBaseView
import com.agoda.kakao.text.KButton

/**
 * View for interact with default time picker
 *
 * @see TimePicker
 */
class KTimePicker : KBaseView<KTimePicker>({ isInstanceOf(TimePicker::class.java) }) {
    val action = KButton {
        isDescendantOfA { isInstanceOf(TimePicker::class.java) }
        withId(android.R.id.button1)
    }

    fun setTime(hour: Int, minutes: Int) {
        perform {
            PickerActions.setTime(hour, minutes)
        }
    }
}
