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
 * @see [BalloonLayout.interleavedMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterleavedMode">Online Documentation</a>
 */
external sealed class InterleavedMode: YEnum<InterleavedMode> {
   companion object: EnumMetadata<InterleavedMode> {
       /**
 * A child placement mode where all child nodes are placed around their parent with equal distances.
 * 
 * Value - `0`
 * @see [BalloonLayout.interleavedMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterleavedMode%23OFF">Online Documentation</a>
 */
val OFF: InterleavedMode

/**
 * A child placement mode where nodes are placed in an interleaved fashion, that is, with two different, alternating distances to the parent node.
 * 
 * Value - `1`
 * @see [BalloonLayout.interleavedMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterleavedMode%23ALL_NODES">Online Documentation</a>
 */
val ALL_NODES: InterleavedMode

/**
 * A child placement mode where child nodes of selected nodes are placed in an interleaved fashion, that is, with two different, alternating distances to the parent node.
 * 
 * Value - `2`
 * @see [BalloonLayout.interleavedMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InterleavedMode%23MARKED_NODES">Online Documentation</a>
 */
val MARKED_NODES: InterleavedMode
   }
}
