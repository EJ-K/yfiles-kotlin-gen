// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan

/**
 * This layout algorithm places nodes in a tabular fashion.
 * @see [LayoutGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TabularLayout] class with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-constructor-TabularLayout">Online Documentation</a>
 */
open external class TabularLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets whether the algorithm should consider edges so that it tries to find a node arrangement with a low overall edge length.
   * 
   * Default value - `false`. Edges are not considered.
   * @see [layoutMode]
   * @see [TabularLayoutData.freeNodeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23considerEdges">Online Documentation</a>
   */
  final var considerEdges: Boolean
  
  /**
   * Gets or sets the [TabularLayoutNodeDescriptor] instance that defines settings for those nodes that do not have an [individual descriptor][TabularLayoutData] specified.
   * 
   * Default value - [TabularLayoutNodeDescriptor]. Descriptor instance with default settings.
   * @see [TabularLayoutData.nodeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23defaultNodeDescriptor">Online Documentation</a>
   */
  final var defaultNodeDescriptor: TabularLayoutNodeDescriptor
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [TabularLayoutEdgeLabelPlacement.GENERIC]. Edge labels are placed by an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: TabularLayoutEdgeLabelPlacement
  
  /**
   * Gets the [GenericLabeling] helper class from the [layoutStages][TabularLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][TabularLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23genericLabeling">Online Documentation</a>
   */
  final val genericLabeling: GenericLabeling
  
  /**
   * Gets or sets the policy defining the size of the resulting tabular layout and the mapping of the nodes to the table cells.
   * 
   * Default value - [TabularLayoutMode.AUTO_SIZE]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23layoutMode">Online Documentation</a>
   */
  final var layoutMode: TabularLayoutMode
  
  /**
   * Gets the mutable stack of [ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets or sets the time limit set for the layout algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. The layout algorithm runs unrestricted.
   * @throws ArgumentError if the stop duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Calculates a tabular layout of the graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Arranges the input graph in a tabular fashion.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [TabularLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [TabularLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): TabularLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [TabularLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [TabularLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): TabularLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<TabularLayout> {
    /**
     * A [data key][NodeDataKey] for publishing the layout grid cell descriptors for all nodes in the graph.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23LAYOUT_GRID_CELL_DESCRIPTOR_RESULT_DATA_KEY">Online Documentation</a>
     */
     val LAYOUT_GRID_CELL_DESCRIPTOR_RESULT_DATA_KEY: NodeDataKey<LayoutGridCellDescriptor>
    
    /**
     * A [data key][NodeDataKey] for providing layout information for each node.
     * @see [TabularLayoutData.nodeDescriptors]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23NODE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val NODE_DESCRIPTOR_DATA_KEY: NodeDataKey<TabularLayoutNodeDescriptor>
  }
}

inline fun TabularLayout(
    block: TabularLayout.() -> Unit
): TabularLayout {
    return TabularLayout()
        .apply(block)
}
