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
 * @see [CircularLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStyle">Online Documentation</a>
 */
@JsName("CircularLayoutStyle")
external sealed class LayoutStyle: YEnum<LayoutStyle> {
   companion object: EnumMetadata<LayoutStyle> {
       /**
 * The specifier for a layout style where the nodes within a biconnected component of the input graph are treated as separate partitions.
 * 
 * Value - `0`
 * @see [CircularLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStyle%23BCC_COMPACT">Online Documentation</a>
 */
val BCC_COMPACT: LayoutStyle

/**
 * The specifier for a layout style where the nodes within a biconnected component of the input graph are treated as separate partitions.
 * 
 * Value - `1`
 * @see [CircularLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStyle%23BCC_ISOLATED">Online Documentation</a>
 */
val BCC_ISOLATED: LayoutStyle

/**
 * The specifier for a layout style where the user can specify groups that will form separate partitions.
 * 
 * Value - `2`
 * @see [CircularLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStyle%23CUSTOM_GROUPS">Online Documentation</a>
 */
val CUSTOM_GROUPS: LayoutStyle

/**
 * The specifier for a layout style where all nodes of the input graph will be placed on or in the interior of a single cycle.
 * 
 * Value - `3`
 * @see [CircularLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStyle%23SINGLE_CYCLE">Online Documentation</a>
 */
val SINGLE_CYCLE: LayoutStyle
   }
}
