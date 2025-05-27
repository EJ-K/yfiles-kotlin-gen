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
 * This class provides routing settings for edges routed internally by the [CircularLayout].
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see [CircularLayoutEdgeRoutingPolicy.AUTOMATIC]
 * @see [CircularLayoutEdgeRoutingPolicy.INTERIOR]
 * @see [CircularLayoutEdgeRoutingPolicy.MARKED_EXTERIOR]
 * @see [CircularLayout.defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeLayoutDescriptor] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-constructor-EdgeLayoutDescriptor">Online Documentation</a>
 */
@JsName("CircularLayoutEdgeLayoutDescriptor")
external open class EdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the routing style for edges between partitions.
 * 
 * Default value - [CircularLayoutRoutingStyle.STRAIGHT]. All inter edges are routed straight.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor%23betweenCirclesRoutingStyle">Online Documentation</a>
 */
open var betweenCirclesRoutingStyle: CircularLayoutRoutingStyle
/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets or sets the routing style for edges within partitions.
 * 
 * Default value - [CircularLayoutRoutingStyle.STRAIGHT]. All interior edges are routed straight.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor%23inCircleRoutingStyle">Online Documentation</a>
 */
open var inCircleRoutingStyle: CircularLayoutRoutingStyle
/**
 * Gets or sets the routing style for edges between neighbors in one partition.
 * 
 * Default value - [CircularLayoutRoutingStyle.STRAIGHT]. All circle edges are routed straight.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeLayoutDescriptor%23onCircleRoutingStyle">Online Documentation</a>
 */
open var onCircleRoutingStyle: CircularLayoutOnCircleRoutingStyle

companion object : ClassMetadata<EdgeLayoutDescriptor> {
}
}

inline fun EdgeLayoutDescriptor(
    block: EdgeLayoutDescriptor.() -> Unit
): EdgeLayoutDescriptor {
    return EdgeLayoutDescriptor()
        .apply(block)
}
