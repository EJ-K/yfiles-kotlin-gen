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
import yfiles.lang.InterfaceMetadata

/**
 * An interface used by implementations that provide various size constraints for [INode][yfiles.graph.INode]s.
 * @see [NodeSizeConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider">Online Documentation</a>
 */
external interface INodeSizeConstraintProvider  {
  /**
   * Returns the maximum size allowed for the node whose lookup returned this provider.
   * @return The maximum size or [INFINITE][Size] if there is no constraint on the size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMaximumSize">Online Documentation</a>
   */
  fun getMaximumSize(): Size
  
  /**
   * Returns the minimum area that needs to be enclosed by the node whose lookup returned this provider.
   * @return The area to enclose or [EMPTY][Rect] if there is no constraint on the size due to an enclosed area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMinimumEnclosedArea">Online Documentation</a>
   */
  fun getMinimumEnclosedArea(): Rect
  
  /**
   * Returns the minimum size allowed for the node whose lookup returned this provider.
   * @return The minimum size or [EMPTY][Size] if there is no constraint on the size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSizeConstraintProvider%23INodeSizeConstraintProvider-method-getMinimumSize">Online Documentation</a>
   */
  fun getMinimumSize(): Size

  
  companion object : InterfaceMetadata<INodeSizeConstraintProvider> {
  }
}
