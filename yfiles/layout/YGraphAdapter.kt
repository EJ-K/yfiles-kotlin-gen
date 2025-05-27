// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Graph
import yfiles.algorithms.GraphObject
import yfiles.algorithms.IDataMap
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.IEdgeMap
import yfiles.algorithms.INodeMap
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.MapperDelegate
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Converts an [IGraph] instance into a [Graph] instance.
 * @see [LayoutGraphAdapter]
 * @see [LayoutExecutor]
 * @see [Bipartitions][yfiles.algorithms.Bipartitions]
 * @see [Centrality][yfiles.algorithms.Centrality]
 * @see [Cycles][yfiles.algorithms.Cycles]
 * @see [GraphChecker]
 * @see [GraphConnectivity]
 * @see [Groups][yfiles.algorithms.Groups]
 * @see [IndependentSets][yfiles.algorithms.IndependentSets]
 * @see [NetworkFlows][yfiles.algorithms.NetworkFlows]
 * @see [NodeOrders]
 * @see [Paths][yfiles.algorithms.Paths]
 * @see [RankAssignments][yfiles.algorithms.RankAssignments]
 * @see [ShortestPaths][yfiles.algorithms.ShortestPaths]
 * @see [SpanningTrees][yfiles.algorithms.SpanningTrees]
 * @see [Transitivity][yfiles.algorithms.Transitivity]
 * @see [Trees][yfiles.algorithms.Trees]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [YGraphAdapter] class.
 * @param [originalGraph] The original graph whose structure will be copied.
 * @param [subgraphNodes] The (sub) set of nodes to use to build the graph. If omitted, all [nodes][IGraph.nodes] will be used. Providing nodes which are not part of the `originalGraph` will result in an exception.
 * @param [subgraphEdges] The (sub) set of edges to use to build the graph. If omitted, all [edges][IGraph.edges] will be used. Providing edges which are not part of the `originalGraph` will result in an exception.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-constructor-YGraphAdapter">Online Documentation</a>
 * 
 * @property originalGraph
 * Gets the original graph instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23originalGraph">Online Documentation</a>
 */
external open class YGraphAdapter  (
final val originalGraph: IGraph,
 subgraphNodes: IEnumerable<INode>?  = definedExternally,
 subgraphEdges: IEnumerable<IEdge>?  = definedExternally) : YObject {

/**
 * Gets the graph instance that is created during the constructor call.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23yGraph">Online Documentation</a>
 */
final val yGraph: Graph
/**
 * Creates an [IDataMap] that delegates to the provided [IMapper] when queried for items in the [yGraph].
 * @param [K] The type of the keys in the mapper.
 * @param [V] The type of the values in the mapper.
 * @param [keyType] The type of the keys in the mapper.
 * @param [valueType] The type of the values in the mapper.
 * @param [mapper] The mapper to direct requests to.
 * @return An [IDataMap] that will delegate the functionality to the `mapper`.
 * @see [createDataProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createDataMap">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createDataMap( keyType: YClass<K> ,
 valueType: YClass<V> ,
 mapper: IMapper<K, V> ):IDataMap<K, V>
/**
 * Creates an [IDataProvider] that delegates to the provided [IMapper] when queried for items in the [yGraph].
 * @param [K] The type of the keys in the mapper.
 * @param [V] The type of the values in the mapper.
 * @param [keyType] The type of the keys in the mapper.
 * @param [valueType] The type of the values in the mapper.
 * @param [mapper] The mapper to direct requests to.
 * @return A DataProvider that will delegate requests to the `mapper`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createDataProvider(yfiles.lang.Class,yfiles.lang.Class,IMapper)">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createDataProvider( keyType: YClass<K> ,
 valueType: YClass<V> ,
 mapper: IMapper<K, V> ):IDataProvider<K, V>
/**
 * Creates an [IDataProvider] that delegates to the provided delegate when queried for items in the [yGraph].
 * @param [K] The type of the keys in the mapper.
 * @param [V] The type of the values in the mapper.
 * @param [keyType] The type of the keys in the mapper.
 * @param [valueType] The type of the values in the mapper.
 * @param [getter] The mapper delegate to direct requests to.
 * @return A DataProvider that will delegate requests to the `getter`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createDataProvider(yfiles.lang.Class,yfiles.lang.Class,MapperDelegate)">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createDataProvider( keyType: YClass<K> ,
 valueType: YClass<V> ,
 getter: MapperDelegate<K, V> ):IDataProvider<K, V>
/**
 * Creates an [enumerable of edges][IEnumerable] that maps the edges from the [EdgeList] to their [original][getOriginalEdge] ones.
 * @param [edges] The edge list.
 * @return An enumerable that contains the [original][getOriginalEdge] edges for the ones in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createEdgeEnumerable">Online Documentation</a>
 */
 final   fun createEdgeEnumerable( edges: EdgeList ):IListEnumerable<IEdge>
/**
 * Creates an [EdgeList] that maps the edges from the [IEnumerable] to their [copied][getCopiedEdge] ones.
 * @param [edges] The edges from the [originalGraph].
 * @return An [EdgeList] that contains the [copied][getCopiedEdge] edges for the ones in the enumerable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createEdgeList">Online Documentation</a>
 */
 final   fun createEdgeList( edges: IEnumerable<IEdge> ):EdgeList
/**
 * Creates an [IEdgeMap] that delegates to the provided [IMapper] when queried for [Edge]s in the [yGraph].
 * @param [V] The type of the values in the mapper.
 * @param [mapper] The mapper to direct requests to.
 * @return An [IEdgeMap] that will delegate reads and writes to the `mapper`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createEdgeMap(IMapper)">Online Documentation</a>
 */
 final   fun <V : Any>createEdgeMap( mapper: IMapper<IEdge, V> ):IEdgeMap<V>
/**
 * Creates an [IEdgeMap] that delegates to the provided delegate when queried for [Edge]s in the [yGraph].
 * @param [V] The type of the values in the mapper.
 * @param [getter] The mapper delegate to direct read requests to.
 * @return An [INodeMap] that will delegate reads to the `getter`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createEdgeMap(MapperDelegate)">Online Documentation</a>
 */
 final   fun <V : Any>createEdgeMap( getter: MapperDelegate<IEdge, V> ):IEdgeMap<V>
/**
 * Creates an [IMapper] that delegates to the provided [IEdgeMap] when queried for items in the [IGraph].
 * @param [T] The type of the values in the mapper.
 * @param [edgeMap] The map to direct requests to.
 * @return A mapper that will delegate requests to the `edgeMap`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createEdgeMapper">Online Documentation</a>
 */
 final   fun <T : Any>createEdgeMapper( edgeMap: IEdgeMap<T> ):IMapper<IEdge, T>
/**
 * Creates an [IMapper] that delegates to the provided [IDataProvider] when queried for items in the [IGraph].
 * @param [T] The type of the values in the mapper.
 * @param [dataProvider] The provider to direct requests to.
 * @return A mapper that will delegate requests to the `dataProvider`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createMapper">Online Documentation</a>
 */
 final   fun <T : Any>createMapper( dataProvider: IDataProvider<GraphObject, T> ):IMapper<IModelItem, T>
/**
 * Creates an [enumerable of nodes][IEnumerable] that maps the nodes from the [NodeList] to their [original][getOriginalNode] ones.
 * @param [nodes] The node list.
 * @return An enumerable that contains the [original][getOriginalNode] nodes for the ones in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createNodeEnumerable">Online Documentation</a>
 */
 final   fun createNodeEnumerable( nodes: NodeList ):IListEnumerable<INode>
/**
 * Creates a [NodeList] that maps the nodes from the [IEnumerable] to their [copied][getCopiedNode] ones.
 * @param [nodes] The nodes from the [originalGraph].
 * @return A [NodeList] that contains the [copied][getCopiedNode] nodes for the ones in the enumerable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createNodeList">Online Documentation</a>
 */
 final   fun createNodeList( nodes: IEnumerable<INode> ):NodeList
/**
 * Creates an [INodeMap] that delegates to the provided [IMapper] when queried for [Node]s in the [yGraph].
 * @param [V] The type of the values in the mapper.
 * @param [mapper] The mapper to direct requests to.
 * @return An [INodeMap] that will delegate reads and writes to the `mapper`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createNodeMap(IMapper)">Online Documentation</a>
 */
 final   fun <V : Any>createNodeMap( mapper: IMapper<INode, V> ):INodeMap<V>
/**
 * Creates an [INodeMap] that delegates to the provided delegate when queried for [Node]s in the [yGraph].
 * @param [V] The type of the values in the mapper.
 * @param [getter] The mapper delegate to direct read requests to.
 * @return An [INodeMap] that will delegate reads to the `getter`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createNodeMap(MapperDelegate)">Online Documentation</a>
 */
 final   fun <V : Any>createNodeMap( getter: MapperDelegate<INode, V> ):INodeMap<V>
/**
 * Creates an [IMapper] that delegates to the provided [INodeMap] when queried for items in the [IGraph].
 * @param [T] The type of the values in the mapper.
 * @param [nodeMap] The map to direct requests to.
 * @return A mapper that will delegate requests to the `nodeMap`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-createNodeMapper">Online Documentation</a>
 */
 final   fun <T : Any>createNodeMapper( nodeMap: INodeMap<T> ):IMapper<INode, T>
/**
 * Yields the edge that has been created as a copy in [yGraph] to represent the given edge.
 * @param [edge] The edge for which the representation is returned.
 * @return The edge that represents `edge` in [yGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-getCopiedEdge">Online Documentation</a>
 */
 final   fun getCopiedEdge( edge: IEdge ):Edge?
/**
 * Yields the node that has been created as a copy in [yGraph] to represent the given node.
 * @param [node] The node for which the representation is returned.
 * @return The node that represents `node` in [yGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-getCopiedNode">Online Documentation</a>
 */
 final   fun getCopiedNode( node: INode ):Node?
/**
 * Yields the original edge from the [original IGraph][originalGraph] that the given edge has been created for.
 * @param [edge] The edge for which the original instance will be returned.
 * @return The original instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-getOriginalEdge">Online Documentation</a>
 */
 final   fun getOriginalEdge( edge: Edge ):IEdge?
/**
 * Yields the original node from the [original IGraph][originalGraph] that the given node has been created for.
 * @param [node] The node for which the original instance will be returned.
 * @return The original instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YGraphAdapter%23YGraphAdapter-method-getOriginalNode">Online Documentation</a>
 */
 final   fun getOriginalNode( node: Node ):INode?

companion object : ClassMetadata<YGraphAdapter> {
}
}
