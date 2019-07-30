package com.kotlin

interface Box {
    fun validate(length: Float, width: Float, height: Float) : Boolean
}

class Box3(val length: Float, val width: Float, val height: Float) : Box {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        if (length <= this.length && width <= this.width && height <= this.height) {
            println("Box3")

            return true
        } else {
            return false
        }
    }
}

class Box5(val length: Float, val width: Float, val height: Float) : Box {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        if (length <= this.length && width <= this.width && height <= this.height) {
            println("Box5")

            return true
        } else {
            return false
        }
    }
}