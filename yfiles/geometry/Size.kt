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
 * Represents the size of a rectangular object with a given [width][Size] and [height][Size].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size">Online Documentation</a>
 * 
 * @constructor Creates a new instance with the provided width and height.
 * @param [width] The new width.
 * @param [height] The new height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-constructor-Size">Online Documentation</a>
 * 
 * @property width
 * Gets the width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23width">Online Documentation</a>
 * 
 * @property height
 * Gets the height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23height">Online Documentation</a>
 */
external class Size (
final override val width: Double,
final override val height: Double) : ISize {
  /**
   * Gets the area of this instance which is the product of [width][Size] and [height][Size].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23area">Online Documentation</a>
   */
  final val area: Double
  
  /**
   * Gets a value indicating whether this instance is finite.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23isFinite">Online Documentation</a>
   */
  final val isFinite: Boolean
  
  /**
   * Multiplies the [width][Size] and [height][Size] by the given factor and returns the result.
   * @param [factor] The factor to multiply the width and height by.
   * @return A new size that has the width and height multiplied by the factor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-method-multiply">Online Documentation</a>
   */
  fun multiply(
    factor: Double,
  ): Size
  
  /**
   * Multiplies the [width][Size] and [height][Size] by the given factor and returns the result.
   * @param [factor] The factor to multiply the width and height by.
   * @return A new size that has the width and height multiplied by the factor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-method-multiply">Online Documentation</a>
   */
  @JsName("multiply")
  final operator fun times(
    factor: Double,
  ): Size
  
  /**
   * Creates a [MutableSize] instance with the current values of this instance.
   * @return A new [MutableSize] instance whose properties have been initialized with the values of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-method-toMutableSize">Online Documentation</a>
   */
  fun toMutableSize(): MutableSize
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
  
  
  
  companion object : ClassMetadata<Size> {
    /**
     * The "empty" size that has [width][Size] and [height][Size] set to `-1.0`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23EMPTY">Online Documentation</a>
     */
     val EMPTY: Size
    
    /**
     * The "infinite" size that has [width][Size] and [height][Size] set to [POSITIVE_INFINITY][Number].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23INFINITE">Online Documentation</a>
     */
     val INFINITE: Size
    
    /**
     * The "zero" size that has [width][Size] and [height][Size] set to `0.0`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23ZERO">Online Documentation</a>
     */
     val ZERO: Size
    
    /**
     * Returns a size whose [width][Size] and [height][Size] are the respective maximum of the two provided [Size] instances.
     * @param [size1] The first size.
     * @param [size2] The second size.
     * @return A size whose [width][Size] and [height][Size] are the [max][Math] of the respective properties of the two parameters.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-method-max">Online Documentation</a>
     */
    fun max(
      size1: Size,
      size2: Size,
    ): Size
    
    /**
     * Returns a size whose [width][Size] and [height][Size] are the respective minimum of the two provided [Size] instances.
     * @param [size1] The first size.
     * @param [size2] The second size.
     * @return A size whose [width][Size] and [height][Size] are the [min][Math] of the respective properties of the two parameters.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Size%23Size-method-min">Online Documentation</a>
     */
    fun min(
      size1: Size,
      size2: Size,
    ): Size
  }
}
