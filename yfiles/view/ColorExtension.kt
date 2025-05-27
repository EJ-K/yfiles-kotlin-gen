// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.ILookup
import yfiles.graphml.MarkupExtension
import yfiles.lang.ClassMetadata

/**
 * The markup extension for [Color].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColorExtension">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class for the given color.
 * @param [color] The color that the new instance is for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColorExtension%23ColorExtension-constructor-ColorExtension(Color)">Online Documentation</a>
 */
open external class ColorExtension (
  color: Color  = definedExternally,
) : MarkupExtension {
  /**
   * Returns the value of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColorExtension%23value">Online Documentation</a>
   */
  final var value: String
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColorExtension%23ColorExtension-method-provideValue">Online Documentation</a>
   */
  override fun provideValue(
    serviceProvider: ILookup?,
  ): Any?
  
  companion object : ClassMetadata<ColorExtension> {
  }
}

inline fun ColorExtension(
    block: ColorExtension.() -> Unit
): ColorExtension {
    return ColorExtension()
        .apply(block)
}
