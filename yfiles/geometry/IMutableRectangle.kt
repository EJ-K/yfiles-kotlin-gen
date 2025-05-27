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
 * Interface for mutable rectangles aligned to the axes in 2D coordinate space with double precision coordinates.
 * @see [ISize]
 * @see [IPoint]
 * @see [MutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle">Online Documentation</a>
 */
external interface IMutableRectangle : IMutableSize, IMutablePoint, IRectangle {
/**
 * Adds a rectangle to another one.
 * @param [rectangle2] The rectangle to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IRectangle)">Online Documentation</a>
 */
  final  fun add( rectangle2: IRectangle ):Unit = definedExternally

/**
 * Adds a rectangle to another one.
 * @param [rectangle2] The rectangle to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IRectangle)">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( rectangle2: IRectangle ):Unit = definedExternally
/**
 * Adds a point to a rectangle, possibly enlarging the rectangle.
 * @param [point] The coordinate to include in the bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IPoint)">Online Documentation</a>
 */
  final  fun add( point: IPoint ):Unit = definedExternally

/**
 * Adds a point to a rectangle, possibly enlarging the rectangle.
 * @param [point] The coordinate to include in the bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IPoint)">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( point: IPoint ):Unit = definedExternally
/**
 * Applies a new position and size to a given mutable rectangle.
 * @param [newRectangle] The bounds to set to the `rectangle`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-reshape(IRectangle)">Online Documentation</a>
 */
  final  fun reshape( newRectangle: IRectangle ):Unit = definedExternally
/**
 * Applies a new position and size to a given mutable rectangle.
 * @param [position] The new location.
 * @param [size] The new size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-reshape(IPoint,ISize)">Online Documentation</a>
 */
  final  fun reshape( position: IPoint ,
 size: ISize ):Unit = definedExternally
/**
 * Applies a new position and size to a given mutable rectangle.
 * @param [x] The new x coordinate of the upper left corner of the rectangle.
 * @param [y] The new y coordinate of the upper left corner of the rectangle.
 * @param [width] The new width of the rectangle.
 * @param [height] The new height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-reshape(number,number,number,number)">Online Documentation</a>
 */
  final  fun reshape( x: Double ,
 y: Double ,
 width: Double ,
 height: Double ):Unit = definedExternally
/**
 * Sets the center of the rectangle to the provided value.
 * @param [center] The new center coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setCenter">Online Documentation</a>
 */
  final  fun setCenter( center: Point ):Unit = definedExternally
/**
 * Creates the union of two rectangles, placing the result in the this parameter.
 * @param [rectangle1] The first rectangle to create the union of.
 * @param [rectangle2] The second rectangle to create the union of.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setToUnion">Online Documentation</a>
 */
  final  fun setToUnion( rectangle1: IRectangle ,
 rectangle2: IRectangle ):Unit = definedExternally

companion object : InterfaceMetadata<IMutableRectangle> {
}
}
