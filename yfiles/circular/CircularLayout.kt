// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ComponentLayout
import yfiles.layout.EdgeBundling
import yfiles.layout.EdgeDataKey
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
import yfiles.tree.RadialTreeLayout

/**
 * This layout algorithm arranges graphs in a circular fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CircularLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-constructor-CircularLayout">Online Documentation</a>
 */
open external class CircularLayout () : ILayoutAlgorithm {
  /**
   * Gets the [RadialTreeLayout] instance used for arranging multiple partitions.
   * @see [partitioningPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23backboneLayout">Online Documentation</a>
   */
  final val backboneLayout: RadialTreeLayout
  
  /**
   * Gets the [ComponentLayout] from the [layoutStages][CircularLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][CircularLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeBundling">Online Documentation</a>
   */
  final val edgeBundling: EdgeBundling
  
  /**
   * Gets or sets the descriptor that defines settings for the non-exterior edges, that is, edges that are routed within or between circle partitions.
   * @throws ArgumentError if the given descriptor is `null`
   * @see [edgeRoutingPolicy]
   * @see [exteriorEdgeDescriptor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeDescriptor">Online Documentation</a>
   */
  final var edgeDescriptor: CircularLayoutEdgeDescriptor
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [RadialEdgeLabelPlacement.GENERIC]. Edge labels are placed by an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: RadialEdgeLabelPlacement
  
  /**
   * Gets or sets the edge routing policy that determines whether edges are routed internally or externally with respect to a single partition circle.
   * 
   * Default value - [CircularLayoutEdgeRoutingPolicy.INTERIOR]. Edges are routed as simple straight lines on the interior.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeRoutingPolicy">Online Documentation</a>
   */
  final var edgeRoutingPolicy: CircularLayoutEdgeRoutingPolicy
  
  /**
   * Gets or sets the descriptor that defines settings for the exterior edges.
   * @throws ArgumentError if the given descriptor is `null`
   * @see [edgeRoutingPolicy]
   * @see [edgeDescriptor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23exteriorEdgeDescriptor">Online Documentation</a>
   */
  final var exteriorEdgeDescriptor: CircularLayoutExteriorEdgeDescriptor
  
  /**
   * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes of the partitions and the partitions themselves.
   * 
   * Default value - `false`. The layout algorithm does not consider the initial coordinates of the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets the maximum deviation angle in degrees allowed for an edge.
   * 
   * Default value - `90`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23maximumDeviationAngle">Online Documentation</a>
   */
  final var maximumDeviationAngle: Int
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [RadialNodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: RadialNodeLabelPlacement
  
  /**
   * Gets or sets the distance between node labels belonging to the same node.
   * 
   * Default value - `2.0`
   * @throws ArgumentError if the given spacing value is negative
   * @see [nodeLabelPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23nodeLabelSpacing">Online Documentation</a>
   */
  final var nodeLabelSpacing: Double
  
  /**
   * Gets the [ParallelEdgeRouter] from the [layoutStages][CircularLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][CircularLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23parallelEdgeRouter">Online Documentation</a>
   */
  final val parallelEdgeRouter: ParallelEdgeRouter
  
  /**
   * Gets or sets the descriptor that defines settings for the layouts of the circle partitions.
   * @see [partitioningPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23partitionDescriptor">Online Documentation</a>
   */
  final var partitionDescriptor: PartitionDescriptor
  
  /**
   * Gets or sets the global partitioning policy for this layout algorithm.
   * 
   * Default value - [CircularLayoutPartitioningPolicy.BCC_COMPACT]
   * @see [partitionDescriptor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23partitioningPolicy">Online Documentation</a>
   */
  final var partitioningPolicy: CircularLayoutPartitioningPolicy
  
  /**
   * Gets or sets whether or not, in the underlying tree, the children of a tree node are placed on a common radius.
   * 
   * Default value - `true`. Children are placed on a common radius.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23placeChildrenOnCommonRadius">Online Documentation</a>
   */
  final var placeChildrenOnCommonRadius: Boolean
  
  /**
   * Gets the [SelfLoopRouter] from the [layoutStages][CircularLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][CircularLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23selfLoopRouter">Online Documentation</a>
   */
  final val selfLoopRouter: SelfLoopRouter
  
  /**
   * Gets or sets the minimum size (number of nodes including the root) a star needs to have to be detected and handled as a star substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `3`
   * @see [starSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureSize">Online Documentation</a>
   */
  final var starSubstructureSize: Int
  
  /**
   * Gets or sets the layout style for star substructures.
   * 
   * Default value - [CircularLayoutStarSubstructureStyle.NONE]. Stars are not detected and not handled in a special way.
   * @see [starSubstructureSize]
   * @see [CircularLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureStyle">Online Documentation</a>
   */
  final var starSubstructureStyle: CircularLayoutStarSubstructureStyle
  
  /**
   * Gets or sets whether star substructures should be separated by the node type.
   * 
   * Default value - `true`. Star substructures are strictly separated by node type.
   * @see [starSubstructureStyle]
   * @see [CircularLayoutData.nodeTypes]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureTypeSeparation">Online Documentation</a>
   */
  final var starSubstructureTypeSeparation: Boolean
  
  /**
   * Calculates a circular layout for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Arranges the given graph in a circular fashion.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [CircularLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CircularLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): CircularLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [CircularLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CircularLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): CircularLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<CircularLayout> {
    /**
     * A [data key][NodeDataKey] for publishing the final circle information.
     * @see [CircularLayoutData.circleIdsResult]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CIRCLE_ID_RESULT_DATA_KEY">Online Documentation</a>
     */
     val CIRCLE_ID_RESULT_DATA_KEY: NodeDataKey<Number>
    
    /**
     * A [data key][EdgeDataKey] for marking edges that should be routed externally, around the circle instead of inside.
     * @see [edgeRoutingPolicy]
     * @see [CircularLayoutData.exteriorEdges]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23EXTERIOR_EDGES_DATA_KEY">Online Documentation</a>
     */
     val EXTERIOR_EDGES_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for defining custom node partitions.
     * @see [CircularLayoutData.partitions]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23PARTITION_DATA_KEY">Online Documentation</a>
     */
     val PARTITION_DATA_KEY: NodeDataKey<Any>
  }
}

inline fun CircularLayout(
    block: CircularLayout.() -> Unit
): CircularLayout {
    return CircularLayout()
        .apply(block)
}
