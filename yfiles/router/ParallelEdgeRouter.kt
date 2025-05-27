// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IMapper
import yfiles.collections.YList
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [ParallelEdgeRouter] is an [ILayoutStage][yfiles.layout.ILayoutStage] that routes multi-edges, which connect the same pair of nodes, in a parallel fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [ParallelEdgeRouter] instance with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm.
 * @see [LayoutStageBase.coreLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-constructor-ParallelEdgeRouter">Online Documentation</a>
 */
open external class ParallelEdgeRouter (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets the absolute distance from the end point of the joined lines to the first parallel segments.
   * 
   * Default value - `20`
   * @throws ArgumentError if the specified distance is negative
   * @see [joinEnds]
   * @see [relativeJoinEndDistanceFactor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23absoluteJoinEndDistance">Online Documentation</a>
   */
  final var absoluteJoinEndDistance: Double
  
  /**
   * Gets or sets whether or not the distances between parallel multi-edges should be determined automatically according to the sizes of their source and target nodes.
   * 
   * Default value - `true`. The distances between multi-edges are adjusted to the nodes' bounds.
   * @see [edgeDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23adaptiveEdgeDistances">Online Documentation</a>
   */
  final var adaptiveEdgeDistances: Boolean
  
  /**
   * Gets or sets whether or not to adjust the leading edge to obtain more symmetric results.
   * 
   * Default value - `true`. The leading edge is adjusted for more symmetric results.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23adjustLeadingEdge">Online Documentation</a>
   */
  final var adjustLeadingEdge: Boolean
  
  /**
   * Gets or sets whether or not the direction of edges should be considered.
   * 
   * Default value - `false`. All edges that connect the same pair of nodes are considered parallel, ignoring their directions.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23directedMode">Online Documentation</a>
   */
  final var directedMode: Boolean
  
  /**
   * Gets or sets the distance between two adjacent edge paths that run in parallel.
   * 
   * Default value - `10`
   * @throws ArgumentError if the specified distance is less than `0`
   * @see [adaptiveEdgeDistances]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23edgeDistance">Online Documentation</a>
   */
  final var edgeDistance: Double
  
  /**
   * Gets or sets whether or not to join end points of multi-edges.
   * 
   * Default value - `false`. Multi-edges have only parallel segments.
   * @see [absoluteJoinEndDistance]
   * @see [relativeJoinEndDistanceFactor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23joinEnds">Online Documentation</a>
   */
  final var joinEnds: Boolean
  
  /**
   * Gets or sets a relative factor which controls the distance from the end point of the joined lines to the first parallel segments.
   * 
   * Default value - `0.0`. No additional relative distance is added to [absoluteJoinEndDistance][ParallelEdgeRouter]
   * @throws ArgumentError if the specified relative distance is less than `0` or greater than `1`
   * @see [joinEnds]
   * @see [absoluteJoinEndDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23relativeJoinEndDistanceFactor">Online Documentation</a>
   */
  final var relativeJoinEndDistanceFactor: Double
  
  /**
   * Delegates the arrangement of nodes and edges to the [coreLayout][LayoutStageBase] and routes the multi-edges.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Hides all multi-edges only leaving one leading edge per group of multi-edges.
   * @param [graph] the input graph
   * @return A mapping from each leading edge to the list of multi-edges that it represents.
   * @see [directedMode]
   * @see [ParallelEdgeRouterData.affectedEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-findAndHideMultiEdges">Online Documentation</a>
   */
  protected open fun findAndHideMultiEdges(
    graph: LayoutGraph,
  ): IMapper<LayoutEdge, YList<LayoutEdge>>
  
  /**
   * Routes all the multi-edges.
   * @param [graph] the graph after the core layout
   * @param [parallelEdges] the [IMapper] that provides all multi-edges for each leading edge, or `null` if there are none
   * @see [joinEnds]
   * @see [adaptiveEdgeDistances]
   * @see [adjustLeadingEdge]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-routeEdges">Online Documentation</a>
   */
  protected open fun routeEdges(
    graph: LayoutGraph,
    parallelEdges: IMapper<LayoutEdge, YList<LayoutEdge>>,
  )
  
  companion object : ClassMetadata<ParallelEdgeRouter> {
    /**
     * A [data key][EdgeDataKey] for marking edges that will be routed.
     * @see [ParallelEdgeRouterData.affectedEdges]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23AFFECTED_EDGES_DATA_KEY">Online Documentation</a>
     */
     val AFFECTED_EDGES_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * A [data key][EdgeDataKey] for specifying the leading edges.
     * @see [ParallelEdgeRouterData.leadingEdges]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23LEADING_EDGE_DATA_KEY">Online Documentation</a>
     */
     val LEADING_EDGE_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * A [data key][EdgeDataKey] for publishing the multi-edges that were routed and not treated as leading edges.
     * @see [ParallelEdgeRouterData.routedMultiEdgesResult]
     * @see [LEADING_EDGE_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ROUTED_MULTI_EDGES_RESULT_DATA_KEY">Online Documentation</a>
     */
     val ROUTED_MULTI_EDGES_RESULT_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * Routes two edges which are incident to the same nodes in parallel, optionally joining the end points.
     * @param [leadingEdge] the leading edge
     * @param [edge] the edge to be adjusted
     * @param [edgeDistance] the distance between the two edges
     * @param [joinEnds] `true` if the edges should share their end points (the ones of the leading edge), `false` otherwise
     * @param [absJoinDistance] the absolute distance between the end points and the beginning of the parallel segment routing if the ends are joined
     * @param [relJoinDistance] the relative distance, measured relative to the length of the first/last segments if the ends are joined
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouter%23ParallelEdgeRouter-method-routeEdgesParallel">Online Documentation</a>
     */
    fun routeEdgesParallel(
      leadingEdge: LayoutEdge,
      edge: LayoutEdge,
      edgeDistance: Double,
      joinEnds: Boolean  = definedExternally,
      absJoinDistance: Double  = definedExternally,
      relJoinDistance: Double  = definedExternally,
    )
  }
}

inline fun ParallelEdgeRouter(
    block: ParallelEdgeRouter.() -> Unit
): ParallelEdgeRouter {
    return ParallelEdgeRouter()
        .apply(block)
}
