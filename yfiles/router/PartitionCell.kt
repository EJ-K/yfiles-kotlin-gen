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
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [PartitionCell] represents a rectangular part of a [IPartition] as result of the decomposition process.
 * @see [PartitionCellKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell">Online Documentation</a>
 * 
 * @constructor Creates a new [PartitionCell] of the given [IPartition] with the location and the size of the given rectangle.
 * @param [bounds] the bounds describing the size and location of the partition cell
 * @param [partition] the partition to which the partition cell belongs
 * @see [IPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-constructor-PartitionCell(YRectangle,IPartition)">Online Documentation</a>
 * 
 * @property bounds
 * Gets the bounds of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23bounds">Online Documentation</a>
 * 
 * @property partition
 * Gets the [partition][IPartition] to which this [PartitionCell] belongs.
 * @see [IPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23partition">Online Documentation</a>
 */
external open class PartitionCell  (
open val bounds: YRectangle,
open val partition: IPartition) : YObject {
/**
 * Creates a new [PartitionCell] instance of the given [IPartition] with the given bounds.
 * @param [x] the x-coordinate of the upper-left corner of the partition cell
 * @param [y] the y-coordinate of the upper-left corner of the partition cell
 * @param [width] the width of the partition cell
 * @param [height] the height of the partition cell
 * @param [partition] the partition to which the partition cell belongs
 * @see [IPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-constructor-PartitionCell(number,number,number,number,IPartition)">Online Documentation</a>
 */
 constructor( x: Double ,
 y: Double ,
 width: Double ,
 height: Double ,
 partition: IPartition )

/**
 * Gets the height of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23height">Online Documentation</a>
 */
open val height: Double
/**
 * Gets a unique identifier of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23id">Online Documentation</a>
 */
open val id: Int
/**
 * Gets the x-coordinate of the right border of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23maxX">Online Documentation</a>
 */
open val maxX: Double
/**
 * Gets the y-coordinate of the bottom border of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23maxY">Online Documentation</a>
 */
open val maxY: Double
/**
 * Gets the x-coordinate of the left border of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23minX">Online Documentation</a>
 */
open val minX: Double
/**
 * Gets the y-coordinate of the upper border of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23minY">Online Documentation</a>
 */
open val minY: Double
/**
 * Gets the width of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23width">Online Documentation</a>
 */
open val width: Double
/**
 * Clears all additional data for this [PartitionCell].
 * @see [getData]
 * @see [putData]
 * @see [removeData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-clearData">Online Documentation</a>
 */
 open   fun clearData()
/**
 * Returns an [OrthogonalInterval] that defines the location, the size and the orientation of the given [PartitionCellBorder].
 * @param [border] a border of this partition cell
 * @return an [OrthogonalInterval] that defines the location, the size and the orientation of the given border
 * @see [PartitionCellBorder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-createBorderInterval">Online Documentation</a>
 */
 open   fun createBorderInterval( border: PartitionCellBorder ):OrthogonalInterval
/**
 * Returns the additional data associated with the given key for this [PartitionCell].
 * @param [key] the key whose associated data will be returned
 * @return the additional data associated with the given key or `null` if there is no data associated with the given key
 * @see [putData]
 * @see [removeData]
 * @see [clearData]
 * @see [PartitionCellKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-getData">Online Documentation</a>
 */
 open   fun <T : Any>getData( key: PartitionCellKey<T> ):T?
/**
 * Stores the additional data associated with the given key for this [PartitionCell].
 * @param [key] the key with which the additional data will be associated
 * @param [data] the additional data
 * @return the previous data associated with the given key or `null` if there was no data associated with the given key
 * @see [getData]
 * @see [removeData]
 * @see [clearData]
 * @see [PartitionCellKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-putData">Online Documentation</a>
 */
 open   fun <T : Any>putData( key: PartitionCellKey<T> ,
 data: T ):T?
/**
 * Removes the additional data associated with the given key for this [PartitionCell].
 * @param [key] the key for which the associated data will be removed
 * @return the additional data associated with the given key or `null` if there is no data associated with the given key
 * @see [getData]
 * @see [putData]
 * @see [clearData]
 * @see [PartitionCellKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-removeData">Online Documentation</a>
 */
 open   fun <T : Any>removeData( key: PartitionCellKey<T> ):T?

companion object : ClassMetadata<PartitionCell> {
}
}
