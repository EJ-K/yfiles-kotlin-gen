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
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.EdgeDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.NodeDataKey
import yfiles.layout.PartialLayoutRoutingStyle

/**
 * This class represents a partial layout algorithm which changes the coordinates for a given set of graph elements (called partial elements) only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartialLayout] which uses the specified [ILayoutAlgorithm] instance as the core layout algorithm.
 * @param [coreLayout] the layout algorithm that is applied to the subgraph components
 * @see [componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-constructor-PartialLayout">Online Documentation</a>
 */
open external class PartialLayout (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets whether subgraph components may be mirrored to improve the layout quality.
   * 
   * Default value - `false`. Mirroring is disabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23allowMirroring">Online Documentation</a>
   */
  final var allowMirroring: Boolean
  
  /**
   * Gets or sets whether or not the algorithm may move fixed elements.
   * 
   * Default value - `false`. The algorithm doesn't move fixed elements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23allowMovingFixedElements">Online Documentation</a>
   */
  final var allowMovingFixedElements: Boolean
  
  /**
   * Gets or sets the strategy that assigns partial nodes to subgraph components.
   * 
   * Default value - [ComponentAssignmentStrategy.SINGLE]. Each partial node is assigned to a separate subgraph component.
   * @see [PartialLayoutData.componentIds]
   * @see [LayoutStageBase.coreLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23componentAssignmentStrategy">Online Documentation</a>
   */
  final var componentAssignmentStrategy: ComponentAssignmentStrategy
  
  /**
   * Gets or sets whether or not a subgraph component may be placed within another subgraph component.
   * 
   * Default value - `true`. Subgraph component may be placed within another subgraph component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23componentCompaction">Online Documentation</a>
   */
  final var componentCompaction: Boolean
  
  /**
   * Gets or sets whether or not partial nodes should be aligned.
   * 
   * Default value - `false`. Nodes are not aligned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23considerNodeAlignment">Online Documentation</a>
   */
  final var considerNodeAlignment: Boolean
  
  /**
   * Gets or sets the custom edge router instance that is used for partial edges and edges between different subgraph components (so-called inter-edges).
   * 
   * Default value - [StraightLineEdgeRouter][yfiles.router.StraightLineEdgeRouter]
   * @see [edgeRoutingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23edgeRouter">Online Documentation</a>
   */
  final var edgeRouter: ILayoutAlgorithm?
  
  /**
   * Gets or sets the routing style that is used for partial edges and inter-edges.
   * 
   * Default value - [PartialLayoutRoutingStyle.STRAIGHT_LINE]
   * @see [edgeRouter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23edgeRoutingStyle">Online Documentation</a>
   */
  final var edgeRoutingStyle: PartialLayoutRoutingStyle
  
  /**
   * Gets or sets the layout orientation that is considered during the placement of partial elements.
   * 
   * Default value - [PartialLayoutOrientation.NONE]. The layout orientation is completely ignored.
   * @see [PartialLayoutData.edgeOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: PartialLayoutOrientation
  
  /**
   * Gets or sets the minimum distance between two adjacent nodes.
   * 
   * Default value - `10`
   * @throws ArgumentError if the distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets whether or not a postprocessing step should be applied to reduce the number of directed edges that do not comply with the specified layout orientation.
   * 
   * Default value - `true`. This postprocessing step is enabled.
   * @see [layoutOrientation]
   * @see [PartialLayoutData.edgeOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23optimizeOrientation">Online Documentation</a>
   */
  final var optimizeOrientation: Boolean
  
  /**
   * Gets or sets whether or not fixed (non-partial) group nodes may be resized.
   * 
   * Default value - `false`. Fixed group nodes may not be resized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23resizeFixedGroups">Online Documentation</a>
   */
  final var resizeFixedGroups: Boolean
  
  /**
   * Gets or sets whether or not edges between different subgraph components should be routed immediately.
   * 
   * Default value - `false`. Edges are not routed immediately.
   * @see [routeInterEdges]
   * @see [placeSubgraphs]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23routeInterEdgesImmediately">Online Documentation</a>
   */
  final var routeInterEdgesImmediately: Boolean
  
  /**
   * Gets or sets the preferred time limit for the layout algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. The time is not limited.
   * @throws ArgumentError if the given duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets or sets the objective used for finding 'good' positions for subgraph components.
   * 
   * Default value - [SubgraphPlacement.BARYCENTER]. Each subgraph component is placed close to the barycenter of its graph neighbors.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23subgraphPlacement">Online Documentation</a>
   */
  final var subgraphPlacement: SubgraphPlacement
  
  /**
   * This method calculates the partial layout.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [PartialLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [PartialLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): PartialLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [PartialLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [PartialLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph  = definedExternally,
  ): PartialLayoutData<INode, IEdge, ILabel, ILabel>
  
  /**
   * This method is called during the [layout process][PartialLayout] and places the subgraph components one-by-one onto the drawing area.
   * @param [graph] the input graph
   * @param [subgraphComponents] each entry contains a collection with [LayoutNode]s that induces a subgraph component
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-placeSubgraphs">Online Documentation</a>
   */
  protected open fun placeSubgraphs(
    graph: LayoutGraph,
    subgraphComponents: ReadonlyArray<IEnumerable<LayoutNode>>,
  )
  
  /**
   * This method is called during the [layout process][PartialLayout] and routes all partial edges that connect two fixed elements.
   * @param [graph] the subgraph of the input graph induced by the fixed nodes
   * @param [partialEdges] the [list of partial edges][yfiles.collections.YList] to be routed
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-routeEdgesBetweenFixedElements">Online Documentation</a>
   */
  protected open fun routeEdgesBetweenFixedElements(
    graph: LayoutGraph,
    partialEdges: IEnumerable<LayoutEdge>,
  )
  
  /**
   * This method is called during the [layout process][PartialLayout] and routes all inter-edges.
   * @param [graph] the relevant subgraph
   * @param [interEdges] the [list of inter-edges][yfiles.collections.YList] to be routed
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23PartialLayout-method-routeInterEdges">Online Documentation</a>
   */
  protected open fun routeInterEdges(
    graph: LayoutGraph,
    interEdges: IEnumerable<LayoutEdge>,
  )
  
  companion object : ClassMetadata<PartialLayout> {
    /**
     * A [data key][NodeDataKey] for defining custom subgraph components.
     * @see [PartialLayoutData.componentIds]
     * @see [componentAssignmentStrategy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23COMPONENT_ID_DATA_KEY">Online Documentation</a>
     */
     val COMPONENT_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][EdgeDataKey] for specifying the orientation of edges with respect to the main layout orientation.
     * @see [PartialLayoutData.edgeOrientation]
     * @see [layoutOrientation]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23EDGE_ORIENTATION_DATA_KEY">Online Documentation</a>
     */
     val EDGE_ORIENTATION_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][EdgeDataKey] for marking partial edges.
     * @see [PartialLayoutData.scope]
     * @see [NODE_SCOPE_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23EDGE_SCOPE_DATA_KEY">Online Documentation</a>
     */
     val EDGE_SCOPE_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for marking partial nodes.
     * @see [PartialLayoutData.scope]
     * @see [EDGE_SCOPE_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayout%23NODE_SCOPE_DATA_KEY">Online Documentation</a>
     */
     val NODE_SCOPE_DATA_KEY: NodeDataKey<Boolean>
  }
}

inline fun PartialLayout(
    block: PartialLayout.() -> Unit
): PartialLayout {
    return PartialLayout()
        .apply(block)
}
