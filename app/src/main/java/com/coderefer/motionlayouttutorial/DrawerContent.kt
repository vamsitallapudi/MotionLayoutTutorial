package com.coderefer.motionlayouttutorial

import android.content.Context
import androidx.drawerlayout.widget.DrawerLayout
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout

class DrawerContent @JvmOverloads constructor(context: Context, attrs: AttributeSet? =null, defStyleAttr:Int=0) : MotionLayout(context,attrs, defStyleAttr), androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    override fun onDrawerStateChanged(p0: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDrawerSlide(p0: View, slideOffset: Float) {
        progress = slideOffset
    }

    override fun onDrawerClosed(p0: View) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDrawerOpened(p0: View) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? androidx.drawerlayout.widget.DrawerLayout)?.addDrawerListener(this)
    }

}