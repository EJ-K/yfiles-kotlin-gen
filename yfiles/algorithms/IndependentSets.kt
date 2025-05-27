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
 * This class provides methods for calculating independent sets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetAlgorithm">Online Documentation</a>
 */
@JsName("IndependentSetAlgorithm")
external object IndependentSets {
/**
 * Calculates an independent set for a given graph.
 * ### Preconditions
 * - The input graph is [simple][GraphChecker.isSimple] i.e., it contains neither parallel edges nor self-loops.
 * @receiver the input graph
 * @return a [NodeList] containing an independent set of nodes
 * @see [getIndependentSet]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetAlgorithm%23IndependentSets-method-getIndependentSet">Online Documentation</a>
 */
 final   fun Graph.getIndependentSet():NodeList
/**
 * Partitions the set of nodes of the given graph into independent sets.
 * ### Preconditions
 * - The input graph is [simple][GraphChecker.isSimple] i.e., it contains neither parallel edges nor self-loops.
 * @receiver the input graph
 * @return an array of [NodeList]s each of which contains an independent set of nodes
 * @see [getIndependentSet]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetAlgorithm%23IndependentSets-method-getIndependentSets">Online Documentation</a>
 */
 final   fun Graph.getIndependentSets():ReadonlyArray<NodeList>
}
