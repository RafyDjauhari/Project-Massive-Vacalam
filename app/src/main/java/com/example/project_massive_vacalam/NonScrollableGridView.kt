package com.example.project_massive_vacalam

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.GridView

class NonScrollableGridView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : GridView(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Set a custom height for the GridView
        val heightSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST)
        super.onMeasure(widthMeasureSpec, heightSpec)


        // Set the measured height to the GridView to enable scrolling within ScrollView
        val params: ViewGroup.LayoutParams = layoutParams
        params.height = measuredHeight
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        // Prevent the GridView from intercepting touch events to enable scrolling within ScrollView
        return false

    }
}
