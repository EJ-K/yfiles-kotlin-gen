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
import yfiles.lang.ICloneable

/**
 * Specifies the properties of a transition point of a gradient.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop">Online Documentation</a>
 * 
 * @constructor Creates a new transition point of a gradient with the given color and offset.
 * @param [color] The stop's color.
 * @param [offset] The offset defined as ratio from 0 to 1. Default value is 0.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23GradientStop-constructor-GradientStop(Color,number)">Online Documentation</a>
 */
external class GradientStop (
  color: Color  = definedExternally,
  offset: Double  = definedExternally,
) : ICloneable<GradientStop> {
  /**
   * Creates a new transition point of a gradient with the given rgba values and offset.
   * @param [r] The red value.
   * @param [g] The green value.
   * @param [b] The blue value.
   * @param [a] The alpha value, 255 by default.
   * @param [offset] The offset defined as ratio from 0 to 1. Default value is 0.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23GradientStop-constructor-GradientStop(number,number,number,number,number)">Online Documentation</a>
   */ constructor(
    r: Int,
    g: Int,
    b: Int,
    a: Int  = definedExternally,
    offset: Double  = definedExternally,
  )
  /**
   * Gets or sets the color of this transition point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23color">Online Documentation</a>
   */
  final var color: Color
  
  /**
   * Gets or sets the offset of this transition point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23offset">Online Documentation</a>
   */
  final var offset: Double
  
  /**
   * Clones this instance by returning a memberwise clone, or by returning `this` if this instance is [frozen][GradientStop].
   * @return An instance of the same type as this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23GradientStop-method-clone">Online Documentation</a>
   */
  override fun clone(): GradientStop
  
  /**
   * Freezes and returns this instance.
   * @return This instance, made immutable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23GradientStop-method-freeze">Online Documentation</a>
   */
  fun freeze(): GradientStop
  
  /**
   * Determines if this instance is frozen.
   * @return `true` if this instance is frozen; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientStop%23GradientStop-method-isFrozen">Online Documentation</a>
   */
  fun isFrozen(): Boolean
  
  companion object : ClassMetadata<GradientStop> {
  }
}
