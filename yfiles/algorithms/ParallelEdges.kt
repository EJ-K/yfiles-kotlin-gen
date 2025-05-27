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
 * This class provides methods for finding the *parallel edges* in a graph, also called *multiple edges* or *multi-edges*.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgesAlgorithm">Online Documentation</a>
 */
@JsName("ParallelEdgesAlgorithm")
external object ParallelEdges {
/**
 * Finds and returns the parallel edges in the given graph, or, optionally, incident to the given node.
 * @receiver the input graph
 * @param [directed] `true`, if parallel edges need to have same source and same target, `false`, if it suffices that parallel edges are incident to the same two nodes
 * @param [node] the node to which the parallel edges must be incident to or `null` if all parallel edges in the graph should be returned
 * @return the array of all parallel edges incident to the given node or contained in the given graph, where each list represents a set of parallel edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgesAlgorithm%23ParallelEdges-method-findParallelEdges">Online Documentation</a>
 */
 final   fun Graph.findParallelEdges( directed: Boolean ,
 node: Node?  = definedExternally):ReadonlyArray<EdgeList>
}
