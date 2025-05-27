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

/**
 * This class provides algorithms for determining certain connectivity components within a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity">Online Documentation</a>
 */
external object GraphConnectivity {
/**
 * Calculates the biconnected components of a given undirected graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * @receiver the input graph
 * @return an array of [EdgeList]s each containing all edges that belong to the same biconnected component
 * @see [biconnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-biconnectedComponents(Graph)">Online Documentation</a>
 */
 final   fun Graph.biconnectedComponents():ReadonlyArray<EdgeList>
/**
 * Calculates the biconnected components and the articulation points of a given undirected graph and returns the number of biconnected components.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * - `compNum` should not be `null`.
 * - `aPoint` should not be `null`.
 * @receiver the input graph
 * @param [compNum] the [IEdgeMap] that will be filled during the execution and returns the zero-based index of the biconnected component to which each edge belongs or `-1` for self-loops
 * @param [aPoint] the [INodeMap] that will be filled during the execution and returns a boolean value indicating whether or not a given node is an articulation point
 * @return the number of biconnected components
 * @see [biconnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-biconnectedComponents(Graph,IEdgeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.biconnectedComponents( compNum: IEdgeMap<Int> ,
 aPoint: INodeMap<Boolean>  = definedExternally):Int
/**
 * Calculates the connected components of a given graph.
 * @receiver the input graph
 * @return an array of [NodeList]s each of which contains the nodes that belong to the same connected component
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-connectedComponents(Graph)">Online Documentation</a>
 */
 final   fun Graph.connectedComponents():ReadonlyArray<NodeList>
/**
 * Calculates the connected components of a given graph and returns their number.
 * @param [compNum] the [INodeMap] that will be filled during the execution and returns the zero-based index of the connected component to which each node belongs
 * @return the number of connected components of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-connectedComponents(Graph,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.connectedComponents( compNum: INodeMap<Int> ):Int
/**
 * Determines the direct or indirect neighbors of a given set of nodes.
 * @return a [NodeList] that contains all direct and indirect neighbors of a node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-getNeighbors">Online Documentation</a>
 */
 final   fun Graph.getNeighbors( startNodes: NodeList ,
 maxDistance: Double ):NodeList
/**
 * Determines the direct or indirect predecessors of a given list of nodes.
 * @receiver the given graph
 * @param [startNodes] a [NodeList] containing the nodes from which the search starts
 * @param [maxDistance] an integer value that limits the distance between a start node and a returned node
 * @return a [NodeList] that contains all direct and indirect predecessors of a node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-getPredecessors">Online Documentation</a>
 */
 final   fun Graph.getPredecessors( startNodes: NodeList ,
 maxDistance: Double ):NodeList
/**
 * Determines the direct or indirect successors of a given list of nodes.
 * @receiver the given graph
 * @param [startNodes] a [NodeList] containing the nodes from which the search starts
 * @param [maxDistance] an integer value that limits the distance between a start node and a returned node
 * @return a [NodeList] that contains all direct and indirect successors of a node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-getSuccessors">Online Documentation</a>
 */
 final   fun Graph.getSuccessors( startNodes: NodeList ,
 maxDistance: Double ):NodeList
/**
 * Checks whether or not the given undirected graph is biconnected.
 * @receiver the given undirected graph
 * @return `true` if the graph is biconnected, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-isBiconnected">Online Documentation</a>
 */
 final   fun Graph.isBiconnected():Boolean
/**
 * Checks whether or not the given graph is connected.
 * @receiver the given graph
 * @return `true` if the graph is connected, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-isConnected">Online Documentation</a>
 */
 final   fun Graph.isConnected():Boolean
/**
 * Checks whether or not the given directed graph is strongly connected.
 * @receiver the given directed graph
 * @return `true` if the graph is strongly connected, `false`, otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-isStronglyConnected">Online Documentation</a>
 */
 final   fun Graph.isStronglyConnected():Boolean
/**
 * Calculates the k-cores of an undirected input graph.
 * @receiver the undirected input graph
 * @param [kValue] stores the largest `k` for which a node is contained in the k-core
 * @return the largest `k` for which the k-core of the graph is not empty
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-kCore(Graph,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.kCore( kValue: INodeMap<Int> ):Int
/**
 * Calculates the k-core for a given undirected input graph and k value.
 * @receiver the undirected input graph
 * @param [k] the minimum degree (k-core) of a node in the resulting subgraph components
 * @return a list that contains the nodes of the k-core (list may be empty)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-kCore(Graph,number)">Online Documentation</a>
 */
 final   fun Graph.kCore( k: Int ):NodeList
/**
 * Makes the given graph biconnected by inserting a minimum number of edges in the graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * @receiver the input graph
 * @return an [EdgeList] containing the edges added to the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-makeBiconnected">Online Documentation</a>
 */
 final   fun Graph.makeBiconnected():EdgeList
/**
 * Makes a graph connected by adding additional edges to the graph.
 * @receiver the input graph
 * @return an [EdgeList] containing the edges added to the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-makeConnected">Online Documentation</a>
 */
 final   fun Graph.makeConnected():EdgeList
/**
 * Determines the set of nodes that are reachable from a given node when a set of edges that cannot be traversed is specified.
 * ### Preconditions
 * - `forbiddenEdges.length = graph.E()`
 * @receiver the given graph
 * @param [start] the node from which the search starts
 * @param [directed] `true` if the edges should be traversed from source to target, `false` if edges can be traversed in both directions
 * @param [reached] an array that will be filled during the execution and returns for each [Node] a [Boolean] value based on whether the node can be reached during the DFS; if a node `v` is reachable, then `reached[v.index()] = true`
 * @param [forbidden] an array that holds for each [Edge] a [Boolean] value indicating whether or not an edge can be traversed; an edge `e` is marked as forbidden if `forbidden[e.index()] == true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-reachable">Online Documentation</a>
 */
 final   fun Graph.reachable( start: Node ,
 directed: Boolean ,
 reached: ReadonlyArray<Boolean> ,
 forbidden: ReadonlyArray<Boolean>  = definedExternally)
/**
 * Calculates the strongly connected components of a given graph.
 * @receiver the input graph
 * @return an array of [NodeList]s each of which contains the nodes that belong to the same strongly connected component
 * @see [stronglyConnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-stronglyConnectedComponents(Graph)">Online Documentation</a>
 */
 final   fun Graph.stronglyConnectedComponents():ReadonlyArray<NodeList>
/**
 * Calculates the strongly connected components of a given graph and returns their number.
 * @receiver the input graph
 * @param [compNum] the [INodeMap] that will be filled during the execution and returns the zero-based index of the connected component to which each node belongs
 * @return the number of strongly connected components of the given graph
 * @see [stronglyConnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-stronglyConnectedComponents(Graph,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.stronglyConnectedComponents( compNum: INodeMap<Int> ):Int
/**
 * Transforms the return values of [biconnectedComponents] to an array of [EdgeList]s, like it is returned by [biconnectedComponents].
 * @receiver the input graph
 * @param [compNum] the [IEdgeMap] that will be filled during the execution and returns the zero-based index of the connected component to which each edge belongs
 * @param [maxCompNum] the maximum number of biconnected components
 * @return an array of [EdgeList]s each containing all edges that belong to the same biconnected component
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-toEdgeListArray">Online Documentation</a>
 */
 final   fun Graph.toEdgeListArray( compNum: IEdgeMap<Int> ,
 maxCompNum: Int ):ReadonlyArray<EdgeList>
/**
 * Transforms the return values of method [connectedComponents] to an array of [NodeList]s, like it is returned by [connectedComponents].
 * @receiver the input graph
 * @param [compNum] the [INodeMap] that will be filled during the execution and returns the zero-based index of the connected component to which each node belongs
 * @param [maxCompNum] the maximum number of connected components
 * @return an array of [NodeList]s each of which contains the nodes that belong to the same connected component
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphConnectivity%23GraphConnectivity-method-toNodeListArray">Online Documentation</a>
 */
 final   fun Graph.toNodeListArray( compNum: INodeMap<Int> ,
 maxCompNum: Int ):ReadonlyArray<NodeList>
}
