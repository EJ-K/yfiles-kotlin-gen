// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLElement
import yfiles.lang.InterfaceMetadata

/**
 * An utility type for [HtmlVisual] that restricts the type of the [element][HtmlVisual] property.
 * @param [TElement] The type of the [element][TypedHtmlVisual] property.
 * @see [TaggedHtmlVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypedHtmlVisual">Online Documentation</a>
 */
external interface TypedHtmlVisual<TElement : HTMLElement>  {
  /**
   * Gets or sets the HTML element of this visual.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypedHtmlVisual%23element">Online Documentation</a>
   */
  var element: TElement

  
  companion object : InterfaceMetadata<TypedHtmlVisual<*>> {
  }
}
