package com.kotlin

open class Box(val name: String, val length: Float, val width: Float, val height: Float) {
    open fun validate(length: Float, width: Float, height: Float) =
        (length <= this.length && width <= this.width && height <= this.height)
}

class Box3() : Box("Box3", 23f, 14f, 13f) {

}

class Box5() : Box("Box5", 39.5f, 27.5f, 23f) {

}