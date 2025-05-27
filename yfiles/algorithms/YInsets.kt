// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * Double-precision immutable insets representation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets">Online Documentation</a>
 * 
 * @constructor Creates a new instance with the given values
 * @param [top] The new top inset value
 * @param [left] The new left inset value
 * @param [bottom] The new bottom inset value
 * @param [right] The new right inset value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23Insets-constructor-Insets">Online Documentation</a>
 * 
 * @property top
 * The inset from the top.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23top">Online Documentation</a>
 * 
 * @property left
 * The inset from the left.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23left">Online Documentation</a>
 * 
 * @property bottom
 * The inset from the bottom.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23bottom">Online Documentation</a>
 * 
 * @property right
 * The inset from the right.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23right">Online Documentation</a>
 */
external open class YInsets  (
final val top: Double,
final val left: Double,
final val bottom: Double,
final val right: Double) : ICloneable<YInsets> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23Insets-method-clone">Online Documentation</a>
 */
 override   fun clone():YInsets
/**
 * Creates a [Insets] from a given [YInsets].
 * @return The [Insets].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YInsets%23Insets-defaultmethod-toInsets">Online Documentation</a>
 */
   fun toInsets():Insets

/**
 * @return [top]
 */    
@JsName("__ygen_top_negy__")
final operator fun component1(): Double
/**
 * @return [left]
 */    
@JsName("__ygen_left_negy__")
final operator fun component2(): Double
/**
 * @return [bottom]
 */    
@JsName("__ygen_bottom_negy__")
final operator fun component3(): Double
/**
 * @return [right]
 */    
@JsName("__ygen_right_negy__")
final operator fun component4(): Double

companion object : ClassMetadata<YInsets> {
}
}
