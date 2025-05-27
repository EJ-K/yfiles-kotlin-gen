// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.INodeType
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo

/**
 * Specifies custom data for the [CompactDiskLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23CompactDiskLayoutData-constructor-CompactDiskLayoutData">Online Documentation</a>
 */
external open class CompactDiskLayoutData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of child nodes such that those with same type are preferably placed next to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>

companion object : ClassMetadata<CompactDiskLayoutData> {
}
}

inline fun CompactDiskLayoutData(
    block: CompactDiskLayoutData.() -> Unit
): CompactDiskLayoutData {
    return CompactDiskLayoutData()
        .apply(block)
}
