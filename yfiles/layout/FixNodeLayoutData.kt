// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [FixNodeLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FixNodeLayoutData] which helps configuring [FixNodeLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutData%23FixNodeLayoutData-constructor-FixNodeLayoutData">Online Documentation</a>
 */
external open class FixNodeLayoutData  () : LayoutData {

/**
 * Gets or sets the collection of nodes which should remain fixed.
 * @see [FixNodeLayoutStage.FIXED_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutData%23fixedNodes">Online Documentation</a>
 */
final var fixedNodes: ItemCollection<INode>

companion object : ClassMetadata<FixNodeLayoutData> {
}
}

inline fun FixNodeLayoutData(
    block: FixNodeLayoutData.() -> Unit
): FixNodeLayoutData {
    return FixNodeLayoutData()
        .apply(block)
}
