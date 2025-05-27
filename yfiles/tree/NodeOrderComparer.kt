// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * The [NodeOrderComparer] compares edges according to a specified order.
 * @see [ClassicTreeLayout.comparer]
 * @see [TreeLayout.defaultOutEdgeComparer]
 * @see [TreeLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see [BalloonLayout.comparer]
 * @see [AspectRatioTreeLayout.comparer]
 * @see [NODE_ORDER_COMPARABLE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderComparer">Online Documentation</a>
 * 
 * @constructor Creates a new [NodeOrderComparer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderComparer%23NodeOrderComparer-constructor-NodeOrderComparer">Online Documentation</a>
 */
external open class NodeOrderComparer  () : IComparer<Node> {

/**
 * Compares two edges according to their index in the order specified using a [IDataProvider][yfiles.algorithms.IDataProvider].
 * @param [x] the first edge
 * @param [y] the second edge
 * @see [NODE_ORDER_COMPARABLE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderComparer%23NodeOrderComparer-method-compare">Online Documentation</a>
 */
 override   fun compare( x: Node ,
 y: Node ):Int

companion object : ClassMetadata<NodeOrderComparer> {
/**
 * A data provider key for registering an order for each node in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeOrderComparer%23NODE_ORDER_COMPARABLE_DP_KEY">Online Documentation</a>
 */
 val NODE_ORDER_COMPARABLE_DP_KEY: NodeDpKey<IComparable<*>>
}
}
