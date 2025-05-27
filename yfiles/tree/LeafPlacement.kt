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
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement">Online Documentation</a>
 */
external sealed class LeafPlacement: YEnum<LeafPlacement> {
   companion object: EnumMetadata<LeafPlacement> {
       /**
 * A policy for placing the leaf nodes in a stack-like fashion with balanced stack heights.
 * 
 * Value - `0`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23LEAVES_STACKED">Online Documentation</a>
 */
val LEAVES_STACKED: LeafPlacement

/**
 * A policy for placing the leaf nodes in a stack-like fashion using a single stack left.
 * 
 * Value - `1`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23LEAVES_STACKED_LEFT">Online Documentation</a>
 */
val LEAVES_STACKED_LEFT: LeafPlacement

/**
 * A policy for placing the leaf nodes in a stack-like fashion using a single stack right.
 * 
 * Value - `2`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23LEAVES_STACKED_RIGHT">Online Documentation</a>
 */
val LEAVES_STACKED_RIGHT: LeafPlacement

/**
 * A policy for placing the leaf nodes in a stack-like fashion using two stacks.
 * 
 * Value - `3`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23LEAVES_STACKED_LEFT_AND_RIGHT">Online Documentation</a>
 */
val LEAVES_STACKED_LEFT_AND_RIGHT: LeafPlacement

/**
 * A policy for placing the leaf nodes in a dendrogram-like fashion.
 * 
 * Value - `4`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23ALL_LEAVES_ON_SAME_LAYER">Online Documentation</a>
 */
val ALL_LEAVES_ON_SAME_LAYER: LeafPlacement

/**
 * A policy for placing the leaf nodes with the same parent in the same layer.
 * 
 * Value - `5`
 * @see [ClassicTreeLayout.leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafPlacement%23SIBLINGS_ON_SAME_LAYER">Online Documentation</a>
 */
val SIBLINGS_ON_SAME_LAYER: LeafPlacement
   }
}
