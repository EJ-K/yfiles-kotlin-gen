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
 * @see [BalloonLayout.childOrderingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy">Online Documentation</a>
 */
external sealed class ChildOrderingPolicy: YEnum<ChildOrderingPolicy> {
   companion object: EnumMetadata<ChildOrderingPolicy> {
       /**
 * Child ordering policy which orders child nodes depending on their subtree size such that large subtrees are placed next to small ones in order to save space.
 * 
 * Value - `0`
 * @see [BalloonLayout.childOrderingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy%23COMPACT">Online Documentation</a>
 */
val COMPACT: ChildOrderingPolicy

/**
 * Child ordering policy which sorts the child nodes according to their wedge angles.
 * 
 * Value - `1`
 * @see [BalloonLayout.childOrderingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy%23SYMMETRIC">Online Documentation</a>
 */
val SYMMETRIC: ChildOrderingPolicy
   }
}
