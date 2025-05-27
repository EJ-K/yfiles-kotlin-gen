// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Element
import web.html.HTMLElement
import yfiles.geometry.IRectangle
import yfiles.lang.ClassMetadata

/**
 * Wraps an [HTMLElement] as [Visual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual">Online Documentation</a>
 * 
 * @constructor Creates a new instance which wraps the specified HTML element.
 * @param [element] The HTML element which this visual wraps.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23HtmlVisual-constructor-HtmlVisual">Online Documentation</a>
 * 
 * @property element
 * Gets or sets the HTML element that is wrapped by this visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23element">Online Documentation</a>
 */
open external class HtmlVisual (
final var element: HTMLElement) : Visual {
  
  companion object : ClassMetadata<HtmlVisual> {
    /**
     * Creates a new [TaggedSvgVisual] for the given `element` and `tag` object.
     * @param [TElement] The type of the element, typically inferred from the first argument.
     * @param [TTag] The type of the cache value, typically inferred from the second argument.
     * @param [element] The element to wrap.
     * @param [tag] The object to set to the [SvgVisual] as [tag][TaggedSvgVisual].
     * @return A properly typed [SvgVisual] for the given element and tag value.
     * @see [from]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23HtmlVisual-method-from(TElement,TTag)">Online Documentation</a>
     */
    @JsName("from")
    operator fun <TElement : Element, TTag> invoke(
      element: TElement,
      tag: TTag,
    ): TaggedHtmlVisual<TElement, TTag>
    
    /**
     * Sets the translation and size values of a given HtmlElement to the provided values so that it works well inside an [HtmlVisual] in a [CanvasComponent].
     * @param [element] The element that should be arranged in the [HtmlVisual].
     * @param [layout] The values for the rectangle.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23HtmlVisual-method-setLayout(HTMLElement,IRectangle)">Online Documentation</a>
     */
    fun setLayout(
      element: HTMLElement,
      layout: IRectangle,
    )
    
    /**
     * Sets the translation and size values of a given HtmlElement to the provided values so that it works well inside an [HtmlVisual] in a [CanvasComponent].
     * @param [element] The element that should be arranged in the [HtmlVisual].
     * @param [dx] The offset on the x-axis.
     * @param [dy] The offset on the y-axis.
     * @param [width] The width to set to the element.
     * @param [height] The height to set to the element.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23HtmlVisual-method-setLayout(HTMLElement,number,number,number,number)">Online Documentation</a>
     */
    fun setLayout(
      element: HTMLElement,
      dx: Double,
      dy: Double,
      width: Double,
      height: Double,
    )
    
    /**
     * Sets the translation values of a given HtmlElement to the provided values so that it works well inside an [HtmlVisual] in a [CanvasComponent].
     * @param [element] The element that should be translated.
     * @param [dx] The offset on the x-axis.
     * @param [dy] The offset on the y-axis.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlVisual%23HtmlVisual-method-setTranslate">Online Documentation</a>
     */
    fun setTranslate(
      element: HTMLElement,
      dx: Double,
      dy: Double,
    )
  }
}
