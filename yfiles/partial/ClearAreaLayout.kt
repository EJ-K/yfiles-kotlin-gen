// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import js.array.ReadonlyArray
import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.BorderLine
import yfiles.layout.EdgeDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageStack
import yfiles.layout.NodeDataKey
import yfiles.layout.NodeLabelPlacement
import yfiles.layout.PartialLayoutRoutingStyle
import yfiles.layout.ValueDataKey

/**
 * This layout algorithm clears a specified area by moving intersecting elements, while trying to minimize the changes in the given layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ClearAreaLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-constructor-ClearAreaLayout">Online Documentation</a>
 */
open external class ClearAreaLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets the rectangular area that must be cleared.
   * 
   * Default value - `null`. There is no area to be cleared.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23area">Online Documentation</a>
   */
  final var area: Rect?
  
  /**
   * Gets or sets the outline describing the shape of the area that must be cleared.
   * 
   * Default value - `null`. There is no outline to be cleared.
   * @throws ArgumentError if the given array does not contain exactly four non-null [BorderLine]s
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23areaOutline">Online Documentation</a>
   */
  final var areaOutline: ReadonlyArray<BorderLine>?
  
  /**
   * Gets or sets the strategy applied for clearing the desired area.
   * 
   * Default value - [ClearAreaStrategy.PRESERVE_SHAPES]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23clearAreaStrategy">Online Documentation</a>
   */
  final var clearAreaStrategy: ClearAreaStrategy
  
  /**
   * Gets or sets the strategy that assigns nodes to components whose elements should preferably not be separated.
   * 
   * Default value - [ComponentAssignmentStrategy.SINGLE]. Each node is a separate component.
   * @see [ClearAreaLayoutData.componentIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23componentAssignmentStrategy">Online Documentation</a>
   */
  final var componentAssignmentStrategy: ComponentAssignmentStrategy
  
  /**
   * Gets or sets whether or not edges are considered when clearing the [area][ClearAreaLayout] such that no segments intersecting the area are allowed.
   * 
   * Default value - `true`. Edges are not allowed to intersect the area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23considerEdges">Online Documentation</a>
   */
  final var considerEdges: Boolean
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [ClearAreaLayoutEdgeLabelPlacement.CONSIDER]. Edge labels intersecting the clearing area are considered and rearranged.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: ClearAreaLayoutEdgeLabelPlacement
  
  /**
   * Gets or sets the custom edge router instance that is applied to reroute edges.
   * 
   * Default value - `null`. There is no custom router and the routing style is automatically determined.
   * @see [edgeRoutingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23edgeRouter">Online Documentation</a>
   */
  final var edgeRouter: ILayoutAlgorithm?
  
  /**
   * Gets or sets the routing style that is preserved while clearing the area and applied when rerouting edges.
   * 
   * Default value - [PartialLayoutRoutingStyle.AUTOMATIC]. The routing style is automatically determined.
   * @see [edgeRouter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23edgeRoutingStyle">Online Documentation</a>
   */
  final var edgeRoutingStyle: PartialLayoutRoutingStyle
  
  /**
   * Gets or sets whether the ports of the input graph must be fixed or if they can be changed.
   * 
   * Default value - `true`. Ports are fixed and not allowed to change when adjusting the edge paths.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23fixPorts">Online Documentation</a>
   */
  final var fixPorts: Boolean
  
  /**
   * Gets the [GenericLabeling] helper class from the [layoutStages][ClearAreaLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][ClearAreaLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23genericLabeling">Online Documentation</a>
   */
  final val genericLabeling: GenericLabeling
  
  /**
   * Gets or sets the current grid spacing.
   * 
   * Default value - `0`. No grid is considered.
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the layout orientation that is considered during the clearing of the area.
   * 
   * Default value - [PartialLayoutOrientation.NONE]. The layout is considered to have no specific orientation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: PartialLayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets or sets the spacing that is considered between elements when they are moved to clear the area.
   * 
   * Default value - `10`
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23spacing">Online Documentation</a>
   */
  final var spacing: Double
  
  /**
   * Gets or sets the time limit for the layout algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]
   * @throws ArgumentError if the stop duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Clears the specified rectangular [area][ClearAreaLayout], the area defined via [areaNodes][ClearAreaLayoutData] or [expandedNode][ClearAreaLayoutData] by moving all other graph elements currently intersecting with it.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Clears the specified rectangular [area][ClearAreaLayout], the area defined via [areaNodes][ClearAreaLayoutData] or [expandedNode][ClearAreaLayoutData] by moving all other graph elements currently intersecting with it.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Creates and sets the value of the property [areaOutline][ClearAreaLayout] of the `layout` determined from the `items`.
   * @param [items] The [IModelItem]s from which the [BorderLine]s are determined.
   * @param [spacing] The spacing that is considered between the area and the elements.
   * @param [closed] Whether the area is closed or can be traversed by other elements (without overlaps).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-defaultmethod-configureAreaOutline">Online Documentation</a>
   */
  fun configureAreaOutline(
    items: IEnumerable<IModelItem>,
    spacing: Double,
    closed: Boolean  = definedExternally,
  )
  
  /**
   * Creates the outline that describes the shape of the given nodes and edges.
   * @param [graph] the input graph
   * @param [areaNodes] the nodes that are part of the area that should be cleared
   * @param [areaEdges] the edges that are adjacent to the given area nodes
   * @return an array of four [BorderLine]s describing the outline of the area to be cleared
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-createAreaOutline">Online Documentation</a>
   */
  protected open fun createAreaOutline(
    graph: LayoutGraph,
    areaNodes: IEnumerable<LayoutNode>,
    areaEdges: IEnumerable<LayoutEdge>,
  ): ReadonlyArray<BorderLine>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [ClearAreaLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [ClearAreaLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): ClearAreaLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [ClearAreaLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [ClearAreaLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): ClearAreaLayoutData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Moves the [areaOutline][ClearAreaLayout] by the given `delta`.
   * @param [delta] the delta to move the [areaOutline][ClearAreaLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-moveAreaOutline">Online Documentation</a>
   */
  fun moveAreaOutline(
    delta: IPoint,
  )
  
  companion object : ClassMetadata<ClearAreaLayout> {
    /**
     * A [data key][NodeDataKey] for specifying the group node inside which the cleared area should be located.
     * @see [ClearAreaLayoutData.areaGroupNode]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23AREA_GROUP_NODE_DATA_KEY">Online Documentation</a>
     */
     val AREA_GROUP_NODE_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for specifying a set of nodes that define the area which should be cleared.
     * @see [createAreaOutline]
     * @see [ClearAreaLayoutData.areaNodes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23AREA_NODES_DATA_KEY">Online Documentation</a>
     */
     val AREA_NODES_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for defining custom components whose elements should preferably not be separated.
     * @see [ClearAreaLayoutData.componentIds]
     * @see [componentAssignmentStrategy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23COMPONENT_ID_DATA_KEY">Online Documentation</a>
     */
     val COMPONENT_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][NodeDataKey] for marking the node that was expanded and, thus, defines the area that must be cleared.
     * @see [ClearAreaLayoutData.expandedNode]
     * @see [EXPANDED_NODE_ORIGINAL_BOUNDS_DATA_KEY]
     * @see [EXPANDED_NODE_ORIGINAL_EDGE_PATH_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_DATA_KEY">Online Documentation</a>
     */
     val EXPANDED_NODE_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][ValueDataKey] for specifying the original, non-expanded bounds of the expanded node.
     * @see [ClearAreaLayoutData.expandedNodeOriginalBounds]
     * @see [EXPANDED_NODE_DATA_KEY]
     * @see [EXPANDED_NODE_ORIGINAL_EDGE_PATH_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_ORIGINAL_BOUNDS_DATA_KEY">Online Documentation</a>
     */
     val EXPANDED_NODE_ORIGINAL_BOUNDS_DATA_KEY: ValueDataKey<Rect>
    
    /**
     * A [data key][EdgeDataKey] for associating original paths for edges connecting to the expanded node, including edges that did so only when the node was not yet expanded.
     * @see [ClearAreaLayoutData.expandedNodeOriginalEdgePaths]
     * @see [EXPANDED_NODE_DATA_KEY]
     * @see [EXPANDED_NODE_ORIGINAL_BOUNDS_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_ORIGINAL_EDGE_PATH_DATA_KEY">Online Documentation</a>
     */
     val EXPANDED_NODE_ORIGINAL_EDGE_PATH_DATA_KEY: EdgeDataKey<IEnumerable<Point>>
  }
}

inline fun ClearAreaLayout(
    block: ClearAreaLayout.() -> Unit
): ClearAreaLayout {
    return ClearAreaLayout()
        .apply(block)
}
