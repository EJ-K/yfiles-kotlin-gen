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
 * Represents a mutable axis-aligned rectangle in two-dimensional Cartesian coordinates.
 * @see [Rect]
 * @see [IRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided values to initialize the position and size.
 * @param [x] The x-coordinate of the upper left corner of the rectangle.
 * @param [y] The y-coordinate of the upper left corner of the rectangle.
 * @param [width] The width of the rectangle.
 * @param [height] The height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets or sets the x-coordinate of the upper left corner of this instance from the [dynamicLocation][MutableRectangle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23x">Online Documentation</a>
 * 
 * @property y
 * Gets or sets the y-coordinate of the upper left corner of this instance from the [dynamicLocation][MutableRectangle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23y">Online Documentation</a>
 * 
 * @property width
 * Gets or sets the width of this instance from the [dynamicSize][MutableRectangle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23width">Online Documentation</a>
 * 
 * @property height
 * Gets or sets the height of this instance from the [dynamicSize][MutableRectangle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23height">Online Documentation</a>
 */
external class MutableRectangle (
final override var x: Double,
final override var y: Double,
final override var width: Double,
final override var height: Double) : IMutableRectangle, ICloneable<MutableRectangle> {
  /**
   * Creates a new empty instance located at the origin with width and height set to `-1`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle()">Online Documentation</a>
   */ constructor()
  /**
   * Creates a new instance initialized to the values of the provided argument.
   * @param [rectangle] The rectangle whose values are used to initialize the new instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(IRectangle)">Online Documentation</a>
   */ constructor(
    rectangle: IRectangle,
  )
  /**
   * Creates a new instance using the provided implementation for the storage of the position and size of the rectangle.
   * @param [location] The provider for the dynamic position of this instance.
   * @param [size] The provider for the dynamic size of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(IMutablePoint,IMutableSize)">Online Documentation</a>
   */ constructor(
    location: IMutablePoint,
    size: IMutableSize,
  )
  /**
   * Creates a new instance using the provided values to initialize the position and size.
   * @param [location] The coordinates of the upper left corner of the rectangle.
   * @param [size] The size of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(Point,Size)">Online Documentation</a>
   */ constructor(
    location: Point,
    size: Size,
  )
  /**
   * Gets the position of this rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23dynamicLocation">Online Documentation</a>
   */
  final var dynamicLocation: IPoint
  
  /**
   * Gets the size of this rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23dynamicSize">Online Documentation</a>
   */
  final var dynamicSize: ISize
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-method-clone">Online Documentation</a>
   */
  override fun clone(): MutableRectangle
  
  companion object : ClassMetadata<MutableRectangle> {
    /**
     * Performs an explicit conversion from [Rect] to [MutableRectangle].
     * @param [rectangle] The rectangle to convert.
     * @return The result of the conversion.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-method-convertFrom">Online Documentation</a>
     */
    @JsName("convertFrom")
    operator fun invoke(
      rectangle: Rect,
    ): MutableRectangle
    
    /**
     * Performs an explicit conversion from [MutableRectangle] to [Rect].
     * @param [rectangle] The rectangle to convert.
     * @return The result of the conversion.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-method-convertToRectD">Online Documentation</a>
     */
    fun convertToRectD(
      rectangle: MutableRectangle,
    ): Rect
  }
}
