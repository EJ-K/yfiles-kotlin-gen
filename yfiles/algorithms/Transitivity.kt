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
 * This class provides algorithms to compute reachability information for directed, acyclic graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitivityAlgorithm">Online Documentation</a>
 */
@JsName("TransitivityAlgorithm")
external object Transitivity {
/**
 * Calculates the transitive closure for a directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * @receiver the input graph to which this method will add transitive edges, if necessary
 * @param [addedEdges] a [list][EdgeList] that will be filled during the execution and contains the edges that have been added to the graph by this method
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitivityAlgorithm%23Transitivity-method-transitiveClosure">Online Documentation</a>
 */
 final   fun Graph.transitiveClosure( addedEdges: EdgeList  = definedExternally)
/**
 * Creates the transitive edges that connect the `visible` nodes in the specified graph.
 * @receiver the original graph that contains both the visible and invisible nodes
 * @param [visibleNode] specifies which nodes should be considered as `visible`
 * @param [directed] whether or not the edges should be considered as directed
 * @return the [EdgeList] of created transitive edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitivityAlgorithm%23Transitivity-method-transitiveEdges">Online Documentation</a>
 */
 final   fun Graph.transitiveEdges( visibleNode: IDataProvider<Node, Boolean> ,
 directed: Boolean ):EdgeList
/**
 * Calculates the transitive reduction for a directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphChecker.isAcyclic].
 * @receiver the input graph
 * @param [transitiveEdges] a [list][EdgeList] that will be filled during the execution and contains all transitive edges of the given graph; removal of these edges will yield the transitive reduction of the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitivityAlgorithm%23Transitivity-method-transitiveReduction">Online Documentation</a>
 */
 final   fun Graph.transitiveReduction( transitiveEdges: EdgeList  = definedExternally)
}
