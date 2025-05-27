// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.InterfaceMetadata

/**
 * An extension to the [IEnumerable] interface that allows for indexed access and retrieval of the element count.
 * @param [T] The type of the contained elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IListEnumerable">Online Documentation</a>
 */
external interface IListEnumerable<out T> : IEnumerable<T> {
  /**
   * Gets the element at the specified index of this enumerable.
   * @param [index] The index to get the item for.
   * @return The item at the given index.
   * @throws ArgumentError `index` is not a valid index in this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IListEnumerable%23IListEnumerable-method-get">Online Documentation</a>
   */
  operator fun get(
    index: Int,
  ): T

  
  companion object : InterfaceMetadata<IListEnumerable<*>> {
    /**
     * An empty, immutable instance of [IListEnumerable].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IListEnumerable%23EMPTY">Online Documentation</a>
     */
     val EMPTY: IListEnumerable<*>
  }
}
