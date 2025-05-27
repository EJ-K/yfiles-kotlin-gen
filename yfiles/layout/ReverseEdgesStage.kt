// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.IDataAcceptor
import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata

/**
 * [ReverseEdgesStage] selectively reverses edges in a graph, while keeping the layout and label positions of the reversed edges as close to the pre-reversal layout and positions as possible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage">Online Documentation</a>
 * 
 * @constructor Creates a new [ReverseEdgesStage] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayouter] The core layout algorithm.
 * @see [LayoutStageBase.coreLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-constructor-ReverseEdgesStage">Online Documentation</a>
 */
external open class ReverseEdgesStage  ( coreLayouter: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Reverses all *selected* edges before calling the [core layout algorithm][LayoutStageBase.coreLayout] and restores the original edge direction after the core layout algorithm has finished.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Reverses the specified edge in the specified graph.
 * @param [graph] the graph to which the specified edge belongs
 * @param [edge] the edge to be reversed
 * @see [LayoutGraphUtilities.reverseEdgeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-method-reverseEdge">Online Documentation</a>
 */
 open   fun reverseEdge( graph: LayoutGraph ,
 edge: Edge )
/**
 * Reverses *selected* edges in the specified graph.
 * @param [graph] the graph in which to reverse edges.
 * @see [AFFECTED_EDGES_DP_KEY]
 * @see [reverseEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-method-reverseEdges">Online Documentation</a>
 */
 open   fun reverseEdges( graph: LayoutGraph )

companion object : ClassMetadata<ReverseEdgesStage> {
/**
 * A data provider key for selecting edges for reversal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * Marks edges in a tree-structured graph component that need to be reversed to make the specified node the root of the tree component.
 * @receiver the graph to which the specified node belongs
 * @param [root] the node to be considered the root of its tree component
 * @param [reversedEdges] a [IDataAcceptor] to mark edges for reversal
 * @throws ArgumentError if the specified root node is `null` or does not belong to the specified graph
 * @see [AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-method-findReversedTreeEdges">Online Documentation</a>
 */
 final   fun LayoutGraph.findReversedTreeEdges( root: Node ,
 reversedEdges: IDataAcceptor<Edge, Boolean> )
}
}

inline fun ReverseEdgesStage(
    block: ReverseEdgesStage.() -> Unit
): ReverseEdgesStage {
    return ReverseEdgesStage()
        .apply(block)
}
