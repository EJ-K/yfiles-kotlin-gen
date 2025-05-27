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
 * This class provides (minimum) spanning tree algorithms for graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm">Online Documentation</a>
 */
@JsName("SpanningTreeAlgorithm")
external object SpanningTrees {
/**
 * Returns the overall cost of a previously calculated minimum spanning tree.
 * @param [treeEdges] the given [list][EdgeList] of edges that form a minimum spanning tree
 * @param [edgeCost] the [IDataProvider] that returns a double value (cost) for each tree edge
 * @return the overall cost of the tree edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm%23SpanningTrees-method-cost">Online Documentation</a>
 */
 final   fun cost( treeEdges: EdgeList ,
 edgeCost: IDataProvider<Edge, Double> ):Double
/**
 * Calculates a minimum spanning tree for the given graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * - `cost.length == graph.E()`
 * @receiver the input graph
 * @param [cost] the [IDataProvider] that returns a double value (cost) for each edge
 * @return a [list][EdgeList] containing the edges that form the minimum spanning tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm%23SpanningTrees-method-kruskal">Online Documentation</a>
 */
 final   fun Graph.kruskal( cost: IDataProvider<Edge, Double> ):EdgeList
/**
 * Calculates a minimum spanning tree for the given graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * - `cost.length == graph.E()`
 * @receiver the input graph
 * @param [cost] the [IDataProvider] that returns a double value (cost) for each edge
 * @return a [list][EdgeList] containing the edges that form the minimum spanning tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm%23SpanningTrees-method-minimum">Online Documentation</a>
 */
 final   fun Graph.minimum( cost: IDataProvider<Edge, Double> ):EdgeList
/**
 * Calculates a minimum spanning tree for the given graph.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * - `cost.length == graph.E()`
 * @receiver the input graph
 * @param [cost] the [IDataProvider] that returns a double value (cost) for each edge
 * @return a [list][EdgeList] containing the edges that form the minimum spanning tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm%23SpanningTrees-method-prim">Online Documentation</a>
 */
 final   fun Graph.prim( cost: IDataProvider<Edge, Double> ):EdgeList
/**
 * Calculates a spanning tree for the given graph in which each edge has a uniform cost of `1.0`.
 * ### Preconditions
 * - The graph must be [connected][GraphChecker.isConnected].
 * @receiver the input graph
 * @return a [list][EdgeList] containing the edges that form the minimum spanning tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeAlgorithm%23SpanningTrees-method-uniform">Online Documentation</a>
 */
 final   fun Graph.uniform():EdgeList
}
