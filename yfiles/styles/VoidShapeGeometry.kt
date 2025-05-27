// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A void implementation of the [IShapeGeometry] interface that does nothing and behaves like an empty geometry.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidShapeGeometry">Online Documentation</a>
 */
external  class VoidShapeGeometry 
private constructor () : IShapeGeometry {

/**
 * This implementation always returns `null` (a [T] with no value).
 * @param [inner] The first point of the line that is inside the shape.
 * @param [outer] The second point of the line that is outside the shape.
 * @return A [T] with no value.
 * @see [IShapeGeometry.getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidShapeGeometry%23VoidShapeGeometry-method-getIntersection">Online Documentation</a>
 */
 final override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * This implementation returns an empty path.
 * @return The empty path.
 * @see [IShapeGeometry.getOutline]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidShapeGeometry%23VoidShapeGeometry-method-getOutline">Online Documentation</a>
 */
 final override   fun getOutline():GeneralPath?
/**
 * This implementation always returns `false`.
 * @param [location] The point to test.
 * @return `false`
 * @see [IShapeGeometry.isInside]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidShapeGeometry%23VoidShapeGeometry-method-isInside">Online Documentation</a>
 */
 final override   fun isInside( location: Point ):Boolean

companion object : ClassMetadata<VoidShapeGeometry> {
/**
 * The [VoidShapeGeometry] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidShapeGeometry%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IShapeGeometry
}
}
