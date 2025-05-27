// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.ClassMetadata

/**
 * Wraps a simple [IEnumerable] into an [IListEnumerable].
 * @param [T] The type of the enumerable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListEnumerable">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given backing enumerable.
 * @param [backingEnumerable] The enumerable to back this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListEnumerable%23ListEnumerable-constructor-ListEnumerable(IEnumerable)">Online Documentation</a>
 * 
 * @property backingEnumerable
 * Gets the backing enumerable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListEnumerable%23backingEnumerable">Online Documentation</a>
 */
external class ListEnumerable<T> (
final val backingEnumerable: IEnumerable<T> = definedExternally) : IListEnumerable<T> {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListEnumerable%23ListEnumerable-method-get">Online Documentation</a>
   */
  override operator fun get(
    index: Int,
  ): T
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListEnumerable%23ListEnumerable-method-getEnumerator">Online Documentation</a>
   */
  override fun getEnumerator(): IEnumerator<T>
  
  companion object : ClassMetadata<ListEnumerable<*>> {
  }
}
