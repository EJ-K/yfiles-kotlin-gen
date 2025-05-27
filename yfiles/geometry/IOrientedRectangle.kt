// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.algorithms.YOrientedRectangle
import yfiles.lang.InterfaceMetadata

/**
 * Interface for oriented rectangles in 2D coordinate space with double precision coordinates.
 * @see [ISize]
 * @see [IRectangle]
 * @see [OrientedRectangle]
 * @see [MutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle">Online Documentation</a>
 */
external interface IOrientedRectangle : ISize {
/**
 * Gets the anchor location of the oriented rectangle as a [Point] struct.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchorLocation">Online Documentation</a>
 */
final val anchorLocation: Point
/**
 * Gets the x coordinate of the anchor of the oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchorX">Online Documentation</a>
 */
val anchorX: Double
/**
 * Gets the y coordinate of the anchor of the oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchorY">Online Documentation</a>
 */
val anchorY: Double
/**
 * Determines the bounds of an oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23bounds">Online Documentation</a>
 */
final val bounds: Rect
/**
 * Gets the current center of the oriented rectangle as a [Point] struct.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23orientedRectangleCenter">Online Documentation</a>
 */
final val orientedRectangleCenter: Point
/**
 * Gets the up vector of the oriented rectangle as a [Point] struct.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upVector">Online Documentation</a>
 */
final val upVector: Point
/**
 * Gets the x value of the up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upX">Online Documentation</a>
 */
val upX: Double
/**
 * Gets the y value of the up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upY">Online Documentation</a>
 */
val upY: Double
/**
 * Determines whether the given oriented rectangle contains the provided point, using an epsilon value.
 * @param [point] The coordinates of the point to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return `true` iff the point lies inside the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-containsWithEps">Online Documentation</a>
 */
  final  fun containsWithEps( point: Point ,
 eps: Double ):Boolean = definedExternally
/**
 * Creates a transformation matrix that can be used to transform points that are in the local coordinate system of the oriented rectangle if the top-left corner is the origin.
 * @return A matrix that can be used to transform from oriented rectangle coordinates to world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-createTransform">Online Documentation</a>
 */
  final  fun createTransform():Matrix = definedExternally
/**
 * Creates an enlarged instance that is the same as this one but enlarged by the specified padding.
 * @param [padding] The padding to use to add to the instance.
 * @return A new [OrientedRectangle] instance which is enlarged by the given `padding`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-getEnlarged">Online Documentation</a>
 */
  final  fun getEnlarged( padding: Insets ):OrientedRectangle = definedExternally

/**
 * Creates an enlarged instance that is the same as this one but enlarged by the specified padding.
 * @param [padding] The padding to use to add to the instance.
 * @return A new [OrientedRectangle] instance which is enlarged by the given `padding`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-getEnlarged">Online Documentation</a>
 */
@JsName("getEnlarged")
  final operator fun plus( padding: Insets ):OrientedRectangle = definedExternally
/**
 * Determines whether the oriented rectangle contains the provided point, using an epsilon value.
 * @param [location] The coordinates of the point to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return `true` iff the point lies inside the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-hits">Online Documentation</a>
 */
  final  fun hits( location: Point ,
 eps: Double ):Boolean = definedExternally
/**
 * Creates a [YOrientedRectangle] from a given [IOrientedRectangle].
 * @return The [YOrientedRectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-toOrientedRectangle">Online Documentation</a>
 */
  final  fun toOrientedRectangle():YOrientedRectangle = definedExternally

companion object : InterfaceMetadata<IOrientedRectangle> {
/**
 * An immutable empty [IOrientedRectangle] with width and height of `-1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23EMPTY">Online Documentation</a>
 */
 val EMPTY: IOrientedRectangle
}
}
