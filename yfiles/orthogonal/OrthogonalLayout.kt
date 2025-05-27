// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.ComponentLayout
import yfiles.layout.EdgeDataKey
import yfiles.layout.EdgeLabelPlacement
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutOrientation
import yfiles.layout.LayoutStageStack
import yfiles.layout.NodeLabelPlacement

/**
 * This layout algorithm arranges graphs in an orthogonal fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [OrthogonalLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-constructor-OrthogonalLayout">Online Documentation</a>
 */
open external class OrthogonalLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets whether degree-one nodes that have the same neighbor should be aligned.
   * 
   * Default value - `false`. Degree-one nodes with the same neighbor are not aligned with each other.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23alignDegreeOneNodes">Online Documentation</a>
   */
  final var alignDegreeOneNodes: Boolean
  
  /**
   * Gets or sets the minimum size (number of nodes) a chain needs to have to be detected and handled as a chain substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23chainSubstructureSize">Online Documentation</a>
   */
  final var chainSubstructureSize: Int
  
  /**
   * Gets or sets the arrangement style for chain substructures.
   * 
   * Default value - [OrthogonalLayoutChainSubstructureStyle.NONE]. Chains are not handled explicitly.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23chainSubstructureStyle">Online Documentation</a>
   */
  final var chainSubstructureStyle: OrthogonalLayoutChainSubstructureStyle
  
  /**
   * Gets or sets the [ComponentLayout] from the [layoutStages][OrthogonalLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][OrthogonalLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets or sets the minimum size (number of nodes) a cycle needs to have to be detected and explicitly handled as a cycle substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23cycleSubstructureSize">Online Documentation</a>
   */
  final var cycleSubstructureSize: Int
  
  /**
   * Gets or sets the arrangement style for cycle substructures.
   * 
   * Default value - [OrthogonalLayoutCycleSubstructureStyle.NONE]. Cycles are not handled explicitly.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23cycleSubstructureStyle">Online Documentation</a>
   */
  final var cycleSubstructureStyle: OrthogonalLayoutCycleSubstructureStyle
  
  /**
   * Gets or sets the [OrthogonalLayoutEdgeDescriptor] instance used for all those edges that do not have a [specific descriptor][OrthogonalLayoutData] assigned.
   * 
   * Default value - [OrthogonalLayoutEdgeDescriptor]. A descriptor instance with default settings.
   * @see [OrthogonalLayoutData.edgeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23defaultEdgeDescriptor">Online Documentation</a>
   */
  final var defaultEdgeDescriptor: OrthogonalLayoutEdgeDescriptor
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [EdgeLabelPlacement.INTEGRATED]. Edge labels are placed by the layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: EdgeLabelPlacement
  
  /**
   * Gets or sets whether the existing drawing should be used as a sketch of the resulting orthogonal layout.
   * 
   * Default value - `false`. The initial coordinates of the nodes are not considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
   * 
   * Default value - `20`
   * @throws ArgumentError if the grid spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the main layout mode for this algorithm.
   * 
   * Default value - [OrthogonalLayoutMode.STRICT]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23layoutMode">Online Documentation</a>
   */
  final var layoutMode: OrthogonalLayoutMode
  
  /**
   * Gets or sets the [layoutOrientation][OrthogonalLayout] of the [OrientationStage][yfiles.layout.OrientationStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: LayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets or sets whether parallel routes for parallel edges (multi-edges) are preferred over independent routes.
   * 
   * Default value - `true`. The algorithm tries to route parallel edges in parallel.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23preferParallelRoutes">Online Documentation</a>
   */
  final var preferParallelRoutes: Boolean
  
  /**
   * Gets or sets the ratio of layout quality versus running time.
   * 
   * Default value - `0.6`. Quality is a bit more important than fast running time.
   * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23qualityTimeRatio">Online Documentation</a>
   */
  final var qualityTimeRatio: Double
  
  /**
   * Gets or sets the preferred time limit.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. The layout algorithm runs unrestricted.
   * @throws ArgumentError if the stop duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets or sets the desired orientation for tree substructure layouts.
   * 
   * Default value - [SubstructureOrientation.AUTO_DETECT]. The tree orientation is determined automatically.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeSubstructureOrientation">Online Documentation</a>
   */
  final var treeSubstructureOrientation: SubstructureOrientation
  
  /**
   * Gets or sets the minimum size (number of nodes) a subtree needs to have to be detected and explicitly handled as a tree substructure.
   * 
   * Default value - `3`
   * @throws ArgumentError if the given minimum size is less than `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeSubstructureSize">Online Documentation</a>
   */
  final var treeSubstructureSize: Int
  
  /**
   * Gets or sets the arrangement style for tree substructures.
   * 
   * Default value - [OrthogonalLayoutTreeSubstructureStyle.NONE]. Subtrees are not arranged in a special way.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeSubstructureStyle">Online Documentation</a>
   */
  final var treeSubstructureStyle: OrthogonalLayoutTreeSubstructureStyle
  
  /**
   * Gets or sets whether the layout algorithm should try to obtain a uniform port assignment of the edges incident to the same node side.
   * 
   * Default value - `false`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23uniformPortAssignment">Online Documentation</a>
   */
  final var uniformPortAssignment: Boolean
  
  /**
   * Calculates an orthogonal layout for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates an orthogonal layout for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrthogonalLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrthogonalLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): OrthogonalLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrthogonalLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrthogonalLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): OrthogonalLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<OrthogonalLayout> {
    /**
     * A [data key][EdgeDataKey] for providing bend costs for each edge.
     * @see [OrthogonalLayoutData.edgeBendCosts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_BEND_COST_DATA_KEY">Online Documentation</a>
     */
     val EDGE_BEND_COST_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][EdgeDataKey] for providing crossing costs for each edge.
     * @see [OrthogonalLayoutData.edgeCrossingCosts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_CROSSING_COST_DATA_KEY">Online Documentation</a>
     */
     val EDGE_CROSSING_COST_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][EdgeDataKey] for providing layout information for each edge.
     * @see [OrthogonalLayoutData.edgeDescriptors]
     * @see [layoutMode]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_DESCRIPTOR_DATA_KEY: EdgeDataKey<OrthogonalLayoutEdgeDescriptor>
    
    /**
     * A [data key][EdgeDataKey] for specifying the orientation of edges with respect to the main layout orientation.
     * @see [OrthogonalLayoutData.edgeOrientation]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_ORIENTATION_DATA_KEY">Online Documentation</a>
     */
     val EDGE_ORIENTATION_DATA_KEY: EdgeDataKey<Number>
  }
}

inline fun OrthogonalLayout(
    block: OrthogonalLayout.() -> Unit
): OrthogonalLayout {
    return OrthogonalLayout()
        .apply(block)
}
