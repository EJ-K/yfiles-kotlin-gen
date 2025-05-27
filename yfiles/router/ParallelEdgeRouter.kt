// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Graph
import yfiles.algorithms.IEdgeMap
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [ParallelEdgeRouter] is a [ILayoutStage][yfiles.layout.ILayoutStage] that routes parallel edges which connect the same pair of nodes in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [ParallelEdgeRouter] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see [LayoutStageBase.coreLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-constructor-ParallelEdgeRouter">Online Documentation</a>
 */
external open class ParallelEdgeRouter  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the absolute distance from the end point of the joined lines to the first parallel segments.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see [joinEnds]
 * @see [relJoinEndDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23absJoinEndDistance">Online Documentation</a>
 */
open var absJoinEndDistance: Double
/**
 * Gets or sets whether or not the distances between parallel edges should be determined automatically according to the sizes of their source and target nodes.
 * 
 * Default value - `true`. The distances between parallel edges are adjusted to the nodes' bounds.
 * @see [lineDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23adaptiveLineDistances">Online Documentation</a>
 */
open var adaptiveLineDistances: Boolean
/**
 * Gets or sets whether or not to adjust the leading edge to obtain more symmetric results.
 * 
 * Default value - `true`. The leading edge is adjusted for more symmetric results.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23adjustLeadingEdge">Online Documentation</a>
 */
open var adjustLeadingEdge: Boolean
/**
 * Gets or sets whether or not the direction of edges should be considered.
 * 
 * Default value - `false`. All edges that connect the same pair of nodes are considered parallel, ignoring their directions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23directedMode">Online Documentation</a>
 */
open var directedMode: Boolean
/**
 * Holds the list of parallel edges that are hidden from the [core layout algorithm][LayoutStageBase.coreLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23hiddenEdges">Online Documentation</a>
 */
protected final var hiddenEdges: EdgeList
/**
 * Gets or sets whether or not to join end points of parallel edges.
 * 
 * Default value - `false`. Parallel edges have only parallel segments.
 * @see [absJoinEndDistance]
 * @see [relJoinEndDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23joinEnds">Online Documentation</a>
 */
open var joinEnds: Boolean
/**
 * Gets or sets the distance between two adjacent edge paths that run in parallel.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified distance is less than `0`
 * @see [adaptiveLineDistances]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23lineDistance">Online Documentation</a>
 */
open var lineDistance: Double
/**
 * [IEdgeMap] that associates a hidden edge with the unique parallel edge not hidden from the [core layout algorithm][LayoutStageBase.coreLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23parallelEdges">Online Documentation</a>
 */
final var parallelEdges: IEdgeMap<Edge>
/**
 * Gets or sets the relative distance from the end point of the joined lines to the first parallel segments.
 * 
 * Default value - `0.1`
 * @throws ArgumentError if the specified relative distance is less than `0` or greater than `1`
 * @see [joinEnds]
 * @see [absJoinEndDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23relJoinEndDistance">Online Documentation</a>
 */
open var relJoinEndDistance: Double
/**
 * Delegates the arrangement of nodes and edges to the [core layout algorithm][LayoutStageBase.coreLayout] and routes the parallel edges.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Hides all parallel edges leaving a master edge in the graph.
 * @param [graph] the input graph
 * @see [directedMode]
 * @see [AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-findAndHideParallelEdges">Online Documentation</a>
 */
 open protected   fun findAndHideParallelEdges( graph: Graph )
/**
 * Assigns a layout to all parallel edges.
 * @param [graph] the graph after the core layout
 * @param [parallelEdges] the map that provides all parallel edges for each master edge
 * @see [joinEnds]
 * @see [adaptiveLineDistances]
 * @see [adjustLeadingEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-layoutParallelEdges">Online Documentation</a>
 */
 open protected   fun layoutParallelEdges( graph: LayoutGraph ,
 parallelEdges: IEdgeMap<EdgeList> )

companion object : ClassMetadata<ParallelEdgeRouter> {
/**
 * A data provider key for marking edges that will be routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for specifying the master edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23LEADING_EDGE_DP_KEY">Online Documentation</a>
 */
 val LEADING_EDGE_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data acceptor key for publishing the parallel edges that were routed and not treated as leading edges.
 * @see [LEADING_EDGE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ROUTED_PARALLEL_EDGES_DP_KEY">Online Documentation</a>
 */
 val ROUTED_PARALLEL_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun ParallelEdgeRouter(
    block: ParallelEdgeRouter.() -> Unit
): ParallelEdgeRouter {
    return ParallelEdgeRouter()
        .apply(block)
}
