// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.collections.IEnumerable
import yfiles.geometry.Rect
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageStack
import yfiles.layout.NodeDataKey
import yfiles.layout.NodeLabelPlacement

/**
 * This layout algorithm tries to fill a specified area with graph elements by moving nearby elements towards it, with the goal to make the existing layout more compact and not changing it too much.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FillAreaLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-constructor-FillAreaLayout">Online Documentation</a>
 */
open external class FillAreaLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets the rectangular area that should be filled.
   * 
   * Default value - `null`. There is no area to be filled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23area">Online Documentation</a>
   */
  final var area: Rect?
  
  /**
   * Gets or sets the strategy that assigns nodes to components whose elements should preferably not be separated.
   * 
   * Default value - [ComponentAssignmentStrategy.SINGLE]. Each node is a separate component.
   * @see [FillAreaLayoutData.componentIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23componentAssignmentStrategy">Online Documentation</a>
   */
  final var componentAssignmentStrategy: ComponentAssignmentStrategy
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [FillAreaLayoutEdgeLabelPlacement.CONSIDER]. Edge labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: FillAreaLayoutEdgeLabelPlacement
  
  /**
   * Gets the [GenericLabeling] helper class from the [layoutStages][FillAreaLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][FillAreaLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23genericLabeling">Online Documentation</a>
   */
  final val genericLabeling: GenericLabeling
  
  /**
   * Gets or sets the current grid spacing.
   * 
   * Default value - `0`. No grid is considered.
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the layout orientation that is considered during the compaction process.
   * 
   * Default value - [PartialLayoutOrientation.NONE]. The layout is considered to have no specific orientation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: PartialLayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets or sets the spacing that is considered between elements when they are moved.
   * 
   * Default value - `10`
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23spacing">Online Documentation</a>
   */
  final var spacing: Double
  
  /**
   * Gets or sets the time limit for the layout algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]
   * @throws ArgumentError if the stop duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Tries to fill the specified area in the given graph with elements, such that the resulting layout is more compact.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Tries to fill the specified area in the given graph with elements, such that the resulting layout is more compact.
   * @param [graph] The input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Creates and sets the value of the property [area][FillAreaLayout] of the `layout` determined from the `items`.
   * @param [items] The [IModelItem]s from which the rectangular area is determined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-defaultmethod-configureAreaOutline">Online Documentation</a>
   */
  fun configureAreaOutline(
    items: IEnumerable<IModelItem>,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [FillAreaLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [FillAreaLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): FillAreaLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [FillAreaLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [FillAreaLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): FillAreaLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<FillAreaLayout> {
    /**
     * A [data key][NodeDataKey] for defining custom components whose elements should preferably not be separated.
     * @see [FillAreaLayoutData.componentIds]
     * @see [componentAssignmentStrategy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23COMPONENT_ID_DATA_KEY">Online Documentation</a>
     */
     val COMPONENT_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][NodeDataKey] for marking nodes as fixed.
     * @see [FillAreaLayoutData.fixedNodes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FIXED_NODE_DATA_KEY">Online Documentation</a>
     */
     val FIXED_NODE_DATA_KEY: NodeDataKey<Boolean>
  }
}

inline fun FillAreaLayout(
    block: FillAreaLayout.() -> Unit
): FillAreaLayout {
    return FillAreaLayout()
        .apply(block)
}
