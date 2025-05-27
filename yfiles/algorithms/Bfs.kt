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
 * This class provides services that center around breadth first search (BFS).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm">Online Documentation</a>
 */
@JsName("BfsAlgorithm")
external object Bfs {
/**
 * Returns the layers of nodes calculated by a breadth first search.
 * @receiver the given graph
 * @param [coreNodes] the list of core nodes from which the BFS starts
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,NodeList)">Online Documentation</a>
 */
 final   fun Graph.getLayers( coreNodes: NodeList ):ReadonlyArray<NodeList>
/**
 * Returns the layers of nodes constructed by a breadth first search.
 * ### Preconditions
 * - `isCoreNode.getBool(node)` defined for all nodes in graph
 * @receiver the given graph
 * @param [isCoreNode] the [IDataProvider] that contains the nodes from which the BFS starts; core nodes are marked with a `true` value
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,IDataProvider)">Online Documentation</a>
 */
 final   fun Graph.getLayers( isCoreNode: IDataProvider<Node, Boolean> ):ReadonlyArray<NodeList>
/**
 * Returns the layers of nodes constructed by a breadth first search.
 * ### Preconditions
 * - `isCoreNode.getBool(node)` defined for all nodes in graph
 * @receiver the given graph
 * @param [isCoreNode] the [IDataProvider] that contains the nodes from which the BFS starts; core nodes are marked with a `true` value
 * @param [layerIDMap] the [INodeMap] that will be filled during the BFS execution and holds the zero-based index of the BFS layer to which each node belongs or `-1` if the node is not reachable
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,IDataProvider,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.getLayers( isCoreNode: IDataProvider<Node, Boolean> ,
 layerIDMap: INodeMap<Int> ):ReadonlyArray<NodeList>
/**
 * Returns the layers of nodes constructed by a breadth first search.
 * ### Preconditions
 * - `isCoreNode.getBool(node)` defined for all nodes in graph
 * @receiver the given graph
 * @param [coreNodes] the list of core nodes from which the BFS starts
 * @param [layerIDMap] the [INodeMap] that will be filled during the BFS execution and holds the zero-based index of the BFS layer to which each node belongs or `-1` if the node is not reachable
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,NodeList,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.getLayers( coreNodes: NodeList ,
 layerIDMap: INodeMap<Int> ):ReadonlyArray<NodeList>
/**
 * Returns the layers of nodes constructed by a directed/undirected breadth first search where the maximum number of layers is restricted.
 * @receiver the given graph
 * @param [coreNodes] the list of core nodes from which the BFS starts
 * @param [directed] `true` if the graph should be considered directed, `false` otherwise
 * @param [layerIDMap] the [INodeMap] that will be filled during the BFS execution and holds the zero-based index of the BFS layer to which each node belongs or `-1` if the node is not reachable
 * @param [maxLayers] the number of layers that will be returned or `0` if all layers are required
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,NodeList,boolean,INodeMap,number)">Online Documentation</a>
 */
 final   fun Graph.getLayers( coreNodes: NodeList ,
 directed: Boolean ,
 layerIDMap: INodeMap<Int> ,
 maxLayers: Int  = definedExternally):ReadonlyArray<NodeList>
/**
 * Returns the layers of nodes constructed by a directed/undirected breadth first search where the maximum number of layers is restricted.
 * @receiver the given graph
 * @param [coreNodes] the list of core nodes
 * @param [direction] one of the predefined direction specifiers
 * @param [layerIDMap] the [INodeMap] that will be filled during the BFS execution and holds the zero-based index of the BFS layer to which each node belongs or `-1` if the node is not reachable
 * @param [maxLayerCount] the maximum number of layers that will be returned or `0` if all layers are required
 * @return an array of [NodeList]s each of which contains the nodes of a particular layer
 * @throws ArgumentError if the given direction is not supported
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BfsAlgorithm%23Bfs-method-getLayers(Graph,NodeList,BfsDirection,INodeMap,number)">Online Documentation</a>
 */
 final   fun Graph.getLayers( coreNodes: NodeList ,
 direction: BfsDirection ,
 layerIDMap: INodeMap<Int> ,
 maxLayerCount: Int  = definedExternally):ReadonlyArray<NodeList>
}
