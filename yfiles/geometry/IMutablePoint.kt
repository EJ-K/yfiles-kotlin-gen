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
 * Interface for a mutable point in 2D coordinate space with double precision coordinates.
 * @see [IPoint]
 * @see [MutablePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutablePoint">Online Documentation</a>
 */
external interface IMutablePoint : IPoint {
/**
 * Gets or sets the x coordinate for this point.
 * @see [IPoint.x]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutablePoint%23x">Online Documentation</a>
 */
override var x: Double
/**
 * Gets or sets the y coordinate for this point.
 * @see [IPoint.y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutablePoint%23y">Online Documentation</a>
 */
override var y: Double
/**
 * Sets the coordinates of the point to the given values.
 * @param [location] The new location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutablePoint%23IMutablePoint-defaultmethod-relocate(IPoint)">Online Documentation</a>
 */
  final  fun relocate( location: IPoint ):Unit = definedExternally
/**
 * Sets the coordinates of the point to the given values.
 * @param [x] The new x coordinate
 * @param [y] The new y coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutablePoint%23IMutablePoint-defaultmethod-relocate(number,number)">Online Documentation</a>
 */
  final  fun relocate( x: Double ,
 y: Double ):Unit = definedExternally

companion object : InterfaceMetadata<IMutablePoint> {
}
}
