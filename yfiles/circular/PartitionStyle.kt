// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [CircularLayout.partitionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionStyle">Online Documentation</a>
 */
external sealed class PartitionStyle: YEnum<PartitionStyle> {
   companion object: EnumMetadata<PartitionStyle> {
       /**
 * Specifier for a partition layout style where all nodes of a partition are placed on the boundary of a circle.
 * 
 * Value - `0`
 * @see [CircularLayout.partitionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionStyle%23CYCLE">Online Documentation</a>
 */
val CYCLE: PartitionStyle

/**
 * Specifier for a partition style with a semi-compact layout for each partition.
 * 
 * Value - `1`
 * @see [CircularLayout.partitionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionStyle%23DISK">Online Documentation</a>
 */
val DISK: PartitionStyle

/**
 * Specifier for a partition style with a compact layout for each partition.
 * 
 * Value - `2`
 * @see [CircularLayout.partitionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionStyle%23ORGANIC">Online Documentation</a>
 */
val ORGANIC: PartitionStyle

/**
 * Specifier for a partition style with a compact disk layout for each partition.
 * 
 * Value - `3`
 * @see [CircularLayout.partitionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionStyle%23COMPACT_DISK">Online Documentation</a>
 */
val COMPACT_DISK: PartitionStyle
   }
}
