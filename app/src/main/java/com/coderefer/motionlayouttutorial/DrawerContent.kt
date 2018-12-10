package com.coderefer.motionlayouttutorial

import android.content.Context
import android.support.constraint.motion.MotionLayout
import android.support.v4.widget.DrawerLayout
import android.util.AttributeSet
import android.view.View

class DrawerContent @JvmOverloads constructor(context: Context, attrs: AttributeSet? =null, defStyleAttr:Int=0) : MotionLayout(context,attrs, defStyleAttr), DrawerLayout.DrawerListener {
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
        (parent as? DrawerLayout)?.addDrawerListener(this)
    }

}