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
 * Specifies custom data for the [TemporaryGroupNodeInsertionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TemporaryGroupNodeInsertionData] which helps configuring [TemporaryGroupNodeInsertionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionData%23TemporaryGroupNodeInsertionData-constructor-TemporaryGroupNodeInsertionData">Online Documentation</a>
 */
external open class TemporaryGroupNodeInsertionData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes to a [TemporaryGroupDescriptor] so that nodes with the same descriptor will be assigned to the same temporarily inserted group node.
 * @see [TemporaryGroupNodeInsertionStage.TEMPORARY_GROUP_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionData%23temporaryGroups">Online Documentation</a>
 */
final var temporaryGroups: ItemCollectionMapping<INode, TemporaryGroupDescriptor>

companion object : ClassMetadata<TemporaryGroupNodeInsertionData> {
}
}

inline fun TemporaryGroupNodeInsertionData(
    block: TemporaryGroupNodeInsertionData.() -> Unit
): TemporaryGroupNodeInsertionData {
    return TemporaryGroupNodeInsertionData()
        .apply(block)
}
