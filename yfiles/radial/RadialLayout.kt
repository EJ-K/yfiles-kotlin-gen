// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.layout.ComponentLayout
import yfiles.layout.EdgeBundling
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageStack
import yfiles.layout.NodeDataKey
import yfiles.layout.RadialEdgeLabelPlacement
import yfiles.layout.RadialNodeLabelPlacement
import yfiles.router.ParallelEdgeRouter
import yfiles.router.SelfLoopRouter
import yfiles.tree.TreeReductionStage

/**
 * This layout algorithm arranges graphs in a radial fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [RadialLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-constructor-RadialLayout">Online Documentation</a>
 */
open external class RadialLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets the policy that determines which nodes are selected as roots of the (virtual) tree for the layout process and are set in the center of the circles.
   * 
   * Default value - [CenterNodesPolicy.WEIGHTED_CENTRALITY]. The node determined using weighted centrality is placed in the center.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23centerNodesPolicy">Online Documentation</a>
   */
  final var centerNodesPolicy: CenterNodesPolicy
  
  /**
   * Gets the [ComponentLayout] from the [layoutStages][RadialLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][RadialLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
   * 
   * Default value - `false`. Each point is a normal polyline bend point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23createControlPoints">Online Documentation</a>
   */
  final var createControlPoints: Boolean
  
  /**
   * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23edgeBundling">Online Documentation</a>
   */
  final val edgeBundling: EdgeBundling
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [RadialEdgeLabelPlacement.IGNORE]. Edge labels are placed by an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: RadialEdgeLabelPlacement
  
  /**
   * Gets or sets the edge routing style.
   * 
   * Default value - [RadialLayoutRoutingStyle.ARC]. The edges will be routed as arcs.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23edgeRoutingStyle">Online Documentation</a>
   */
  final var edgeRoutingStyle: RadialLayoutRoutingStyle
  
  /**
   * Gets or sets the spacing between two consecutive circles (layers).
   * 
   * Default value - `25`
   * @throws ArgumentError if the spacing value is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23layerSpacing">Online Documentation</a>
   */
  final var layerSpacing: Double
  
  /**
   * Gets or sets the layering strategy that determines how nodes are distributed into different layers.
   * 
   * Default value - [RadialLayeringStrategy.BFS]. The layers are determined using BFS.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23layeringStrategy">Online Documentation</a>
   */
  final var layeringStrategy: RadialLayeringStrategy
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets the maximum angle in degrees of the sector around a node within which the node's children will be placed.
   * 
   * Default value - `180`
   * @throws ArgumentError if the sector angle is negative or greater than `360` degrees
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23maximumChildSectorAngle">Online Documentation</a>
   */
  final var maximumChildSectorAngle: Double
  
  /**
   * Gets or sets the minimum bend angle (in degrees) between two adjacent edge segments.
   * 
   * Default value - `5`
   * @throws ArgumentError if the given minimum bend angle is negative or greater than `90`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumBendAngle">Online Documentation</a>
   */
  final var minimumBendAngle: Double
  
  /**
   * Gets or sets the minimum distance between two neighboring edges of the same circle.
   * 
   * Default value - `50`
   * @throws ArgumentError if the given minimum distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumEdgeDistance">Online Documentation</a>
   */
  final var minimumEdgeDistance: Double
  
  /**
   * Gets or sets the minimum distance between two circles.
   * 
   * Default value - `100`
   * @throws ArgumentError if the minimum layer distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumLayerDistance">Online Documentation</a>
   */
  final var minimumLayerDistance: Double
  
  /**
   * Gets or sets the minimum distance between two neighboring nodes of the same circle.
   * 
   * Default value - `10`
   * @throws ArgumentError if the given minimum distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets the distance between neighboring nodes on the outermost circle that do not share the same predecessor on the previous circle.
   * 
   * Default value - `0`. The nodes are distributed evenly.
   * @see [minimumNodeDistance]
   * @see [layeringStrategy]
   * @see [RadialLayeringStrategy.DENDROGRAM]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumSectorDistance">Online Documentation</a>
   */
  final var minimumSectorDistance: Double
  
  /**
   * Gets or sets how the layout algorithm handles node labels.
   * 
   * Default value - [RadialNodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see [RadialNodeLabelPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: RadialNodeLabelPlacement
  
  /**
   * Gets or sets the distance between node labels belonging to the same node.
   * 
   * Default value - `2.0`
   * @throws ArgumentError if the given spacing value is negative
   * @see [nodeLabelPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23nodeLabelSpacing">Online Documentation</a>
   */
  final var nodeLabelSpacing: Double
  
  /**
   * Gets the [ParallelEdgeRouter] from the [layoutStages][RadialLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][RadialLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23parallelEdgeRouter">Online Documentation</a>
   */
  final val parallelEdgeRouter: ParallelEdgeRouter
  
  /**
   * Gets the [SelfLoopRouter] from the [layoutStages][RadialLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][RadialLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23selfLoopRouter">Online Documentation</a>
   */
  final val selfLoopRouter: SelfLoopRouter
  
  /**
   * Gets the [TreeReductionStage] from the [layoutStages][RadialLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][RadialLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23treeReductionStage">Online Documentation</a>
   */
  final val treeReductionStage: TreeReductionStage
  
  /**
   * Calculates a radial arrangement for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates a radial arrangement for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [RadialLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [RadialLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): RadialLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [RadialLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [RadialLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): RadialLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<RadialLayout> {
    /**
     * A [data key][NodeDataKey] for marking custom nodes that should be placed in the center.
     * @see [RadialLayoutData.centerNodes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23CENTER_NODES_DATA_KEY">Online Documentation</a>
     */
     val CENTER_NODES_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for providing user-defined layer/circle IDs.
     * @see [RadialLayoutData.layerIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23LAYER_ID_DATA_KEY">Online Documentation</a>
     */
     val LAYER_ID_DATA_KEY: NodeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for publishing the circle ID and sector data.
     * @see [RadialLayoutData.nodePlacementsResult]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23NODE_PLACEMENT_RESULT_DATA_KEY">Online Documentation</a>
     */
     val NODE_PLACEMENT_RESULT_DATA_KEY: NodeDataKey<RadialLayoutNodePlacementResult>
    
    /**
     * A [data key][NodeDataKey] for specifying the comparator for the outgoing edges which ultimately orders the successor nodes of a node.
     * @see [RadialLayoutData.childOrder]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23OUT_EDGE_COMPARATOR_DATA_KEY">Online Documentation</a>
     */
     val OUT_EDGE_COMPARATOR_DATA_KEY: NodeDataKey<Comparison1<LayoutEdge>>
  }
}

inline fun RadialLayout(
    block: RadialLayout.() -> Unit
): RadialLayout {
    return RadialLayout()
        .apply(block)
}
