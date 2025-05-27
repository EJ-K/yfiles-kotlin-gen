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
 * @see [BalloonLayout.rootNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodePolicy">Online Documentation</a>
 */
external sealed class RootNodePolicy: YEnum<RootNodePolicy> {
   companion object: EnumMetadata<RootNodePolicy> {
       /**
 * Root node policy for choosing a node with indegree `0` as root node of the tree.
 * 
 * Value - `0`
 * @see [BalloonLayout.rootNodePolicy]
 * @see [Trees.getRoot][yfiles.algorithms.Trees.getRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodePolicy%23DIRECTED_ROOT">Online Documentation</a>
 */
val DIRECTED_ROOT: RootNodePolicy

/**
 * Root node policy for choosing the center node as root node of the tree.
 * 
 * Value - `1`
 * @see [BalloonLayout.rootNodePolicy]
 * @see [Trees.getCenterRoot][yfiles.algorithms.Trees.getCenterRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodePolicy%23CENTER_ROOT">Online Documentation</a>
 */
val CENTER_ROOT: RootNodePolicy

/**
 * Root node policy for choosing a weighted center node as root node of the tree.
 * 
 * Value - `2`
 * @see [BalloonLayout.rootNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodePolicy%23WEIGHTED_CENTER_ROOT">Online Documentation</a>
 */
val WEIGHTED_CENTER_ROOT: RootNodePolicy

/**
 * Root node policy for choosing a custom node as the root node of the tree.
 * 
 * Value - `3`
 * @see [BalloonLayout.rootNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodePolicy%23SELECTED_ROOT">Online Documentation</a>
 */
val SELECTED_ROOT: RootNodePolicy
   }
}
