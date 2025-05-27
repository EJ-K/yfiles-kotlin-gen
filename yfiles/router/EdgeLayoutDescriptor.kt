// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YPoint
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.CurveConnectionStyle

/**
 * This class is used by [EdgeRouter] to provide routing details for the edges of the graph.
 * @see [EdgeRouter.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of an [EdgeLayoutDescriptor] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23EdgeLayoutDescriptor-constructor-EdgeLayoutDescriptor">Online Documentation</a>
 */
@JsName("EdgeRouterEdgeLayoutDescriptor")
external open class EdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets or sets whether or not [curved][EdgeRoutingStyle.CURVED] edges may shortcut and introduce additional edge crossings to make curves more direct and smoother.
 * 
 * Default value - `false`. Curved edges do not shortcut.
 * @see [EdgeRoutingStyle.CURVED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23curveShortcuts">Online Documentation</a>
 */
open var curveShortcuts: Boolean
/**
 * Gets or sets how symmetric u-turn parts of [curved][EdgeRoutingStyle.CURVED] routes should preferably be.
 * 
 * Default value - `0`. The symmetry of u-turns is not specifically optimized.
 * @throws ArgumentError if the given symmetry value is negative or larger than one
 * @see [EdgeRoutingStyle.CURVED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23curveUTurnSymmetry">Online Documentation</a>
 */
open var curveUTurnSymmetry: Double
/**
 * Gets or sets whether or not this edge is routed directly to a group node's border if it connects the group node with one of its descendants.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23directGroupContentEdgeRouting">Online Documentation</a>
 */
open var directGroupContentEdgeRouting: Boolean
/**
 * Gets or sets the list of intermediate [YPoint]s that need to lie on the edge route.
 * 
 * Default value - `null`. The route does not obey any intermediate points.
 * @see [EdgeRouter.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23intermediateRoutingPoints">Online Documentation</a>
 */
open var intermediateRoutingPoints: IList<out YPoint>?
/**
 * Gets or sets the maximum ratio between the horizontal/vertical part of a segment and the non-orthogonal, octilinear part.
 * 
 * Default value - `0.3`
 * @throws ArgumentError if the maximum ratio is negative or greater than `0.5`
 * @see [EdgeRoutingStyle.OCTILINEAR]
 * @see [preferredOctilinearSegmentLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23maximumOctilinearSegmentRatio">Online Documentation</a>
 */
open var maximumOctilinearSegmentRatio: Double
/**
 * Gets or sets the minimum distance between a pair of edges.
 * 
 * Default value - `3.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23minimumEdgeToEdgeDistance">Online Documentation</a>
 */
open var minimumEdgeToEdgeDistance: Double
/**
 * Gets or sets the minimum length of the first segment of the edge path (at the source node).
 * 
 * Default value - `5.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length of the last segment of the edge path (at the target node).
 * 
 * Default value - `10.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum distance that the edge should maintain from node corners when entering or leaving the node.
 * 
 * Default value - `3.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23minimumNodeCornerDistance">Online Documentation</a>
 */
open var minimumNodeCornerDistance: Double
/**
 * Gets or sets the monotonic path restrictions that should be applied.
 * 
 * Default value - [MonotonicPathRestriction.NONE]. No path restrictions are used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23monotonicPathRestriction">Online Documentation</a>
 */
open var monotonicPathRestriction: MonotonicPathRestriction
/**
 * Gets or sets the [PenaltySettings] used for this edge.
 * @throws ArgumentError if the given penalty settings are `null`
 * @see [PenaltySettings.OPTIMIZATION_BALANCED]
 * @see [PenaltySettings.OPTIMIZATION_EDGE_BENDS]
 * @see [PenaltySettings.OPTIMIZATION_EDGE_CROSSINGS]
 * @see [PenaltySettings.OPTIMIZATION_EDGE_LENGTHS]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23penaltySettings">Online Documentation</a>
 */
open var penaltySettings: PenaltySettings
/**
 * Gets or sets the preferred length of non-orthogonal, octilinear segments.
 * 
 * Default value - `30`
 * @throws ArgumentError if the preferred octilinear segment length is negative
 * @see [EdgeRoutingStyle.OCTILINEAR]
 * @see [maximumOctilinearSegmentRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23preferredOctilinearSegmentLength">Online Documentation</a>
 */
open var preferredOctilinearSegmentLength: Double
/**
 * Gets or sets the routing policy indicating if the edge associated with this descriptor is unconditionally routed or if the existing route determines whether a routing is even necessary.
 * 
 * Default value - [RoutingPolicy.ALWAYS]. The edge is routed, ignoring the existing sketch.
 * @throws ArgumentError if an unknown routing policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23routingPolicy">Online Documentation</a>
 */
open var routingPolicy: RoutingPolicy
/**
 * Gets or sets the routing style for the edge associated with this descriptor.
 * 
 * Default value - [EdgeRoutingStyle.ORTHOGONAL]
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23routingStyle">Online Documentation</a>
 */
open var routingStyle: EdgeRoutingStyle
/**
 * Gets or sets the style which determines how curved edge paths connect at the source side of the edge.
 * @throws ArgumentError if an unknown connection style is given
 * @see [targetCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23sourceCurveConnectionStyle">Online Documentation</a>
 */
open var sourceCurveConnectionStyle: CurveConnectionStyle
/**
 * Gets or sets the style using which determines how edge paths connect at the target side of the edge.
 * @throws ArgumentError if an unknown connection style is given
 * @see [sourceCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23targetCurveConnectionStyle">Online Documentation</a>
 */
open var targetCurveConnectionStyle: CurveConnectionStyle
/**
 * Creates a copy of this [EdgeLayoutDescriptor] instance.
 * @return a copy of this [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeLayoutDescriptor%23EdgeLayoutDescriptor-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():EdgeLayoutDescriptor

companion object : ClassMetadata<EdgeLayoutDescriptor> {
}
}

inline fun EdgeLayoutDescriptor(
    block: EdgeLayoutDescriptor.() -> Unit
): EdgeLayoutDescriptor {
    return EdgeLayoutDescriptor()
        .apply(block)
}
