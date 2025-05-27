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
 * This class provides sophisticated algorithms for solving classical network flow problems.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm">Online Documentation</a>
 */
@JsName("NetworkFlowAlgorithm")
external object NetworkFlows {
/**
 * Solves a maximum flow problem using the preflow-push method.
 * @receiver the given network
 * @param [source] the source node of the network
 * @param [sink] the sink node of the network
 * @param [eCapDP] the [IEdgeMap] that returns the integer capacity for each edge. `0x7FFFFFFF` denotes infinite capacity for an edge
 * @param [flowEM] the [IEdgeMap] that will be filled during the execution with an integer flow for each edge
 * @return the maximum flow value
 * @see [calcMaxFlowMinCut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm%23NetworkFlows-method-calcMaxFlow">Online Documentation</a>
 */
 final   fun Graph.calcMaxFlow( source: Node ,
 sink: Node ,
 eCapDP: IDataProvider<Edge, Int> ,
 flowEM: IEdgeMap<Int> ):Int
/**
 * Solves a maximum flow problem using the preflow-push method but additionally marks all nodes that belong to the minimum cut set that is associated with the source of the network.
 * @receiver the given network
 * @param [source] the source node of the network
 * @param [sink] the sink node of the network
 * @param [eCapDP] the [IEdgeMap] that returns the integer capacity for each edge. `0x7FFFFFFF` denotes infinite capacity for an edge
 * @param [flowEM] the [IEdgeMap] that will be filled during the execution with an integer flow for each edge
 * @param [sourceCutNM] the [INodeMap] that will be filled during the execution and returns a boolean value indicating whether or not a node belongs to the cut set associated with the source of the network
 * @return the maximum flow value
 * @see [calcMaxFlow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm%23NetworkFlows-method-calcMaxFlowMinCut">Online Documentation</a>
 */
 final   fun Graph.calcMaxFlowMinCut( source: Node ,
 sink: Node ,
 eCapDP: IDataProvider<Edge, Int> ,
 flowEM: IEdgeMap<Int> ,
 sourceCutNM: INodeMap<Boolean> ):Int
/**
 * Uses method [minCostFlow] to solve a minimum cost flow problem.
 * @receiver the given network
 * @param [uCapDP] the [IDataProvider] that returns the integer capacity of each edge
 * @param [cost0DP] the [IDataProvider] that returns a double value (cost) for each edge
 * @param [supplyDP] the [IDataProvider] that returns the supply/demand of each node; supply is denoted by a positive value, demand by a negative value
 * @param [flowEM] the [IEdgeMap] that will be filled during the execution with an integer flow for each edge
 * @param [dualsNM] the [INodeMap] that will be filled during the execution with an integer value (dual value) for each node or `null` if no such values occur; dual values are also referred as potentials
 * @return the total cost of the flow
 * @see [minCostFlow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm%23NetworkFlows-method-minCostFlow(Graph,IDataProvider,IDataProvider,IDataProvider,IEdgeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.minCostFlow( uCapDP: IDataProvider<Edge, Int> ,
 cost0DP: IDataProvider<Edge, Double> ,
 supplyDP: IDataProvider<Node, Double> ,
 flowEM: IEdgeMap<Int> ,
 dualsNM: INodeMap<Int>? ):Int
/**
 * Solves a minimum cost flow problem with a capacity scaling algorithm.
 * @receiver the given network
 * @param [lCapDP] the [IDataProvider] that returns the integer lower bound for the capacity of each edge or `null` if no bound is specified
 * @param [uCapDP] the [IDataProvider] that returns the integer upper bound for the capacity of each edge
 * @param [cost0DP] the [IDataProvider] that returns a double value (cost) of each edge
 * @param [supplyDP] the [IDataProvider] that returns the supply/demand of each node; supply is denoted by a positive value, demand by a negative value
 * @param [flowEM] the [IEdgeMap] that will be filled during the execution with an integer flow for each edge
 * @param [dualsNM] the [INodeMap] that will be filled during the execution with an integer value (dual value) for each node or `null` if no such values occur; dual values are also referred as potentials
 * @return the total cost of the flow
 * @see [minCostFlow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm%23NetworkFlows-method-minCostFlow(Graph,IDataProvider,IDataProvider,IDataProvider,IDataProvider,IEdgeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.minCostFlow( lCapDP: IDataProvider<Edge, Int> ,
 uCapDP: IDataProvider<Edge, Int> ,
 cost0DP: IDataProvider<Edge, Double> ,
 supplyDP: IDataProvider<Node, Double> ,
 flowEM: IEdgeMap<Int> ,
 dualsNM: INodeMap<Int>? ):Int
/**
 * Solves a minimum cost maximum flow problem.
 * @receiver the given network
 * @param [s] the source node of the network
 * @param [t] the sink node of the network
 * @param [uCapDP] the [IDataProvider] that returns the integer capacity of each edge
 * @param [cost0DP] the [IDataProvider] that returns a double value (cost) for each edge
 * @param [flowEM] the [IEdgeMap] that will be filled during the execution with an integer flow for each edge
 * @param [dualsNM] the [INodeMap] that will be filled during the execution with an integer value (dual value) for each node or `null` if no such values occur; dual values are also referred as potentials
 * @return the total cost of the flow
 * @see [minCostFlow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NetworkFlowAlgorithm%23NetworkFlows-method-minCostFlow(Graph,Node,Node,IDataProvider,IDataProvider,IEdgeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.minCostFlow( s: Node ,
 t: Node ,
 uCapDP: IDataProvider<Edge, Int> ,
 cost0DP: IDataProvider<Edge, Double> ,
 flowEM: IEdgeMap<Int> ,
 dualsNM: INodeMap<Int>? ):Int
}
