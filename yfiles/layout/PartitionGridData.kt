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
 * Specifies a [PartitionGrid] for a layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartitionGridData] which helps configuring [PartitionGrid].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23PartitionGridData-constructor-PartitionGridData">Online Documentation</a>
 */
external open class PartitionGridData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes to [PartitionCellId] using the partition grid as context.
 * @see [rowIndices]
 * @see [columnIndices]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23cellIds">Online Documentation</a>
 */
final var cellIds: ContextItemMapping<INode, PartitionCellId, PartitionGrid>
/**
 * Gets or sets the mapping from a node to its column index.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23columnIndices">Online Documentation</a>
 */
final var columnIndices: ItemMapping<INode, Int>
/**
 * Gets or sets the [partition grid][PartitionGrid].
 * @see [PartitionGrid.PARTITION_GRID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23grid">Online Documentation</a>
 */
final var grid: PartitionGrid
/**
 * Gets or sets a value indicating whether or not the order of the columns should be chosen automatically to minimize edge lengths.
 * 
 * Default value - `true`. The order is chosen automatically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23optimizeColumnOrder">Online Documentation</a>
 */
final var optimizeColumnOrder: Boolean
/**
 * Gets or sets a value indicating whether or not the order of the rows should be chosen automatically to minimize edge lengths.
 * 
 * Default value - `true`. The order is chosen automatically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23optimizeRowOrder">Online Documentation</a>
 */
final var optimizeRowOrder: Boolean
/**
 * Gets or sets the mapping from a node to its row index.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridData%23rowIndices">Online Documentation</a>
 */
final var rowIndices: ItemMapping<INode, Int>

companion object : ClassMetadata<PartitionGridData> {
}
}

inline fun PartitionGridData(
    block: PartitionGridData.() -> Unit
): PartitionGridData {
    return PartitionGridData()
        .apply(block)
}
