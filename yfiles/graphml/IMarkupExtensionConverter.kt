// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.InterfaceMetadata

/**
 * An interface for converters that can convert an object to a corresponding [MarkupExtension].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarkupExtensionConverter">Online Documentation</a>
 */
external interface IMarkupExtensionConverter  {
  /**
   * Returns if the converter can convert the `value` to a [MarkupExtension] in the current write context.
   * @param [context] The current write context.
   * @param [value] The object to convert.
   * @return Whether the converter can convert the passed value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarkupExtensionConverter%23IMarkupExtensionConverter-method-canConvert">Online Documentation</a>
   */
  fun canConvert(
    context: IWriteContext,
    value: Any,
  ): Boolean
  
  /**
   * Converts the `value` to a [MarkupExtension] using the current write context.
   * @param [context] The current write context.
   * @param [value] The object to convert.
   * @return The [MarkupExtension] the value was converted to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMarkupExtensionConverter%23IMarkupExtensionConverter-method-convert">Online Documentation</a>
   */
  fun convert(
    context: IWriteContext,
    value: Any,
  ): MarkupExtension

  
  companion object : InterfaceMetadata<IMarkupExtensionConverter> {
  }
}
