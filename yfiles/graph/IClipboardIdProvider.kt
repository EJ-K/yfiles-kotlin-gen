// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata

/**
 * Used by the [GraphClipboard] to assign IDs for elements in the clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardIdProvider">Online Documentation</a>
 */
external interface IClipboardIdProvider  {
  /**
   * Gets the ID for the given `originalItem`.
   * @param [context] The clipboard context
   * @param [originalItem] The original item which is copied. The item is part of the original graph from which the item is copied.
   * @return An ID for the given item. The object should be suitable for use in a [HashMap][yfiles.collections.HashMap].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardIdProvider%23IClipboardIdProvider-method-getId">Online Documentation</a>
   */
  fun getId(
    context: IGraphClipboardContext,
    originalItem: IModelItem,
  ): Id
  
  /**
   * Gets the item which is represented by the given `id`.
   * @param [context] The clipboard context.
   * @param [id] The ID to get the item for.
   * @return The item which is represented by the given ID or `null` if the item cannot be located or is invalid. The item needs to be part of the target graph for paste operations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardIdProvider%23IClipboardIdProvider-method-getItem">Online Documentation</a>
   */
  fun getItem(
    context: IGraphClipboardContext,
    id: Id,
  ): IModelItem?

  
  companion object : InterfaceMetadata<IClipboardIdProvider> {
  }
}
