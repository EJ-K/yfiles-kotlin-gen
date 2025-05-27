// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.lang.InterfaceMetadata

/**
 * Common interface for items in an [IGraph] implementation that may own [labels][ILabel].
 * @see [INode]
 * @see [IEdge]
 * @see [IPort]
 * @see [IGraph.addLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelOwner">Online Documentation</a>
 */
external interface ILabelOwner : IModelItem {
  /**
   * Gets a collection of [labels][ILabel] that are owned by this instance.
   * @see [IGraph.addLabel]
   * @see [IGraph.remove]
   * @see [ILabel.owner]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelOwner%23labels">Online Documentation</a>
   */
  val labels: IListEnumerable<ILabel>

  
  companion object : InterfaceMetadata<ILabelOwner> {
  }
}
