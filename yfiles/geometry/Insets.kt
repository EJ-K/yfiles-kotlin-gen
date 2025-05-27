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

/**
 * Represents margins or padding for a rectangular area in two-dimensional Cartesian coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets">Online Documentation</a>
 * 
 * @constructor Initializes a new instance using the provided values.
 * @param [top] The top inset.
 * @param [right] The right inset.
 * @param [bottom] The bottom inset.
 * @param [left] The left inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-constructor-Insets(number,number,number,number)">Online Documentation</a>
 * 
 * @property top
 * Gets the top inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23top">Online Documentation</a>
 * 
 * @property right
 * Gets the right inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23right">Online Documentation</a>
 * 
 * @property bottom
 * Gets the bottom inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23bottom">Online Documentation</a>
 * 
 * @property left
 * Gets the left inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23left">Online Documentation</a>
 */
external class Insets (
final val top: Double,
final val right: Double,
final val bottom: Double,
final val left: Double)  {
  /**
   * Creates a new instance using the provided value as inset for all four sides.
   * @param [inset] The inset to use for all sides.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-constructor-Insets(number)">Online Documentation</a>
   */ constructor(
    inset: Double,
  )
  /**
   * Gets the horizontal insets, which is the sum of [left][Insets] and [right][Insets].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23horizontalInsets">Online Documentation</a>
   */
  final val horizontalInsets: Double
  
  /**
   * Gets a value indicating whether this instance is empty, that is all insets are `0.0`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23isEmpty">Online Documentation</a>
   */
  final val isEmpty: Boolean
  
  /**
   * Gets the vertical insets, which is the sum of [top][Insets] and [bottom][Insets].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23verticalInsets">Online Documentation</a>
   */
  final val verticalInsets: Double
  
  /**
   * Calculates the union of this instance and the given inset which is done by performing [max][Math] on all four inset values.
   * @param [insets] The insets to max with these insets.
   * @return The union of this instance and the given inset.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-createUnion">Online Documentation</a>
   */
  fun createUnion(
    insets: Insets,
  ): Insets
  
  /**
   * Creates an enlarged instance by adding the insets of the specified insets to this instance and returning the result.
   * @param [insets] The insets to add to this instance.
   * @return An enlarged instance of the given insets instance.
   * @see [getReduced]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getEnlarged">Online Documentation</a>
   */
  fun getEnlarged(
    insets: Insets,
  ): Insets
  
  /**
   * Creates an enlarged instance by adding the insets of the specified insets to this instance and returning the result.
   * @param [insets] The insets to add to this instance.
   * @return An enlarged instance of the given insets instance.
   * @see [getReduced]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getEnlarged">Online Documentation</a>
   */
  @JsName("getEnlarged")
  final operator fun plus(
    insets: Insets,
  ): Insets
  
  /**
   * Creates a reduced instance by subtracting the insets of the specified insets from this instance and returning the result.
   * @param [insets] The insets to subtract from this instance.
   * @return A reduced instance of the given instance of insets.
   * @see [getEnlarged]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getReduced">Online Documentation</a>
   */
  fun getReduced(
    insets: Insets,
  ): Insets
  
  /**
   * Creates a reduced instance by subtracting the insets of the specified insets from this instance and returning the result.
   * @param [insets] The insets to subtract from this instance.
   * @return A reduced instance of the given instance of insets.
   * @see [getEnlarged]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getReduced">Online Documentation</a>
   */
  @JsName("getReduced")
  final operator fun minus(
    insets: Insets,
  ): Insets
  /**
   * @return [top]
   */    
  @JsName("__ygen_top_negy__")
  final operator fun component1(): Double
  /**
   * @return [right]
   */    
  @JsName("__ygen_right_negy__")
  final operator fun component2(): Double
  /**
   * @return [bottom]
   */    
  @JsName("__ygen_bottom_negy__")
  final operator fun component3(): Double
  /**
   * @return [left]
   */    
  @JsName("__ygen_left_negy__")
  final operator fun component4(): Double
  
  
  
  companion object : ClassMetadata<Insets> {
    /**
     * The "empty" insets that have all properties set to `0.0`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23EMPTY">Online Documentation</a>
     */
     val EMPTY: Insets
    
    /**
     * Divides each side of the insets by the given factor.
     * @receiver The insets to scale down.
     * @param [factor] The factor to scale down by.
     * @return New insets scaled down by the factor.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-divide">Online Documentation</a>
     */
    @JsName("divide")
    final operator fun Insets.div(
      factor: Double,
    ): Insets
    
    /**
     * Multiplies each side of the insets by the given factor and returns the result.
     * @receiver The insets to scale up.
     * @param [factor] The factor to scale up by.
     * @return New insets scaled up by the factor.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-multiply">Online Documentation</a>
     */
    @JsName("multiply")
    final operator fun Insets.times(
      factor: Double,
    ): Insets
  }
}

inline val  Insets.isNotEmpty: Boolean
    get() = !isEmpty
