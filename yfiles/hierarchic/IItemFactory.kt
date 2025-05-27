// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Node
import yfiles.algorithms.Rectangle2D
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.PortConstraint

/**
 * This interface is a factory for creating and destroying helper structures used in the graph during layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory">Online Documentation</a>
 */
external interface IItemFactory : YObject {
/**
 * Converts a given [Node] to a label node.
 * @param [dummyNode] the given [Node] to be converted
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-convertToLabelNode">Online Documentation</a>
 */
   fun convertToLabelNode( dummyNode: Node )
/**
 * Creates a bend [Node] for the given [Edge] in the given [ILayer] and assigns it to the given [SwimlaneDescriptor] instance.
 * @param [layer] the given [ILayer] instance
 * @param [edge] the given [Edge]
 * @param [laneDescriptor] a given [SwimlaneDescriptor] instance
 * @return the new bend [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBendNode">Online Documentation</a>
 */
   fun createBendNode( layer: ILayer ,
 edge: Edge ,
 laneDescriptor: SwimlaneDescriptor?  = definedExternally):Node
/**
 * Creates a [INodeData] object for a bend [Node] and associates it with the [Node].
 * @param [node] the given [Node]
 * @param [edge] the given [Edge]
 * @param [laneDescriptor] the given [SwimlaneDescriptor] instance
 * @return a [INodeData] object for the given bend [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBendNodeData">Online Documentation</a>
 */
   fun createBendNodeData( node: Node ,
 edge: Edge ,
 laneDescriptor: SwimlaneDescriptor?  = definedExternally):INodeData
/**
 * Creates a dummy edge that models the bus segment of a [bus substructure][HierarchicLayout.BUS_DESCRIPTOR_DP_KEY].
 * @param [sourceBusNode] the source bus dummy node or the root node of the bus substructure
 * @param [targetBusNode] the target bus dummy node or the root node of the bus substructure
 * @param [edgeLayoutDescriptor] the descriptor which is assigned to the new dummy edge
 * @param [groupingId] the edge grouping id assigned to the new dummy edge
 * @param [groupingAtSource] `true` if the dummy edge should be grouped at the source side, `false` if it should be grouped at the target side
 * @return the newly created bus dummy edge connecting the two given nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBusDummyEdge">Online Documentation</a>
 */
   fun createBusDummyEdge( sourceBusNode: Node ,
 targetBusNode: Node ,
 edgeLayoutDescriptor: EdgeLayoutDescriptor ,
 groupingId: Id ,
 groupingAtSource: Boolean ):Edge
/**
 * Creates an [IEdgeData] instance for a [bus dummy edge][createBusDummyEdge].
 * @param [busDummyEdge] the bus dummy edge
 * @param [edgeLayoutDescriptor] the descriptor which is assigned to the given bus dummy edge
 * @param [groupingId] the grouping id assigned to the given bus dummy edge
 * @param [groupingAtSource] `true` if the dummy edge is grouped at the source side, `false` if it is grouped at the target side
 * @return the newly created [IEdgeData] for the given bus dummy edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBusDummyEdgeData">Online Documentation</a>
 */
   fun createBusDummyEdgeData( busDummyEdge: Edge ,
 edgeLayoutDescriptor: EdgeLayoutDescriptor ,
 groupingId: Id ,
 groupingAtSource: Boolean ):IEdgeData
/**
 * Creates a dummy node that is used during the sequencing and drawing phase for the [bus-style routing][HierarchicLayout.BUS_DESCRIPTOR_DP_KEY] edges at a certain root node.
 * @param [layer] the layer to which the created dummy node is added
 * @param [groupNode] the group node to which the created dummy node is added
 * @param [laneDescriptor] the lane to which the dummy should belong to
 * @return the newly created bus dummy node
 * @see [HierarchicLayout.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBusDummyNode">Online Documentation</a>
 */
   fun createBusDummyNode( layer: ILayer ,
 groupNode: Node ,
 laneDescriptor: SwimlaneDescriptor? ):Node
/**
 * Creates a [INodeData] instance for a [bus dummy node][createBusDummyNode].
 * @param [busDummyNode] the bus dummy node for which the data is created
 * @param [groupNode] the group node to which the bus dummy node belongs
 * @param [laneDescriptor] the lane to which the bus dummy node belongs
 * @return the newly created [INodeData] instance for the given bus dummy node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createBusDummyNodeData">Online Documentation</a>
 */
   fun createBusDummyNodeData( busDummyNode: Node ,
 groupNode: Node ,
 laneDescriptor: SwimlaneDescriptor? ):INodeData
/**
 * Creates a dummy [Node] that mimics a connector to a group [Node].
 * @param [groupNode] the given group [Node]
 * @param [groupId] the given group ID
 * @param [layer] the given [ILayer] instance
 * @param [edge] the given [Edge]
 * @return the new [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createConnectorProxyForGroup">Online Documentation</a>
 */
   fun createConnectorProxyForGroup( groupNode: Node ,
 groupId: Id ,
 layer: ILayer ,
 edge: Edge ):Node
/**
 * Creates a dummy node that mimics a connector to a group node from a descendant.
 * @param [groupNode] the group node to which the edge is connected
 * @param [groupId] the id of the group node
 * @param [layer] the layer to which the dummy node will be assigned
 * @param [e] the edge that connects to the dummy node
 * @return the dummy node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createContentConnectorProxyForGroup">Online Documentation</a>
 */
   fun createContentConnectorProxyForGroup( groupNode: Node ,
 groupId: Id ,
 layer: ILayer ,
 e: Edge ):Node
/**
 * Creates a spacer [Node] for the drawing phase using the given bounds in the given [ILayer].
 * @param [layer] the given [ILayer] instance
 * @param [size] the given bounds
 * @param [edges] an array of [Edge]s
 * @return the new spacer [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createDistanceNode">Online Documentation</a>
 */
   fun createDistanceNode( layer: ILayer ,
 size: Rectangle2D ,
 edges: ReadonlyArray<Edge> ):Node
/**
 * Creates a dummy [Edge] using the given data.
 * @param [newSource] the source node of the [Edge]
 * @param [newTarget] the target node of the [Edge]
 * @param [oldEdge] the old [Edge] from which to retrieve the data
 * @param [sourceEnd] `true` if the source node of the edge is referred, `false` otherwise
 * @param [targetEnd] `true` if the target node of the edge is referred, `false` otherwise
 * @return a new dummy [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createDummyEdge">Online Documentation</a>
 */
   fun createDummyEdge( newSource: Node ,
 newTarget: Node ,
 oldEdge: Edge ,
 sourceEnd: Boolean ,
 targetEnd: Boolean ):Edge
/**
 * Creates an edge group [Node] in the given [ILayer].
 * @param [layer] the given [ILayer] instance
 * @param [groupId] the ID of the edge group
 * @return the new group [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createEdgeGroupNode">Online Documentation</a>
 */
   fun createEdgeGroupNode( layer: ILayer ,
 groupId: Id ):Node
/**
 * Creates a [INodeData] object for an edge group [Node] and associates it with the [Node].
 * @param [node] the given [Node]
 * @param [groupId] the given group ID
 * @param [source] `true` if the edge group is referred to the source node, `false` otherwise
 * @return a [INodeData] object for the given edge group [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createEdgeGroupNodeData">Online Documentation</a>
 */
   fun createEdgeGroupNodeData( node: Node ,
 groupId: Id ,
 source: Boolean ):INodeData
/**
 * Creates an [Edge] that connects two group border [Node]s.
 * @param [source] the source [Node]
 * @param [target] the target [Node]
 * @return the new [Edge] connecting the two group [Node]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createGroupBorderEdge">Online Documentation</a>
 */
   fun createGroupBorderEdge( source: Node ,
 target: Node ):Edge
/**
 * Creates a group boundary [Node] for a group node in the given [ILayer].
 * @param [groupNode] the given group [Node]
 * @param [layer] the given [ILayer]
 * @param [type] one of [NodeDataType.GROUP_BEGIN] or [NodeDataType.GROUP_END]
 * @return the new group boundary [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createGroupBorderNode">Online Documentation</a>
 */
   fun createGroupBorderNode( groupNode: Node ,
 layer: ILayer ,
 type: NodeDataType ):Node
/**
 * Create a dummy [Node] for a group [layer][ILayer].
 * @return a new dummy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createGroupLayerDummyNode">Online Documentation</a>
 */
   fun createGroupLayerDummyNode():Node
/**
 * Creates a group node connector [Edge] between two group [Node]s.
 * @param [groupNode1] the first group node
 * @param [groupNode2] the first group node
 * @param [representative] the given representative [Edge]
 * @return a new connector [Edge] between two group [Node]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createGroupNodeConnectorEdge">Online Documentation</a>
 */
   fun createGroupNodeConnectorEdge( groupNode1: Node ,
 groupNode2: Node ,
 representative: Edge ):Edge
/**
 * Creates an [IEdgeData] object for a normal [Edge] and associates it with the edge.
 * @param [edge] the given [Edge]
 * @return an [IEdgeData] object for the given [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createNormalEdgeData">Online Documentation</a>
 */
   fun createNormalEdgeData( edge: Edge ):IEdgeData
/**
 * Creates a [INodeData] object for a normal [Node] and associates it with the [Node].
 * @param [node] the given [Node]
 * @return a [INodeData] object for the given [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createNormalNodeData">Online Documentation</a>
 */
   fun createNormalNodeData( node: Node ):INodeData
/**
 * Creates a proxy [Node] for an [Edge] during the drawing phase, changing the [Edge] to end/start at the proxy and assigns it to a [SwimlaneDescriptor] instance.
 * @param [edge] the given [Edge]
 * @param [source] `true` if the node is the source node of the edge, `false` otherwise
 * @param [laneDescriptor] a given [SwimlaneDescriptor] instance
 * @return the new proxy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createProxyNode">Online Documentation</a>
 */
   fun createProxyNode( edge: Edge ,
 source: Boolean ,
 laneDescriptor: SwimlaneDescriptor?  = definedExternally):Node
/**
 * Creates a [INodeData] object for a proxy [Node] and associates it with the proxy node.
 * @param [node] the given [Node]
 * @param [proxy] the given proxy node
 * @param [edge] the given [Edge]
 * @return a [INodeData] object for the given proxy node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createProxyNodeData">Online Documentation</a>
 */
   fun createProxyNodeData( node: Node ,
 proxy: Node ,
 edge: Edge ):INodeData
/**
 * Creates a dummy edge that belongs to a recursive [Edge].
 * @param [newSource] the source node of the [Edge]
 * @param [newTarget] the target node of the [Edge]
 * @param [oldEdge] the old [Edge] from which to retrieve the data
 * @param [sourceEnd] `true` if the source node of the edge is referred, `false` otherwise
 * @param [targetEnd] `true` if the target node of the edge is referred, `false` otherwise
 * @return a new dummy [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createRecursiveDummyEdge">Online Documentation</a>
 */
   fun createRecursiveDummyEdge( newSource: Node ,
 newTarget: Node ,
 oldEdge: Edge ,
 sourceEnd: Boolean ,
 targetEnd: Boolean ):Edge
/**
 * Creates a dummy [Node] that represents a bend node of a recursive [Edge].
 * @param [layer] the given [ILayer] to which the dummy [Node] is assigned
 * @param [edge] the given [Edge] to which the dummy [Node] belongs
 * @param [laneDescriptor] the given [SwimlaneDescriptor] instance
 * @return the new [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createRecursiveEdgeDummy">Online Documentation</a>
 */
   fun createRecursiveEdgeDummy( layer: ILayer ,
 edge: Edge ,
 laneDescriptor: SwimlaneDescriptor? ):Node
/**
 * Creates a [INodeData] for a dummy [Node] of a recursive [Edge].
 * @param [node] the given [Node]
 * @param [edge] the given [Edge] to which the dummy [Node] belongs
 * @param [laneDescriptor] the given [SwimlaneDescriptor] instance
 * @return the new [INodeData] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createRecursiveEdgeNodeData">Online Documentation</a>
 */
   fun createRecursiveEdgeNodeData( node: Node ,
 edge: Edge ,
 laneDescriptor: SwimlaneDescriptor? ):INodeData
/**
 * Creates an [IEdgeData] object for a same-layer recursive [Edge] and associates it with the edge.
 * @param [edge] the given [Edge]
 * @param [originalEdgeData] the [IEdgeData] object of the original edge
 * @param [isUpper] `true` is the recursive edge is an upper same layer edge, `false` otherwise
 * @return an [IEdgeData] object for the recursive same-layer [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createRecursiveSameLayerEdgeData">Online Documentation</a>
 */
   fun createRecursiveSameLayerEdgeData( edge: Edge ,
 originalEdgeData: IEdgeData ,
 isUpper: Boolean ):IEdgeData
/**
 * Creates a redirected [Edge] to replace an [Edge] connected to a group [Node].
 * @param [newSource] the source node of the [Edge]
 * @param [newTarget] the target node of the [Edge]
 * @param [groupEdge] the given group [Edge]
 * @return a new redirected [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createRedirectedGroupEdge">Online Documentation</a>
 */
   fun createRedirectedGroupEdge( newSource: Node ,
 newTarget: Node ,
 groupEdge: Edge ):Edge
/**
 * Creates a reversed dummy [Edge] using the given data.
 * @param [newSource] the source node of the [Edge]
 * @param [newTarget] the target node of the [Edge]
 * @param [oldEdge] the old [Edge] from which to retrieve the data
 * @param [sourceEnd] `true` if the source node of the edge is referred, `false` otherwise
 * @param [targetEnd] `true` if the target node of the edge is referred, `false` otherwise
 * @return a new reversed dummy [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createReverseDummyEdge">Online Documentation</a>
 */
   fun createReverseDummyEdge( newSource: Node ,
 newTarget: Node ,
 oldEdge: Edge ,
 sourceEnd: Boolean ,
 targetEnd: Boolean ):Edge
/**
 * Creates an [IEdgeData] object for a same-layer [Edge] and associates it with the edge.
 * @param [edge] the given [Edge]
 * @return an [IEdgeData] object for the same-layer [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createSameLayerEdgeData">Online Documentation</a>
 */
   fun createSameLayerEdgeData( edge: Edge ):IEdgeData
/**
 * Creates a same-layer [Edge] proxy connecting a newly created proxy [Node] and a given proxy [Node] in the given [ILayer].
 * @param [layer] the given [ILayer]
 * @param [edge] the given [Edge]
 * @param [toProxy] the given proxy [Node]
 * @return a new redefined same-layer [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createSameLayerProxy">Online Documentation</a>
 */
   fun createSameLayerProxy( layer: ILayer ,
 edge: Edge ,
 toProxy: Node ):Edge
/**
 * Creates a proxy [Node] for a same-layer [Edge] during the drawing phase that ends at the side of a node.
 * @param [inLayer] the given [ILayer] instance
 * @param [forNode] the given [Node]
 * @param [edge] the given [Edge]
 * @param [sld] a given [SwimlaneDescriptor] instance
 * @return the new proxy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createSameLayerSideProxy">Online Documentation</a>
 */
   fun createSameLayerSideProxy( inLayer: ILayer ,
 forNode: Node ,
 edge: Edge ,
 sld: SwimlaneDescriptor  = definedExternally):Node
/**
 * Creates a same-layer switch proxy [Node] (switching between two same-layer [Edge]s on two different sides of the layer).
 * @param [layer] the given [ILayer]
 * @param [edge] the given [Edge]
 * @return the new same-layer switch proxy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createSameLayerSwitchProxy">Online Documentation</a>
 */
   fun createSameLayerSwitchProxy( layer: ILayer ,
 edge: Edge ):Node
/**
 * Creates an [IEdgeData] object for a self-loop [Edge] and associates it with the edge.
 * @param [edge] the given [Edge]
 * @return an [IEdgeData] object for a self-loop [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-createSelfLoopEdgeData">Online Documentation</a>
 */
   fun createSelfLoopEdgeData( edge: Edge ):IEdgeData
/**
 * Destroys a spacer [Node] for the drawing phase created using [createDistanceNode].
 * @param [distanceNode] the [Node] to be destroyed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroyDistanceNode">Online Documentation</a>
 */
   fun destroyDistanceNode( distanceNode: Node )
/**
 * Removes the given layer for proxies at groups to handle direct group content connector edges between a node in the first/last layer of the group node and the groups border.
 * @param [layer] the layer to destroy
 * @param [useInEdges] whether the incoming edges should be used as the resulting edges
 * @see [EdgeLayoutDescriptor.directGroupContentEdgeRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroyGroupConnectorLayer">Online Documentation</a>
 */
   fun destroyGroupConnectorLayer( layer: ILayer ,
 useInEdges: Boolean )
/**
 * Destroys a previously created label layer
 * @param [layer] the layer to destroy
 * @param [useInEdges] whether the incoming edges should be used as the resulting edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroyLabelNodeLayer">Online Documentation</a>
 */
   fun destroyLabelNodeLayer( layer: ILayer ,
 useInEdges: Boolean )
/**
 * Destroys a proxy [Node] created using [createProxyNode] for the drawing phase.
 * @param [proxyNode] the proxy [Node] to be destroyed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroyProxyNode">Online Documentation</a>
 */
   fun destroyProxyNode( proxyNode: Node ):Edge
/**
 * Destroys a same-layer [Edge] proxy created using [createSameLayerProxy].
 * @param [edge] the [Edge] whose proxy will be destroyed
 * @return the redefined [Edge] after the removal of the proxy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroySameLayerProxy">Online Documentation</a>
 */
   fun destroySameLayerProxy( edge: Edge ):Edge
/**
 * Destroys a proxy [Node] created using [createProxyNode] for the drawing phase.
 * @param [proxyNode] the proxy [Node] to be destroyed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroySameLayerSideProxy">Online Documentation</a>
 */
   fun destroySameLayerSideProxy( proxyNode: Node )
/**
 * Destroys a same-layer switch proxy [Node] created using [createSameLayerSwitchProxy].
 * @param [node] the [Node] to be destroyed
 * @return the redefined [Edge] after the removal of the same-layer switch proxy [Node]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-destroySameLayerSwitchProxy">Online Documentation</a>
 */
   fun destroySameLayerSwitchProxy( node: Node ):Edge
/**
 * Inserts a same-layer [Edge] or an [Edge] that may span multiple layers into the data structure and returns the resulting list of [Edge]s that has been created if this edge spans multiple layers.
 * @param [edge] the given [Edge]
 * @return the resulting list of [Edge]s that has been created if this edge spans multiple layers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-insertEdge">Online Documentation</a>
 */
   fun insertEdge( edge: Edge ):EdgeList
/**
 * Inserts a layer for proxies at groups to handle direct group content connector edges between a node in the first/last layer of the group node and the groups border.
 * @param [top] `true` if this layer is placed above a group nodes, `false` if placed below
 * @param [index] the index where the layer is inserted
 * @return the new layer
 * @see [EdgeLayoutDescriptor.directGroupContentEdgeRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-insertGroupConnectorLayer">Online Documentation</a>
 */
   fun insertGroupConnectorLayer( top: Boolean ,
 index: Int ):ILayer
/**
 * Inserts a [layer][ILayer] for group [Node]s.
 * @param [source] `true` if the group refers to the source node of an edge, `false` otherwise
 * @param [index] the index at which the specified [layer][ILayer] is to be inserted
 * @return a [layer][ILayer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-insertGroupNodeLayer">Online Documentation</a>
 */
   fun insertGroupNodeLayer( source: Boolean ,
 index: Int ):ILayer
/**
 * Inserts a [ILayer] for labels.
 * @param [source] `true` if the source node of the edge, `false` otherwise
 * @param [index] the index at which the specified [ILayer] is to be inserted
 * @return a [layer][ILayer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-insertLabelNodeLayer">Online Documentation</a>
 */
   fun insertLabelNodeLayer( source: Boolean ,
 index: Int ):ILayer
/**
 * Registers an [Edge] as a same-layer [Edge] appropriately into all data structures.
 * @param [edge] the given [Edge] to be registered
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-registerSameLayerEdge">Online Documentation</a>
 */
   fun registerSameLayerEdge( edge: Edge )
/**
 * Converts a same-layer [Edge] to an [Edge] of type [EdgeDataType.DIRECT_SAME_LAYER_EDGE].
 * @param [sameLayerEdge] the given same-layer [Edge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setDirectlyConnectSameLayerEdge">Online Documentation</a>
 */
   fun setDirectlyConnectSameLayerEdge( sameLayerEdge: Edge )
/**
 * Specifies the critical edge priority for an [Edge] and defines it in an [IEdgeData] object.
 * @param [edge] the given edge
 * @param [priority] the new priority for the given edge
 * @return an [IEdgeData] object with an adjusted critical edge priority
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setTemporaryCriticalEdgePriority">Online Documentation</a>
 */
   fun setTemporaryCriticalEdgePriority( edge: Edge ,
 priority: Int ):IEdgeData
/**
 * Specifies the crossing cost for an [Edge] and defines it in an [IEdgeData] object.
 * @param [edge] the given edge
 * @param [crossingCost] the new crossing cost for the given edge
 * @return an [IEdgeData] object with an adjusted edge crossing cost
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setTemporaryCrossingCost">Online Documentation</a>
 */
   fun setTemporaryCrossingCost( edge: Edge ,
 crossingCost: Double ):IEdgeData
/**
 * Specifies an edge group constraint for an [Edge] and assigns it to an [IEdgeData] object.
 * @param [edge] the given [Edge]
 * @param [sgId] the ID of the edge group at the source node
 * @param [tgId] the ID of the edge group at the target node
 * @return an [IEdgeData] object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setTemporaryEdgeGroups">Online Documentation</a>
 */
   fun setTemporaryEdgeGroups( edge: Edge ,
 sgId: Id ,
 tgId: Id ):IEdgeData
/**
 * Specifies the thickness for an [Edge] and defines it in an [IEdgeData] object.
 * @param [edge] the given [Edge]
 * @param [thickness] the new edge thickness
 * @return an [IEdgeData] object with an adjusted edge thickness
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setTemporaryEdgeThickness">Online Documentation</a>
 */
   fun setTemporaryEdgeThickness( edge: Edge ,
 thickness: Double ):IEdgeData
/**
 * Specifies a port constraint for an [Edge] at the given side and assigns it to an [IEdgeData] object.
 * @param [edge] the given [Edge]
 * @param [source] `true` of the port constraint is defined on the source node of the [Edge], `false` otherwise
 * @param [pc] the given [PortConstraint] instance
 * @return an [IEdgeData] object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-setTemporaryPortConstraint">Online Documentation</a>
 */
   fun setTemporaryPortConstraint( edge: Edge ,
 source: Boolean ,
 pc: PortConstraint ):IEdgeData
/**
 * Reverts a label node to the normal [Node].
 * @param [labelNode] the given label node to be converted
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IItemFactory%23IItemFactory-method-unconvertToLabelNode">Online Documentation</a>
 */
   fun unconvertToLabelNode( labelNode: Node )

companion object : InterfaceMetadata<IItemFactory> {
}
}
