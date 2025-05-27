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
 * @see [DefaultNodePlacer.childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildPlacement">Online Documentation</a>
 */
external sealed class ChildPlacement: YEnum<ChildPlacement> {
   companion object: EnumMetadata<ChildPlacement> {
       /**
 * Placement specifier which defines that subtrees are placed horizontally next to each other and below the root node.
 * 
 * Value - `0`
 * @see [DefaultNodePlacer.childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildPlacement%23HORIZONTAL_DOWNWARD">Online Documentation</a>
 */
val HORIZONTAL_DOWNWARD: ChildPlacement

/**
 * Placement specifier which defines that subtrees are placed one below the other and left of the root node.
 * 
 * Value - `1`
 * @see [DefaultNodePlacer.childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildPlacement%23VERTICAL_TO_LEFT">Online Documentation</a>
 */
val VERTICAL_TO_LEFT: ChildPlacement

/**
 * Placement specifier which defines that subtrees are placed horizontally next to each other and above the root node.
 * 
 * Value - `2`
 * @see [DefaultNodePlacer.childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildPlacement%23HORIZONTAL_UPWARD">Online Documentation</a>
 */
val HORIZONTAL_UPWARD: ChildPlacement

/**
 * Placement specifier which defines that subtrees are placed one below the other and right of the root node.
 * 
 * Value - `3`
 * @see [DefaultNodePlacer.childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildPlacement%23VERTICAL_TO_RIGHT">Online Documentation</a>
 */
val VERTICAL_TO_RIGHT: ChildPlacement
   }
}
