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
import yfiles.algorithms.DpKeyBase
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.GraphObjectDpKey
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.IEdgeLabelLayoutDpKey
import yfiles.algorithms.INodeLabelLayoutDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelCandidateDescriptor
import yfiles.graph.ILabelCandidateDescriptorProvider
import yfiles.graph.ILabelModelParameter
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.ISelectionModel

/**
 * Adapter class that can be used to obtain an [LayoutGraph] from an [IGraph].
 * @see [CopiedLayoutGraph]
 * @see [ILayoutAlgorithm]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter">Online Documentation</a>
 * 
 * @constructor Creates the adapter using a given [IGraph] and [ISelectionModel].
 * @param [adaptedGraph] The graph to build an adapter for.
 * @param [selectionModel] The optional selection model to use by the [LayoutKeys.AFFECTED_NODES_DP_KEY] and [LayoutKeys.AFFECTED_EDGES_DP_KEY] [IDataProvider] instances that are automatically bound to this adapter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-constructor-LayoutGraphAdapter">Online Documentation</a>
 * 
 * @property adaptedGraph
 * Sets or yields the original [IGraph] instance that is adapted by this instance.
 * @throws ArgumentError if the value of this property is already non `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23adaptedGraph">Online Documentation</a>
 * 
 * @property selectionModel
 * Gets or sets the [ISelectionModel] to use for the automatically registered [IDataProvider] instances for the keys [LayoutKeys.AFFECTED_NODES_DP_KEY] and [LayoutKeys.AFFECTED_EDGES_DP_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23selectionModel">Online Documentation</a>
 */
external open class LayoutGraphAdapter  (
final var adaptedGraph: IGraph? = definedExternally,
final var selectionModel: ISelectionModel<IModelItem>? = definedExternally) : YObject {

/**
 * Gets or sets a value that controls whether edge groups are automatically created for edges that are connected to the same port.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see [LayoutExecutor.automaticEdgeGrouping]
 * @see [fixPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23automaticEdgeGrouping">Online Documentation</a>
 */
final var automaticEdgeGrouping: Boolean
/**
 * Gets an array of all data provider look-up keys that are registered with the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23dataProviderKeys">Online Documentation</a>
 */
final val dataProviderKeys: ReadonlyArray<Any>
/**
 * Gets or sets the size of the nodes that are inserted for the ports that are created for [IEdge]s that are connected at other [IEdge]s.
 * @see [hideEdgesAtEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23edgePortNodeSize">Online Documentation</a>
 */
final var edgePortNodeSize: Size
/**
 * Gets or sets a value that controls whether strong port constraints are automatically created.
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see [LayoutExecutor.fixPorts]
 * @see [automaticEdgeGrouping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23fixPorts">Online Documentation</a>
 */
final var fixPorts: Boolean
/**
 * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
 * @see [edgePortNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23hideEdgesAtEdges">Online Documentation</a>
 */
final var hideEdgesAtEdges: Boolean
/**
 * Gets or sets how [ILabel]s at [IEdge]s should be placed by the layout algorithm.
 * @see [EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23labelPreferredPlacementPolicy">Online Documentation</a>
 */
final var labelPreferredPlacementPolicy: LabelPreferredPlacementPolicy
/**
 * Gets or sets the policy that specifies how port locations should be adjusted after a layout has been calculated.
 * @see [PortCalculator]
 * @see [LayoutExecutor.portAdjustmentPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23portAdjustmentPolicy">Online Documentation</a>
 */
final var portAdjustmentPolicy: PortAdjustmentPolicy
/**
 * Gets or sets how [ILabel]s at [IPort]s should be treated by the layout algorithm.
 * @see [PortLabelPolicy]
 * @see [LayoutExecutor.portLabelPolicies]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23portLabelPolicies">Online Documentation</a>
 */
final var portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>
/**
 * Registers a data provider with the graph using the given look-up key and wrapping the given mapper.
 * @param [K] The type of the key to use.
 * @param [V] The type of the value to use.
 * @param [keyType] The type of the key to use.
 * @param [valueType] The type of the value to use.
 * @param [dataKey] The look-up key to register the data provider with.
 * @param [mapper] The mapper wrapped as data provider.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-addDataProvider">Online Documentation</a>
 */
 open   fun <K : YObject, V : Any>addDataProvider( keyType: YClass<K> ,
 valueType: YClass<V> ,
 dataKey: DpKeyBase<K, V> ,
 mapper: IMapper<K, V> ):IDataProvider<K, V>
/**
 * Applies a [layout algorithm][ILayoutAlgorithm] to an [IGraph], optionally applying some [LayoutData].
 * @param [layout] The layout algorithm to apply.
 * @param [layoutData] The layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-applyLayout">Online Documentation</a>
 */
 final   fun applyLayout( layout: ILayoutAlgorithm ,
 layoutData: LayoutData?  = definedExternally)
/**
 * Creates a [CopiedLayoutGraph] for this instance.
 * @return An instance whose [CopiedLayoutGraph.commitLayoutToOriginalGraph] will update this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createCopiedLayoutGraph">Online Documentation</a>
 */
 final   fun createCopiedLayoutGraph():CopiedLayoutGraph
/**
 * Creates the [EdgeLabelCandidate] for a given label and [ILabelModelParameter] combination.
 * @param [originalLabel] The original label.
 * @param [dummyLabel] The dummy label that describes the current laid out label.
 * @param [layoutParameter] The parameter to create a candidate for.
 * @param [labelLayout] The [IEdgeLabelLayout] of the label to pass to the candidate.
 * @return A candidate to yield for the labeling algorithms or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createEdgeLabelCandidate">Online Documentation</a>
 */
 open protected   fun createEdgeLabelCandidate( originalLabel: ILabel ,
 dummyLabel: ILabel ,
 layoutParameter: ILabelModelParameter ,
 labelLayout: IEdgeLabelLayout ):EdgeLabelCandidate?
/**
 * Factory method that creates an [IEdgeLayout] implementation that wraps the given [IEdge]
 * @param [edge] The edge to wrap.
 * @return A wrapper instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createEdgeLayout">Online Documentation</a>
 */
 open protected   fun createEdgeLayout( edge: IEdge ):IEdgeLayout
/**
 * Callback factory method that creates the [INodeLayout] for the given [IPort] that is used as a dummy to represent the port at the [IEdge] that owns `port`.
 * @param [port] The port to create the layout for.
 * @return A suitable implementation of [INodeLayout] that uses the [port's location][IPort.location] as the center of the node.
 * @see [edgePortNodeSize]
 * @see [hideEdgesAtEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createEdgePortLayout">Online Documentation</a>
 */
 open protected   fun createEdgePortLayout( port: IPort ):INodeLayout
/**
 * Creates a [NodeLabelCandidate] for a given label and [ILabelModelParameter] combination.
 * @param [originalLabel] The original label.
 * @param [dummyLabel] The dummy label that describes the current laid out label.
 * @param [layoutParameter] The parameter to create a candidate for.
 * @param [ownerLayout] The [INodeLabelLayout] of the label to pass to the candidate.
 * @return A candidate to yield for the labeling algorithms or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createNodeLabelCandidate">Online Documentation</a>
 */
 open protected   fun createNodeLabelCandidate( originalLabel: ILabel ,
 dummyLabel: ILabel ,
 layoutParameter: ILabelModelParameter ,
 ownerLayout: INodeLabelLayout ):NodeLabelCandidate?
/**
 * Factory method that creates a [INodeLayout] implementation that wraps the given [INode]
 * @param [node] The node to wrap.
 * @return A wrapper instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-createNodeLayout">Online Documentation</a>
 */
 open protected   fun createNodeLayout( node: INode ):INodeLayout
/**
 * Returns an [IEnumerable] that provides access to all edges residing in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-edgeObjects">Online Documentation</a>
 */
 final   fun edgeObjects():IEnumerable<YObject>
/**
 * Returns the data provider that is registered with the graph using the given look-up key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getDataProvider">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>getDataProvider( dataKey: DpKeyBase<K, V> ):IDataProvider<K, V>?
/**
 * Returns the layout information for all edge labels belonging to the given edge.
 * @param [edge] the edge that owns the labels
 * @return the array of all labels that belong to the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getEdgeLabelLayout">Online Documentation</a>
 */
 final   fun getEdgeLabelLayout( edge: YObject ):ReadonlyArray<IEdgeLabelLayout>
/**
 * Returns the layout information associated with the given edge.
 * @param [edge] the edge
 * @return the layout information for the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getEdgeLayout">Online Documentation</a>
 */
 final   fun getEdgeLayout( edge: YObject ):IEdgeLayout
/**
 * Callback that retrieves the label candidate descriptor for the given label and parameter.
 * @param [originalLabel] The original label to which a parameter will be applied.
 * @param [dummyLabel] The dummy label to which the parameter will be applied.
 * @param [layoutParameter] The parameter to apply.
 * @return A descriptor or `null`.
 * @see [createNodeLabelCandidate]
 * @see [createEdgeLabelCandidate]
 * @see [getLabelCandidateDescriptorProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLabelCandidateDescriptor">Online Documentation</a>
 */
 open protected   fun getLabelCandidateDescriptor( originalLabel: ILabel ,
 dummyLabel: ILabel ,
 layoutParameter: ILabelModelParameter ):ILabelCandidateDescriptor?
/**
 * Callback method that gets the label candidate descriptor provider for the given [IGraph].
 * @param [graph] The graph.
 * @return The result of a [ILookup.lookup][yfiles.graph.ILookup.lookup] query on `graph` for the [ILabelCandidateDescriptorProvider] type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getLabelCandidateDescriptorProvider">Online Documentation</a>
 */
 open protected   fun getLabelCandidateDescriptorProvider( graph: IGraph ):ILabelCandidateDescriptorProvider?
/**
 * Returns the layout information for all node labels belonging to the given node.
 * @param [node] the node that owns the labels
 * @return the array of all labels that belong to the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getNodeLabelLayout">Online Documentation</a>
 */
 final   fun getNodeLabelLayout( node: YObject ):ReadonlyArray<INodeLabelLayout>
/**
 * Returns the layout information associated with the given node.
 * @param [node] the node
 * @return the layout information for the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getNodeLayout">Online Documentation</a>
 */
 final   fun getNodeLayout( node: YObject ):INodeLayout
/**
 * Returns the source node associated with the given edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getSource">Online Documentation</a>
 */
 final   fun getSource( edgeObject: YObject ):YObject
/**
 * Returns the target node associated with the given edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-getTarget">Online Documentation</a>
 */
 final   fun getTarget( edgeObject: YObject ):YObject
/**
 * Returns an [IEnumerable] that provides access to all nodes residing in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-nodeObjects">Online Documentation</a>
 */
 final   fun nodeObjects():IEnumerable<YObject>
/**
 * Callback method that assigns a new location that matches `newLocation` to `port`.
 * @param [port] The edge port that should be placed.
 * @param [newLocation] The new location of the port as calculated by the layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-setEdgePortLocation">Online Documentation</a>
 */
 open protected   fun setEdgePortLocation( port: IPort ,
 newLocation: Point )
/**
 * Callback method that assigns a new relative location to `port`.
 * 
 * The default implementation calls [IGraph.setRelativePortLocation] with `newRelativeLocation`. Depending on the port location model, the actual resulting port location may be different.
 * @param [port] The port that should be placed.
 * @param [newRelativeLocation] The new coordinate offsets relative to the center of the node's [INode.layout]'s center.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23LayoutGraphAdapter-method-setRelativePortLocation">Online Documentation</a>
 */
 open protected   fun setRelativePortLocation( port: IPort ,
 newRelativeLocation: Point )

companion object : ClassMetadata<LayoutGraphAdapter> {
/**
 * An [IMapperRegistry][yfiles.graph.IMapperRegistry] tag for an [IMapper] that provides for the edge [ILabel]s in the [adaptedGraph] a [PreferredPlacementDescriptor] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY: IEdgeLabelLayoutDpKey<PreferredPlacementDescriptor>
/**
 * A data provider key that can be used to look up the original [IEdge] of an [Edge][yfiles.algorithms.Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_EDGE_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_EDGE_DP_KEY: EdgeDpKey<IEdge>
/**
 * A data provider key that can be used to look up the original [ILabel] of an [IEdgeLabelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_EDGE_LABEL_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_EDGE_LABEL_DP_KEY: IEdgeLabelLayoutDpKey<ILabel>
/**
 * A data provider key that can be used to look up the original [INode] of a [Node][yfiles.algorithms.Node].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_NODE_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_NODE_DP_KEY: NodeDpKey<INode>
/**
 * A data provider key that can be used to look up the original [ILabel] of an [INodeLabelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_NODE_LABEL_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_NODE_LABEL_DP_KEY: INodeLabelLayoutDpKey<ILabel>
/**
 * A data provider key that can be used to look up the [source port][IPort] of the original [IEdge] of an [Edge][yfiles.algorithms.Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_SOURCE_PORT_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_SOURCE_PORT_DP_KEY: EdgeDpKey<IPort>
/**
 * A data provider key that can be used to look up the [ITagOwner.tag][yfiles.graph.ITagOwner.tag] of an original [INode], [IEdge] or [ILabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_TAG_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_TAG_DP_KEY: GraphObjectDpKey<Tag>
/**
 * A data provider key that can be used to look up the [target port][IPort] of the original [IEdge] of an [Edge][yfiles.algorithms.Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23ORIGINAL_TARGET_PORT_DP_KEY">Online Documentation</a>
 */
 val ORIGINAL_TARGET_PORT_DP_KEY: EdgeDpKey<IPort>
/**
 * This key is used to provide information about dummy nodes that have been inserted into the graph to model edges at edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23PORT_DUMMY_NODE_DP_KEY">Online Documentation</a>
 */
 val PORT_DUMMY_NODE_DP_KEY: NodeDpKey<IEdge>
/**
 * A data provider key that can be used to look up the original **unconnected**[ports][IPort] of the original [IPortOwner] of an [Node][yfiles.algorithms.Node] or, in the case of edge-to-edge connections, an [Edge][yfiles.algorithms.Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphAdapter%23UNCONNECTED_PORTS_DP_KEY">Online Documentation</a>
 */
 val UNCONNECTED_PORTS_DP_KEY: GraphObjectDpKey<IEnumerable<IPort>>
}
}

inline fun LayoutGraphAdapter(
    block: LayoutGraphAdapter.() -> Unit
): LayoutGraphAdapter {
    return LayoutGraphAdapter()
        .apply(block)
}
