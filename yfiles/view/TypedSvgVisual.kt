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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An utility type for [SvgVisual] that restricts the type of the [SvgVisual.svgElement] property.
 * @param [TElement] The type of the [svgElement] property.
 * @see [TaggedSvgVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypedSvgVisual">Online Documentation</a>
 */
external interface TypedSvgVisual<TElement : SVGElement> : YObject {
/**
 * Gets or sets the SVG element of this visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypedSvgVisual%23svgElement">Online Documentation</a>
 */
var svgElement: TElement

companion object : InterfaceMetadata<TypedSvgVisual<*>> {
}
}
