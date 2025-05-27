// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.InterfaceMetadata

/**
 * Interface for mutable oriented rectangles in 2D coordinate space with double precision coordinates.
 * @see [ISize]
 * @see [IOrientedRectangle]
 * @see [OrientedRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle">Online Documentation</a>
 */
external interface IMutableOrientedRectangle : IOrientedRectangle, IMutableSize {
/**
 * Gets or sets the x coordinate for the anchor of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle%23anchorX">Online Documentation</a>
 */
override var anchorX: Double
/**
 * Gets or sets the y coordinate for the anchor of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle%23anchorY">Online Documentation</a>
 */
override var anchorY: Double
/**
 * Sets the anchor vector of the oriented rectangle to the given value.
 * @param [location] The coordinates of the new anchor location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle%23IMutableOrientedRectangle-defaultmethod-setAnchor">Online Documentation</a>
 */
  final  fun setAnchor( location: Point ):Unit = definedExternally
/**
 * Sets the center of the oriented rectangle to the given value.
 * @param [center] The coordinates of the new center.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle%23IMutableOrientedRectangle-defaultmethod-setCenter">Online Documentation</a>
 */
  final  fun setCenter( center: Point ):Unit = definedExternally
/**
 * Sets the orientation of this oriented rectangle by modifying the up vector components.
 * @param [upx] The x component of the normalized up vector.
 * @param [upy] The y component of the normalized up vector.
 * @see [IOrientedRectangle.upX]
 * @see [IOrientedRectangle.upY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableOrientedRectangle%23IMutableOrientedRectangle-method-setUpVector">Online Documentation</a>
 */
   fun setUpVector( upx: Double ,
 upy: Double )

companion object : InterfaceMetadata<IMutableOrientedRectangle> {
}
}
