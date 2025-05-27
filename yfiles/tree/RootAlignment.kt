// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [DefaultNodePlacer]
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment">Online Documentation</a>
 */
external sealed class RootAlignment: YEnum<RootAlignment> {
   companion object: EnumMetadata<RootAlignment> {
       /**
 * Alignment specifier which defines that the root node is placed ahead of all its child subtrees.
 * 
 * Value - `0`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23LEADING_OFFSET">Online Documentation</a>
 */
val LEADING_OFFSET: RootAlignment

/**
 * Alignment specifier which defines that the root node is placed aligned with its first subtree.
 * 
 * Value - `1`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23LEADING">Online Documentation</a>
 */
val LEADING: RootAlignment

/**
 * Alignment specifier which defines that the root node is placed aligned with the center of its subtrees.
 * 
 * Value - `2`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23CENTER">Online Documentation</a>
 */
val CENTER: RootAlignment

/**
 * Alignment specifier which defines that the root node is placed at the median of the connection points to its subtrees.
 * 
 * Value - `3`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23MEDIAN">Online Documentation</a>
 */
val MEDIAN: RootAlignment

/**
 * Alignment specifier which defines that the root node is placed aligned with its last subtree.
 * 
 * Value - `4`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23TRAILING">Online Documentation</a>
 */
val TRAILING: RootAlignment

/**
 * Alignment specifier which defines that the root is placed after all its subtree.
 * 
 * Value - `5`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23TRAILING_OFFSET">Online Documentation</a>
 */
val TRAILING_OFFSET: RootAlignment

/**
 * Alignment specifier which defines that the root is placed after all its subtrees, centered on the bus.
 * 
 * Value - `6`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23TRAILING_ON_BUS">Online Documentation</a>
 */
val TRAILING_ON_BUS: RootAlignment

/**
 * Alignment specifier which defines that the root is placed ahead of all its subtrees, centered on the bus.
 * 
 * Value - `7`
 * @see [DefaultNodePlacer.rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootAlignment%23LEADING_ON_BUS">Online Documentation</a>
 */
val LEADING_ON_BUS: RootAlignment
   }
}
