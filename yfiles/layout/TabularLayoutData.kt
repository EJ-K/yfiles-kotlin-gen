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
 * Specifies custom data for the [TabularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TabularLayoutData] which helps configuring [TabularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23TabularLayoutData-constructor-TabularLayoutData">Online Documentation</a>
 */
external open class TabularLayoutData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping of nodes to their [TabularNodeLayoutDescriptor] that defines custom node placement settings.
 * @see [TabularLayout.NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23nodeLayoutDescriptors">Online Documentation</a>
 */
final var nodeLayoutDescriptors: ItemMapping<INode, TabularNodeLayoutDescriptor>
/**
 * Gets or sets the partition grid layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData

companion object : ClassMetadata<TabularLayoutData> {
}
}

inline fun TabularLayoutData(
    block: TabularLayoutData.() -> Unit
): TabularLayoutData {
    return TabularLayoutData()
        .apply(block)
}
