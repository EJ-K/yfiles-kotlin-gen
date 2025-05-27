// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * This class represents the size of an object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension">Online Documentation</a>
 * 
 * @constructor Creates a new YDimension2D object for given size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension%23YDimension-constructor-YDimension">Online Documentation</a>
 * 
 * @property width
 * Gets the width of the dimension object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension%23width">Online Documentation</a>
 * 
 * @property height
 * Gets the height of the dimension object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension%23height">Online Documentation</a>
 */
external open class YDimension  (
final val width: Double,
final val height: Double) : IComparable<YDimension> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension%23YDimension-method-compareTo">Online Documentation</a>
 */
 override  operator fun compareTo( other: YDimension ):Int
/**
 * Creates a [Size] from a given [YDimension].
 * @return The [Size].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YDimension%23YDimension-defaultmethod-toSize">Online Documentation</a>
 */
   fun toSize():Size

/**
 * @return [width]
 */    
@JsName("__ygen_width_negy__")
final operator fun component1(): Double
/**
 * @return [height]
 */    
@JsName("__ygen_height_negy__")
final operator fun component2(): Double

companion object : ClassMetadata<YDimension> {
}
}
