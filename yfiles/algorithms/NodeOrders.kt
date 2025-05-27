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
 * This class provides algorithms that order the nodes of a graph using specific criteria.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm">Online Documentation</a>
 */
@JsName("NodeOrderAlgorithm")
external object NodeOrders {
/**
 * Calculates an ordering of the nodes identical to the order of node completion events in a depth first search.
 * @receiver the input graph
 * @return a [NodeList] containing the nodes of the graph in the order identical to the order of node completion events in a depth first search
 * @see [topological]
 * @see [dfsCompletion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-dfsCompletion(Graph)">Online Documentation</a>
 */
 final   fun Graph.dfsCompletion():NodeList
/**
 * Calculates an ordering of the nodes identical to the order of node completion events in a depth first search.
 * @receiver the input graph
 * @param [order] an array of [Number]s that returns for each [Node] `v`, its zero-based index within the calculated ordering, i.e., `order[v.index()] == 5` means that `v` is the `6`-th node within the ordering
 * @see [topological]
 * @see [dfsCompletion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-dfsCompletion(Graph,number[])">Online Documentation</a>
 */
 final   fun Graph.dfsCompletion( order: ReadonlyArray<Int> )
/**
 * Assigns an `st`-ordering to the nodes of a biconnected graph.
 * ### Preconditions
 * - The graph must be [biconnected][GraphChecker.isBiconnected].
 * @receiver the input graph
 * @return a [NodeList] containing the nodes of the graph in the order defined by the `st`-ordering
 * @see [st]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-st(Graph)">Online Documentation</a>
 */
 final   fun Graph.st():NodeList
/**
 * Assigns an `st`-ordering to the nodes of a biconnected graph given the edge between source node `s` and sink node `t`.
 * ### Preconditions
 * - `stOrder.length == graph.N()`
 * - The graph must be [biconnected][GraphChecker.isBiconnected].
 * @receiver the input graph
 * @param [stOrder] an array of [Number]s that will be filled during the execution and returns for each [Node] `v`, its zero-based index within the calculated ordering, i.e., `stOrder[v.index()] == 5` means that `v` is the `6`-th node within the ordering
 * @param [stEdge] an [Edge] that connects source node `s` and sink node `t`
 * @see [st]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-st(Graph,number[],Edge)">Online Documentation</a>
 */
 final   fun Graph.st( stOrder: ReadonlyArray<Int> ,
 stEdge: Edge  = definedExternally)
/**
 * Converts an array-based result returned by a method of this class to a [NodeList] that contains all nodes in the order provided by the given array.
 * @receiver the input graph
 * @param [order] an array of [Number]s that will be filled during the execution and returns for each [Node] `v`, its zero-based index within the calculated ordering, i.e., `order[v.index()] == 5` means that `v` is the `6`-th node within the ordering
 * @return a [NodeList] containing the nodes of the graph in the order provided by the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-toNodeList">Online Documentation</a>
 */
 final   fun Graph.toNodeList( order: ReadonlyArray<Int> ):NodeList
/**
 * Copies a [NodeList]-based result returned by a method of this class to a [INodeMap] that will provide values of basic type `int`.
 * @param [order] a [NodeList] containing the nodes of the graph in the appropriate order
 * @param [result] the [INodeMap] that will be filled during the execution with the zero-based index of each node within the calculated ordering
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-toNodeMap(NodeList,INodeMap)">Online Documentation</a>
 */
 final   fun toNodeMap( order: NodeList ,
 result: INodeMap<Int> )
/**
 * Copies an array-based result returned by a method of this class to a [INodeMap] that will provide values of basic type `int`.
 * @receiver the input graph
 * @param [order] an array of [Number]s that returns for each [Node] `v`, its zero-based index within the calculated ordering, i.e., `order[v.index()] == 5` means that `v` is the `6`-th node within the ordering
 * @param [result] the [INodeMap] that will be filled during the execution with the zero-based index of each node within the calculated ordering
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-toNodeMap(Graph,number[],INodeMap)">Online Documentation</a>
 */
 final   fun Graph.toNodeMap( order: ReadonlyArray<Int> ,
 result: INodeMap<Int> )
/**
 * Returns a topological ordering of the nodes of a directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * @receiver the input graph
 * @return a [NodeList] containing the nodes of the graph in the order they appear in the topological ordering
 * @throws ArgumentError if the graph is cyclic
 * @see [topological]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-topological(Graph)">Online Documentation</a>
 */
 final   fun Graph.topological():NodeList
/**
 * Assigns a topological ordering to the nodes of a directed acyclic graph.
 * ### Preconditions
 * - `order.length == graph.N()`
 * @receiver the input graph
 * @param [order] an array of [Number]s that will be filled during the execution and returns for each [Node] `v`, its zero-based index within the calculated ordering, i.e., `order[v.index()] == 5` means that `v` is the `6`-th node within the ordering
 * @return `true` if the graph is acyclic, `false` otherwise
 * @see [topological]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderAlgorithm%23NodeOrders-method-topological(Graph,number[])">Online Documentation</a>
 */
 final   fun Graph.topological( order: ReadonlyArray<Int> ):Boolean
}
