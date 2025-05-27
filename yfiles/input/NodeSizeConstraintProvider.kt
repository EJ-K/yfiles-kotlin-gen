// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * An implementation of [INodeSizeConstraintProvider] which provides constant sizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided size instances as the initial values.
 * @param [minimumSize] The [minimumSize][NodeSizeConstraintProvider].
 * @param [maximumSize] The [maximumSize][NodeSizeConstraintProvider].
 * @param [minimumEnclosedArea] The [minimumEnclosedArea][NodeSizeConstraintProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-constructor-NodeSizeConstraintProvider">Online Documentation</a>
 * 
 * @property minimumSize
 * Gets or sets the instance to return by [getMinimumSize][NodeSizeConstraintProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23minimumSize">Online Documentation</a>
 * 
 * @property maximumSize
 * Gets or sets the instance to return by [getMaximumSize][NodeSizeConstraintProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23maximumSize">Online Documentation</a>
 * 
 * @property minimumEnclosedArea
 * Gets or sets the instance to return by [getMinimumEnclosedArea][NodeSizeConstraintProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23minimumEnclosedArea">Online Documentation</a>
 */
open external class NodeSizeConstraintProvider (
final var minimumSize: ISize,
final var maximumSize: ISize,
final var minimumEnclosedArea: IRectangle = definedExternally) : INodeSizeConstraintProvider {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMaximumSize">Online Documentation</a>
   */
  override fun getMaximumSize(): Size
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMinimumEnclosedArea">Online Documentation</a>
   */
  override fun getMinimumEnclosedArea(): Rect
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSizeConstraintProvider%23NodeSizeConstraintProvider-method-getMinimumSize">Online Documentation</a>
   */
  override fun getMinimumSize(): Size
  
  companion object : ClassMetadata<NodeSizeConstraintProvider> {
  }
}
