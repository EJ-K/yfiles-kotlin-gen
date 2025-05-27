// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.IComparer
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class implements a directed graph structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph">Online Documentation</a>
 * 
 * @constructor Instantiates an empty [Graph] object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-constructor-Graph()">Online Documentation</a>
 */
external open class Graph  () : YObject {
/**
 * Instantiates a new [Graph] object as a partial copy of the given graph.
 * @param [graph] The graph to be (partially) copied.
 * @param [subNodes] A cursor to iterate over the nodes that actually induce the subgraph to be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-constructor-Graph(Graph,ICursor)">Online Documentation</a>
 */
 constructor( graph: Graph ,
 subNodes: ICursor<Node>?  = definedExternally)

/**
 * Gets an array of all data provider look-up keys that are registered with this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23dataProviderKeys">Online Documentation</a>
 */
open val dataProviderKeys: ReadonlyArray<Any>
/**
 * Gets the number of edges in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23e">Online Documentation</a>
 */
final val e: Int
/**
 * Gets the number of edges in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23edgeCount">Online Documentation</a>
 */
final val edgeCount: Int
/**
 * Yields a dynamic [IEnumerable] for [Edge]s that can be used to iterate over the edges that are contained in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23edges">Online Documentation</a>
 */
final val edges: IEnumerable<Edge>
/**
 * Gets `true` if this graph contains no nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23empty">Online Documentation</a>
 */
final val empty: Boolean
/**
 * Gets the first edge in this graph.
 * ### Preconditions
 * - `edgeCount() > 0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23firstEdge">Online Documentation</a>
 */
final val firstEdge: Edge?
/**
 * Gets the first node in this graph.
 * ### Preconditions
 * - `!isEmpty()`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23firstNode">Online Documentation</a>
 */
final val firstNode: Node?
/**
 * Gets the last edge in this graph.
 * ### Preconditions
 * - `edgeCount() > 0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23lastEdge">Online Documentation</a>
 */
final val lastEdge: Edge?
/**
 * Gets the last node in this graph.
 * ### Preconditions
 * - `!isEmpty()`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23lastNode">Online Documentation</a>
 */
final val lastNode: Node?
/**
 * Gets the number of nodes in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23n">Online Documentation</a>
 */
final val n: Int
/**
 * Gets the number of nodes in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23nodeCount">Online Documentation</a>
 */
final val nodeCount: Int
/**
 * Yields a dynamic [IEnumerable] for [Node]s that can be used to iterate over the nodes that are contained in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23nodes">Online Documentation</a>
 */
final val nodes: IEnumerable<Node>
/**
 * Gets all edge maps that have been created by this graph but have not yet been disposed.
 * @see [createEdgeMap]
 * @see [disposeEdgeMap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23registeredEdgeMaps">Online Documentation</a>
 */
open val registeredEdgeMaps: ReadonlyArray<IEdgeMap<*>>
/**
 * Gets all node maps that have been created by this graph but have not yet been disposed.
 * @see [createNodeMap]
 * @see [disposeNodeMap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23registeredNodeMaps">Online Documentation</a>
 */
open val registeredNodeMaps: ReadonlyArray<INodeMap<*>>
/**
 * Registers the given data provider using the given look-up key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-addDataProvider">Online Documentation</a>
 */
 open   fun <K : YObject, V : Any>addDataProvider( providerKey: DpKeyBase<K, V> ,
 data: IDataProvider<K, V> )
/**
 * Redefines an edge's end points.
 * ### Preconditions
 * - `newSource` and `newTarget` must belong to this graph.
 * @param [e] The edge to be changed.
 * @param [newSource] The new source node of the given edge.
 * @param [newTarget] The new target node of the given edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-changeEdge(Edge,Node,Node)">Online Documentation</a>
 */
 open   fun changeEdge( e: Edge ,
 newSource: Node ,
 newTarget: Node )
/**
 * Redefines an edge's end points.
 * ### Preconditions
 * - Edges `e`, `e1`, and `e2` must belong to this graph.
 * @param [e] The edge to be changed.
 * @param [e1] Reference edge for insertion at a new source node.
 * @param [e2] Reference edge for insertion at a new target node.
 * @param [d1] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @param [d2] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-changeEdge(Edge,Edge,Edge,GraphElementInsertion,GraphElementInsertion)">Online Documentation</a>
 */
 open   fun changeEdge( e: Edge ,
 e1: Edge ,
 e2: Edge ,
 d1: GraphElementInsertion ,
 d2: GraphElementInsertion )
/**
 * Redefines an edge's end points.
 * ### Preconditions
 * - Edge `e` must belong to this graph. Also, either `sourceReference` or `newSource` must be non-null and belong to this graph, and either `targetReference` or `newTarget` must be non-null and belong to this graph.
 * @param [e] The edge to be changed.
 * @param [newSource] The new source node.
 * @param [sourceReference] Reference edge for insertion at the new source node.
 * @param [sourceD] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @param [newTarget] The new target node.
 * @param [targetReference] Reference edge for insertion at the new target node.
 * @param [targetD] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-changeEdge(Edge,Node,Edge,GraphElementInsertion,Node,Edge,GraphElementInsertion)">Online Documentation</a>
 */
 open   fun changeEdge( e: Edge ,
 newSource: Node ,
 sourceReference: Edge ,
 sourceD: GraphElementInsertion ,
 newTarget: Node ,
 targetReference: Edge ,
 targetD: GraphElementInsertion )
/**
 * Removes all nodes and edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Whether or not this graph contains the given node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-contains(Node)">Online Documentation</a>
 */
 open  operator fun contains( v: Node ):Boolean
/**
 * Whether or not this graph contains the given edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-contains(Edge)">Online Documentation</a>
 */
 open  operator fun contains( e: Edge ):Boolean
/**
 * Returns whether or not this graph contains an edge that connects the given nodes.
 * @param [source] The source node.
 * @param [target] The target node.
 * @see [Node.getEdgeTo]
 * @see [Node.getEdgeFrom]
 * @see [Node.getEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-containsEdge">Online Documentation</a>
 */
 open   fun containsEdge( source: Node ,
 target: Node ):Boolean
/**
 * Creates a copy of this graph.
 * @return The newly created Graph object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():Graph
/**
 * Creates a new edge in this graph.
 * @param [v] The source node of the edge.
 * @param [w] The target node of the edge.
 * @return The newly created Edge object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createEdge(Node,Node)">Online Documentation</a>
 */
 open   fun createEdge( v: Node ,
 w: Node ):Edge
/**
 * Creates a new edge in this graph to be ordered before or after a given edge.
 * ### Preconditions
 * - Edge `e1` must have source node `v` and edge `e2` must have target node `w`.
 * @param [v] The source node of the edge.
 * @param [e1] An edge with source node `v`.
 * @param [w] The target node of the edge.
 * @param [e2] An edge with target node `w`.
 * @param [d1] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @param [d2] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @return The newly created Edge object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createEdge(Node,Edge,Node,Edge,GraphElementInsertion,GraphElementInsertion)">Online Documentation</a>
 */
 open   fun createEdge( v: Node ,
 e1: Edge? ,
 w: Node ,
 e2: Edge? ,
 d1: GraphElementInsertion ,
 d2: GraphElementInsertion ):Edge
/**
 * Returns a newly created edge map that is valid for the edges in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createEdgeMap">Online Documentation</a>
 */
 open   fun <V : Any>createEdgeMap():IEdgeMap<V>
/**
 * Creates an empty base object of the same type as this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createGraph">Online Documentation</a>
 */
 open   fun createGraph():Graph
/**
 * Creates a new node in this graph.
 * @return The newly created Node object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createNode">Online Documentation</a>
 */
 open   fun createNode():Node
/**
 * Returns a newly created node map that is valid for the nodes in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-createNodeMap">Online Documentation</a>
 */
 open   fun <V : Any>createNodeMap():INodeMap<V>
/**
 * Informs the graph that the given edge map is no longer needed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-disposeEdgeMap">Online Documentation</a>
 */
 open   fun disposeEdgeMap( map: IEdgeMap<*> )
/**
 * Informs the graph that the given node map is no longer needed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-disposeNodeMap">Online Documentation</a>
 */
 open   fun disposeNodeMap( map: INodeMap<*> )
/**
 * Returns the data provider that is registered with the graph using the given look-up key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-getDataProvider">Online Documentation</a>
 */
 open   fun <K : YObject, V : Any>getDataProvider( providerKey: DpKeyBase<K, V> ):IDataProvider<K, V>?
/**
 * Returns an array containing all edges of this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-getEdgeArray">Online Documentation</a>
 */
 final   fun getEdgeArray():ReadonlyArray<Edge>
/**
 * Provides access to the edges of the graph.
 * @return An EdgeCursor to iterate over the edges in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-getEdgeCursor">Online Documentation</a>
 */
 open   fun getEdgeCursor():IEdgeCursor
/**
 * Returns an array containing all nodes of this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-getNodeArray">Online Documentation</a>
 */
 final   fun getNodeArray():ReadonlyArray<Node>
/**
 * Provides access to the nodes of the graph.
 * @return A NodeCursor to iterate over the nodes in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-getNodeCursor">Online Documentation</a>
 */
 open   fun getNodeCursor():INodeCursor
/**
 * Hides the given edge from this graph.
 * @see [hide]
 * @see [unhide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-hide(Edge)">Online Documentation</a>
 */
 open   fun hide( e: Edge )
/**
 * Hides the given node from this graph.
 * @see [hide]
 * @see [unhide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-hide(Node)">Online Documentation</a>
 */
 open   fun hide( v: Node )
/**
 * Moves the given node to the first position within the sequence of nodes in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-moveToFirst(Node)">Online Documentation</a>
 */
 open   fun moveToFirst( v: Node )
/**
 * Moves the given edge to the first position within the sequence of edges in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-moveToFirst(Edge)">Online Documentation</a>
 */
 open   fun moveToFirst( e: Edge )
/**
 * Moves the given node to the last position within the sequence of nodes in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-moveToLast(Node)">Online Documentation</a>
 */
 open   fun moveToLast( v: Node )
/**
 * Moves the given edge to the last position within the sequence of edges in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-moveToLast(Edge)">Online Documentation</a>
 */
 open   fun moveToLast( e: Edge )
/**
 * For internal debugging purposes only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-printNodeSlotSize">Online Documentation</a>
 */
 open   fun printNodeSlotSize()
/**
 * Reinserts a formerly removed edge into this graph.
 * @param [e] The edge to be reinserted.
 * @see [removeEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-reInsertEdge">Online Documentation</a>
 */
 open   fun reInsertEdge( e: Edge )
/**
 * Reinserts a formerly removed node into this graph.
 * @param [v] The node to be reinserted.
 * @see [removeNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-reInsertNode">Online Documentation</a>
 */
 open   fun reInsertNode( v: Node )
/**
 * Removes the data provider that is registered using the given look-up key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-removeDataProvider">Online Documentation</a>
 */
 open   fun removeDataProvider( providerKey: DpKeyBase<*, *> )
/**
 * Removes the given edge from this graph.
 * @param [e] The edge to be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-removeEdge">Online Documentation</a>
 */
 open   fun removeEdge( e: Edge )
/**
 * Removes the given node from this graph.
 * @param [v] The node to be removed from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-removeNode">Online Documentation</a>
 */
 open   fun removeNode( v: Node )
/**
 * Reverses the given edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-reverseEdge">Online Documentation</a>
 */
 open   fun reverseEdge( e: Edge )
/**
 * Sorts the internally held list of edges.
 * @param [comparer] The comparator used for the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-sortEdges(IComparer)">Online Documentation</a>
 */
 open   fun sortEdges( comparer: IComparer<in Edge> )
/**
 * Sorts incoming and outgoing edges at each node of the graph.
 * @param [inComparer] The comparator used for the incoming edges at each node.
 * @param [outComparer] The comparator used for the outgoing edges at each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-sortEdges(IComparer,IComparer)">Online Documentation</a>
 */
 open   fun sortEdges( inComparer: IComparer<in Edge> ,
 outComparer: IComparer<in Edge> )
/**
 * Sorts the internally held list of nodes.
 * @param [comparer] The comparator used for the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-sortNodes">Online Documentation</a>
 */
 open   fun sortNodes( comparer: IComparer<in Node> )
/**
 * Unhides the given edge in this graph.
 * @see [hide]
 * @see [unhide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-unhide(Edge)">Online Documentation</a>
 */
 open   fun unhide( e: Edge )
/**
 * Unhides the given node in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-unhide(Node)">Online Documentation</a>
 */
 open   fun unhide( v: Node )

companion object : ClassMetadata<Graph> {
/**
 * Low-level iteration support for adjacent edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Graph%23Graph-method-firstOutEdge">Online Documentation</a>
 */
 final protected   fun Node.firstOutEdge():Edge?
}
}

inline val  Graph.notEmpty: Boolean
    get() = !empty
