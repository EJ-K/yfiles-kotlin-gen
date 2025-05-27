// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.PortPlacementStage

/**
 * This edge routing algorithm applies organic routes to the edges of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [OrganicEdgeRouter] with the given [coreLayout][LayoutStageBase].
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-constructor-OrganicEdgeRouter">Online Documentation</a>
 */
open external class OrganicEdgeRouter (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets whether or not edges are allowed to cross nodes.
   * 
   * Default value - `true`. Edges are allowed to cross nodes.
   * @see [allowMovingNodes]
   * @see [minimumDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23allowEdgeNodeOverlaps">Online Documentation</a>
   */
  final var allowEdgeNodeOverlaps: Boolean
  
  /**
   * Gets or sets whether nodes are allowed to move, which can increase the routing quality and reduce the probability of overlaps between nodes and edges.
   * 
   * Default value - `false`. Nodes are not moved.
   * @see [allowEdgeNodeOverlaps]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23allowMovingNodes">Online Documentation</a>
   */
  final var allowMovingNodes: Boolean
  
  /**
   * Gets or sets whether or not the initial bend coordinates influence the path routing such that the calculated routes tend to have a similar overall shape.
   * 
   * Default value - `false`. Bends in the input graph are not considered for edge routing.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23considerExistingBends">Online Documentation</a>
   */
  final var considerExistingBends: Boolean
  
  /**
   * Gets or sets whether or not the initial bend coordinates are kept when determining the edge path.
   * 
   * Default value - `false`. Bends coordinates in the input graph are not kept fixed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23keepExistingBends">Online Documentation</a>
   */
  final var keepExistingBends: Boolean
  
  /**
   * Gets or sets the minimum distance the algorithm should guarantee between nodes and non-incident edges.
   * 
   * Default value - `10`
   * @throws ArgumentError if the given minimum distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23minimumDistance">Online Documentation</a>
   */
  final var minimumDistance: Double
  
  /**
   * Gets a [LayoutStageBase] that provides support for [EdgePortCandidates][yfiles.layout.EdgePortCandidates], [NodePortCandidates][yfiles.layout.NodePortCandidates] or port groups ids.
   * @see [OrganicEdgeRouterData.ports]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23portPlacementStage">Online Documentation</a>
   */
  final val portPlacementStage: PortPlacementStage
  
  /**
   * Gets or sets whether a rerouting step is performed on all edges or just on a subset where distances are violated.
   * 
   * Default value - `false`. Only edges being too close to nodes are rerouted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23routeAllEdges">Online Documentation</a>
   */
  final var routeAllEdges: Boolean
  
  /**
   * Performs the organic routing of the edges of the input graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrganicEdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrganicEdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): OrganicEdgeRouterData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrganicEdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrganicEdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): OrganicEdgeRouterData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<OrganicEdgeRouter> {
  }
}

inline fun OrganicEdgeRouter(
    block: OrganicEdgeRouter.() -> Unit
): OrganicEdgeRouter {
    return OrganicEdgeRouter()
        .apply(block)
}
