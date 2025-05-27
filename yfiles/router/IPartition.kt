// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YRectangle
import yfiles.collections.IList
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This class divides a rectangular area into one or more [PartitionCell]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartition">Online Documentation</a>
 */
external interface IPartition : YObject {
/**
 * Gets the bounds of the original rectangular area that is partitioned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartition%23bounds">Online Documentation</a>
 */
val bounds: YRectangle
/**
 * Returns a list of all [PartitionCell]s that intersect or cover the given rectangle.
 * @param [rect] the rectangular area whose (partially) covered cells will be returned
 * @return a list of [PartitionCell]s that (partially) cover the given rectangular area
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartition%23IPartition-method-getCells">Online Documentation</a>
 */
   fun getCells( rect: YRectangle ):IList<out PartitionCell>
/**
 * Returns a list of all [PartitionCell]s that are neighbors of the given cell, i.e., those cells that have a common border segment with the given cell.
 * @param [cell] the cell whose neighbors will be returned
 * @return a list of [PartitionCell]s that are neighbors of the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartition%23IPartition-method-getNeighbors">Online Documentation</a>
 */
   fun getNeighbors( cell: PartitionCell ):IList<out PartitionCell>

companion object : InterfaceMetadata<IPartition> {
}
}
