// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Fork style specifier that defines that the edges will fork on a node.
 * @see [DefaultPortAssignment.forkStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ForkStyle">Online Documentation</a>
 */
external sealed class ForkStyle: YEnum<ForkStyle> {
   companion object: EnumMetadata<ForkStyle> {
       /**
 * Fork style specifier that defines that the edges will fork outside a node.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ForkStyle%23OUTSIDE_NODE">Online Documentation</a>
 */
val OUTSIDE_NODE: ForkStyle

/**
 * Fork style specifier that defines that the edges will fork on a node.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ForkStyle%23AT_NODE">Online Documentation</a>
 */
val AT_NODE: ForkStyle
   }
}
