package com.kotlin

open class Box(val length: Float, val width: Float, val height: Float) {
    open fun validate(length: Float, width: Float, height: Float) =
        (length <= this.length && width <= this.width && height <= this.height)
}

class Box3(length: Float, width: Float, height: Float) : Box(length, width, height) {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        val isValidate = super.validate(length, width, height)

        if (isValidate) {
            println("Box3")
        }

        return isValidate
    }
}

class Box5(length: Float, width: Float, height: Float) : Box(length, width, height) {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        val isValidate = super.validate(length, width, height)

        if (isValidate) {
            println("Box5")
        }

        return isValidate
    }
}