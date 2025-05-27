// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Encapsulates information bound to a node while the algorithm calculates a layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo">Online Documentation</a>
 */
external open class BalloonLayoutNodeInfo  : YObject {

/**
 * Gets the sum of all wedge angles of the subtree rooted at this node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo%23angleSum">Online Documentation</a>
 */
open val angleSum: Double
/**
 * The distance of the node to its root node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo%23dist">Online Documentation</a>
 */
final var dist: Double
/**
 * The angle of the gap to the wedge of the previous child node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo%23gapAngle">Online Documentation</a>
 */
final var gapAngle: Double
/**
 * The lower angle of the subtree wedge rooted at the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo%23lowerAngle">Online Documentation</a>
 */
final var lowerAngle: Double
/**
 * The upper angle of the subtree wedge rooted at the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutNodeInfo%23upperAngle">Online Documentation</a>
 */
final var upperAngle: Double

companion object : ClassMetadata<BalloonLayoutNodeInfo> {
}
}
