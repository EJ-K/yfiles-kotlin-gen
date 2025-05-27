// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * [PartitionCellId] represents an identifier for partition cells of a [partition grid][PartitionGrid] structure.
 * @see [PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellId">Online Documentation</a>
 */
external open class PartitionCellId  : YObject {

/**
 * Gets a [collection][yfiles.collections.ICollection] of elements of type [PartitionCellIdEntry].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellId%23cells">Online Documentation</a>
 */
open val cells: IEnumerable<PartitionCellIdEntry>
/**
 * Gets the first [column][ColumnDescriptor] associated with this [partition cell][PartitionCellId] identifier.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellId%23column">Online Documentation</a>
 */
open val column: ColumnDescriptor
/**
 * Gets whether or not this [PartitionCellId] represents a multi-cell, i.e., a cell spanning multiple rows/columns.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellId%23isSpanning">Online Documentation</a>
 */
open val isSpanning: Boolean
/**
 * Gets the first [row][RowDescriptor] associated with this [partition cell][PartitionCellId] identifier.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellId%23row">Online Documentation</a>
 */
open val row: RowDescriptor

companion object : ClassMetadata<PartitionCellId> {
}
}
