// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class is used by [HierarchicLayoutCore] during the various phases to provide routing details for the edges of the graph.
 * @see [HierarchicLayoutCore.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see [NodeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of an [EdgeLayoutDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-constructor-EdgeLayoutDescriptor">Online Documentation</a>
 */
@JsName("HierarchicLayoutEdgeLayoutDescriptor")
external open class EdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets whether or not this edge is routed directly to a group node's border if it connects the group node with one of its descendants.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23directGroupContentEdgeRouting">Online Documentation</a>
 */
open var directGroupContentEdgeRouting: Boolean
/**
 * Gets or sets the preferred minimum distance to obstacles.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumDistance">Online Documentation</a>
 */
open var minimumDistance: Double
/**
 * Gets or sets the minimum length of the first segment of the edge path (at the source node).
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum length of the first segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length of the last segment of the edge path (at the target node).
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum length of the last segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum length of an edge.
 * 
 * Default value - `20.0`
 * @throws ArgumentError if the minimum length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumLength">Online Documentation</a>
 */
open var minimumLength: Double
/**
 * Gets or sets the minimum length of octilinear segments for this edge.
 * 
 * Default value - `20.0`
 * @throws ArgumentError if the minimum length of the first segment is negative
 * @see [routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumOctilinearSegmentLength">Online Documentation</a>
 */
open var minimumOctilinearSegmentLength: Double
/**
 * Gets or sets the minimum slope that the mid segments of this edge should have, if the edge is routed polyline in vertical layouts.
 * 
 * Default value - `0.2`
 * @throws ArgumentError if the given minimum slope is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23minimumSlope">Online Documentation</a>
 */
open var minimumSlope: Double
/**
 * Gets or sets how edges in grouped graphs are routed between the content of different groups.
 * 
 * Default value - [RecursiveEdgeStyle.OFF]. Edges are not routed recursively.
 * @throws ArgumentError if an unknown style is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23recursiveEdgeStyle">Online Documentation</a>
 */
open var recursiveEdgeStyle: RecursiveEdgeStyle
/**
 * Gets or sets the routing style for this edge.
 * @throws ArgumentError if the given routing style is null
 * @see [RoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23routingStyle">Online Documentation</a>
 */
open var routingStyle: RoutingStyle
/**
 * Gets or sets whether or not source port optimization is enabled.
 * 
 * Default value - `false`. Ports being placed at the side of the node which lies closest to the target of the edge in terms of layering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23sourcePortOptimization">Online Documentation</a>
 */
open var sourcePortOptimization: Boolean
/**
 * Gets or sets whether or not target port optimization is enabled.
 * 
 * Default value - `false`. Ports being placed at the side of the node which lies closest to the source of the edge in terms of layering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23targetPortOptimization">Online Documentation</a>
 */
open var targetPortOptimization: Boolean
/**
 * Creates a copy of this [EdgeLayoutDescriptor] instance.
 * @return a copy of this [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-method-createCopy">Online Documentation</a>
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
