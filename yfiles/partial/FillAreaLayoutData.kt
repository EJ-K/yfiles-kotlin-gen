// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.algorithms.AbortHandler
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData

/**
 * Specifies custom data for the [FillAreaLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FillAreaLayoutData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23FillAreaLayoutData-constructor-FillAreaLayoutData">Online Documentation</a>
 */
external open class FillAreaLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping from nodes to an object defining their component id.
 * @see [FillAreaLayout.COMPONENT_ID_DP_KEY]
 * @see [ComponentAssignmentStrategy.CUSTOMIZED]
 * @see [FillAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23componentIds">Online Documentation</a>
 */
final var componentIds: ItemMapping<INode, Id>
/**
 * Gets or sets the collection of nodes that are fixed and must not be moved.
 * @see [FillAreaLayout.FIXED_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23fixedNodes">Online Documentation</a>
 */
final var fixedNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the [partition grid][yfiles.layout.PartitionGrid] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData

companion object : ClassMetadata<FillAreaLayoutData> {
}
}

inline fun FillAreaLayoutData(
    block: FillAreaLayoutData.() -> Unit
): FillAreaLayoutData {
    return FillAreaLayoutData()
        .apply(block)
}
