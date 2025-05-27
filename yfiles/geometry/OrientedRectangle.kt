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
 * A mutable oriented rectangle in 2D coordinate space with double precision values stored in an instance of [IMutablePoint] and [IMutableSize] as well as two doubles for the up vector components.
 * @see [IOrientedRectangle]
 * @see [IMutableOrientedRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided values to initialize the anchor and size.
 * @param [anchorX] The x coordinate of the anchor of the oriented rectangle.
 * @param [anchorY] The y coordinate of the anchor of the oriented rectangle.
 * @param [width] The width of the rectangle.
 * @param [height] The height of the rectangle.
 * @param [upX] The x component of the up vector.
 * @param [upY] The y component of the up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-constructor-OrientedRectangle(number,number,number,number,number,number)">Online Documentation</a>
 * 
 * @property anchorX
 * Gets or sets the x coordinate of the anchor of this instance from the [anchor] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23anchorX">Online Documentation</a>
 * 
 * @property anchorY
 * Gets or sets the y coordinate of the anchor of this instance from the [anchor] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23anchorY">Online Documentation</a>
 * 
 * @property width
 * Gets or sets the width of this instance from the [size] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23width">Online Documentation</a>
 * 
 * @property height
 * Gets or sets the height of this instance from the [size] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23height">Online Documentation</a>
 * 
 * @property upX
 * Gets or sets the x component of the up vector to the new value.
 * @see [angle]
 * @see [setUpVector]
 * @see [upY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23upX">Online Documentation</a>
 * 
 * @property upY
 * Gets or sets the y component of the up vector to the new value.
 * @see [angle]
 * @see [setUpVector]
 * @see [upX]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23upY">Online Documentation</a>
 */
external  class OrientedRectangle  (
final override var anchorX: Double,
final override var anchorY: Double,
final override var width: Double,
final override var height: Double,
final override var upX: Double = definedExternally,
final override var upY: Double = definedExternally) : IMutablePoint, IMutableOrientedRectangle, ICloneable<OrientedRectangle> {
/**
 * Initializes a new instance of the [OrientedRectangle] class located at `0.0,0.0` with empty width and height (`-1.0`).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-constructor-OrientedRectangle()">Online Documentation</a>
 */
 constructor()
/**
 * Creates a new instance using the provided rectangle to initialize the anchor and size.
 * @param [rectangle] The rectangle to initialize the anchor and size from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-constructor-OrientedRectangle(IRectangle)">Online Documentation</a>
 */
 constructor( rectangle: IRectangle )
/**
 * Creates a new instance using the provided values to initialize.
 * @param [rectangle] The rectangle to initialize the anchor and size and up vector from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-constructor-OrientedRectangle(IOrientedRectangle)">Online Documentation</a>
 */
 constructor( rectangle: IOrientedRectangle )
/**
 * Creates a new instance using the provided values to initialize the anchor and size.
 * @param [anchor] The provider for the dynamic anchor of this instance.
 * @param [size] The provider for the dynamic size of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-constructor-OrientedRectangle(IMutablePoint,IMutableSize)">Online Documentation</a>
 */
 constructor( anchor: IMutablePoint ,
 size: IMutableSize )

/**
 * Gets or sets the anchor of this oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23anchor">Online Documentation</a>
 */
final var anchor: IPoint
/**
 * Gets or sets the orientation of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23angle">Online Documentation</a>
 */
final var angle: Double
/**
 * Gets whether this instance has negative width or height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23isEmpty">Online Documentation</a>
 */
final val isEmpty: Boolean
/**
 * Gets or sets the size of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23size">Online Documentation</a>
 */
final var size: ISize
/**
 * Gets or sets the x coordinate of the anchor of this instance from the [anchor] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23x">Online Documentation</a>
 */
final override var x: Double
/**
 * Gets or sets the y coordinate of the anchor of this instance from the [anchor] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23y">Online Documentation</a>
 */
final override var y: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-clone">Online Documentation</a>
 */
 final override   fun clone():OrientedRectangle
/**
 * Moves this rectangle by applying the offset to the [anchor]
 * @param [delta] The offset to move the rectangle's anchor by.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-moveBy">Online Documentation</a>
 */
 final   fun moveBy( delta: Point )
/**
 * Applies the values provided by the given instance to the values of this instance.
 * @param [rectangle] The instance to retrieve the values from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-reshape">Online Documentation</a>
 */
 final   fun reshape( rectangle: IOrientedRectangle )
/**
 * Sets the components of the up vector to the new values.
 * @param [upx] The x component of the normalized up vector.
 * @param [upy] The y component of the normalized up vector.
 * @see [angle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-setUpVector">Online Documentation</a>
 */
 final override   fun setUpVector( upx: Double ,
 upy: Double )

/**
 * @return [anchorX]
 */    
@JsName("__ygen_anchorX_negy__")
final operator fun component1(): Double
/**
 * @return [anchorY]
 */    
@JsName("__ygen_anchorY_negy__")
final operator fun component2(): Double
/**
 * @return [width]
 */    
@JsName("__ygen_width_negy__")
final operator fun component3(): Double
/**
 * @return [height]
 */    
@JsName("__ygen_height_negy__")
final operator fun component4(): Double
/**
 * @return [upX]
 */    
@JsName("__ygen_upX_negy__")
final operator fun component5(): Double
/**
 * @return [upY]
 */    
@JsName("__ygen_upY_negy__")
final operator fun component6(): Double

companion object : ClassMetadata<OrientedRectangle> {
/**
 * A casting operator that creates a new instance of [OrientedRectangle] using the current state of the rectangle that is cast.
 * @param [rect] the rectangle to get the current state from
 * @return A new instance of [OrientedRectangle] that holds no reference to the provided rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-convertFrom">Online Documentation</a>
 */
@JsName("convertFrom")
  operator fun invoke( rect: MutableRectangle ):OrientedRectangle
/**
 * Creates an immutable [IOrientedRectangle] with the given values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangle%23OrientedRectangle-method-createImmutable">Online Documentation</a>
 */
 final   fun createImmutable( anchorX: Double ,
 anchorY: Double ,
 width: Double ,
 height: Double ,
 upX: Double ,
 upY: Double ):IOrientedRectangle
}
}

inline val  OrientedRectangle.isNotEmpty: Boolean
    get() = !isEmpty
