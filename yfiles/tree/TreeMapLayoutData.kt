// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.AbortHandler
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [TreeMapLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TreeMapLayoutData] which helps configuring [TreeMapLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23TreeMapLayoutData-constructor-TreeMapLayoutData">Online Documentation</a>
 */
external open class TreeMapLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping from nodes to the weight value used for the tree map layout.
 * @see [TreeMapLayout.NODE_WEIGHT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23nodeWeights">Online Documentation</a>
 */
final var nodeWeights: ItemMapping<INode, Double>

companion object : ClassMetadata<TreeMapLayoutData> {
}
}

inline fun TreeMapLayoutData(
    block: TreeMapLayoutData.() -> Unit
): TreeMapLayoutData {
    return TreeMapLayoutData()
        .apply(block)
}
