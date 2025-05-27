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
import yfiles.lang.Predicate

/**
 * This class provides methods for finding paths within a graph that have certain properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm">Online Documentation</a>
 */
@JsName("PathAlgorithm")
external object Paths {
/**
 * Constructs a [path of nodes][NodeList] from a given [path of edges][EdgeList].
 * @param [path] the given [path of edges][EdgeList]
 * @return a [path of nodes][NodeList] from the given [path of edges][EdgeList]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-constructNodePath">Online Documentation</a>
 */
 final   fun constructNodePath( path: EdgeList ):NodeList
/**
 * Returns all chains present in the given graph.
 * @receiver the input graph
 * @param [directed] `true` if the chain should be considered as directed, `false` otherwise
 * @return an array of [EdgeList]s each of which contains the edges (at least two) that make up a chain
 * @see [constructNodePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findAllChains">Online Documentation</a>
 */
 final   fun Graph.findAllChains( directed: Boolean ):ReadonlyArray<EdgeList>
/**
 * Finds all edges that belong to a directed path from a `start` node to an `end` node.
 * @receiver the input graph
 * @param [startNode] the given start node
 * @param [endNode] the given end node
 * @param [pathEdges] the [IEdgeMap] that will be filled during the execution with a boolean value indicating whether or not an edge belongs to a path connecting the two given nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findAllPaths(Graph,Node,Node,IEdgeMap)">Online Documentation</a>
 */
 final   fun Graph.findAllPaths( startNode: Node ,
 endNode: Node ,
 pathEdges: IEdgeMap<Boolean> )
/**
 * Returns all simple directed or undirected paths that connect a `start` node with an `end` node.
 * ### Preconditions
 * - Input graph, `start` node and `end` node must not be `null`.
 * @receiver the input graph
 * @param [startNode] the given start node
 * @param [endNode] the given end node
 * @param [directed] `true` if the path should be considered as directed, `false` otherwise
 * @return an array of [EdgeList]s each of which represents a path between the start and end node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findAllPaths(Graph,Node,Node,boolean)">Online Documentation</a>
 */
 final   fun Graph.findAllPaths( startNode: Node ,
 endNode: Node ,
 directed: Boolean ):ReadonlyArray<EdgeList>
/**
 * A variant of [findAllPaths] which returns all simple directed or undirected paths between two given nodes and, additionally, allows to specify a filter for the paths to be returned.
 * ### Preconditions
 * - Input graph, `start` node and `end` node must not be `null`.
 * @receiver the input graph
 * @param [startNode] the given start node
 * @param [endNode] the given end node
 * @param [directed] `true` if the path should be considered as directed, `false` otherwise
 * @param [filter] a predicate that accepts or rejects a found [EdgeList] and adds it to the result
 * @return an array of [EdgeList]s each of which represents a path between the start and end node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findAllPaths(Graph,Node,Node,boolean,system.Predicate)">Online Documentation</a>
 */
 final   fun Graph.findAllPaths( startNode: Node ,
 endNode: Node ,
 directed: Boolean ,
 filter: Predicate<EdgeList> ):ReadonlyArray<EdgeList>
/**
 * A variant of [findAllPaths], which returns all simple directed or undirected paths between two given nodes as a special cursor that calculates the next path in the sequence, only when needed.
 * ### Preconditions
 * - Input graph, `start` node and `end` node must not be `null`.
 * @receiver the input graph
 * @param [startNode] the given start node
 * @param [endNode] the given end node
 * @param [directed] `true` if the path should be considered as directed, `false` otherwise
 * @return a [ICursor] that calculates the next path in the sequence
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findAllPathsCursor">Online Documentation</a>
 */
 final   fun Graph.findAllPathsCursor( startNode: Node ,
 endNode: Node ,
 directed: Boolean ):ICursor<EdgeList>
/**
 * Returns an [EdgeList] containing the edges of an undirected simple path within the given graph.
 * ### Preconditions
 * - The graph must be [simple][GraphChecker.isSimple].
 * @receiver the given graph
 * @return an [EdgeList] containing the edges of an undirected simple path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findLongPath">Online Documentation</a>
 */
 final   fun Graph.findLongPath():EdgeList
/**
 * Returns the longest directed path in a given acyclic weighted graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * - `edgeLength.getInt(e) >= 0` for all edges `e` of the graph
 * @receiver a directed acyclic graph
 * @param [edgeLength] the [IDataProvider] that returns the non-negative integer length of each edge
 * @return an [EdgeList] containing the edges of the longest directed path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findLongestPath">Online Documentation</a>
 */
 final   fun Graph.findLongestPath( edgeLength: IDataProvider<Edge, Int>  = definedExternally):EdgeList
/**
 * Calculates the longest path from a given node to all other node in a given directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * @receiver a directed acyclic graph
 * @param [startNode] the node for which the distances are calculated
 * @param [dist] the [IEdgeMap] that returns the distance (i.e. weight) of type double for each edge
 * @param [maxDist] the [INodeMap] that will be filled during the execution and holds the maximum distance between the given node and all other nodes
 * @param [predicate] the [IEdgeMap] that returns a boolean value indicating whether or not an edge should be considered during the path search
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findLongestPaths">Online Documentation</a>
 */
 final   fun Graph.findLongestPaths( startNode: Node ,
 dist: IEdgeMap<Double> ,
 maxDist: INodeMap<Double> ,
 predicate: IEdgeMap<Boolean> )
/**
 * Returns an [EdgeList] containing the edges of a path from the given start node to the given end node, if such a path exists.
 * ### Preconditions
 * - `startNode != endNode`
 * @receiver the input graph
 * @param [startNode] the first node of the path
 * @param [endNode] the last node of the path
 * @param [directed] `true` if the path should be directed, `false` otherwise
 * @return an [EdgeList] containing the path edges between the start node and the end node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findPath(Graph,Node,Node,boolean)">Online Documentation</a>
 */
 final   fun Graph.findPath( startNode: Node ,
 endNode: Node ,
 directed: Boolean ):EdgeList
/**
 * Returns whether or not a directed path from a start node to another node in an acyclic graph exists.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * @receiver an acyclic graph which contains the two nodes
 * @param [topSort] a [list][NodeList] of nodes sorted in topological order
 * @param [predicate] the [IEdgeMap] that returns a boolean value indicating whether or not an edge should be considered during the path search
 * @return `true` if a directed path from a start node to another node exists, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathAlgorithm%23Paths-method-findPath(Graph,NodeList,Node,Node,IEdgeMap)">Online Documentation</a>
 */
 final   fun Graph.findPath( topSort: NodeList ,
 startNode: Node ,
 endNode: Node ,
 predicate: IEdgeMap<Boolean> ):Boolean
}
