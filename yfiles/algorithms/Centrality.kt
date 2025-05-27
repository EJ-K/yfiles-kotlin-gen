// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

/**
 * This class provides methods to determine various centrality indices of nodes or edges of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm">Online Documentation</a>
 */
@JsName("CentralityAlgorithm")
external object Centrality {
/**
 * Computes the closeness centrality for the nodes of a graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * @receiver the input graph
 * @param [closeness] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCosts] the [IDataProvider] that returns a positive double value (cost) or `null` if the edges are of equal cost
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-closenessCentrality">Online Documentation</a>
 */
 final   fun Graph.closenessCentrality( closeness: INodeMap<Double> ,
 directed: Boolean ,
 edgeCosts: IDataProvider<Edge, Double>? )
/**
 * Computes the degree centrality for the nodes of a given graph.
 * ### Preconditions
 * - At least one of the flags `considerInEdges` and `considerOutEdges` must be `true`.
 * @receiver the input graph
 * @param [centrality] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [considerInEdges] `true` if the incoming edges should be considered, `false` otherwise
 * @param [considerOutEdges] `true` if the outgoing edges should be considered, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-degreeCentrality">Online Documentation</a>
 */
 final   fun Graph.degreeCentrality( centrality: INodeMap<Double> ,
 considerInEdges: Boolean ,
 considerOutEdges: Boolean )
/**
 * Computes betweenness centrality for each edge of a given graph.
 * @receiver the input graph
 * @param [centrality] the [IEdgeMap] that will be filled during the execution and returns a double value (centrality) for each edge
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCosts] the [IDataProvider] that returns a positive double value (cost) or `null` if the edges are of equal cost; for invalid input values the algorithm uses cost `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-edgeBetweenness">Online Documentation</a>
 */
 final   fun Graph.edgeBetweenness( centrality: IEdgeMap<Double> ,
 directed: Boolean ,
 edgeCosts: IDataProvider<Edge, Double>? )
/**
 * Computes an eigenvector centrality for each node of a given undirected graph.
 * @receiver the undirected input graph
 * @param [centralityMap] a node map that can store values of type `double`. It is used for returning the resulting centrality values (in the interval `[0,1]`) for each node
 * @param [precision] specifies the precision used during the calculation of the power iteration method (i.e. the maximum possible difference to consider two values as equal)
 * @return whether or not an eigenvector could be found and `centralityMap` contains valid entries
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-eigenvectorCentrality">Online Documentation</a>
 */
 final   fun Graph.eigenvectorCentrality( centralityMap: INodeMap<Double> ,
 precision: Double  = definedExternally):Boolean
/**
 * Computes the graph centrality for the nodes of a graph.
 * ### Preconditions
 * - A [INodeMap] must be given as input that returns for each [Node] a zero value that represents the initial closeness centrality.
 * @receiver the input graph
 * @param [centrality] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCosts] the [IDataProvider] that returns a positive double value (cost) or `null` if the edges are of equal cost
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-graphCentrality">Online Documentation</a>
 */
 final   fun Graph.graphCentrality( centrality: INodeMap<Double> ,
 directed: Boolean ,
 edgeCosts: IDataProvider<Edge, Double>? )
/**
 * Computes betweenness centrality for each node of a given graph.
 * @receiver the input graph
 * @param [centrality] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCosts] the [IDataProvider] that returns a positive double value (cost) or `null` if the edges are of equal cost; for invalid input values the algorithm uses cost `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-nodeBetweenness">Online Documentation</a>
 */
 final   fun Graph.nodeBetweenness( centrality: INodeMap<Double> ,
 directed: Boolean ,
 edgeCosts: IDataProvider<Edge, Double>? )
/**
 * Computes betweenness centrality for each node and edge of a given graph.
 * @receiver the input graph
 * @param [nodeCentrality] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [edgeCentrality] the [IEdgeMap] that will be filled during the execution and returns a double value (centrality) for each edge
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCosts] the [IDataProvider] that returns a positive double value (cost) or `null` if the edges are of equal cost; for invalid input values the algorithm uses cost `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-nodeEdgeBetweenness">Online Documentation</a>
 */
 final   fun Graph.nodeEdgeBetweenness( nodeCentrality: INodeMap<Double> ,
 edgeCentrality: IEdgeMap<Double> ,
 directed: Boolean ,
 edgeCosts: IDataProvider<Edge, Double>? )
/**
 * Normalizes the `double` values of a given [IEdgeMap] by dividing each of them by the maximum of all values (maximum norm).
 * ### Preconditions
 * - For each edge `e`: `map.getDouble(e) >= 0`
 * @receiver the input graph
 * @param [map] the [IEdgeMap] that will be filled during the execution and returns a double value from `[0,1]` interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-normalizeEdgeMap">Online Documentation</a>
 */
 final   fun Graph.normalizeEdgeMap( map: IEdgeMap<Double> )
/**
 * Normalizes the `double` values of a given [INodeMap] by dividing each of them by the maximum of all values (maximum norm).
 * ### Preconditions
 * - For each node `n`: `map.getDouble(n) >= 0`
 * @receiver the input graph
 * @param [map] the [INodeMap] that will be filled during the execution and returns a double value from `[0,1]` interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-normalizeNodeMap">Online Documentation</a>
 */
 final   fun Graph.normalizeNodeMap( map: INodeMap<Double> )
/**
 * Computes page rank values for all nodes based on their attached edges.
 * @receiver the graph to calculate the ranks for
 * @param [pageRank] the [INodeMap] that will be filled during the execution with the rank value for each node
 * @param [initialPageRank] The [IDataProvider] that specifies the initial page rank for each node
 * @param [nodeWeight] the [IDataProvider] that specifies the weight for each node
 * @param [edgeWeight] the [IDataProvider] that specifies the weight for each edge
 * @param [edgeDirectedness] [IDataProvider] that stores the directedness of the edges
 * @param [dampingFactor] a value between `0` and `1` denoting the factor of a node's rank that shall be distributed to its successors (a good default value is `0.85`)
 * @param [precision] the non-negative precision of the calculated page ranks (a good default value is `0.001`)
 * @return the sum of all node ranks
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-pageRank">Online Documentation</a>
 */
 final   fun Graph.pageRank( pageRank: INodeMap<Double> ,
 initialPageRank: IDataProvider<Node, Double>  = definedExternally,
 nodeWeight: IDataProvider<Node, Double>  = definedExternally,
 edgeWeight: IDataProvider<Edge, Double>  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>  = definedExternally,
 dampingFactor: Double  = definedExternally,
 precision: Double  = definedExternally):Double
/**
 * Computes the weight centrality for the nodes of a graph.
 * @receiver the input graph
 * @param [centrality] the [INodeMap] that will be filled during the execution and returns a double value (centrality) for each node
 * @param [considerInEdges] `true` if the incoming edges should be considered, `false` otherwise
 * @param [considerOutEdges] `true` if the outgoing edges should be considered, `false` otherwise
 * @param [edgeWeights] the [IDataProvider] that returns a positive double value (weight) or `null` if the edges are considered to have uniform weight of `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CentralityAlgorithm%23Centrality-method-weightCentrality">Online Documentation</a>
 */
 final   fun Graph.weightCentrality( centrality: INodeMap<Double> ,
 considerInEdges: Boolean ,
 considerOutEdges: Boolean ,
 edgeWeights: IDataProvider<Edge, Double>? )
}
