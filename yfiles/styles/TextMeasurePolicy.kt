// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Possible text measurement modes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextMeasurePolicy">Online Documentation</a>
 */
external sealed class TextMeasurePolicy: YEnum<TextMeasurePolicy> {
   companion object: EnumMetadata<TextMeasurePolicy> {
       /**
 * The measure policy will be determined heuristically.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextMeasurePolicy%23AUTOMATIC">Online Documentation</a>
 */
val AUTOMATIC: TextMeasurePolicy

/**
 * Use <a href="http://www.w3.org/TR/SVG11/types.html#__svg__SVGLocatable__getBBox" target="_blank">getBBox()</a> to measure the size of text elements.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextMeasurePolicy%23SVG">Online Documentation</a>
 */
val SVG: TextMeasurePolicy

/**
 * Use <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-measuretext" target="_blank">CanvasRenderingContext2D.measureText()</a> to measure the width of text elements.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextMeasurePolicy%23CANVAS">Online Documentation</a>
 */
val CANVAS: TextMeasurePolicy
   }
}
