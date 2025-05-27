// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.DataGetter
import yfiles.collections.DataSetter
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.collections.ItemMapping
import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.labeling.LabelCandidate
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.styles.IEdgeStyle
import yfiles.styles.INodeStyle

/**
 * Adapter class that can be used to obtain a [layoutGraph][LayoutGraphAdapter] from an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter">Online Documentation</a>
 * 
 * @constructor Creates a new adapter using the given `originalGraph`.
 * @param [originalGraph] The graph to build this adapter for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-constructor-LayoutGraphAdapter">Online Documentation</a>
 * 
 * @property originalGraph
 * Gets the original [IGraph] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23originalGraph">Online Documentation</a>
 */
open external class LayoutGraphAdapter (
final val originalGraph: IGraph)  {
  /**
   * Gets or sets a comparison function that normalizes the order of the edges for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [nodeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23edgeComparator">Online Documentation</a>
   */
  final var edgeComparator: Comparison1<IEdge>?
  
  /**
   * Gets or sets the size of the nodes that are inserted for the ports that are created for [IEdge]s that are connected at other [IEdge]s.
   * @see [hideEdgesAtEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23edgePortNodeSize">Online Documentation</a>
   */
  final var edgePortNodeSize: Size
  
  /**
   * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
   * @see [edgePortNodeSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23hideEdgesAtEdges">Online Documentation</a>
   */
  final var hideEdgesAtEdges: Boolean
  
  /**
   * Gets or sets a mapping that specifies how [ILabel]s should be placed by the layout algorithm.
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see [LayoutExecutor.labelPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23labelPlacementPolicies">Online Documentation</a>
   */
  final var labelPlacementPolicies: ItemMapping<ILabel, LabelPlacementPolicy>
  
  /**
   * Gets the [layoutGraph][LayoutGraphAdapter] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23layoutGraph">Online Documentation</a>
   */
  final val layoutGraph: LayoutGraph
  
  /**
   * Gets or sets a comparison function that normalizes the order of the nodes for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [edgeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23nodeComparator">Online Documentation</a>
   */
  final var nodeComparator: Comparison1<INode>?
  
  /**
   * Gets or sets the mapping from ports to a policy that specifies how port locations should be adjusted after a layout has been calculated.
   * @see [LayoutExecutor.portAdjustmentPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23portAdjustmentPolicies">Online Documentation</a>
   */
  final var portAdjustmentPolicies: ItemMapping<IPort, PortAdjustmentPolicy>
  
  /**
   * Gets or sets how [ILabel]s at [IPort]s (owned by an [INode]) should be treated by the layout algorithm.
   * @see [PortLabelPolicy]
   * @see [LayoutExecutor.portLabelPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23portLabelPolicies">Online Documentation</a>
   */
  final var portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>
  
  /**
   * Gets or sets a mapping that specifies how [IPort]s should be placed by the layout algorithm.
   * @see [EdgePortCandidates.SOURCE_PORT_CANDIDATES_DATA_KEY]
   * @see [EdgePortCandidates.TARGET_PORT_CANDIDATES_DATA_KEY]
   * @see [LayoutExecutor.portPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23portPlacementPolicies">Online Documentation</a>
   */
  final var portPlacementPolicies: ItemMapping<IPort, PortPlacementPolicy>
  
  /**
   * Registers a single value data for the adapted layout graph with the specified [ValueDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [ValueDataKey] the data should be registered for.
   * @param [value] The data to register.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addData">Online Documentation</a>
   */
  fun <T> addData(
    dataKey: ValueDataKey<T>,
    value: T?,
  )
  
  /**
   * Registers [data for individual nodes][IMapper] at the graph with the specified [NodeDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [NodeDataKey] the data should be registered for.
   * @param [provider] The data to be registered at the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(NodeDataKey,IMapper)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: NodeDataKey<T>,
    provider: IMapper<INode, T>,
  )
  
  /**
   * Registers [data for individual edges][IMapper] at the graph with the specified [EdgeDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [EdgeDataKey] the data should be registered for.
   * @param [provider] The data to be registered at the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(EdgeDataKey,IMapper)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: EdgeDataKey<T>,
    provider: IMapper<IEdge, T>,
  )
  
  /**
   * Registers [data for individual node labels][IMapper] at the graph with the specified [NodeLabelDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [NodeLabelDataKey] the data should be registered for.
   * @param [provider] The data to be registered at the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(NodeLabelDataKey,IMapper)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: NodeLabelDataKey<T>,
    provider: IMapper<ILabel, T>,
  )
  
  /**
   * Registers [data for individual edge labels][IMapper] at the graph with the specified [EdgeLabelDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [EdgeLabelDataKey] the data should be registered for.
   * @param [provider] The data to be registered at the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(EdgeLabelDataKey,IMapper)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: EdgeLabelDataKey<T>,
    provider: IMapper<ILabel, T>,
  )
  
  /**
   * Registers [data for individual nodes][IMapper] at the graph with the specified [NodeDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [NodeDataKey] the data should be registered for.
   * @param [getter] A callback to get the data for an edge in the created mapper.
   * @param [setter] A callback to set the data for an edge in the created mapper.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(NodeDataKey,DataGetter,DataSetter)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: NodeDataKey<T>,
    getter: DataGetter<INode, T>,
    setter: DataSetter<INode, T>  = definedExternally,
  )
  
  /**
   * Registers [data for individual edges][IMapper] at the graph with the specified [EdgeDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [EdgeDataKey] the data should be registered for.
   * @param [getter] A callback to get the data for an edge in the created mapper.
   * @param [setter] A callback to set the data for an edge in the created mapper.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(EdgeDataKey,DataGetter,DataSetter)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: EdgeDataKey<T>,
    getter: DataGetter<IEdge, T>,
    setter: DataSetter<IEdge, T>  = definedExternally,
  )
  
  /**
   * Registers [data for individual node labels][IMapper] at the graph with the specified [NodeLabelDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [NodeLabelDataKey] the data should be registered for.
   * @param [getter] A callback to get the data for an edge in the created mapper.
   * @param [setter] A callback to set the data for an edge in the created mapper.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(NodeLabelDataKey,DataGetter,DataSetter)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: NodeLabelDataKey<T>,
    getter: DataGetter<ILabel, T>,
    setter: DataSetter<ILabel, T>  = definedExternally,
  )
  
  /**
   * Registers [data for individual edge labels][IMapper] at the graph with the specified [EdgeLabelDataKey].
   * @param [T] The type of the data to register.
   * @param [dataKey] The [EdgeLabelDataKey] the data should be registered for.
   * @param [getter] A callback to get the data for an edge in the created mapper.
   * @param [setter] A callback to set the data for an edge in the created mapper.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addItemData(EdgeLabelDataKey,DataGetter,DataSetter)">Online Documentation</a>
   */
  fun <T> addItemData(
    dataKey: EdgeLabelDataKey<T>,
    getter: DataGetter<ILabel, T>,
    setter: DataSetter<ILabel, T>  = definedExternally,
  )
  
  /**
   * Applies an [ILayoutAlgorithm] to an [IGraph], optionally applying some [LayoutData].
   * @param [layout] The layout algorithm to apply.
   * @param [layoutData] The layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-applyLayout">Online Documentation</a>
   */
  fun applyLayout(
    layout: ILayoutAlgorithm,
    layoutData: LayoutData<INode, IEdge, ILabel, ILabel>  = definedExternally,
  )
  
  /**
   * Helper method that applies a given [LayoutData] for [IGraph] elements onto the [layoutGraph][LayoutGraphAdapter] using the mapping between the elements established by this instance.
   * @param [layoutData] The data to apply to the [layoutGraph][LayoutGraphAdapter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-applyLayoutData">Online Documentation</a>
   */
  fun applyLayoutData(
    layoutData: LayoutData<INode, IEdge, ILabel, ILabel>,
  )
  
  /**
   * Sets the layout information of all graph items of the [originalGraph][LayoutGraphAdapter] to the current values of the corresponding items in the [layoutGraph][LayoutGraphAdapter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-commitLayoutToOriginalGraph">Online Documentation</a>
   */
  fun commitLayoutToOriginalGraph()
  
  /**
   * Creates a copy of an [IEdgeStyle] instance that is used during the layout for path calculations and the like.
   * @param [style] The style to copy.
   * @return A replacement of `style` that is used during layout calculation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-copyEdgeStyle">Online Documentation</a>
   */
  protected open fun copyEdgeStyle(
    style: IEdgeStyle,
  ): IEdgeStyle
  
  /**
   * Creates a copy of an [INodeStyle] instance that is used during the layout.
   * @param [style] The style to copy.
   * @return A replacement of `style` that is used during layout calculation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-copyNodeStyle">Online Documentation</a>
   */
  protected open fun copyNodeStyle(
    style: INodeStyle,
  ): INodeStyle
  
  /**
   * Creates the [LabelCandidate] for a given label and [ILabelModelParameter] combination.
   * @param [originalLabel] The original label.
   * @param [helperLabel] The helper label that describes the current laid out label.
   * @param [layoutParameter] The parameter to create a candidate for.
   * @param [edgeLabel] The [LayoutEdgeLabel] of the label to pass to the candidate.
   * @return A candidate to yield for the labeling algorithms or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createEdgeLabelCandidate">Online Documentation</a>
   */
  protected open fun createEdgeLabelCandidate(
    originalLabel: ILabel,
    helperLabel: ILabel,
    layoutParameter: ILabelModelParameter,
    edgeLabel: LayoutEdgeLabel,
  ): LabelCandidate?
  
  /**
   * Creates a [LabelCandidate] for a given label and [ILabelModelParameter] combination.
   * @param [originalLabel] The original label.
   * @param [helperLabel] The helper label that describes the current laid out label.
   * @param [layoutParameter] The parameter to create a candidate for.
   * @param [ownerLayout] The [LayoutNodeLabel] of the label to pass to the candidate.
   * @return A candidate to yield for the labeling algorithms or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createNodeLabelCandidate">Online Documentation</a>
   */
  protected open fun createNodeLabelCandidate(
    originalLabel: ILabel,
    helperLabel: ILabel,
    layoutParameter: ILabelModelParameter,
    ownerLayout: LayoutNodeLabel,
  ): LabelCandidate?
  
  /**
   * Returns the layout graph edge that corresponds to the given original edge.
   * @param [edge] an edge of the [originalGraph][LayoutGraphAdapter] whose copy resides in the [layoutGraph][LayoutGraphAdapter]
   * @return an edge in the [layoutGraph][LayoutGraphAdapter] that is the copy of the given original edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLayoutEdge">Online Documentation</a>
   */
  fun getLayoutEdge(
    edge: IEdge,
  ): LayoutEdge?
  
  /**
   * Returns the layout graph edge label that corresponds to the given original label.
   * @param [label] an edge label of the [originalGraph][LayoutGraphAdapter] whose copy resides in the [layoutGraph][LayoutGraphAdapter]
   * @return an edge label in the [layoutGraph][LayoutGraphAdapter] that is the copy of the given original label
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLayoutEdgeLabel">Online Documentation</a>
   */
  fun getLayoutEdgeLabel(
    label: ILabel,
  ): LayoutEdgeLabel?
  
  /**
   * Returns the layout graph node that corresponds to the given original node.
   * @param [node] a node of the [originalGraph][LayoutGraphAdapter] whose copy resides in the [layoutGraph][LayoutGraphAdapter]
   * @return a node in the [layoutGraph][LayoutGraphAdapter] that is the copy of the given original node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLayoutNode(INode)">Online Documentation</a>
   */
  fun getLayoutNode(
    node: INode,
  ): LayoutNode?
  
  /**
   * Returns the temporary node that represents the given original port.
   * @param [port] an edge port of the [originalGraph][LayoutGraphAdapter] whose representing node resides in the [layoutGraph][LayoutGraphAdapter]
   * @return a node in the [layoutGraph][LayoutGraphAdapter] that represents the given original port
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLayoutNode(IPort)">Online Documentation</a>
   */
  fun getLayoutNode(
    port: IPort,
  ): LayoutNode?
  
  /**
   * Returns the layout graph node label that corresponds to the given original label.
   * @param [label] A node label of the [originalGraph][LayoutGraphAdapter] whose copy resides in the [layoutGraph][LayoutGraphAdapter]
   * @return A node label in the [layoutGraph][LayoutGraphAdapter] that is the copy of the given original label
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLayoutNodeLabel">Online Documentation</a>
   */
  fun getLayoutNodeLabel(
    label: ILabel,
  ): LayoutNodeLabel?
  
  /**
   * Returns the original edge that corresponds to the given layout graph edge.
   * @param [edge] the edge in the [layoutGraph][LayoutGraphAdapter] that is a copy of the returned edge
   * @return the edge in the [originalGraph][LayoutGraphAdapter] whose copy is the given edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getOriginalEdge">Online Documentation</a>
   */
  fun getOriginalEdge(
    edge: LayoutEdge,
  ): IEdge?
  
  /**
   * Returns the original node label that corresponds to the given layout graph label.
   * @param [label] the label in the [layoutGraph][LayoutGraphAdapter] that is a copy of the returned label
   * @return the node label in the [originalGraph][LayoutGraphAdapter] whose copy is the given label
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getOriginalLabel(LayoutNodeLabel)">Online Documentation</a>
   */
  fun getOriginalLabel(
    label: LayoutNodeLabel,
  ): ILabel?
  
  /**
   * Returns the original edge label that corresponds to the given layout graph label.
   * @param [label] the label in the [layoutGraph][LayoutGraphAdapter] that is a copy of the returned edge label
   * @return the edge label in the [originalGraph][LayoutGraphAdapter] whose copy is the given label
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getOriginalLabel(LayoutEdgeLabel)">Online Documentation</a>
   */
  fun getOriginalLabel(
    label: LayoutEdgeLabel,
  ): ILabel?
  
  /**
   * Returns the original node that corresponds to the given layout graph node.
   * @param [node] the node in the [layoutGraph][LayoutGraphAdapter] that is a copy of the returned node
   * @return the node in the [originalGraph][LayoutGraphAdapter] whose copy is the given node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getOriginalNode">Online Documentation</a>
   */
  fun getOriginalNode(
    node: LayoutNode,
  ): INode?
  
  /**
   * Returns the original port that corresponds to the given temporary node.
   * @param [node] the node in the [layoutGraph][LayoutGraphAdapter] that represents the returned port.
   * @return the port in the [originalGraph][LayoutGraphAdapter] whose represent is the given node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getOriginalPort">Online Documentation</a>
   */
  fun getOriginalPort(
    node: LayoutNode,
  ): IPort?
  
  /**
   * Initializes the [layoutGraph][LayoutGraphAdapter] instance by taking the current state of the [originalGraph][LayoutGraphAdapter] and the settings of this adapter.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-initialize">Online Documentation</a>
   */
  fun initialize()
  
  /**
   * Callback method that assigns a new location that matches `newLocation` to the edge `port`.
   * @param [port] The edge port that should be placed.
   * @param [newLocation] The new location of the port as calculated by the layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-setEdgePortLocation">Online Documentation</a>
   */
  protected open fun setEdgePortLocation(
    port: IPort,
    newLocation: Point,
  )
  
  /**
   * Callback method that assigns a new location that matches `newLocation` to the node `port`.
   * @param [port] The node port that should be placed.
   * @param [newLocation] The new location of the port as calculated by the layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-setNodePortLocation">Online Documentation</a>
   */
  protected open fun setNodePortLocation(
    port: IPort,
    newLocation: Point,
  )
  
  companion object : ClassMetadata<LayoutGraphAdapter> {
    /**
     * A data provider key that can be used to look up the original [IEdge] of an [LayoutEdge].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_EDGE_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_EDGE_DATA_KEY: EdgeDataKey<IEdge>
    
    /**
     * A data provider key that can be used to look up the original [ILabel] of an [LayoutEdgeLabel].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_EDGE_LABEL_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_EDGE_LABEL_DATA_KEY: EdgeLabelDataKey<ILabel>
    
    /**
     * A data provider key that can be used to look up the original [INode] of a [LayoutNode].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_NODE_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_NODE_DATA_KEY: NodeDataKey<INode>
    
    /**
     * A data provider key that can be used to look up the original [ILabel] of an [LayoutNodeLabel].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_NODE_LABEL_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_NODE_LABEL_DATA_KEY: NodeLabelDataKey<ILabel>
    
    /**
     * A data provider key that can be used to look up the [source port][IPort] of the original [IEdge] of an [LayoutEdge].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_SOURCE_PORT_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_SOURCE_PORT_DATA_KEY: EdgeDataKey<IPort>
    
    /**
     * A data provider key that can be used to look up the [target port][IPort] of the original [IEdge] of an [LayoutEdge].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_TARGET_PORT_DATA_KEY">Online Documentation</a>
     */
     val ORIGINAL_TARGET_PORT_DATA_KEY: EdgeDataKey<IPort>
    
    /**
     * This key is used to provide information about helper nodes that have been inserted into the graph to model edges at edges.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23PORT_HELPER_NODE_DATA_KEY">Online Documentation</a>
     */
     val PORT_HELPER_NODE_DATA_KEY: NodeDataKey<IEdge>
    
    /**
     * A data provider key that can be used to look up the original **unconnected** [ports][IPort] of the original [IPortOwner] of an [LayoutEdge] in the case of edge-to-edge connections.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23UNCONNECTED_EDGE_PORTS_DATA_KEY">Online Documentation</a>
     */
     val UNCONNECTED_EDGE_PORTS_DATA_KEY: EdgeDataKey<IEnumerable<IPort>>
    
    /**
     * A data provider key that can be used to look up the original **unconnected** [ports][IPort] of the original [IPortOwner] of an [LayoutNode].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23UNCONNECTED_NODE_PORTS_DATA_KEY">Online Documentation</a>
     */
     val UNCONNECTED_NODE_PORTS_DATA_KEY: NodeDataKey<IEnumerable<IPort>>
  }
}
