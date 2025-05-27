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
 * This class is responsible for finding cycles within a graph that have certain properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleAlgorithm">Online Documentation</a>
 */
@JsName("CycleAlgorithm")
external object Cycles {
/**
 * Returns an [EdgeList] that contains all the edges that are part of at least one directed or undirected simple cycle.
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered directed, `false` otherwise
 * @return an [EdgeList] that contains all the edges that are part of at least one directed or undirected simple cycle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleAlgorithm%23Cycles-method-findAllCycleEdges">Online Documentation</a>
 */
 final   fun Graph.findAllCycleEdges( directed: Boolean ):EdgeList
/**
 * Returns an [EdgeList] that contains the edges of a cycle found in the given graph.
 * @receiver the given graph
 * @param [directed] `true` if the graph should be considered directed, `false` otherwise
 * @return an [EdgeList] containing the edges of a cycle or an empty [EdgeList] if the graph is acyclic
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleAlgorithm%23Cycles-method-findCycle">Online Documentation</a>
 */
 final   fun Graph.findCycle( directed: Boolean ):EdgeList
/**
 * Marks the edges of a given graph whose removal or reversal would make the graph acyclic while trying to minimize the cost associated with the marked edges.
 * @receiver the given graph
 * @param [cycleEdges] the [IEdgeMap] that will be filled during the execution and returns whether an edge is a detected cycle edge
 * @param [costDP] the [IDataProvider] that holds the non-negative [Number] reversal cost for each edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleAlgorithm%23Cycles-method-findCycleEdges">Online Documentation</a>
 */
 final   fun Graph.findCycleEdges( cycleEdges: IEdgeMap<Boolean> ,
 costDP: IDataProvider<Edge, Double>  = definedExternally)
/**
 * Marks the edges of a given graph whose removal or reversal would make the graph acyclic based on a depth first search.
 * @receiver the given graph
 * @param [cycleEdges] the [IEdgeMap] that will be filled during the execution and returns a boolean value indicating whether or not an edge is a detected cycle edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleAlgorithm%23Cycles-method-findCycleEdgesDFS">Online Documentation</a>
 */
 final   fun Graph.findCycleEdgesDFS( cycleEdges: IEdgeMap<Boolean> )
}
