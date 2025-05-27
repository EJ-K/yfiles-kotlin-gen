// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.INode
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface used by implementations that provide various size constraints for [INode]s.
 * @see [NodeSizeConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider">Online Documentation</a>
 */
external interface INodeSizeConstraintProvider : YObject {
/**
 * Returns the maximum size allowed for the given `node`.
 * @param [node] The node to return the maximum size for.
 * @return The maximum size or [Size.INFINITE] if there is no constraint on the size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMaximumSize">Online Documentation</a>
 */
   fun getMaximumSize( node: INode ):Size
/**
 * Returns the minimum area that needs to be enclosed by the given `node`.
 * @param [node] The node to return the area for.
 * @return The area to enclose or [Rect.EMPTY] if there is no constraint on the size due to an enclosed area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMinimumEnclosedArea">Online Documentation</a>
 */
   fun getMinimumEnclosedArea( node: INode ):Rect
/**
 * Returns the minimum size allowed for the given `node`.
 * @param [node] The node to return the minimum size for.
 * @return The minimum size or [Size.EMPTY] if there is no constraint on the size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMinimumSize">Online Documentation</a>
 */
   fun getMinimumSize( node: INode ):Size

companion object : InterfaceMetadata<INodeSizeConstraintProvider> {
}
}
