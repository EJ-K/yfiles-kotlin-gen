// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides routing settings for edges routed externally by the [CircularLayout].
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see [CircularLayoutEdgeRoutingPolicy.AUTOMATIC]
 * @see [CircularLayoutEdgeRoutingPolicy.EXTERIOR]
 * @see [CircularLayoutEdgeRoutingPolicy.MARKED_EXTERIOR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [ExteriorEdgeLayoutDescriptor] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23ExteriorEdgeLayoutDescriptor-constructor-ExteriorEdgeLayoutDescriptor">Online Documentation</a>
 */
external open class ExteriorEdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the minimum distance between the outer border of the circle partition and the arc path of exterior edges that run around the circle.
 * 
 * Default value - `20`
 * @throws ArgumentError if the given circle distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23circleDistance">Online Documentation</a>
 */
open var circleDistance: Double
/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets or sets the minimum distance that exterior edges keep to each other.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23edgeToEdgeDistance">Online Documentation</a>
 */
open var edgeToEdgeDistance: Double
/**
 * Gets or sets the preferred angle (in degrees) between adjacent segments of exterior edges at the same node.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the given angle is negative or larger than `45`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23preferredAngle">Online Documentation</a>
 */
open var preferredAngle: Double
/**
 * Gets or sets the preferred length of the curve part that connects the first or last segment with the outer arc.
 * 
 * Default value - `20`
 * @throws ArgumentError if the given preferred length is negative
 * @see [smoothness]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23preferredCurveLength">Online Documentation</a>
 */
open var preferredCurveLength: Double
/**
 * Gets or sets the smoothness of the exterior edges which determines how many bend points are generated to approximate the curvature of the edge paths.
 * 
 * Default value - `0.7`
 * @throws ArgumentError if the smoothness is not in the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorEdgeLayoutDescriptor%23smoothness">Online Documentation</a>
 */
open var smoothness: Double

companion object : ClassMetadata<ExteriorEdgeLayoutDescriptor> {
}
}

inline fun ExteriorEdgeLayoutDescriptor(
    block: ExteriorEdgeLayoutDescriptor.() -> Unit
): ExteriorEdgeLayoutDescriptor {
    return ExteriorEdgeLayoutDescriptor()
        .apply(block)
}
