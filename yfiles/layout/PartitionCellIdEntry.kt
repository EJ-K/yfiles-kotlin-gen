// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * This class represents a single partition cell, i.e., a pair consisting of a row and a column.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellIdEntry">Online Documentation</a>
 */
external  class PartitionCellIdEntry 
private constructor () : IComparable<PartitionCellIdEntry> {

/**
 * Gets the [ColumnDescriptor] associated with this [partition cell][PartitionCellId].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellIdEntry%23column">Online Documentation</a>
 */
final val column: ColumnDescriptor
/**
 * Gets the [RowDescriptor] associated with this [partition cell][PartitionCellId].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellIdEntry%23row">Online Documentation</a>
 */
final val row: RowDescriptor
/**
 * Compares this [PartitionCellIdEntry] instance with a given other [PartitionCellIdEntry] instance.
 * @param [other] the [PartitionCellIdEntry] to be compared
 * @return `-1`, `0` or `1` if this [PartitionCellIdEntry] is smaller than, equal to, or greater than the given other [PartitionCellIdEntry] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellIdEntry%23PartitionCellIdEntry-method-compareTo">Online Documentation</a>
 */
 final override  operator fun compareTo( other: PartitionCellIdEntry ):Int

companion object : ClassMetadata<PartitionCellIdEntry> {
}
}
