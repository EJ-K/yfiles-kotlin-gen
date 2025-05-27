// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [TabularLayout.layoutPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutPolicy">Online Documentation</a>
 */
external sealed class TabularLayoutPolicy: YEnum<TabularLayoutPolicy> {
   companion object: EnumMetadata<TabularLayoutPolicy> {
       /**
 * Layout policy that automatically chooses the table size of the layout.
 * 
 * Value - `0`
 * @see [TabularLayout.layoutPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutPolicy%23AUTO_SIZE">Online Documentation</a>
 */
val AUTO_SIZE: TabularLayoutPolicy

/**
 * Layout policy that adopts the size from an already registered [PartitionGrid] instance.
 * 
 * Value - `1`
 * @see [TabularLayout.layoutPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutPolicy%23FIXED_SIZE">Online Documentation</a>
 */
val FIXED_SIZE: TabularLayoutPolicy

/**
 * Layout policy that uses the coordinates of the input graph to determine the table size and the mapping of the nodes to the cells.
 * 
 * Value - `2`
 * @see [TabularLayout.layoutPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutPolicy%23FROM_SKETCH">Online Documentation</a>
 */
val FROM_SKETCH: TabularLayoutPolicy
   }
}
