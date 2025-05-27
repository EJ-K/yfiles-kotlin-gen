// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [PolylineLayoutStage] extends the orthogonal edge paths with polyline segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PolylineLayoutStage] using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23PolylineLayoutStage-constructor-PolylineLayoutStage">Online Documentation</a>
 */
external open class PolylineLayoutStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key used for looking up the selected state of the edges of the graph to be laid out.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key used for looking up the selected state of the nodes of the graph to be laid out.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23affectedNodesDpKey">Online Documentation</a>
 */
open var affectedNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets the maximum segment length ratio at each end of an orthogonal segment that may get converted into a (non-orthogonal) polyline segment.
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the ratio does not lie within `[0,0.5]` interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23maximumNonOrthogonalSegmentRatio">Online Documentation</a>
 */
open var maximumNonOrthogonalSegmentRatio: Double
/**
 * Gets or sets the minimum distance between edges and node bounds.
 * 
 * Default value - `10`
 * @throws ArgumentError if the distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23minimumNodeToEdgeDistance">Online Documentation</a>
 */
open var minimumNodeToEdgeDistance: Double
/**
 * Gets or sets the preferred segment length for (non-orthogonal) polyline segments.
 * 
 * Default value - `50`
 * @throws ArgumentError if the length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23preferredPolylineSegmentLength">Online Documentation</a>
 */
open var preferredPolylineSegmentLength: Double
/**
 * Gets or sets the (sub-)set of edges to be routed in a polyline fashion.
 * 
 * Default value - [Scope.ROUTE_ALL_EDGES]. All edges are routed.
 * @throws ArgumentError if the given argument is none of the predefined scope values
 * @see [affectedEdgesDpKey]
 * @see [affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Adds polyline segments to the edge routes produced by the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineLayoutStage%23PolylineLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<PolylineLayoutStage> {
}
}

inline fun PolylineLayoutStage(
    block: PolylineLayoutStage.() -> Unit
): PolylineLayoutStage {
    return PolylineLayoutStage()
        .apply(block)
}
