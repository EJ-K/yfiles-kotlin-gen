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
import yfiles.algorithms.Graph
import yfiles.algorithms.IDataMap
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * [NormalizeGraphElementOrderStage] normalizes the order of the elements within a graph to ensure the same order for multiple layout invocations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage">Online Documentation</a>
 * 
 * @constructor Creates a new [NormalizeGraphElementOrderStage] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayouter] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage%23NormalizeGraphElementOrderStage-constructor-NormalizeGraphElementOrderStage">Online Documentation</a>
 */
external open class NormalizeGraphElementOrderStage  ( coreLayouter: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Enforces the specified [order of nodes][NODE_COMPARABLE_DP_KEY] and [order of edges][EDGE_COMPARABLE_DP_KEY] before invoking the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @throws InvalidOperationError if there is no [IDataProvider][yfiles.algorithms.IDataProvider] registered for one of the keys [NODE_COMPARABLE_DP_KEY] and [EDGE_COMPARABLE_DP_KEY]
 * @see [NODE_COMPARABLE_DP_KEY]
 * @see [EDGE_COMPARABLE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage%23NormalizeGraphElementOrderStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<NormalizeGraphElementOrderStage> {
/**
 * A data provider key for defining a (global) order for edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage%23EDGE_COMPARABLE_DP_KEY">Online Documentation</a>
 */
 val EDGE_COMPARABLE_DP_KEY: EdgeDpKey<IComparable<*>>
/**
 * A data provider key for defining a (global) order for nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage%23NODE_COMPARABLE_DP_KEY">Online Documentation</a>
 */
 val NODE_COMPARABLE_DP_KEY: NodeDpKey<IComparable<*>>
/**
 * Assigns comparable values for each node and edge.
 * @receiver the input graph
 * @param [comparableNodeMap] the map that will be filled with comparable values for the nodes
 * @param [comparableEdgeMap] the map that will be filled with comparable values for the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NormalizeGraphElementOrderStage%23NormalizeGraphElementOrderStage-method-fillComparableMapFromGraph">Online Documentation</a>
 */
 final   fun Graph.fillComparableMapFromGraph( comparableNodeMap: IDataMap<Node, IComparable<*>> ,
 comparableEdgeMap: IDataMap<Edge, IComparable<*>> )
}
}

inline fun NormalizeGraphElementOrderStage(
    block: NormalizeGraphElementOrderStage.() -> Unit
): NormalizeGraphElementOrderStage {
    return NormalizeGraphElementOrderStage()
        .apply(block)
}
