// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGElement
import yfiles.lang.ClassMetadata

/**
 * Wraps an [SVGElement] as a [Visual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual">Online Documentation</a>
 * 
 * @constructor Creates a new instance which wraps the specified SVG element.
 * @param [svgElement] The SVG element which this visual wraps.
 * @see [from]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual%23SvgVisual-constructor-SvgVisual">Online Documentation</a>
 * 
 * @property svgElement
 * Gets or sets the SVG element of this visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual%23svgElement">Online Documentation</a>
 */
open external class SvgVisual (
final var svgElement: SVGElement) : Visual {
  
  companion object : ClassMetadata<SvgVisual> {
    /**
     * Creates a new [TaggedSvgVisual] for the given `element` and `tag` object.
     * @param [TElement] The type of the element, typically inferred from the first argument.
     * @param [TTag] The type of the cache value, typically inferred from the second argument.
     * @receiver The element to wrap.
     * @param [tag] The object to set to the [SvgVisual] as [tag][TaggedSvgVisual].
     * @return A properly typed [SvgVisual] for the given element and tag value.
     * @see [from]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual%23SvgVisual-method-from(TElement,TTag)">Online Documentation</a>
     */
    @JsName("from")
    operator fun <TElement : SVGElement, TTag> TElement.invoke(
      tag: TTag,
    ): TaggedSvgVisual<TElement, TTag>
    
    /**
     * Sets the transform to a scale transform using the given parameters.
     * @receiver The SVG element that should be translated.
     * @param [scaleX] The vertical scale.
     * @param [scaleY] The horizontal scale.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual%23SvgVisual-defaultmethod-setScale">Online Documentation</a>
     */
    fun SVGElement.setScale(
      scaleX: Double,
      scaleY: Double,
    )
    
    /**
     * Sets the transform to a translate transform using the given parameters.
     * @receiver The SVG element that should be translated.
     * @param [dx] The offset on the x-axis.
     * @param [dy] The offset on the y-axis.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisual%23SvgVisual-defaultmethod-setTranslate">Online Documentation</a>
     */
    fun SVGElement.setTranslate(
      dx: Double,
      dy: Double,
    )
  }
}
