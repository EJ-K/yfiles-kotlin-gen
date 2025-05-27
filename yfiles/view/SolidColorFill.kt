// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata

/**
 * Fills an area with a specified solid color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SolidColorFill] class with the specified color.
 * @param [color] The solid color with which the area is filled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill%23SolidColorFill-constructor-SolidColorFill(Color)">Online Documentation</a>
 * 
 * @property color
 * Gets the solid color of this fill.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill%23color">Online Documentation</a>
 */
external  class SolidColorFill  (
final val color: Color = definedExternally) : Fill {
/**
 * Initializes a new instance of the [SolidColorFill] class with the specified RGBA values.
 * @param [r] The red value.
 * @param [g] The green value.
 * @param [b] The blue value.
 * @param [a] The alpha value, 255 by default.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill%23SolidColorFill-constructor-SolidColorFill(number,number,number,number)">Online Documentation</a>
 */
 constructor( r: Int ,
 g: Int ,
 b: Int ,
 a: Int  = definedExternally)

/**
 * Freezes and returns this instance.
 * @return This instance, made immutable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill%23SolidColorFill-method-freeze">Online Documentation</a>
 */
 final override   fun freeze():Fill
/**
 * Determines whether this [SolidColorFill] is equal to the specified object.
 * @param [fill] The other [Fill] instance to compare.
 * @return `true`, if this [SolidColorFill] is equal to the other object; `false`, otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SolidColorFill%23SolidColorFill-method-hasSameValue">Online Documentation</a>
 */
 final override   fun hasSameValue( fill: Fill? ):Boolean

companion object : ClassMetadata<SolidColorFill> {
}
}
