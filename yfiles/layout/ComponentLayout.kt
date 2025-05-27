// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Represents a layout algorithm that arranges the connected components of a graph, allowing for the use of different layout styles and customization for component and edge arrangement.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ComponentLayout] class with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm to be used for arranging the layout. If `null`, the default behavior is to keep the component subgraphs' locations unchanged unless specified otherwise by the [componentLayouts][ComponentLayoutData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-constructor-ComponentLayout">Online Documentation</a>
 */
open external class ComponentLayout (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets the distance between the bounds of the components.
   * 
   * Default value - `45`
   * @throws ArgumentError if the spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23componentSpacing">Online Documentation</a>
   */
  final var componentSpacing: Double
  
  /**
   * Gets or sets whether or not grouping information bound to the graph should be considered when determining the graph components.
   * 
   * Default value - `true`. Grouping information is considered for determining the components.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23considerGrouping">Online Documentation</a>
   */
  final var considerGrouping: Boolean
  
  /**
   * Gets or sets whether to take node and edge labels into account when calculating the bounds of the graph components.
   * 
   * Default value - [BasicEdgeLabelPlacement.CONSIDER]. Edge labels are considered
   * @see [EdgeLabelPreferredPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: BasicEdgeLabelPlacement
  
  /**
   * Gets or sets a value indicating whether the components should be arranged based on the current sketch.
   * 
   * Default value - `false`. From sketch mode is disabled.
   * @see [style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets or sets the current grid spacing.
   * 
   * Default value - `0`. No grid is considered.
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the current edge routing algorithm for handling inter-edges between different components, which may exist when customizing the component assignment using custom [componentIds][ComponentLayoutData]
   * 
   * Default value - `null`. Edges are routed as straight lines from source to target.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23interEdgeRouter">Online Documentation</a>
   */
  final var interEdgeRouter: ILayoutAlgorithm?
  
  /**
   * Gets or sets whether to take node labels into account when calculating the bounds of the graph components.
   * 
   * Default value - [BasicNodeLabelPlacement.CONSIDER]. Node labels are considered
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: BasicNodeLabelPlacement
  
  /**
   * Gets or sets the preferred size of the layout.
   * 
   * Default value - [Size]. Both preferred width and height are `400`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23preferredSize">Online Documentation</a>
   */
  final var preferredSize: Size
  
  /**
   * Gets or sets how the components are arranged.
   * 
   * Default value - [ComponentArrangementStyle.ROWS]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23style">Online Documentation</a>
   */
  final var style: ComponentArrangementStyle
  
  /**
   * Delegates the layout calculation for each component separately to the [coreLayout][LayoutStageBase] and optionally arranges the components.
   * @param [graph] The input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Produces a component graph layout.
   * @param [graph] the input graph
   * @param [components] the components (subgraphs) of the input graph
   * @see [findGraphComponents]
   * @see [setComponentLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-arrangeComponents">Online Documentation</a>
   */
  protected open fun arrangeComponents(
    graph: LayoutGraph,
    components: ReadonlyArray<SubgraphComponent>,
  )
  
  /**
   * Calculates the bounds of a graph component including node margins.
   * @param [graph] the subgraph containing the nodes and edges of a component
   * @return the bounds of the component
   * @see [BasicNodeLabelPlacement]
   * @see [BasicEdgeLabelPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-calculateComponentBounds">Online Documentation</a>
   */
  protected open fun calculateComponentBounds(
    graph: LayoutGraph,
  ): Rect
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [ComponentLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [ComponentLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): ComponentLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [ComponentLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [ComponentLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): ComponentLayoutData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Determines which nodes belong to the same graph component.
   * @param [graph] the input graph
   * @param [compNumber] an [IMapper] that will be filled with the zero-based index of the component to which the node belongs
   * @return the number of connected components of this graph
   * @see [LayoutGraphAlgorithms.connectedComponents][yfiles.analysis.LayoutGraphAlgorithms.connectedComponents]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-findGraphComponents">Online Documentation</a>
   */
  protected open fun findGraphComponents(
    graph: LayoutGraph,
    compNumber: IMapper<LayoutNode, Number>,
  ): Int
  
  /**
   * Reroutes the given inter-edges using the current [edge routing algorithm][ComponentLayout].
   * @param [graph] the input graph
   * @param [interEdges] the edges that connect nodes of different components
   * @see [interEdgeRouter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-routeInterEdges">Online Documentation</a>
   */
  protected open fun routeInterEdges(
    graph: LayoutGraph,
    interEdges: IEnumerable<LayoutEdge>,
  )
  
  /**
   * Moves the top-left corner of the subgraph containing the specified nodes and edges to the given location.
   * @param [graph] The graph containing the component to be moved.
   * @param [component] The component (subgraph) consisting of the nodes and edges that should be repositioned.
   * @param [location] The new top-left location to which the subgraph should be moved.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-setComponentLocation">Online Documentation</a>
   */
  protected open fun setComponentLocation(
    graph: LayoutGraph,
    component: SubgraphComponent,
    location: Point,
  )
  
  companion object : ClassMetadata<ComponentLayout> {
    /**
     * A [data key][NodeDataKey] for specifying which components should be arranged.
     * @see [ComponentLayoutData.affectedComponents]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23AFFECTED_COMPONENTS_DATA_KEY">Online Documentation</a>
     */
     val AFFECTED_COMPONENTS_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for specifying custom graph components.
     * @see [ComponentLayoutData.componentIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23COMPONENT_ID_DATA_KEY">Online Documentation</a>
     */
     val COMPONENT_ID_DATA_KEY: NodeDataKey<IComparable<*>>
    
    /**
     * A [data key][NodeDataKey] for arranging the nodes of each component with an individual layout algorithm.
     * @see [ComponentLayoutData.componentLayouts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23COMPONENT_LAYOUT_DATA_KEY">Online Documentation</a>
     */
     val COMPONENT_LAYOUT_DATA_KEY: NodeDataKey<ILayoutAlgorithm>
  }
}

inline fun ComponentLayout(
    block: ComponentLayout.() -> Unit
): ComponentLayout {
    return ComponentLayout()
        .apply(block)
}
