// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * A a mutable size in 2D coordinate space with double precision values.
 * @see [ISize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize">Online Documentation</a>
 * 
 * @constructor Creates an instance using the given width and height.
 * @param [width] The width.
 * @param [height] The height
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23MutableSize-constructor-MutableSize(number,number)">Online Documentation</a>
 * 
 * @property width
 * Gets or sets the width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23width">Online Documentation</a>
 * 
 * @property height
 * Gets or sets the height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23height">Online Documentation</a>
 */
external  class MutableSize  (
final override var width: Double,
final override var height: Double) : IMutableSize, ICloneable<MutableSize> {
/**
 * Creates the initially empty size, that is both [width] and [height] are `0.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23MutableSize-constructor-MutableSize()">Online Documentation</a>
 */
 constructor()
/**
 * Creates an instance using the values provided by the size instance.
 * @param [size] A size to retrieve the initial values from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23MutableSize-constructor-MutableSize(ISize)">Online Documentation</a>
 */
 constructor( size: ISize )

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableSize%23MutableSize-method-clone">Online Documentation</a>
 */
 final override   fun clone():MutableSize

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

companion object : ClassMetadata<MutableSize> {
}
}
