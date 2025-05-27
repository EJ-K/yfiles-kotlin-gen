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
 * This class provides algorithms for solving the rank assignment problem.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentAlgorithm">Online Documentation</a>
 */
@JsName("RankAssignmentAlgorithm")
external object RankAssignments {
/**
 * This method quickly calculates a tight tree given a maximum time duration for the algorithm.
 * @receiver the input graph in which all the edges have directions, such that `rank[source] < rank[target]` and `rank[target] - rank[source] >= minlength[edge]`
 * @param [rank] the [INodeMap] that will be filled during the execution and returns the integer ranking of each node
 * @param [minLength] the [IEdgeMap] that returns an integer value (minimum/tight length) of each edge
 * @param [maximalDuration] a preferred time limit for the algorithm (in milliseconds)
 * @see [simple]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentAlgorithm%23RankAssignments-method-simple(Graph,INodeMap,IEdgeMap,number)">Online Documentation</a>
 */
 final   fun Graph.simple( rank: INodeMap<Int> ,
 minLength: IEdgeMap<Int> ,
 maximalDuration: Double  = definedExternally):Int
/**
 * Like [simple], but arrays are used instead of [INodeMap]s and [IEdgeMap]s.
 * @receiver the input graph in which all the edges have directions, such that `rank[source] < rank[target]` and `rank[target] - rank[source] >= minlength[edge]`
 * @param [rank] an array that will be filled with the ranking `r` of each node `v` such that `rank[v.index] == r`
 * @param [minLength] an array holding a non-negative value `len` of each edge `e` such that `minLength[e.index] == len`
 * @param [maximalDuration] a preferred time limit for the algorithm (in milliseconds)
 * @return the number of layers
 * @see [simple]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentAlgorithm%23RankAssignments-method-simple(Graph,number[],number[],number)">Online Documentation</a>
 */
 final   fun Graph.simple( rank: ReadonlyArray<Double> ,
 minLength: ReadonlyArray<Double> ,
 maximalDuration: Double  = definedExternally):Int
/**
 * Solves the rank assignment problem using the simplex method given a maximum time duration for the algorithm.
 * ### Preconditions
 * - The graph must be acyclic.
 * @receiver the given graph
 * @param [layer] the [INodeMap] that will be filled during the execution and returns the zero-based ranking index for each node
 * @param [w] the [IDataProvider] that returns an integer value (weight) of each edge
 * @param [minLength] the [IDataProvider] that returns an integer value (minimum length) of each edge
 * @param [maximalDuration] a preferred time limit for the algorithm (in milliseconds)
 * @return the number of layers
 * @see [simplex]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentAlgorithm%23RankAssignments-method-simplex(Graph,INodeMap,IDataProvider,IDataProvider,number)">Online Documentation</a>
 */
 final   fun Graph.simplex( layer: INodeMap<Int> ,
 w: IDataProvider<Edge, Int> ,
 minLength: IDataProvider<Edge, Int> ,
 maximalDuration: Double  = definedExternally):Int
/**
 * Similar to [simplex] but, additionally, it is possible to provide a valid initial tree solution for the problem.
 * @receiver the given graph
 * @param [layer] the [INodeMap] that will be filled during the execution and returns the zero-based ranking index for each node
 * @param [w] the [IDataProvider] that returns an integer value (weight) of each edge
 * @param [minLength] the [IDataProvider] that returns an integer value (minimum length) of each edge
 * @param [tree] the [IEdgeMap] that returns a boolean value indicating whether or not an edge is a tree edge
 * @param [root] the given root node of the tree solution
 * @param [validRanking] `true` if the argument `layer` contains a valid ranking, `false` otherwise
 * @param [maximalDuration] a preferred time limit for the algorithm (in milliseconds)
 * @return the number of layers
 * @see [simplex]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentAlgorithm%23RankAssignments-method-simplex(Graph,INodeMap,IDataProvider,IDataProvider,IEdgeMap,Node,boolean,number)">Online Documentation</a>
 */
 final   fun Graph.simplex( layer: INodeMap<Int> ,
 w: IDataProvider<Edge, Int> ,
 minLength: IDataProvider<Edge, Int> ,
 tree: IEdgeMap<Boolean> ,
 root: Node ,
 validRanking: Boolean ,
 maximalDuration: Double  = definedExternally):Int
}
