// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class can be used to keep the orthogonal edges attached to an [INode][yfiles.graph.INode] orthogonal while the node is moved or reshaped interactively.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeDragHandler">Online Documentation</a>
 */
external open class OrthogonalEdgeDragHandler  : YObject {

/**
 * Cancels the gesture and resets the port and bend locations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeDragHandler%23OrthogonalEdgeDragHandler-method-cancelDrag">Online Documentation</a>
 */
 final   fun cancelDrag()
/**
 * Finishes the gesture and cleans up temporary bends that were created during the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeDragHandler%23OrthogonalEdgeDragHandler-method-finishDrag">Online Documentation</a>
 */
 final   fun finishDrag()
/**
 * Updates the port locations and bend locations of orthogonal edges at these ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeDragHandler%23OrthogonalEdgeDragHandler-method-handleMove">Online Documentation</a>
 */
 final   fun handleMove()

companion object : ClassMetadata<OrthogonalEdgeDragHandler> {
}
}
