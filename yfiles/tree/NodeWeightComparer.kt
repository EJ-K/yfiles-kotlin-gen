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
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * A [IComparer] that compares two nodes with respect to their weight value defined via the [IDataProvider][yfiles.algorithms.IDataProvider] registered with [TreeMapLayout.NODE_WEIGHT_DP_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeWeightComparer">Online Documentation</a>
 */
external open class NodeWeightComparer  : IComparer<Node> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeWeightComparer%23NodeWeightComparer-method-compare">Online Documentation</a>
 */
 override   fun compare( x: Node ,
 y: Node ):Int

companion object : ClassMetadata<NodeWeightComparer> {
}
}
