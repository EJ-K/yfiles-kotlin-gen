// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.CurveConnectionStyle

/**
 * This class is used by [CurveRoutingStage] to provide routing details for the edges of the graph.
 * @see [CurveRoutingStage]
 * @see [CurveRoutingStage.CURVE_EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor">Online Documentation</a>
 */
external open class CurveEdgeLayoutDescriptor  : YObject {

/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets or sets whether or not curved edges may shortcut and introduce additional edge crossings if that makes the curves more direct and smoother.
 * 
 * Default value - `false`. Curved edges do not shortcut.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23curveShortcuts">Online Documentation</a>
 */
open var curveShortcuts: Boolean
/**
 * Gets or sets how symmetric u-turn parts of the curved routes should preferably be.
 * 
 * Default value - `0`. The symmetry of u-turns is not specifically optimized.
 * @throws ArgumentError if the given symmetry value is negative or larger than one
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23curveUTurnSymmetry">Online Documentation</a>
 */
open var curveUTurnSymmetry: Double
/**
 * Gets or sets the minimum distance to segments belonging to other edges.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23minimumEdgeToEdgeDistance">Online Documentation</a>
 */
open var minimumEdgeToEdgeDistance: Double
/**
 * Gets or sets the minimum length of the first segment of the edge path (at the source node).
 * 
 * Default value - `5.0`
 * @throws ArgumentError if the minimum length of the first segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length of the last segment of the edge path (at the target node).
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum length of the last segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum distance to nodes.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23minimumNodeToEdgeDistance">Online Documentation</a>
 */
open var minimumNodeToEdgeDistance: Double
/**
 * Gets or sets the style which determines how curved edge paths connect at the source side of the edge.
 * 
 * Default value - [CurveConnectionStyle.KEEP_PORT]. The source port and the first segment is kept.
 * @throws ArgumentError if an unknown connection style is given
 * @see [targetCurveConnectionStyle]
 * @see [CurveConnectionStyle.KEEP_PORT]
 * @see [CurveConnectionStyle.ORGANIC]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23sourceCurveConnectionStyle">Online Documentation</a>
 */
open var sourceCurveConnectionStyle: CurveConnectionStyle
/**
 * Gets or sets the style which determines how curved edge paths connect at the target side of the edge.
 * 
 * Default value - [CurveConnectionStyle.KEEP_PORT]. The target port and the last segment is kept.
 * @throws ArgumentError if an unknown connection style is given
 * @see [sourceCurveConnectionStyle]
 * @see [CurveConnectionStyle.KEEP_PORT]
 * @see [CurveConnectionStyle.ORGANIC]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23targetCurveConnectionStyle">Online Documentation</a>
 */
open var targetCurveConnectionStyle: CurveConnectionStyle
/**
 * Creates a copy of this [CurveEdgeLayoutDescriptor] instance.
 * @return a copy of this [CurveEdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveEdgeLayoutDescriptor%23CurveEdgeLayoutDescriptor-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():CurveEdgeLayoutDescriptor

companion object : ClassMetadata<CurveEdgeLayoutDescriptor> {
}
}
