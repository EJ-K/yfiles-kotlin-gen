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
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.EdgeDataKey
import yfiles.layout.EdgeLabelDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.NodeLabelDataKey

/**
 * This edge routing algorithm applies orthogonal, octilinear or curved routes to the edges of the graph while not changing node positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeRouter] instance with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-constructor-EdgeRouter">Online Documentation</a>
 */
open external class EdgeRouter (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets the descriptor instance that defines settings for all those edges that do not have an assigned [edge descriptor][EdgeRouterData] .
   * @see [EdgeRouterData.edgeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23defaultEdgeDescriptor">Online Documentation</a>
   */
  open val defaultEdgeDescriptor: EdgeRouterEdgeDescriptor
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [EdgeRouterEdgeLabelPlacement.GENERIC]. Edge labels placed by an an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: EdgeRouterEdgeLabelPlacement
  
  /**
   * Gets or sets a [GenericLabeling] helper class for this algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23genericLabeling">Online Documentation</a>
   */
  final var genericLabeling: GenericLabeling?
  
  /**
   * Gets or sets the equidistant spacing between the horizontal and vertical grid lines, on which the routing algorithm places the orthogonal segments
   * 
   * Default value - `0`. No grid is considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the minimum distance between edges and node bounds.
   * 
   * Default value - `10`
   * @throws ArgumentError if the minimum node-to-edge distance is negative
   * @see [EdgeRouterCosts.minimumNodeToEdgeDistanceCost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23minimumNodeToEdgeDistance">Online Documentation</a>
   */
  final var minimumNodeToEdgeDistance: Double
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [EdgeRouterNodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: EdgeRouterNodeLabelPlacement
  
  /**
   * Gets or sets whether or not the routing algorithm uses an additional step to reroute the edges that are considered to have the worst paths.
   * 
   * Default value - `false`. The rerouting step will not be performed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23rerouting">Online Documentation</a>
   */
  final var rerouting: Boolean
  
  /**
   * Gets or sets the time limit set for the edge routing algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. The edge routing algorithm runs unrestricted.
   * @throws ArgumentError if the given duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Adds a custom [PartitionExtension] instance to this router instance.
   * @param [extension] A custom [PartitionExtension] instance that will be used during the partitioning phase.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-addPartitionExtension">Online Documentation</a>
   */
  fun addPartitionExtension(
    extension: PartitionExtension,
  )
  
  /**
   * Adds a custom [PathSearchExtension] instance to this router instance.
   * @param [extension] A custom [PathSearchExtension] instance that will be used by the path searching algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-addPathSearchExtension">Online Documentation</a>
   */
  fun addPathSearchExtension(
    extension: PathSearchExtension,
  )
  
  /**
   * Performs the routing of the edges of the input graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [EdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [EdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): EdgeRouterData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to define the edges affected by the [EdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [EdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): EdgeRouterData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Returns the [EdgeRouterEdgeDescriptor] instance for a given edge that is defined via [edgeDescriptors][EdgeRouterData].
   * @param [edge] the given edge
   * @return the current [EdgeRouterEdgeDescriptor] instance for a given edge
   * @see [defaultEdgeDescriptor]
   * @see [EdgeRouterData.edgeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EdgeRouter-method-getEdgeDescriptor">Online Documentation</a>
   */
  protected fun getEdgeDescriptor(
    edge: LayoutEdge,
  ): EdgeRouterEdgeDescriptor
  
  companion object : ClassMetadata<EdgeRouter> {
    /**
     * A [data key][EdgeDataKey] for specifying a bus descriptor for each edge.
     * @see [EdgeRouterData.buses]
     * @see [EdgeRouterBusDescriptor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23BUS_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val BUS_DESCRIPTOR_DATA_KEY: EdgeDataKey<EdgeRouterBusDescriptor>
    
    /**
     * A [data key][EdgeDataKey] for specifying individual edge layout information.
     * @see [EdgeRouterData.edgeDescriptors]
     * @see [defaultEdgeDescriptor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EDGE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_DESCRIPTOR_DATA_KEY: EdgeDataKey<EdgeRouterEdgeDescriptor>
    
    /**
     * A [data key][EdgeLabelDataKey] for weighting the costs for crossing each edge label individually.
     * @see [EdgeRouterData.edgeLabelCrossingCostFactors]
     * @see [defaultEdgeDescriptor]
     * @see [EdgeRouterEdgeDescriptor.edgeRouterCosts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23EDGE_LABEL_CROSSING_COST_FACTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABEL_CROSSING_COST_FACTOR_DATA_KEY: EdgeLabelDataKey<Number>
    
    /**
     * A [data key][NodeLabelDataKey] for weighting the costs for crossing each node label individually.
     * @see [EdgeRouterData.nodeLabelCrossingCostFactors]
     * @see [defaultEdgeDescriptor]
     * @see [EdgeRouterEdgeDescriptor.edgeRouterCosts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23NODE_LABEL_CROSSING_COST_FACTOR_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABEL_CROSSING_COST_FACTOR_DATA_KEY: NodeLabelDataKey<Number>
    
    /**
     * A [IMapper][yfiles.collections.IMapper] key to look up the selection state of the edges.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouter%23SCOPE_DATA_KEY">Online Documentation</a>
     */
     val SCOPE_DATA_KEY: EdgeDataKey<EdgeRouterScope>
  }
}

inline fun EdgeRouter(
    block: EdgeRouter.() -> Unit
): EdgeRouter {
    return EdgeRouter()
        .apply(block)
}
